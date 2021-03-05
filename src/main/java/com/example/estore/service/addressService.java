package com.example.estore.service;

import com.example.estore.entity.Product;
import com.example.estore.entity.address;
import com.example.estore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class addressService {


    @Autowired
    private addressService repository;


    public Product updateAddress(address address){
       /* Product existingProduct = repository.findById(product.getId()).orElse(null);


        existingProduct.setTitle(address.getTitle());
        existingProduct.setQuantity(address.getQuantity());
        existingProduct.setPrice(address.getPrice());

        //description
        existingProduct.setDescription(address.getDescription());
        existingProduct.setShort_desk(address.getShort_desk());

        //image
        existingProduct.setPicture(address.getPicture());
        return  repository.save(existingProduct);*/
        return  null;
    }
}
