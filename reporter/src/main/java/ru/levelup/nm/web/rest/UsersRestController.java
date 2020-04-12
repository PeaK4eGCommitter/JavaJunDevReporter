package ru.levelup.nm.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.levelup.nm.dao.UsersRepositories;

@RestController
public class UsersRestController {
    @Autowired
    private UsersRepositories usersRepositories;

}
