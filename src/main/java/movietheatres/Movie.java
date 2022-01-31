package movietheatres;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Movie implements Comparable<Movie> {

    private String title;
    private LocalTime startTime;

    public Movie(String title, LocalTime startTime) {
        this.title = title;
        this.startTime = startTime;
    }

    @Override
    public int compareTo(Movie o) {
        return getTitle().compareTo(o.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return title.equals(movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    public String getTitle() {
        return title;
    }

    public LocalTime getStartTime() {
        return startTime;
    }
}

//    void createMovie(){
//        Movie movie = new Movie("Star Wars", LocalTime.of(12,30));
//
//        assertEquals("Star Wars",movie.getTitle());
//        assertEquals(LocalTime.of(12,30),movie.getStartTime());
//
//    }
//
//    @Test
//    void testEqualsAndHashCode(){
//        Movie movie = new Movie("Star Wars", LocalTime.of(12,30));
//        Movie other = new Movie("Star Wars", LocalTime.of(13,30));