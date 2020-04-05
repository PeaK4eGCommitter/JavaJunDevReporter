package ru.levelp.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.levelp.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByLogin(String login);
}
