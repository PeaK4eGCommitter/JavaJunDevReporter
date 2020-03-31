package ru.levelp.dao;

import ru.levelp.model.Report;
import ru.levelp.model.Role;
import ru.levelp.model.User;

import java.util.List;

public interface ReportsDAOInteface {
    User getUserByName(String roleName);
    Role getRoleByName(String userName);
    void post(Object object);
}
