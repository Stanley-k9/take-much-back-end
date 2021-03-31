package com.example.estore.service;

import com.example.estore.entity.Product;
import com.example.estore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){

        return repository.save(product);
    }

    public Long listNoProducts(){

        return repository.count();
    }

    public List<Product> saveProducts(List<Product> products){

        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }


    public Product getProductById(int Id){
        return repository.findById(Id).orElse(null);
    }


    public Product getProductByTitle(String title){
        return repository.findByTitle(title);
    }




    public String deleteProduct(int id){
        repository.deleteById(id);
        return  "product removed || " + id;
    }

public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setTitle(product.getTitle());
    existingProduct.setQuantity(product.getQuantity());
    existingProduct.setPrice(product.getPrice());

    //description
    existingProduct.setDescription(product.getDescription());
    existingProduct.setShort_desk(product.getShort_desk());

    //image
    existingProduct.setPicture(product.getPicture());
    return  repository.save(existingProduct);
}

}
