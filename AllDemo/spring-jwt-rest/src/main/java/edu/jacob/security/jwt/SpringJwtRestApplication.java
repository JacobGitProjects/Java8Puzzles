package edu.jacob.security.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * https://octoperf.com/blog/2018/03/08/securing-rest-api-spring-security/
 */
@SpringBootApplication
public class SpringJwtRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtRestApplication.class, args);
    }
}
