package com.songr.songr.Repository;

import com.songr.songr.Module.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<Song,Long> {
}
