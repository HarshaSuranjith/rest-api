package lk.nsbm.dea2.restapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Entity
@Table(name = "SONGS")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "artists", nullable = false)
    private String artist;

    @Column(name = "genre")
    private String genre;

    @Column(name = "album")
    private String album;

    @Column(name = "price")
    private Double price;

    // some content
    private byte[] songContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public byte[] getSongContent() {
        return songContent;
    }

    public void setSongContent(byte[] songContent) {
        this.songContent = songContent;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonIgnore
    public boolean isValid() {
        return name != null && !name.isEmpty() && artist != null
                && !artist.isEmpty();
    }
}
