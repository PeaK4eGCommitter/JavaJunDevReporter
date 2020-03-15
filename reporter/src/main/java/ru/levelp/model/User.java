package ru.levelp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
@Data
@Setter
public class User extends Description {
    @Column
    private String email;
    @Column
    private String password;
}
