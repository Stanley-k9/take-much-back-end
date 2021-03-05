package com.example.estore.service;


import com.example.estore.entity.Product;
import com.example.estore.entity.order_details;
import com.example.estore.entity.orders;
import com.example.estore.entity.user;
import com.example.estore.repository.orderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class orderDetailsService {

    @Autowired
    private orderDetailsRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

 /*   public List<order_details> saveOrder(List<order_details> Order_details){

        return
        repository.saveAll(Order_details);
    }*/


    public List<order_details> getOrders(){
        return repository.findAll();
    }



    public order_details getOrderById(int Id){
        return repository.findById(Id).orElse(null);
    }

    public List<order_details> addOrders(List<order_details> order_details){
        return repository.saveAll(order_details);
    }

/*
    @Autowired orders orders;
    @Autowired user user;
    @Autowired order_details order_details;
    @Autowired Product product;

    @Transactional
    public void addNew() {
        entityManager.createNativeQuery("INSERT INTO `take_much`.`order_tbl` (`order_id`, `user_id_user_id`) VALUES (?,?)")
                .setParameter(1, orders.getOrder_id())
                .setParameter(2, user.getUser_id())
                .executeUpdate();

        entityManager.createNativeQuery("INSERT INTO `take_much`.`order_details_tbl` (`orders_id`, `quantity`, `id_id`, `order_id_order_id`) VALUES (?,?,?,?)")
                .setParameter(1, order_details.getOrders_id())
                .setParameter(2, order_details.getQuantity())
                .setParameter(3, product.getId())
                .setParameter(4, orders.getOrder_id())
                .executeUpdate();
    }*/
}
