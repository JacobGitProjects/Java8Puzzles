package edu.jacob.security.jwt.springmvc.advanced.springjwtadv.user.curd.in.memory;

import edu.jacob.security.jwt.springmvc.advanced.springjwtadv.user.entity.User;
import edu.jacob.security.jwt.springmvc.advanced.springjwtadv.user.curd.api.UserCrudService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import static java.util.Optional.ofNullable;

@Service
final class InMemoryUsers implements UserCrudService {


    Map<String, User> users = new HashMap<>();


    @Override
    public User save(User user) {
        return users.put(user.getId(), user);
    }

    @Override
    public Optional<User> find(String id) {
        return ofNullable(users.get(id));
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return users
                .values()
                .stream()
                .filter(u -> Objects.equals(username, u.getUsername()))
                .findFirst();
    }
}
