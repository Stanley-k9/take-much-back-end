package com.example.estore.controller;

import com.example.estore.entity.Product;
import com.example.estore.entity.address;
import com.example.estore.service.ProductService;
import com.example.estore.service.addressService;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class addressController {

    @Autowired
    private addressService service;


    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody address address){
        return  service.updateAddress(address);
    }

}
