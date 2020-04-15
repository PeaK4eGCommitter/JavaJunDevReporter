package ru.levelup.nm.web.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Configuration
@EnableJpaRepositories(basePackages = "ru.levelup.nm.dao")
public class ConfigurationApp {
/*
    @Bean
    public EntityManager getRealEntityManager(EntityManagerFactory entityManagerFactory){
        return entityManagerFactory.createEntityManager();
    }
    @Bean
    public EntityManagerFactory getFactory(){
        return Persistence.createEntityManagerFactory("ProdPersistenceUnit");
    }
 */
}
