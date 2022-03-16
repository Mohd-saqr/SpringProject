package com.songr.songr;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongrServices {

    public List<Album> GetAlbums(){
        List<Album> albums = new ArrayList<>();
        albums.add(new Album("Machine Gun Kelly","Khaled ",116
                ,"10000s"
                ,"http://cdn1.songlyricscom.netdna-cdn.com/album_covers/251/the-xx-xx/the-xx-44876-xx.jpg"));

        albums.add(new Album("Michael Jackson - Miscellaneous Album","Michael Jackson ",224
                ,"11000s"
                ,"http://cdn1.songlyricscom.netdna-cdn.com/album_covers/2/michael-jackson/michael-jackson-22187.jpg"));
        albums.add( new Album("Miley Cyrus - Bangerz Album"," Miley Cyrus ",197
                ,"50000s"
                ,"http://cdn1.songlyricscom.netdna-cdn.com/album_covers/230/miley-cyrus-bangerz/miley-cyrus-133340-bangerz.jpg"));
        albums.add( new Album("Katy Perry - Prism Album\n","Khaled ",240
                ,"600200s"
                ,"http://cdn1.songlyricscom.netdna-cdn.com/album_covers/132/katy-perry-prism/katy-perry-132987-prism.jpg"));
        return albums;
    };
}
