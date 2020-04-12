package ru.levelup.nm.dao;

import lombok.SneakyThrows;
import ru.levelup.nm.model.LogType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Converter
public class LogTypeConverter implements AttributeConverter<LogType, String> {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzzz");
    private static final int PARAM_COUNT = 2;
    private static final String PARAM_SEPARATOR = ";";

    @Override
    public String convertToDatabaseColumn(LogType logType) {
        LogType record = logType;
        if (record == null) {
            record = LogType.emptyType();
        }
        return record.getUserName() + PARAM_SEPARATOR + DATE_FORMAT.format(record.getRecordDate());
    }

    @SneakyThrows
    @Override
    public LogType convertToEntityAttribute(String s) {
        if (s == null) {
            return LogType.emptyType();
        }
        String[] params = s.split(PARAM_SEPARATOR);
        if (params.length == PARAM_COUNT){
            return new LogType(params[0], DATE_FORMAT.parse(params[1]));
        } else {
            throw new IllegalArgumentException("Can'n convert '" + s + "' to LogType type.");
        }
    }
}
