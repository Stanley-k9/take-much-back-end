package com.example.estore.service;

import com.example.estore.entity.Product;
import com.example.estore.entity.Status;
import com.example.estore.entity.user;
import com.example.estore.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

@Autowired
 private userRepository repository;

    public List<user>getUsers(){
        return repository.findAll();
    }




    public user loginUser(user user){
        user existingUser = findExistingUser(user.getEmail());
         if(existingUser != null)
        {
            if(existingUser.getPassword().equals(user.getPassword())){
                existingUser.setLogged_in(true);
                repository.save(existingUser);
                return existingUser;
            }
        }
        return new user();
    }






    public boolean LogOut(user user){

        user existingUser = findExistingUser(user.getEmail());
        if(existingUser != null)
        {
            existingUser.setLogged_in(false);
            repository.save(existingUser);
            return true;
        }
        return false;
    }


    public user register(user newUser) {
        user existingUser = findExistingUser(newUser.getEmail());
        if(existingUser != null){
            return repository.save(newUser);
        }
        return existingUser;
    }

    public  user update(user user){
        user existingUser = findExistingUser(user.getEmail());
        if(existingUser != null){

           existingUser.setEmail(user.getEmail());
           existingUser.setLogged_in(true);
           existingUser.setPassword(user.getPassword());
           existingUser.setAge(user.getAge());
           existingUser.setFirst_name(user.getFirst_name());
           existingUser.setLast_name(user.getLast_name());
           existingUser.setRole(user.getRole());
           existingUser.setType(user.getType());
           existingUser.setPhoto_url(user.getPhoto_url());
           existingUser.setUsername(user.getUsername());
            return repository.save(existingUser);
        }
        return new user();
    }

    private user findExistingUser(String email){
        List<user> users = repository.findAll();
        user existingUser = users.stream().filter(user1 -> user1.getEmail().equals(email)).findAny().orElse(null);
        if (existingUser != null ){
            return existingUser;
        }else {
            return new user();
        }
    }


    public Long listNoCustomers(){

        List<user> users = repository.findAll();

        Long listCustomers = users.stream().filter(user1 -> user1.getType().equals("customer")).count();


        return listCustomers;

    }

    public Long listNoDelivery(){
        List<user> users = repository.findAll();

        Long ListDelivery = users.stream().filter(user -> user.getType().equals("delivery")).count();

        return ListDelivery;
    }

}
