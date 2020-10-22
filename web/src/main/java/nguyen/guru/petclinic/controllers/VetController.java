package nguyen.guru.petclinic.controllers;

import nguyen.guru.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/vets", "/vets.html"})
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"", "/", "/index"})
    public String vetList(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
