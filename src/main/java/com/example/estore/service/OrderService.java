package com.example.estore.service;

import com.example.estore.entity.Product;
import com.example.estore.entity.order_details;
import com.example.estore.entity.orders;
import com.example.estore.entity.user;
import com.example.estore.repository.OrderRepository;
import com.example.estore.repository.orderDetailsRepository;
import com.example.estore.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;
    @Autowired
    private userRepository userRepo;
    @Autowired
    private orderDetailsRepository orderDetailsRepo;



    public List<orders> getAllOrders() {
        return repository.findAll();
    }


    public orders getOrderById(int Id){
        return repository.findById(Id).orElse(null);
    }

    public orders placeNewOrder(orders order) {
        return repository.save(order);
    }


    public List<order_details> getMyOrders(int user_id) {

        //filtering
        var myOrders = getAllOrders().stream().filter(ord ->ord.getUserID().getUser_id() == user_id).collect(Collectors.toList());
        var myOrderDetails = orderDetailsRepo.findAll();
        List<order_details> myNewDetails =  new ArrayList<order_details>();

        for(orders order : myOrders){

            //filtering
            //ADDING to another array myNewDetails
            myNewDetails.addAll(myOrderDetails.stream().filter(ord -> ord.getOrder_id().getOrder_id() == order.getOrder_id()).collect(Collectors.toList()));
        }
        return myNewDetails;
    }


}

