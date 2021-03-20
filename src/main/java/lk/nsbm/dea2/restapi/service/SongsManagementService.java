package lk.nsbm.dea2.restapi.service;

import lk.nsbm.dea2.restapi.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongsManagementService {

    Song get(String name, String artist);

    Song create(Song song);

    Song update(Song song);

    boolean remove(Song song);

    List<Song> getRecommendations(Song song);

    Optional<Song> findBySongId(Long songId);
}
