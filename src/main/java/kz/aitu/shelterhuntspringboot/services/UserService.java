package kz.aitu.shelterhuntspringboot.services;

import kz.aitu.shelterhuntspringboot.models.Advert;
import kz.aitu.shelterhuntspringboot.models.User;
import kz.aitu.shelterhuntspringboot.repositories.AdvertRepositoryInterface;
import kz.aitu.shelterhuntspringboot.repositories.UserRepositoryInterface;
import kz.aitu.shelterhuntspringboot.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserServiceInterface {
    private final UserRepositoryInterface user_repo;
    private final AdvertRepositoryInterface advert_repo;

    public UserService(UserRepositoryInterface user_repo, AdvertRepositoryInterface advertRepo) {
        this.user_repo = user_repo;
        advert_repo = advertRepo;
    }

    @Override
    public List<User> getAllUsers() {
        return user_repo.findAll();
    }

    @Override
    public User getUserById(int id) {
        return user_repo.findById(id).orElse(null);
    }

    @Override
    public User createUser(User user) {
        return user_repo.save(user);
    }

    @Override
    public List<Advert> getOwnedAdverts(int id){
        User user = user_repo.findById(id).orElse(null);
        return advert_repo.findAllById(user.getOwned_adverts_ids());
    }

    @Override
    public List<User> getBySurname(String surname) {
        return null;
    }
}
