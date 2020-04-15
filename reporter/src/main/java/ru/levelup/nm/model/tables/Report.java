package ru.levelup.nm.model.tables;

import lombok.Data;
import ru.levelup.nm.model.EntityType;
import ru.levelup.nm.model.tables.Description;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Reports")
@Data
public class Report extends Description {

    public Report(){
        setEntityType(EntityType.REPORT);
    }

    @Column
    private String header;

    @Column
    private String body;

}
