package kz.aitu.shelterhuntspringboot.services;

import kz.aitu.shelterhuntspringboot.models.Advert;
import kz.aitu.shelterhuntspringboot.repositories.AdvertRepositoryInterface;
import kz.aitu.shelterhuntspringboot.repositories.UserRepositoryInterface;
import kz.aitu.shelterhuntspringboot.services.interfaces.AdvertServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertService implements AdvertServiceInterface {
    private final UserRepositoryInterface user_repo;
    private final AdvertRepositoryInterface advert_repo;

    public AdvertService(UserRepositoryInterface user_repo, AdvertRepositoryInterface advert_repo) {
        this.user_repo = user_repo;
        this.advert_repo = advert_repo;
    }
    @Override
    public List<Advert> fieldCountry(String countryName) {
        return advert_repo.fieldCountry(countryName);
    }

    @Override
    public List<Advert> fieldCity(String countryName, String cityName) {
        return advert_repo.fieldCity(countryName, cityName);
    }

    @Override
    public List<Advert> fieldCity(String countryName, String cityName, String streetName) {
        return advert_repo.fieldStreet(countryName, cityName, streetName);
    }

    @Override
    public List<Advert> fieldPrice(Long starting, Long ending) {
        return advert_repo.fieldPrice(starting, ending);
    }
}
