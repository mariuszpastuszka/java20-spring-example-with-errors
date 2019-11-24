package pl.mpas.firstspringexample.lambda_demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pl.mpas.firstspringexample.repository.PizzaRepo;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double price;
    private int size;
    private String name;
    @ElementCollection
    private List<String> ingredients;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pizza() {
    }

    public Pizza(double price, int size, String name, List<String> ingredients) {
        this.price = price;
        this.size = size;
        this.name = name;
        this.ingredients = ingredients;
    }

    @JsonIgnore
    public double getPrice() {
        return price;
    }

    @JsonIgnore
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Double.compare(pizza.price, price) == 0 &&
                size == pizza.size &&
                Objects.equals(name, pizza.name) &&
                Objects.equals(ingredients, pizza.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, size, name, ingredients);
    }

    public static void main(String[] args) {
        // 3 x nowa pizza
        // z listy wybierz nazwy pizz
        // wybierz liste unikalnych składników

        List<Pizza> pizzas = getPizzas();

        pizzas.stream()
                .map(pizza -> pizza.getName())
                .collect(Collectors.toList())
                .forEach(pizzaName -> System.out.println("pizza name: " + pizzaName));

        List<String> uniqueIng = pizzas.stream()
                .map(pizza -> pizza.getIngredients())
                .flatMap(ingredientsList -> ingredientsList.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("ing: " + uniqueIng);
    }

    public static List<Pizza> getPizzas() {
        return PizzaRepo.pizzas;
    }
}
