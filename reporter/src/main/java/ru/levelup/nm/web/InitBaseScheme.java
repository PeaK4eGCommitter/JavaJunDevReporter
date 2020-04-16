package ru.levelup.nm.web;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import ru.levelup.nm.dao.repositories.MainDAO;
import ru.levelup.nm.model.tables.Role;
import ru.levelup.nm.model.tables.UserAccount;

@Component
public class InitBaseScheme {
    private final MainDAO mainDAO;

    public InitBaseScheme(MainDAO mainDAO) {
        this.mainDAO = mainDAO;
    }

    @EventListener
    public void applicationStarted(ContextRefreshedEvent event) {
        if (mainDAO.FindRole("Admins") == null) {
            Role role = mainDAO.createRole("Admins", "Role for high priority actions");
            UserAccount userAccount = mainDAO.createUserAccount("Vasiliy", "root", "qwer");
/*
            User user = new User();
            user.setLogin("root");
            user.setPassword("qwer");
            user.setEmail("mail@ya.ru");
            LogType logType = LogType.emptyType();
            logType.setUserName("Vasiliy");
            user.setLog(logType);
            mainDAO.persistObject(user);
*/
            UserAccount test = mainDAO.findUserByLogin("root");
            if ("root".equals(test.getLogin())){
                test.setDescription("sdfg");
            }
        }
    }
}
