package pl.mpas.firstspringexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.mpas.firstspringexample.domain.Address;

@Controller
@RequestMapping("/view/ad")
public class AddressController {

    // /view/ad/new-way
    @GetMapping("/new-way")
    public ModelAndView getMyAddress(ModelAndView modelAndView) {

        modelAndView.addObject("mojAdres", new Address("Wwa", "xxx", "15-255"));
        modelAndView.setViewName("address");
        return modelAndView;
    }

    @GetMapping("/old-way")
    public String getAddress(Model model) {

        model.addAttribute("mojAdres", new Address("Wwa", "xxx", "15-255"));
        return "address";
    }
}
