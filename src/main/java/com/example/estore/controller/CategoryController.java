package com.example.estore.controller;

import com.example.estore.entity.Product;
import com.example.estore.entity.category;
import com.example.estore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getProductByCat/{cat_title}")
    public List<Product> findProductsByCategory(@PathVariable String cat_title){
        return categoryService.getProductsByCat(cat_title);
    }

}
