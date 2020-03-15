package ru.levelp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Reports")
@Data
public class Report extends Description {
    @Column
    private String header;
    @Column
    private String Body;
}
