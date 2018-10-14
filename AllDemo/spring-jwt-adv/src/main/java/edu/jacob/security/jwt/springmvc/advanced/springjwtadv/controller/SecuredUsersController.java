package edu.jacob.security.jwt.springmvc.advanced.springjwtadv.controller;

import edu.jacob.security.jwt.springmvc.advanced.springjwtadv.auth.api.UserAuthenticationService;
import edu.jacob.security.jwt.springmvc.advanced.springjwtadv.user.entity.User;
import lombok.NonNull;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;

public class SecuredUsersController {

    @NonNull
    UserAuthenticationService authentication;

    @GetMapping("/current")
    User getCurrent(@AuthenticationPrincipal final User user) {
        return user;
    }

    @GetMapping("/logout")
    boolean logout(@AuthenticationPrincipal final User user) {
        authentication.logout(user);
        return true;
    }
}
