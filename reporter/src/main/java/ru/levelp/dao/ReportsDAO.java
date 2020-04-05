package ru.levelp.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import ru.levelp.model.Role;
import ru.levelp.model.User;
import javax.persistence.EntityManager;

@Data
@Repository
public class ReportsDAO implements ReportsDAOInteface {
    private EntityManager entityManager;

    @Autowired
    public ReportsDAO(@Qualifier("realManager") EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public User getUserByName(String roleName) {
        return null;
    }

    @Override
    public Role getRoleByName(String userName) {
        return null;
    }

    @Override
    public void post(Object object) {
        entityManager.getTransaction().begin();
        try {
            entityManager.persist(object);
        } catch (Throwable cause) {
            entityManager.getTransaction().rollback();
            throw cause;
        }
        entityManager.getTransaction().commit();
    }
}
