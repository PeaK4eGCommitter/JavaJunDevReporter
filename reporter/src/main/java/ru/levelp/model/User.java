package ru.levelp.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

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

    @OneToMany
    private Set<Role> roles;

//    @ManyToMany(mappedBy = "users")
//    private List<Role> roles;
}
