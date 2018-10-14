package edu.jacob.security.jwt.controller;

import edu.jacob.security.jwt.auth.api.UserAuthenticationService;
import edu.jacob.security.jwt.user.entity.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
final class SecuredUsersController {

    @NonNull
    UserAuthenticationService authentication;

    @GetMapping("/current")
    User getCurrent(@AuthenticationPrincipal final User user) {
        System.out.println(" SecuredUsersController.getCurrent() "+user);
        return user;
    }

    @GetMapping("/logout")
    boolean logout(@AuthenticationPrincipal final User user) {
        System.out.println(" SecuredUsersController.logout() "+user);
        authentication.logout(user);
        return true;
    }
}
