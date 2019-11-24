package pl.mpas.firstspringexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.mpas.firstspringexample.lambda_demo.Pizza;
import pl.mpas.firstspringexample.repository.PizzaRepo;

import java.util.Collections;
import java.util.List;

@Service
public class PizzaService {

    private static final Logger logger = LoggerFactory.getLogger(PizzaService.class);

    private PizzaRepo pizzaRepo;

    public PizzaService(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }

    public List<Pizza> getAllPizzasInMenu() {

        logger.info("getAllPizzasInMenu()");
        return pizzaRepo.getAllPizzas();
    }

    List<Pizza> getPizzasWithIngredients(List<String> ingredients) {
        logger.info("getPizzasWithIngredients()");

        return Collections.emptyList();
        // pobrał wszyskie pizze
        // wyfiltrował i podal tylko te z wymaganymi składnikami
    }
}
