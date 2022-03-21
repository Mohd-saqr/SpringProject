package com.songr.songr.Controller;

import com.songr.songr.Module.Album;
import com.songr.songr.Repository.AlbumRepo;
import com.songr.songr.Sevrices.SongrServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongrController {
    private final SongrServices songrServices;
    private final AlbumRepo albumRepo;
    @Autowired
    public SongrController(SongrServices songrServices, AlbumRepo albumRepo) {
        this.songrServices = songrServices;
        this.albumRepo = albumRepo;
    }

    @GetMapping(path = "/hello")
    String HelloWorld() {
        return "Home";
    }


    @GetMapping(path = "/capitalize/{Str}")
    String capitalize(@PathVariable String Str, Model model) {
        model.addAttribute("string", Str.toUpperCase());
        return "index";
    }

    @GetMapping(path = "/")
       RedirectView albums(){

        return new RedirectView("album");

    }

    @PostMapping("/addalbum")
    public RedirectView addNewAlbum(@ModelAttribute Album album){
        albumRepo.save(album);
        return new RedirectView("album");
    }

    @GetMapping("/album")
    public  String getAllAlbum(Model model) {
        model.addAttribute("AlbumList",albumRepo.findAll());
        return "Album";
    }
    }




