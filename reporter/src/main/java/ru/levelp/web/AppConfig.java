package ru.levelp.web;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Configuration
public class AppConfig{
    @Bean
    @Qualifier("realManager")
    public EntityManager getRealEntityManager(EntityManagerFactory entityManagerFactory){
        return entityManagerFactory.createEntityManager();
    }

    @Bean
    @Qualifier("fakeManager")
    public EntityManager getFakeEntityManager(EntityManagerFactory entityManagerFactory){
        return null;
    }

    @Bean
    public EntityManagerFactory getFactory(){
        return Persistence.createEntityManagerFactory("TestPersistenceUnit");
    }
}
