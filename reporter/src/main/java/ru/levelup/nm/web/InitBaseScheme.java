package ru.levelup.nm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.levelup.nm.dao.repositories.UsersDAO;
import ru.levelup.nm.model.LogType;
import ru.levelup.nm.model.tables.Role;
import ru.levelup.nm.model.tables.User;

@Component
public class InitBaseScheme {
    @Autowired
    private UsersDAO usersDAO;

    @EventListener
    @Transactional
    public void applicationStarted(ContextRefreshedEvent event) {
        if (usersDAO.FindRole("Admins") == null) {
            Role role = usersDAO.createRole("Admins", "Role for high priority actions");
//            Role role = new Role("Admins", "Role for high priority actions");
//            usersDAO.persistObject(role);
            User user = new User();
            user.setLogin("root");
            user.setPassword("qwer");
            user.setEmail("mail@ya.ru");
            LogType logType = LogType.emptyType();
            logType.setUserName("Vasiliy");
            user.setLog(logType);
            usersDAO.persistObject(user);
        }
    }
}
