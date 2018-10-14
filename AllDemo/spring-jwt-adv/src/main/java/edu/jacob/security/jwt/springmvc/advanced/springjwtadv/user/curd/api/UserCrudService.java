package edu.jacob.security.jwt.springmvc.advanced.springjwtadv.user.curd.api;

import edu.jacob.security.jwt.springmvc.advanced.springjwtadv.user.entity.User;

import java.util.Optional;

public interface UserCrudService {

    User save(User user);

    Optional<User> find(String id);

    Optional<User> findByUsername(String username);
}
