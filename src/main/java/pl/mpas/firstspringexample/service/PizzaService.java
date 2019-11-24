package pl.mpas.firstspringexample.service;

import org.springframework.stereotype.Service;
import pl.mpas.firstspringexample.lambda_demo.Pizza;
import pl.mpas.firstspringexample.repository.PizzaRepo;

import java.util.List;

@Service
public class PizzaService {

    private PizzaRepo pizzaRepo;

    public PizzaService(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }

    List<Pizza> getAllPizzasInMenu() {
        return pizzaRepo.getAllPizzas();
    }

//    List<Pizza> getPizzasWithIngredients(List<String> ingredients) {
//        // pobrał wszyskie pizze
//        // wyfiltrował i podal tylko te z wymaganymi składnikami
//    }
}
