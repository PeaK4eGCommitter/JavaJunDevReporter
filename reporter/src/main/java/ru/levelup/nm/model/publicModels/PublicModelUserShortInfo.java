package ru.levelup.nm.model.publicModels;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PublicModelUserShortInfo {
    private String login;
    private String name;
    private String description;
}
