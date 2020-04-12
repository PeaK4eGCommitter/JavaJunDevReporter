package ru.levelup.nm.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.levelup.nm.model.tables.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DescriptionTest {
    private EntityManagerFactory factory;
    private EntityManager manager;

    @Before
    public void connect() {
        factory = Persistence.createEntityManagerFactory("TestPersistenceUnit");
        manager = factory.createEntityManager();
    }

    @After
    public void close() {
        if (manager != null) {
            manager.close();
        }
        if (factory != null) {
            factory.close();
        }
    }

    @Test
    public void createUserTest() {
        User user = new User();
        user.setEmail("test-user@email.com");
        user.setLogin("testLogin");
        user.setPassword("testPass");

        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();
    }
}