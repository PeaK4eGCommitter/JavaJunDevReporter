package ru.levelp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Roles")
@Data
public class Role extends Description {
}
