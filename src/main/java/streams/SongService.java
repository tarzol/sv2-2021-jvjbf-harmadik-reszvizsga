package streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SongService {

    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }
//    Add vissza a legrövidebb dalt, Optional-ként!
    public String shortestSong() {
        return  songs.stream()
                .min(new Comparator<Song>() {
                    @Override
                    public int compare(Song o1, Song o2) {
                        return o1.getLength()-o2.getLength();
                    }
                }).orElseThrow(()->new IllegalArgumentException("No songs in the list"))
                .getTitle();
    }

//    Add vissza dalok listáját cím alapján! (Két dalnak lehet ugyanaz a címe)
    public List<Song> findSongByTitle(String song) {
        return songs.stream()
                .filter(s->s.getTitle().equals(song))
                .collect(Collectors.toList());

    }

//    Lehessen lekérdezni, hogy egy előadó szerepel-e egy konkrét dal előadóinak listájában!
    public boolean isPerformerInSong(Song song, String performer) {
        return songs.stream()
                .filter(s->s.getTitle().equals(song.getTitle()))
                .anyMatch(s->s.getPerformers().contains(performer));
    }

//    Gyűjtsd ki az összes dal címét, ami egy paraméterül átadott dátum előtt jelent meg!
    public List<String> titlesBeforeDate(LocalDate date) {
        return songs.stream()
                .filter(s->s.getRelease().isBefore(date))
                .map(s->s.getTitle())
                .toList();

    }



}
