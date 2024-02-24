package kz.aitu.shelterhuntspringboot.services.interfaces;

import kz.aitu.shelterhuntspringboot.models.Advert;
import kz.aitu.shelterhuntspringboot.models.User;
import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUsers();
    User getUserById(int id);

    User createUser(User user);
    List<User> getBySurname(String surname);

    List<Advert> getOwnedAdverts(int id);

    List<Advert> getFavAdverts(int id);

}
