package com.mycompany.app;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class MyBean {
    @PersistenceContext
    private EntityManager entityManager;

    public List<MyEntity> getEntities() {
        return entityManager.createQuery("SELECT e FROM MyEntity e", MyEntity.class)
                .getResultList();
    }
}
