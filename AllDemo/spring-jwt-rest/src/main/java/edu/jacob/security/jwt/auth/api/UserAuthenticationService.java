package edu.jacob.security.jwt.auth.api;


import edu.jacob.security.jwt.user.entity.User;

import java.util.Optional;

public interface UserAuthenticationService {

    Optional<String> login(String username, String password);

    Optional<User> findByToken(String token);

    void logout(User user);
}
