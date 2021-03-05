package com.example.estore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products_tbl")

public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private int quantity;
    private double price;
    private String description;
    private String short_desk;
    private String Picture;
    private int cat_id_cat_id;




    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id",referencedColumnName = "product_id" )

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getShort_desk() {
        return short_desk;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setShort_desk(String short_desk) {
        this.short_desk = short_desk;
    }


    public String getPicture() {
        return  Picture;
    }

    public void setPicture(String picture) {
        this.Picture = picture;
    }
}
