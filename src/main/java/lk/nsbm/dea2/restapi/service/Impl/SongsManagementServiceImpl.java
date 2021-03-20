package lk.nsbm.dea2.restapi.service.Impl;

import lk.nsbm.dea2.restapi.model.Song;
import lk.nsbm.dea2.restapi.persitence.SongsRepository;
import lk.nsbm.dea2.restapi.service.SongsManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongsManagementServiceImpl implements SongsManagementService {

    private static final Logger log = LoggerFactory.getLogger(SongsManagementService.class);
    private final SongsRepository songsRepository;

    @Autowired
    public SongsManagementServiceImpl(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    @Override
    public Song get(String name, String artist) {
        return null;
    }

    @Override
    public Song create(Song song) {
        song = this.songsRepository.save(song);
        log.info("Created song {} in the database", song);
        return song;
    }

    @Override
    public Song update(Song song) {
        return null;
    }

    @Override
    public boolean remove(Song song) {
        return false;
    }

    @Override
    public List<Song> getRecommendations(Song song) {
        return null;
    }

    @Override
    public Optional<Song> findBySongId(Long songId) {
        return this.songsRepository.findById(songId);
    }
}
