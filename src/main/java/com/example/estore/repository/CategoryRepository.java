package com.example.estore.repository;


import com.example.estore.entity.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CategoryRepository extends JpaRepository<category, Integer> {


    @Query( value =  "select" + " * " +
            " from products_tbl p "+
            ", category_tbl c "+
            "where c.cat_id = p.cat_id_cat_id  "+
            "and c.cat_title = :cat_title", nativeQuery = true)
    List<category> findByCat(String cat_title);

}
