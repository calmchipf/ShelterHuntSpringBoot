package kz.aitu.shelterhuntspringboot.services;

import kz.aitu.shelterhuntspringboot.models.User;
import kz.aitu.shelterhuntspringboot.repositories.UserRepositoryInterface;
import kz.aitu.shelterhuntspringboot.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserServiceInterface {
    private final UserRepositoryInterface repo;

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public User getUserById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public List<User> getBySurname(String surname) {
        return null;
    }
}
