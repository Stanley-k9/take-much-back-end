package com.example.estore.controller;

import com.example.estore.entity.Product;
import com.example.estore.entity.category;
import com.example.estore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getProductByCat/{cat_title}")
    public List<category> findProductsByCategory(@PathVariable String cat_title){
        return categoryService.getProductsByCat(cat_title);
    }


    @GetMapping("/categories")
    public  List<category> getCategories(){

        return categoryService.getCategory();
    }

    @PostMapping("/addCategory")
    public category addingCategory(@RequestBody category cat){

        return  categoryService.addCategory(cat);
    }


}
