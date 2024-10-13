package ilnur.projects.kinopoisk.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ilnur.projects.kinopoisk.entities.Comment;
import ilnur.projects.kinopoisk.entities.Movie;
import ilnur.projects.kinopoisk.entities.MovieRepository;

@RestController
@RequestMapping("/app/v1")
@CrossOrigin
public class MoviesController {
    
    @Autowired
    MovieRepository movieRepo;

    @GetMapping("/movies")
    public Iterable<Movie> showMovies() {
        Iterable<Movie> movies = movieRepo.findAll();
        return movies;
    }   
    
    @GetMapping("/movies/{id}")
    public Movie showMovieDetails(@PathVariable Long id) {
        Optional<Movie> movie = movieRepo.findMovieById(id);
        System.out.println(movie.get().getComments());
        for (Comment comment : movie.get().getComments()) {
            System.out.println(comment.getContent());
        }
        return movie.get();
    }

}
