package pl.mpas.firstspringexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mpas.firstspringexample.lambda_demo.Pizza;
import pl.mpas.firstspringexample.service.PizzaService;

@Controller
@RequestMapping("/view")
public class PizzaController {

    private PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    // /view/pizzas
    //http://localhost:8081/view/pizzas?provider=Pizza Hut
    @GetMapping("/pizzas")
    public String getMenu(Model model,
                          @RequestParam(value = "provider", defaultValue = "SDA Pizza") String pizzaProvider) {

//        model.put("key", value)

        model.addAttribute("localName", pizzaProvider);
        model.addAttribute("allpizzas", Pizza.getPizzas());
        return "menu/my-menu";
    }

}
