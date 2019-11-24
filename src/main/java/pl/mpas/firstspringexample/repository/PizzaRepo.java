package pl.mpas.firstspringexample.repository;

import org.springframework.stereotype.Repository;
import pl.mpas.firstspringexample.lambda_demo.Pizza;

import java.util.Collections;
import java.util.List;

@Repository
public class PizzaRepo {
    public List<Pizza> getAllPizzas() {

        return Collections.emptyList();
    }
}

