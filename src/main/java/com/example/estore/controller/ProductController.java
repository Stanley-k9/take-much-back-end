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


@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return  service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return  service.saveProducts(products);
    }


    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }


    @GetMapping("/productById/{id}")
    public Product findAllProductById(@PathVariable int id){
        return  service.getProductById(id);
    }

    @GetMapping("/getProductByTitle/{title}")
    public Product findProductByTitle(@PathVariable String title){
        return service.getProductByTitle(title);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return  service.updateProduct(product);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
      return service.deleteProduct(id);
    }





}
