package com.songr.songr.Sevrices;

import com.songr.songr.Module.Album;
import com.songr.songr.Module.Song;
import org.springframework.ui.Model;

import java.util.List;

public interface SongApplicationSER {
    void deleteSong(long id);
    void deleteAlbum(long id);
    void eidteSong(Song song);
    void EditeAlbum(Album album);
    List<Album> getAllAlbum();
    List<Song> getAllSong();
    void addSong(Song song);
    void addAlbum(Album album);
    void HomePage(Model model);
    Song getSong(long id ,Model model);
    Album getAlbum(long id,Model model);
    List<Song>GetAllSongsById(Long id,Model model);



}
