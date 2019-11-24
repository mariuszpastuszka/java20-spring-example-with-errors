package pl.mpas.firstspringexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mpas.firstspringexample.lambda_demo.Pizza;

import java.util.List;

@RestController
@RequestMapping("/pizza")
public class PizzaRestController {

    @GetMapping("/menu")
    List<Pizza> getMenu() {
        return Pizza.getPizzas();
    }
}


// TODO
// 2 contollery - 1 webowy, 1 restowy
// na webowym wyswietlacie swój adres
// na restowym także
// class Address {
//  String city;
// String street;
// String postalCode;
// }
