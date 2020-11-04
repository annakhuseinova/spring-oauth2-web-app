package com.annakhuseinova.springoauth2webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String getAlbums(Model model){
        return "albums";
    }
}
