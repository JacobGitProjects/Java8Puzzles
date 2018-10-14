package edu.jacob.security.jwt.user.curd;

import com.google.common.collect.ImmutableMap;
import edu.jacob.security.jwt.auth.api.UserAuthenticationService;
import edu.jacob.security.jwt.token.api.TokenService;
import edu.jacob.security.jwt.user.curd.api.UserCrudService;
import edu.jacob.security.jwt.user.entity.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TokenAuthenticationService implements UserAuthenticationService {

    @NonNull
    TokenService tokenService;

    @NonNull
    UserCrudService userCrudService;


    @Override
    public Optional<String> login(String username, String password) {
        return userCrudService.findByUsername(username)
                .filter(user -> Objects.equals(password, user.getPassword()))
                .map(user -> tokenService.expiring(ImmutableMap.of("username", username)));
    }

    @Override
    public Optional<User> findByToken(String token) {
        return Optional.of(tokenService.verify(token))
                .map(map -> map.get("username"))
                .flatMap(userCrudService::findByUsername);
    }

    @Override
    public void logout(User user) {

    }
}
