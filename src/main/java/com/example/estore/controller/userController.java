package com.example.estore.controller;

import com.example.estore.entity.Product;
import com.example.estore.entity.Status;
import com.example.estore.entity.user;
import com.example.estore.repository.userRepository;
import com.example.estore.service.userService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {



    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/users/register")
    public user registerUser(@RequestBody user newUser) {
       return service.register(newUser);
    }

    /*@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/users/login")
    public Status loginUser(@RequestBody user user) {
        List<user> users = repository.findAll();
        for (user other : users) {
            if (other.equals(user)) {
                user.setLoggedIn(true);
                repository.save(user);
                return Status.SUCCESS;
            }
        }
        return Status.FAILURE;
    }*/

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/users/login")
    public user loginUser(@RequestBody user user){
        return  service.loginUser(user);
    }





    @PostMapping("/users/logout")
    public Boolean logUserOut(@RequestBody user user) {
      return service.LogOut(user);
    }


   /* @DeleteMapping("/users/all")
    public Status deleteUsers() {
        service.deleteAll();
        return Status.SUCCESS;
    }*/

    @Autowired
    private userService service;

    @GetMapping("/allUsers")
    public List<user> findAllUsers(){
        return service.getUsers();
    }


}
