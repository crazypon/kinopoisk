package ilnur.projects.kinopoisk.entities;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force=true)
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1024)
    private String movieDescription;

    private Integer localRating;

    private Integer IMDBRating;

    private Integer rottenTomatoes;

    private String filmDirector;

    private String budget;

    private String mainCharacter;

    @Enumerated(EnumType.STRING)
    private Genres genre;

    private String imagePath;

    @ManyToMany(mappedBy = "preferences")
    private Set<User> users;

//    @JsonIgnoreProperties("movie")
    @JoinColumn(name = "movie_id")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Comment> comments;

    public enum Genres {
        FANTASY, HORROR, ACTION, FICTION, DOCUMENTARY, COMEDY
    }
}
