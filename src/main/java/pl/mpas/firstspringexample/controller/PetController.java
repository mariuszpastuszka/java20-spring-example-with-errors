package pl.mpas.firstspringexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.mpas.firstspringexample.domain.Pet;
import pl.mpas.firstspringexample.service.PetService;

@Controller
@RequestMapping("/pets")
public class PetController {

    private static final Logger logger = LoggerFactory.getLogger(PetController.class);

    private PetService dostawca;

    public PetController(PetService dostawca) {
        this.dostawca = dostawca;
    }

    // ?id=5
    // /pets/pet/4
    @GetMapping("/pet/{id}")
    public ModelAndView displayPetOfId(ModelAndView modelAndView, @PathVariable("id") Long id) {

        modelAndView.addObject("twojPet", dostawca.findPetById(id).orElse(new Pet()));
        modelAndView.setViewName("pet/favourite-pet");
        return modelAndView;
    }
}
