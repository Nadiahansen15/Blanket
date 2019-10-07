package com.example.blanket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlanketController {


    @GetMapping("/")
    public String blanket(){
    return "blanket";
    }

    @GetMapping("/Vejledning")
    public String vejledning(){
        return "Vejledning";
    }
}
