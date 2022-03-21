package com.songr.songr.Repository;

import com.songr.songr.Module.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepo extends CrudRepository<Album,Integer> {
}
