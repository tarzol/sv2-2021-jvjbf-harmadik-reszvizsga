package streams;

import java.time.LocalDate;
import java.util.List;

public class Song {

    private String title;
    private int length;
    private List<String> performers;
    private LocalDate release;

    public Song(String title, int length, List<String> performers, LocalDate release) {
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.release = release;
    }

    public List<String> getPerformers() {
        return performers;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public LocalDate getRelease() {
        return release;
    }
}
