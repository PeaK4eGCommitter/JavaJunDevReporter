package ru.levelup.nm.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.levelup.nm.model.tables.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByLogin(String login);
}
