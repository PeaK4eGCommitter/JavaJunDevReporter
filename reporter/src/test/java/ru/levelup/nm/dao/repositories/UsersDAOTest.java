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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class UsersDAOTest {
    @Autowired
    private MainDAO mainDAO;
    @Autowired
    private EntityManager entityManager;

    @Before
    public void setup() {

    }

    @Test
    @Transactional
    public void createRole() {
        Role role = mainDAO.createRole("RoleName", "Role Desription");
        assertNotNull(role);
        assertEquals("RoleName", role.getName());
        Role foundRole = mainDAO.FindRole("RoleName");
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
