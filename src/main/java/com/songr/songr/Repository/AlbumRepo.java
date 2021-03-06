package com.songr.songr.Repository;

import com.songr.songr.Module.Album;
import com.songr.songr.Module.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepo extends JpaRepository<Album, Long> {

}
