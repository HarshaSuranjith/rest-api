package lk.nsbm.dea2.restapi.controller;

import lk.nsbm.dea2.restapi.model.Song;
import lk.nsbm.dea2.restapi.service.SongsManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SongsController {

    private final SongsManagementService songsManagementService;

    @Autowired
    public SongsController(SongsManagementService songsManagementService) {
        this.songsManagementService = songsManagementService;
    }

    @GetMapping(path = "/songs")
    public List<Song> getSongs() {
        return new ArrayList<Song>();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        if (song.isValid()) {
            // perform svae operations
            song = this.songsManagementService.create(song);
            return song;
        } else {
            // received a bad request
            return null;
        }
    }
}
