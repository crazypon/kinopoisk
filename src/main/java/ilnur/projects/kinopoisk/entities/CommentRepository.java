package ilnur.projects.kinopoisk.entities;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long>{
    Comment findCommentsByMovieId(Long movieId);
}
