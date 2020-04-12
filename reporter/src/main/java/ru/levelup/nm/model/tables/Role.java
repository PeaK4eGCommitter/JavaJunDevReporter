package ru.levelup.nm.model.tables;

import lombok.Data;
import ru.levelup.nm.model.EntityType;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = Role.TABLE_NAME)
@Data
public class Role extends Description {
    public static final String TABLE_NAME = "Roles";
    public Role(String roleName, String description){
        super(roleName, description);
        setEntityType(EntityType.ROLE);
    }
}
