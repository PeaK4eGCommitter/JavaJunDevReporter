package ru.levelp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Roles")
@Data
public class Role extends Description {

    public Role(){
        setEntityType(EntityType.ROLE);
    }

//    @ManyToOne
//    private User user;

//    @ManyToMany
//    private List<User> users;

//    @ManyToMany(mappedBy = "roles")
//    private List<User> users;

//    @ManyToMany(mappedBy = "roles")
//    private List<Report> reports;
}
