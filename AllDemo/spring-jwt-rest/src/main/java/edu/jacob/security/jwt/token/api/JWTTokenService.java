package edu.jacob.security.jwt.token.api;

import com.google.common.collect.ImmutableMap;
import edu.jacob.security.jwt.date.service.DateService;
import io.jsonwebtoken.*;
import io.jsonwebtoken.impl.Base64Codec;
import io.jsonwebtoken.impl.Base64UrlCodec;
import io.jsonwebtoken.impl.compression.GzipCompressionCodec;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;
import static io.jsonwebtoken.impl.TextCodec.BASE64;

import static org.apache.commons.lang3.StringUtils.substringBeforeLast;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class JWTTokenService implements Clock, TokenService {


    private static final String DOT = ".";
    private static final GzipCompressionCodec COMPRESSION_CODEC = new GzipCompressionCodec();

    DateService dates;
    String issuer;
    int expirationSec;
    int clockSkewSec;
    String secretKey;

    JWTTokenService(final DateService dates,
                    @Value("${jwt.issuer:jacks}") final String issuer,
                    @Value("${jwt.expiration-sec:600}") final int expirationSec,
                    @Value("${jwt.clock-skew-sec:300}") final int clockSkewSec,
                    @Value("${jwt.secret:heyshuooo}") final String secret) {
        super();
        this.dates = requireNonNull(dates);
        this.issuer = requireNonNull(issuer);
        this.expirationSec = requireNonNull(expirationSec);
        this.clockSkewSec = requireNonNull(clockSkewSec);
        this.secretKey =  BASE64.encode(requireNonNull(secret));
    }


    @Override
    public String permanent(Map<String, String> attributes) {
        return newToken(attributes, 0);
    }

    @Override
    public String expiring(Map<String, String> attributes) {
        return newToken(attributes, expirationSec);
    }

    private String newToken(final Map<String, String> attributes, final int expiresInSec) {
        final DateTime now = dates.now();
        final Claims claims = Jwts
                .claims()
                .setIssuer(issuer)
                .setIssuedAt(now.toDate());

        if (expiresInSec > 0) {
            final DateTime expiresAt = now.plusSeconds(expiresInSec);
            claims.setExpiration(expiresAt.toDate());
        }
        claims.putAll(attributes);

        String tkn = Jwts
                .builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compressWith(COMPRESSION_CODEC)
                .compact();
        System.out.println("token : "+tkn);
        return tkn;
    }

    /**
     * Checks the validity of the given credentials.
     *
     * @param token
     * @return attributes if verified
     */
    @Override
    public Map<String, String> verify(String token) {

        final JwtParser parser = Jwts
                                    .parser()
                                    .requireIssuer(issuer)
                                    .setClock(this)
                                    .setAllowedClockSkewSeconds(clockSkewSec)
                                    .setSigningKey(secretKey);
        return parseClaims(() -> parser.parseClaimsJws(token).getBody());
    }



    /**
     * Checks the validity of the given credentials.
     *
     * @param token
     * @return attributes if verified
     */
    @Override
    public Map<String, String> untrusted(String token) {

        final JwtParser parser = Jwts
                                    .parser()
                                    .requireIssuer(issuer)
                                    .setClock(this)
                                    .setAllowedClockSkewSeconds(clockSkewSec);

        final String withouSignature = substringBeforeLast(token, DOT)+ DOT;

        return parseClaims(() -> parser.parseClaimsJws(withouSignature).getBody());
    }


    private static Map<String, String> parseClaims(final Supplier<Claims> toClaims) {

        try {
            final Claims claims = toClaims.get();

            final ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();

            for (final Map.Entry<String, Object> e : claims.entrySet()) {

                System.out.println(" claims key:"+e.getKey() +"  -  value:"+String.valueOf(e.getValue()));
                builder.put(e.getKey(),String.valueOf(e.getValue()));

            }

            return builder.build();
        } catch (final IllegalArgumentException iae) {
            return ImmutableMap.of();
        }



    }

    /**
     * Returns the clock's current timestamp at the instant the method is invoked.
     *
     * @return the clock's current timestamp at the instant the method is invoked.
     */
    @Override
    public Date now() {
        final DateTime now = dates.now();
        return ((DateTime) now).toDate();
    }
}
