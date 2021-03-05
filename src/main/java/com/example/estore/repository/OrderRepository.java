package com.example.estore.repository;

import com.example.estore.entity.Product;
import com.example.estore.entity.order_details;
import com.example.estore.entity.orders;
import com.example.estore.entity.user;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.util.List;

public interface OrderRepository extends JpaRepository<orders, Integer> {


}



















