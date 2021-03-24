package com.example.estore.service;

import com.example.estore.entity.Product;
import com.example.estore.entity.category;
import com.example.estore.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;


    public List<category> getProductsByCat(String cat_title){

        return repository.findByCat(cat_title);

    }


    public  List<category> getCategory(){

        return repository.findAll();
    }

    public category addCategory( category cat){

        return  repository.save(cat);
    }
}


