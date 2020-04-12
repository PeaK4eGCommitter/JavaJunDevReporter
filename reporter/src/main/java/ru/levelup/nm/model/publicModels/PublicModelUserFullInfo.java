package ru.levelup.nm.model.publicModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.levelup.nm.model.EntityType;
import ru.levelup.nm.model.LogType;

@Data
@AllArgsConstructor
public class PublicModelUserFullInfo {
    private int id;
    private String login;
    private String email;
    private String name;
    private String description;
    private EntityType entityType;
    private LogType log;
}
