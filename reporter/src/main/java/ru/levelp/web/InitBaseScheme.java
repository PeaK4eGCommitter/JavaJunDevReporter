package ru.levelp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.levelp.dao.repositories.UsersDAO;
import ru.levelp.model.LogType;
import ru.levelp.model.Role;
import ru.levelp.model.User;

@Component
public class InitBaseScheme {
    @Autowired
    private UsersDAO usersDAO;

    @EventListener
    @Transactional
    public void applicationStarted(ContextRefreshedEvent event) {
        if (usersDAO.FindRole("Admins") == null) {
            Role role = usersDAO.createRole("Admins", "Role for high priority actions");
            User user = usersDAO.createUser("root");
            user.setPassword("qwe");
            user.setEmail("mail@ya.ru");
            LogType logType = LogType.emptyType();
            logType.setUserName("startup");
            user.setLog(logType);
        }
    }
}
