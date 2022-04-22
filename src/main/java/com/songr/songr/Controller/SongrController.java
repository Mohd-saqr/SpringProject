package com.songr.songr.Controller;

import com.songr.songr.Module.Album;
import com.songr.songr.Module.Song;
import com.songr.songr.Sevrices.SongrServicesIMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.lang.reflect.Method;
import java.util.List;

@Controller
public class SongrController {

    private final SongrServicesIMP songrServicesIMP;

    public SongrController(SongrServicesIMP songrServicesIMP) {
        this.songrServicesIMP = songrServicesIMP;
    }

    ///GET HOME PAGE
    @GetMapping(path = "/")
    String Home(Model model) {
        songrServicesIMP.HomePage(model);
        return "Home";
    }

    ///// this method for testing

    ///sdadasda
    @GetMapping(path = "/capitalize/{Str}")
    String capitalize(@PathVariable String Str, Model model) {
        model.addAttribute("string", Str.toUpperCase());
        return "index";
    }

    /// ADD NEW ALBUM
    @PostMapping("/addalbum")
    public RedirectView addNewAlbum(@ModelAttribute Album album) {
        songrServicesIMP.addAlbum(album);
        return new RedirectView("/");
    }

    // ADD NEW SONG
    @ResponseBody
    @PostMapping("/songAdd")
    RedirectView addSong(@ModelAttribute Song songC, @ModelAttribute String id) {
        songrServicesIMP.addSong(songC);
        return new RedirectView("/");

    }
    // GET ALL SONG
    @ResponseBody
    @GetMapping("/getAllSong") //this end Point used for PostMAN
    List<Song> getAllSong() {
        return songrServicesIMP.getAllSong();
    }
    /// GET ALL ALBUM
    @ResponseBody
    @GetMapping("/getAllAlbum") // this end Point  used for  PostMAN
    List<Album> getAllAlbum() {
        return songrServicesIMP.getAllAlbum();
    }
    //DELETE SONG
    @ResponseBody
    @GetMapping("/deleteSong/{id}")
    RedirectView deleteSong(@PathVariable Long id){
        songrServicesIMP.deleteSong(id);
        return new RedirectView("/");
    }
    // DELETE ALBUM
    @ResponseBody
    @GetMapping("/deleteAlbum/{id}")
    RedirectView deleteAlbum(@PathVariable Long id ){
        songrServicesIMP.deleteAlbum(id);
        return new RedirectView("/");
    }
    // EDITE SONG
    @RequestMapping(value = "/editSong" ,method = RequestMethod.PUT)
    RedirectView test(@ModelAttribute Song song){
        songrServicesIMP.eidteSong(song);
        return new RedirectView("/");
    }
    //EDITE ALBUM
    @RequestMapping(value = "/editAlbum" ,method = RequestMethod.PUT)
    RedirectView EditeAlbum(@ModelAttribute Album album){
        songrServicesIMP.EditeAlbum(album);
        return new RedirectView("/");
    }

    @GetMapping("/editeSongPage/{id}")
    String EditeSongPage(@PathVariable Long id ,Model model){
        songrServicesIMP.getSong(id,model);
        return "editeSong";
    }
    @GetMapping("/editeAlbumPage/{id}")
    String EditeAlbumPage(@PathVariable Long id ,Model model){
        songrServicesIMP.getAlbum(id,model);
        return "editeAlbum";
    }


    @GetMapping("/songs/Album/{id}")
    String getAllSongs(@PathVariable Long id ,Model model){
        songrServicesIMP.GetAllSongsById(id,model);
        return "ViewSongs";
    }

    //sdadasdafgfgf

}





