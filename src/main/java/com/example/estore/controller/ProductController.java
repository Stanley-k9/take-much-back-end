package com.example.estore.controller;


import com.example.estore.entity.Product;
import com.example.estore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;



    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return  service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return  service.saveProducts(products);
    }


    @GetMapping("/products/{count}")
    public List<Product> findAllProducts(@PathVariable int count){
        return service.getProducts(count);
    }


    @GetMapping("/productById/{id}")
    public Product findAllProductById(@PathVariable int id){
        return  service.getProductById(id);
    }

    @GetMapping("/getProductByTitle/{title}")
    public Product findProductByTitle(@PathVariable String title){
        return service.getProductByTitle(title);
    }


    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return  service.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
      return service.deleteProduct(id);
    }





}
