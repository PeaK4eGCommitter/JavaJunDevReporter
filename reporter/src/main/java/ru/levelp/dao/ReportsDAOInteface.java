package ru.levelp.dao;

import ru.levelp.model.Report;
import ru.levelp.model.Role;

import java.util.List;

public interface ReportsDAOInteface {
    List<Report> getReportsByRoleName(String roleName);
    List<Report> getReportsByUserName(String userName);
    List<Role> getRolesByUserName(String userName);
}
