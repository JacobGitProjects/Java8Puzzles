package edu.jacob.security.jwt.springmvc.advanced.springjwtadv.auth.api;

import edu.jacob.security.jwt.springmvc.advanced.springjwtadv.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserAuthenticationService {

    Optional<User> login(String username, String password);

    Optional<User> findByToken(String token);

    void logout(User user);
}
