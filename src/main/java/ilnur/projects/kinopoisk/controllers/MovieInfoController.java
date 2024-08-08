package ilnur.projects.kinopoisk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ilnur.projects.kinopoisk.entities.Comment;
import ilnur.projects.kinopoisk.entities.CommentRepository;
import ilnur.projects.kinopoisk.entities.Movie;
import ilnur.projects.kinopoisk.entities.MovieRepository;

@Controller
@RequestMapping("/movieInfo")
public class MovieInfoController {

    @Autowired
    CommentRepository commentRepo;

    @Autowired
    MovieRepository movieRepo;

    @PostMapping("comment")
    public String leaveAComment(@ModelAttribute("movieComment") String comment, @RequestParam("movieId") Long movieId, Model model) {
        //TODO I should make an author of the comment when I add Spring Security
        
        Movie currentMovie = movieRepo.findMovieById(movieId).get();


        Comment commentObj = new Comment(comment);
        commentRepo.save(commentObj);

        model.addAttribute("movie", currentMovie);
        return "movie_info";
    }
}
