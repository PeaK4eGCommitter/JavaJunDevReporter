package ru.levelp.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import ru.levelp.model.Report;
import ru.levelp.model.Role;

import javax.persistence.EntityManager;
import java.util.List;

/* todo finish it

@NamedQueries({
        @NamedQuery(
                name = "getRolesByUserName",
                query = "select r from roles r where ")
    }
)
*/
@Data
@AllArgsConstructor
public class ReportsDAO implements ReportsDAOInteface {
    private EntityManager entityManager;

    @Override
    public List<Report> getReportsByRoleName(String roleName) {
        return null;
    }

    @Override
    public List<Report> getReportsByUserName(String userName) {
        return null;
    }

    @Override
    public List<Role> getRolesByUserName(String userName) {
        /* todo
        try {
            List<Role> result = entityManager.createQuery("", Role.class)
                    .setParameter("userName", userName)
                    .getResultList();
        }
         */
        return null;
    }
}
