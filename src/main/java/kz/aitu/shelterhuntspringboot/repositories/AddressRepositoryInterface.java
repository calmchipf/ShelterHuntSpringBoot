package kz.aitu.shelterhuntspringboot.repositories;

import kz.aitu.shelterhuntspringboot.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepositoryInterface extends JpaRepository<Address, Integer> {
}
