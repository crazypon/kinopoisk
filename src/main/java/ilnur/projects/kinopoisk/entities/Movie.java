package ilnur.projects.kinopoisk.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force=true)
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String movieDescription;

    private Integer localRating;

    private Integer IMDBRating;

    private Integer rottenTomatoes;

    private String mainCharacter;

    private String imagePath;

    @ManyToMany(mappedBy = "preferences")
    private Set<User> users;

    @ManyToMany()
    private Set<Comment> comments;
}
