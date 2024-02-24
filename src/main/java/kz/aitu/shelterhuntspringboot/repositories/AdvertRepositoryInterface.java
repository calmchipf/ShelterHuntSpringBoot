package kz.aitu.shelterhuntspringboot.repositories;

import kz.aitu.shelterhuntspringboot.models.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertRepositoryInterface extends JpaRepository<Advert, Integer> {
}
