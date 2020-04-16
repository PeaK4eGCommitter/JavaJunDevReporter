package ru.levelup.nm.dao.garbage;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import ru.levelup.nm.model.tables.Role;
import ru.levelup.nm.model.tables.UserAccount;
import javax.persistence.EntityManager;

@Data
@Repository
public class ReportsDAO implements ReportsDAOInteface {
//    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public ReportsDAO(@Qualifier("entityManagerFactory") EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public UserAccount getUserByName(String roleName) {
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
