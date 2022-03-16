package com.songr.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@Controller
public class SongrController {
    private final SongrServices songrServices;

    public SongrController(SongrServices songrServices) {
        this.songrServices = songrServices;
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
    @ResponseBody
    @GetMapping(path = "/albums")
    List<Album> albums(){
        return songrServices.GetAlbums();
    }



}
