package edu.jacob.security.jwt.user.curd.api;


import edu.jacob.security.jwt.user.entity.User;

import java.util.Optional;

public interface UserCrudService {

    User save(User user);

    Optional<User> find(String id);

    Optional<User> findByUsername(String username);
}
