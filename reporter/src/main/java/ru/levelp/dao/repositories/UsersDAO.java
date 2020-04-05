package ru.levelp.dao.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.levelp.model.Role;
import ru.levelp.model.User;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

@Repository
public class UsersDAO {
    @PersistenceContext
    private EntityManager manager;

    @Transactional
    public Role createRole(String roleName, String description){
        Role newRole = new Role(roleName, description);
        manager.persist(newRole);
        return newRole;
    }

    @Transactional
    public User createUser(String userName){
        User newUser = new User();
        newUser.setName(userName);
        manager.persist(newUser);
        return newUser;
    }

    public Role FindRole(String roleName){
        return (Role) getObjectFromTable("Roles", roleName);
    }

    public User FindUser(String userName){
        return (User) getObjectFromTable("Users", userName);
    }

    private Object getObjectFromTable(String tableName, String name){
        try {
            return manager.createQuery("select rl from " + tableName + " rl where rl.Name = :entityName")
                    .setParameter("entityName", name).getSingleResult();
        } catch (NoResultException cause){
            return null;
        }
    }
}
