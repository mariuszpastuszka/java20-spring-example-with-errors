package pl.mpas.firstspringexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.mpas.firstspringexample.service.OwnerService;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    // /owner/all-owners
    @GetMapping("/all-owners")
    public ModelAndView allOwners(ModelAndView modelAndView) {

        modelAndView.addObject("posiadacze", ownerService.allOwners());
        modelAndView.setViewName("owner/owners");

        return modelAndView;
    }
}
