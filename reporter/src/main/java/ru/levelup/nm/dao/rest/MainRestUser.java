package ru.levelup.nm.dao.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import ru.levelup.nm.dao.garbage.UsersRepositories;
import ru.levelup.nm.model.tables.User;

@Repository
@RepositoryRestResource(
        collectionResourceRel = UsersRepositories.API_URL,
        itemResourceRel = UsersRepositories.API_URL,
        path = UsersRepositories.API_URL
)
public interface MainRestUser extends PagingAndSortingRepository<User, Integer> {
    String API_URL = "users-rest-api";

    User findByLogin(@Param("loginName") String login);
}
