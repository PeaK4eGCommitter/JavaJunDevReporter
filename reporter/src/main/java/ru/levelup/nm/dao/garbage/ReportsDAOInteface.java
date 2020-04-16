package ru.levelup.nm.dao.garbage;

import ru.levelup.nm.model.tables.Role;
import ru.levelup.nm.model.tables.UserAccount;

public interface ReportsDAOInteface {
    UserAccount getUserByName(String roleName);
    Role getRoleByName(String userName);
    void post(Object object);
}
