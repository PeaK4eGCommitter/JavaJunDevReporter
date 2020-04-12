package ru.levelup.nm.dao.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ru.levelup.nm.model.tables.Role;
import ru.levelup.nm.tests.TestConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UsersDAOTest {
    private UsersDAO usersDAO;
    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;

    @Before
    public void setup() {
        entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistenceUnit");
        entityManager = entityManagerFactory.createEntityManager();
        usersDAO = new UsersDAO(entityManager);
    }

    @Test
    @Transactional
    public void createRole() {
        Role role = null;
        entityManager.getTransaction().begin();
        try {
            role = usersDAO.createRole("RoleName", "Role Desription");
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
        assertNotNull(role);
        assertEquals("RoleName", role.getName());
        Role foundRole = usersDAO.FindRole("RoleName");
        assertNotNull(foundRole);
        assertEquals("RoleName", foundRole.getName());
    }

//    @Test
//    public void findRole() {
//    }
//
//    @Test
//    public void findUser() {
//    }
//
//    @Test
//    public void persistObject() {
//    }
}
