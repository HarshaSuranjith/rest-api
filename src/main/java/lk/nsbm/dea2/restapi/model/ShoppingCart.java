package lk.nsbm.dea2.restapi.model;

import java.util.List;

public class ShoppingCart {

    private List<Song> songs;

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    // get total of the songs
    public Double total() {
        Double total = 0.0d;
        for (Song song : this.songs) {
            total += song.getPrice();
        }
        return total;
    }

    public boolean isInCart(Song song) {
        return this.songs.contains(song);
    }
}
