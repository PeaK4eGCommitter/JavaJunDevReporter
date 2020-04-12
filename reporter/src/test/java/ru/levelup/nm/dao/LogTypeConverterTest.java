package ru.levelup.nm.dao;

import org.junit.Test;
import ru.levelup.nm.model.LogType;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class LogTypeConverterTest {
    private static final String PARAM_SEPARATOR = ";";
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzzz");
    private LogTypeConverter converter = new LogTypeConverter();
    final LogType expectedLogType = LogType.emptyType();
    final String expectedStringResult = expectedLogType.getUserName() + PARAM_SEPARATOR
            + DATE_FORMAT.format(expectedLogType.getRecordDate());

    @Test
    public void convertToDatabaseColumn() {
        String testedRecord = converter.convertToDatabaseColumn(expectedLogType);
        assertEquals("Convertation to String error!", expectedStringResult, testedRecord);
    }

    @Test
    public void convertToEntityAttribute() {
        LogType logType = converter.convertToEntityAttribute(expectedStringResult);
        assertEquals("Name convertation error!", expectedLogType.getUserName(), logType.getUserName());
        assertEquals("Date convertation error!", DATE_FORMAT.format(expectedLogType.getRecordDate()),
                DATE_FORMAT.format(logType.getRecordDate()));
    }
}