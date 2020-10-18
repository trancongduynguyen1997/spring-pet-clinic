package nguyen.guru.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {
    @GetMapping({"", "/", "/index"})
    public String ownerList() {
        return "owner/index";
    }
}
