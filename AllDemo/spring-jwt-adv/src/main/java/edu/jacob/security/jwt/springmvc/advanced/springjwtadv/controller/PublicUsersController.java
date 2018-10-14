package edu.jacob.security.jwt.springmvc.advanced.springjwtadv.controller;

import edu.jacob.security.jwt.springmvc.advanced.springjwtadv.auth.api.UserAuthenticationService;
import edu.jacob.security.jwt.springmvc.advanced.springjwtadv.user.curd.api.UserCrudService;
import edu.jacob.security.jwt.springmvc.advanced.springjwtadv.user.entity.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/users")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
final class PublicUsersController {
    @NonNull
    UserAuthenticationService authentication;
    @NonNull
    UserCrudService users;

    @PostMapping("/register")
    User register(
            @RequestParam("username") final String username,
            @RequestParam("password") final String password) {
        users
                .save(
                        User
                                .builder()
                                .id(username)
                                .username(username)
                                .password(password)
                                .build()
                );

        return login(username, password);
    }

    @PostMapping("/login")
    User login(
            @RequestParam("username") final String username,
            @RequestParam("password") final String password) {
        return authentication.login(username, password).orElseThrow(() -> new RuntimeException("invalid login and/or password"));

    }
}
