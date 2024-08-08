package ilnur.projects.kinopoisk.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ilnur.projects.kinopoisk.entities.Comment;
import ilnur.projects.kinopoisk.entities.CommentRepository;
import ilnur.projects.kinopoisk.entities.Movie;
import ilnur.projects.kinopoisk.entities.MovieRepository;

@Controller
public class MoviesController {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    CommentRepository commentRepository;

    @GetMapping("/movies")
    public String showMovies(Model model) {
 
        model.addAttribute("movies", movieRepository.findAll());
        return "movies";
    }

    @PostMapping("/movies")
    public String showMovieDetails(@RequestParam("movieId") Long movieID, Model model) {
        // that's how we get Object from optional
        // I should add comments here....

        Movie movieOne = movieRepository.findMovieById(movieID).get();
        model.addAttribute("movie", movieOne);
        model.addAttribute("comments", Arrays.asList(commentRepository.findCommentsByMovieId(movieID)));
        return "movie_info";
    }

}
