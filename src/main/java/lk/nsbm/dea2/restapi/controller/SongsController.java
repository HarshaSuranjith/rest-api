package lk.nsbm.dea2.restapi.controller;

import lk.nsbm.dea2.restapi.model.Song;
import lk.nsbm.dea2.restapi.service.SongsManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<?> addSong(@RequestBody Song song, HttpServletRequest request) {
        if (song.isValid()) {
            // perform svae operations
            song = this.songsManagementService.create(song);
            String uri = request.getRequestURI() + "/" + song.getId();
            return ResponseEntity.created(URI.create(uri)).body(song);
        } else {
            // received a bad request
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/songs/{someId}")
    public ResponseEntity getSongById(@PathVariable(name = "someId") Long songId) {
        Optional<Song> song = this.songsManagementService.findBySongId(songId);
        if (song.isPresent()) {
            return ResponseEntity.ok(song.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/songs/{songId}")
    public ResponseEntity updateSong(@RequestBody Song song) {

    }
}
