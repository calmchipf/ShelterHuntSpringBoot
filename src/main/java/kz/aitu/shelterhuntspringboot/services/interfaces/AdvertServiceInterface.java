package kz.aitu.shelterhuntspringboot.services.interfaces;

import kz.aitu.shelterhuntspringboot.models.Advert;

import java.util.List;

public interface AdvertServiceInterface {
    List<Advert> fieldCountry(String countryName);
    List<Advert> fieldCity(String countryName, String cityName);
    List<Advert> fieldCity(String countryName, String cityName, String streetName);
    List<Advert> fieldPrice(Long starting, Long ending);
}
