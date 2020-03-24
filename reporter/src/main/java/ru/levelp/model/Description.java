package ru.levelp.model;

import lombok.Data;
import ru.levelp.dao.LogTypeConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * https://docs.jboss.org/hibernate/core/3.6/reference/en-US/html_single/#collections-bidirectional
 */

@Entity
@Table(name = "Descriptions")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public class Description {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    @Enumerated(EnumType.STRING)
    private EntityType entityType;
    @Column
    @Convert(converter = LogTypeConverter.class)
    private LogType log;
}
