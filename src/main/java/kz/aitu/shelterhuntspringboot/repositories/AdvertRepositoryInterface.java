package kz.aitu.shelterhuntspringboot.repositories;

import kz.aitu.shelterhuntspringboot.models.Advert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdvertRepositoryInterface extends JpaRepository<Advert, Integer> {

    @Query(value = "SELECT a.*, ad.country, ad.city, ad.street, ad.building, ad.apartment_number " +
            "FROM adverts a JOIN addresses ad ON a.id = ad.id WHERE ad.country = :countryName", nativeQuery = true)
    List<Advert> fieldCountry(String countryName);

    @Query(value = "SELECT a.*, ad.country, ad.city, ad.street, ad.building, ad.apartment_number " +
            "FROM adverts a JOIN addresses ad ON a.id = ad.id WHERE ad.country = :countryName and ad.city = :cityName", nativeQuery = true)
    List<Advert> fieldCity(String countryName, String cityName);

    @Query(value = "SELECT a.*, ad.country, ad.city, ad.street, ad.building, ad.apartment_number " +
            "FROM adverts a JOIN addresses ad ON a.id = ad.id WHERE ad.country = :countryName and ad.city = :cityName and ad.street = :streetName", nativeQuery = true)
    List<Advert> fieldStreet(String countryName, String cityName, String streetName);

    @Query(value = "SELECT a.*, ad.country, ad.city, ad.street, ad.building, ad.apartment_number " +
            "FROM adverts a JOIN addresses ad ON a.id = ad.id WHERE a.price > :starting and a.price < :ending", nativeQuery = true)
    List<Advert> fieldPrice(Long starting, Long ending);
}
