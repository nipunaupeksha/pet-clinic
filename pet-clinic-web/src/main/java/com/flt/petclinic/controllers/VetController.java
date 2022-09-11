package com.flt.petclinic.controllers;

import com.flt.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {

        this.vetService = vetService;
    }

    @RequestMapping({"", "/", " /index", " /index.html"})
    public String index(Model model) {

        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
