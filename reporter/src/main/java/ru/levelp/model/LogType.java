package ru.levelp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class LogType {

    private String userName;
    private Date recordDate;

    public static LogType emptyType(){
        return new LogType("None", new Date());
    }

}
