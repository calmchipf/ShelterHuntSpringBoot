package kz.aitu.shelterhuntspringboot.controllers;

import kz.aitu.shelterhuntspringboot.models.Advert;
import kz.aitu.shelterhuntspringboot.models.User;
import kz.aitu.shelterhuntspringboot.services.interfaces.UserServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserServiceInterface service;

    public UserController(UserServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<User> getAll(){
        return service.getAllUsers();
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<User> getById(@PathVariable("user_id") int id){
        User user = service.getUserById(id);
        if(user == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/{user_id}/owned_adverts")
    public List<Advert> getOwnedAdverts(@PathVariable("user_id") int id){
        return service.getOwnedAdverts(id);
    }

    @GetMapping("/{user_id}/fav_adverts")
    public List<Advert> getFavAdverts(@PathVariable("user_id") int id) { return service.getFavAdverts(id); }

    @PostMapping("/")
    public ResponseEntity<User> create(@RequestBody User user){
        User createdUser = service.createUser(user);
        if(createdUser == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED); //201
    }

}
