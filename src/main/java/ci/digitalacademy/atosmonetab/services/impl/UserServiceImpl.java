package ci.digitalacademy.atosmonetab.services.impl;

import ci.digitalacademy.atosmonetab.models.User;
import ci.digitalacademy.atosmonetab.repositories.UserRepositories;
import ci.digitalacademy.atosmonetab.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepositories userRepositories;




    @Override
    public User save(User user) {
        return userRepositories.save(user);
    }

    @Override
    public User update(User user) {
        Optional<User> OptionalUser = findOne(user.getId());
        if (OptionalUser.isPresent()){
            User userToUpdate = OptionalUser.get() ;
            userToUpdate.setPassword(user.getPassword());
            userToUpdate.setSpeudo(user.getSpeudo());
            return save(userToUpdate);
        }else {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public Optional<User> findOne(Long id) {
        return userRepositories.findById(id);
    }

    @Override
    public void delete(Long id) {
        userRepositories.deleteById(id);

    }

    @Override
    public List<User> findAll() {
        return userRepositories.findAll();
    }
}
