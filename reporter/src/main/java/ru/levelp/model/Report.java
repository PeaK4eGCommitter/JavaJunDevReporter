package ru.levelp.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Reports")
@Data
public class Report extends Description {

    public Report(){
        setEntityType(EntityType.REPORT);
    }

    @Column
    private String header;

    @Column
    private String body;

//    @ManyToMany(mappedBy = "roles", targetEntity = Role.class)
//    private List<Role> roles;
}
