package com.example.blanket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VejledningController {

    @PostMapping("/vejledningpressed")
    public String vejledning(){
        return "Vejledning";
    }
}
