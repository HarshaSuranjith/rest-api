package lk.nsbm.dea2.restapi.persitence;

import lk.nsbm.dea2.restapi.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsRepository extends CrudRepository<Song, Long> {
}
