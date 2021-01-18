package com.insup.jung;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class JPARunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager; //JPA의 핵심

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setUsername("insup");
        account.setPassword("hahahaha");

        Session session = entityManager.unwrap(Session.class);

        session.save(account);
    }
}
