package com.flt.petclinic.controllers;

import com.flt.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {

        this.ownerService = ownerService;
    }

    /**
     * List owners in the index page.
     * @param model Model object.
     * @return The index page listing the owners.
     */
    @RequestMapping({"","/", "/index", "/index.html"})
    public String index(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
