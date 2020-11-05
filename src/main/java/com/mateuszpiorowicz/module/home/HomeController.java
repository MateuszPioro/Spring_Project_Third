package com.mateuszpiorowicz.module.home;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHome(Model model) {

        PersonDto person1 = new PersonDto("Michał", "Piorek", 22);
        PersonDto person2 = new PersonDto("Julian", "Pazdzioch", 5);
        PersonDto person3 = new PersonDto("Jonny", "Jurecki", 212);

        List<PersonDto> nobelLaureateslnPhysic = List.of(person1, person2, person3);
        model.addAttribute("nobelLaureateslnPhysic", nobelLaureateslnPhysic);
        return "home";
    }
}
