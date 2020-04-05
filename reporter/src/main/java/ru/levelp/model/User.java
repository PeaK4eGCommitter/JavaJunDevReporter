package ru.levelp.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Users")
@Data
public class User extends Description {
    public User(){
        setEntityType(EntityType.USER);
    }

    @Column
    private String email;

    @Column
    private String password;

    @
}
