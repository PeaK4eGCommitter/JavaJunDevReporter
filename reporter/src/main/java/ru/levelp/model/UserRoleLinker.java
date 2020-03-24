package ru.levelp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@NamedQueries(
//    {
//        @NamedQuery(
//                name = "getRolesByUserId",
//                query = "from UsersToRoles utr where utr. r from roles r where ")
//    }
//)
@Entity
@Table(name = "UsersToRoles")
@AllArgsConstructor
@Data
public class UserRoleLinker{
    @Id
    @GeneratedValue
    private int id;
    /*
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private User user;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Role role;

     */
}
