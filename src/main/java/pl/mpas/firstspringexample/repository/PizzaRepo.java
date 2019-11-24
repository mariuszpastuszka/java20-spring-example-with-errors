package pl.mpas.firstspringexample.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import pl.mpas.firstspringexample.lambda_demo.Pizza;

import java.util.Arrays;
import java.util.List;

@Repository
public class PizzaRepo {

    private static final Logger logger = LoggerFactory.getLogger(PizzaRepo.class);

    public static final List<Pizza> pizzas = Arrays.asList(
            new Pizza(35, 50, "hawajska",
                    Arrays.asList("pomidory", "ananasy", "papryka")),
            new Pizza(45, 50, "wiejska",
                    Arrays.asList("boczek", "ananasy", "papryka")),
            new Pizza(55, 40, "meksykańska",
                    Arrays.asList("ostra papryczka", "salami", "papryka"))
    );

    public List<Pizza> getAllPizzas() {

        logger.info("getAllPizzas(), returned {} pizzas", pizzas.size());
        return pizzas;
    }
}

