package com.example.estore.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class orderRep {

    @PersistenceContext
    private EntityManager entityManager;
}
