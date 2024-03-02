package kz.aitu.shelterhuntspringboot.controllers;

import kz.aitu.shelterhuntspringboot.models.Advert;
import kz.aitu.shelterhuntspringboot.services.interfaces.AdvertServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value={"adverts"})
public class AdvertController {

    private final AdvertServiceInterface service;

    public AdvertController(AdvertServiceInterface service) {
        this.service = service;
    }


    @GetMapping("/location-filter/{country_name}/")
    public List<Advert> fieldCountry(@PathVariable("country_name") String country) { return service.fieldCountry(country); }

    @GetMapping("/location-filter/{country_name}/{city_name}/")
    public List<Advert> fieldCity(@PathVariable("country_name") String country, @PathVariable("city_name") String city) { return service.fieldCity(country, city); }

    @GetMapping("/location-filter/{country_name}/{city_name}/{street_name}/")
    public List<Advert> fieldCity(@PathVariable("country_name") String country, @PathVariable("city_name") String city, @PathVariable("street_name") String street) { return service.fieldCity(country, city, street); }

    @GetMapping("/price-filter/{starting}/{ending}/")
    public List<Advert> fieldPrice(@PathVariable("starting") Long starting, @PathVariable("ending") Long ending) { return service.fieldPrice(starting, ending); }

}
