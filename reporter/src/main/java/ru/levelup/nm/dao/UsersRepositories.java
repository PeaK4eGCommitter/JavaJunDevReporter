package ru.levelup.nm.dao;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import ru.levelup.nm.model.tables.User;

@Repository
@RepositoryRestResource(
        collectionResourceRel = UsersRepositories.API_URL,
        itemResourceRel = UsersRepositories.API_URL,
        path = UsersRepositories.API_URL
)
public interface UsersRepositories extends PagingAndSortingRepository<User, Integer> {
    String API_URL = "rest-data-users";

    User findByLogin(@Param("loginName") String login);

//    Page<User> getAllUsers(Pageable page);
}
