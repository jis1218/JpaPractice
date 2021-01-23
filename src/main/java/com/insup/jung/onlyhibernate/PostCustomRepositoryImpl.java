package com.insup.jung.onlyhibernate;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class PostCustomRepositoryImpl implements PostCustomRepository{

    @Autowired
    EntityManager entityManager;


    @Override
    public List<Post> findMyPost() {
        System.out.println("custom");
        return entityManager.createQuery("SELECT p FROM Post As p").getResultList();
    }
}
