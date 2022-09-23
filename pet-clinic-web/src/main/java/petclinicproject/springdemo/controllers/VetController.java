package petclinicproject.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import petclinicproject.springdemo.services.map.VetServiceMap;

@Controller
public class VetController {

    private final VetServiceMap vetServiceMap;

    public VetController(VetServiceMap vetServiceMap) {
        this.vetServiceMap = vetServiceMap;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets",vetServiceMap.findAll());
        return "vets/index";
    }
}
