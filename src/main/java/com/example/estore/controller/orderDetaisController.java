package com.example.estore.controller;

import com.example.estore.entity.order_details;
import com.example.estore.service.orderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class orderDetaisController {

@Autowired
private orderDetailsService service;

    //@CrossOrigin(origins = "http://localhost:4200")

   /* @PostMapping("/addOrder")
    public void addOrder(){
        service.addNew();
    }*/

    @GetMapping("/orderDetails")
    public List<order_details> findAllOrders(){
        return service.getOrders();
    }


    @CrossOrigin(origins ="http://localhost:4200")
    @PostMapping("/updateStatus")
    public order_details updateOrderById(@RequestBody order_details id ){
        return  service.updateStatus(id);
    }


    @CrossOrigin(origins ="http://localhost:4200")
    @PostMapping("/addOrder")
    public List<order_details> addingOrders(@RequestBody List<order_details> order_details){
        return service.addOrders(order_details);
    }


  /*  @PostMapping("/updateStatus")
    public List<order_details> updatingOrderDetails(@RequestBody List<order_details> od){
        return  service.updateStatus(od);
    }*/
}
