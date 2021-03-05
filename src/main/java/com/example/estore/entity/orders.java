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
@Table(name = "order_tbl")

public class orders {

    @Id
    @GeneratedValue
    private int order_id;

    @ManyToOne
    @NotNull
    private user user_id;

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_id() {
        return order_id;
    }


    public void setUser(user user){
        this.user_id = user;
    }

    public user getUserID() {
        return this.user_id;
    }

}