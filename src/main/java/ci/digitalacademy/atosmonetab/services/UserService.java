package ci.digitalacademy.atosmonetab.services;

import ci.digitalacademy.atosmonetab.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    User update(User user) throws IllegalAccessException;
    Optional<User> findOne(Long id);
    void delete(Long id);
    List<User> findAll();
}
