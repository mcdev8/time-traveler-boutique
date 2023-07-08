package com.timetravelerboutique.timetravelerboutique.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class home {

    @GetMapping
    public String homePage() {
        return "home";
    }
}
