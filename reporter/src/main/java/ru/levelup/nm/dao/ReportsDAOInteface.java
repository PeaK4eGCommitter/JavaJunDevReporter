package ru.levelup.nm.dao;

import ru.levelup.nm.model.tables.Role;
import ru.levelup.nm.model.tables.User;

public interface ReportsDAOInteface {
    User getUserByName(String roleName);
    Role getRoleByName(String userName);
    void post(Object object);
}
