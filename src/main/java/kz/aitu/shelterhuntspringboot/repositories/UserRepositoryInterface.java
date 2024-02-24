package kz.aitu.shelterhuntspringboot.repositories;

import kz.aitu.shelterhuntspringboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User, Integer> {

}
