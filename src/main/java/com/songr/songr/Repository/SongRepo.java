package com.songr.songr.Repository;

import com.songr.songr.Module.Album;
import com.songr.songr.Module.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SongRepo extends JpaRepository<Song,Long> {

   List<Song> findByalbum(Album album);

    @Query(value = "from Song where album_id = ?1")
    List<Song> findAllSongs(Long id);

}
