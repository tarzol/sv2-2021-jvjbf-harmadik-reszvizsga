package movietheatres;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.*;


public class MovieTheatreService {

    private Map<String, List<Movie>> shows = new TreeMap<>();

    public void readFromFile(Path path) {

        List<String> lines;

        try {
            lines = Files.readAllLines(path);
            for (String actual : lines ) {
                System.out.println(actual);
                String[] temp = actual.split("-");
                String movieName = temp[0];
                String[] performance = temp[1].split(";");

                if (!shows.containsKey(movieName)) {
                    List<Movie> films = new ArrayList<>();
                    films.add(new Movie(performance[0], LocalTime.parse(performance[1])));
                    shows.put(movieName, films);
                } else {
                   // shows.put(movieName, shows.get(movieName).add(new Movie(performance[0], LocalTime.parse(performance[1]))));
                }

            }
        } catch(IOException ioe) {
            throw new IllegalArgumentException("File cannot be found", ioe);
        }
    }

    public List<String> findMovie(String text) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, List<Movie>> actual : shows.entrySet()) {
            if (actual.getValue().contains(text));
            result.add(actual.getKey());
        }
        return result;
    }



}

