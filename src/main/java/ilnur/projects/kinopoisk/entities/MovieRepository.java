package ilnur.projects.kinopoisk.entities;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long>{
    Optional<Movie> findMovieById(Long id);
}
