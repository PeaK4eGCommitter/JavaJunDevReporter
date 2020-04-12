package ru.levelup.nm.model.tables;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.levelup.nm.dao.LogTypeConverter;
import ru.levelup.nm.model.EntityType;
import ru.levelup.nm.model.LogType;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Чтобы не забыть, откуда черпать вдохновение
 * https://docs.jboss.org/hibernate/core/3.6/reference/en-US/html_single/#collections-bidirectional
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
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

    public Description(String name, String description){
        this.setName(name);
        this.setDescription(description);
    }
}
