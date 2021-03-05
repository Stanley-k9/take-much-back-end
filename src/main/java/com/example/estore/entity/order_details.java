package com.example.estore.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_details_tbl")

public class order_details {

    @Id
    @GeneratedValue
    private int orders_id;

    @ManyToOne
    @NotNull
    private orders order_id ;

    @ManyToOne
    @NotNull
    private Product id;



    private int quantity;


    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }
    public int getOrders_id() {
        return orders_id;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public orders getOrder_id(){return this.order_id;}
    public void setOrder_id(orders order){
        this.order_id = order;
    }
}
