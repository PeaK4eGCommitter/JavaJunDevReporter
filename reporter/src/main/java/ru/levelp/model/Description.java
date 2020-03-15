package ru.levelp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Descriptions")
@Data
public class Description {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String description;
}
