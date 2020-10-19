package nguyen.guru.petclinic.controllers;

import nguyen.guru.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

    final private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"", "/", "/index"})
    public String ownerList(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }
}
