package ru.levelp.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Roles")
@Data
public class Role extends Description {
    public Role(String roleName, String description){
        super(roleName, description);
        setEntityType(EntityType.ROLE);
    }
}
