package lk.nsbm.dea2.restapi.service;

import lk.nsbm.dea2.restapi.model.Song;

import java.util.List;

public interface SongsManagementService {

    Song get(String name, String artist);

    Song create(Song song);

    Song update(Song song);

    boolean remove(Song song);

    List<Song> getRecommendations(Song song);
}
