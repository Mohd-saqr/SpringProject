package com.songr.songr.Sevrices;

import com.songr.songr.Exception.NotFoundException;
import com.songr.songr.Module.Album;
import com.songr.songr.Module.Song;
import com.songr.songr.Repository.AlbumRepo;
import com.songr.songr.Repository.SongRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import java.util.List;


@Service
public class SongrServicesIMP implements SongApplicationSER {
    private final AlbumRepo albumRepo;
    private final SongRepo songRepo;

    public SongrServicesIMP(AlbumRepo albumRepo, SongRepo songRepo) {
        this.albumRepo = albumRepo;
        this.songRepo = songRepo;
    }

    @Override
    public void deleteSong(long id) {
        songRepo.deleteById(id);
    }

    @Override
    public void deleteAlbum(long id) {
        List<Song> song = songRepo.findByalbum(albumRepo.getById(id));
        if (song != null) songRepo.deleteAll(song);
        if (albumRepo.existsById(id)) albumRepo.deleteById(id);
    }

    @Override
    @Transactional
    public void eidteSong(Song song) {
        Song song1 = songRepo.getById(song.getId());
        song1.setAlbum(song.getAlbum());
        song1.setLength(song.getLength());
        song1.setTitle(song.getTitle());
        song1.setTrackNumber(song.getTrackNumber());
    }


    @Override
    @Transactional
    public void EditeAlbum(Album album) {
        Album album1 = albumRepo.getById(album.getId());
        album1.setArtist(album.getArtist());
        album1.setTitle(album.getTitle());
        album1.setLength(album.getLength());
        album1.setSongCount(album.getSongCount());
        album1.setImageUrl(album.getImageUrl());
    }


    @Override
    public List<Album> getAllAlbum() {
        return albumRepo.findAll();
    }

    @Override
    public List<Song> getAllSong() {
        return songRepo.findAll();
    }

    @Override
    public void addSong(Song song) {
        if (song.getAlbum() == null) {
//            song.setAlbum(new Album());
            songRepo.save(song);
        } else {
            Album album = albumRepo.findById(song.getAlbum().getId()).orElseThrow(() -> new NotFoundException("album " + song.getAlbum().getId() + "Not found"));
            song.setAlbum(album);
            songRepo.save(song);
        }
    }

    @Override
    public void addAlbum(Album album) {
        albumRepo.save(album);
    }

    @Override
    public void HomePage(Model model) {
        model.addAttribute("SongList", songRepo.findAll());
        model.addAttribute("AlbumList", albumRepo.findAll());
    }

    @Override
    public Song getSong(long id, Model model) {
        model.addAttribute("AlbumList", albumRepo.findAll());
        model.addAttribute("songOne", songRepo.getById(id));
        return songRepo.getById(id);

    }

    @Override
    public Album getAlbum(long id, Model model) {
        model.addAttribute("AlbumOne", albumRepo.getById(id));
        return albumRepo.getById(id);
    }

    @Override
    public List<Song> GetAllSongsById(Long id, Model model) {
        model.addAttribute("Songs", songRepo.findAllSongs(id));
        return songRepo.findAllSongs(id);
    }

}
