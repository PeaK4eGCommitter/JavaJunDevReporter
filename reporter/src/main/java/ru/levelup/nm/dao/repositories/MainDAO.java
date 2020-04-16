package ru.levelup.nm.dao.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.levelup.nm.model.tables.Role;
import ru.levelup.nm.model.tables.UserAccount;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
public class MainDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Role createRole(String roleName, String description){
        Role newRole = new Role(roleName, description);
        entityManager.persist(newRole);
        return newRole;
    }

    @Transactional
    public UserAccount createUserAccount(String userName, String login, String password){
        UserAccount newUserAccount = new UserAccount();
        newUserAccount.setName(userName);
        newUserAccount.setLogin(login);
        newUserAccount.setPassword(password);
        entityManager.persist(newUserAccount);
        return newUserAccount;
    }

    public Role FindRole(String roleName){
        return (Role) getObjectFromTable("Role", roleName);
    }

    public UserAccount FindUser(String userName){
        return (UserAccount) getObjectFromTable("User", userName);
    }

    private Object getObjectFromTable(String tableName, String name){
        try {
            return entityManager.createQuery("SELECT rl from " + tableName + " rl WHERE rl.name = :entityName")
                    .setParameter("entityName", name).getSingleResult();
        } catch (NoResultException cause){
            return null;
        }
    }
    @Transactional
    public void persistObject(Object object) {
        entityManager.persist(object);
    }

    public UserAccount findUserByLogin(String login) {
        try {
            final String tableName = "UserAccount";
            return (UserAccount) entityManager.createQuery("SELECT u from " + tableName + " u WHERE u.login = :entityName")
                    .setParameter("entityName", login).getSingleResult();
        } catch (NoResultException cause){
            return null;
        }
    }
}
