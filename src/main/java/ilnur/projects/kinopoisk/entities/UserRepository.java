package ilnur.projects.kinopoisk.entities;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    Optional<User> findUserById(Integer id);
}
