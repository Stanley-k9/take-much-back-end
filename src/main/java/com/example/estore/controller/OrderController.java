package com.example.estore.controller;

import com.example.estore.entity.Product;
import com.example.estore.entity.order_details;
import com.example.estore.entity.orders;
import com.example.estore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
   private OrderService orderService;

    @GetMapping("/orders")
    public List<orders> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/ordersById/{order_id}")
    public orders findOrdersById(@PathVariable int order_id){
        return orderService.getOrderById(order_id);
    }


    @CrossOrigin(origins ="http://localhost:4200")
   @PostMapping("/newOrder")
    public orders placeNewOrder(@RequestBody orders orders){
        return  orderService.placeNewOrder(orders);
    }


    @GetMapping("/myOrders/{id}")
    public List<order_details> getMyOrders(@PathVariable int id){
        return orderService.getMyOrders(id);
    }




}
