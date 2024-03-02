package kz.aitu.shelterhuntspringboot.repositories;

import kz.aitu.shelterhuntspringboot.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepositoryInterface extends JpaRepository<Review, Integer> {
}
