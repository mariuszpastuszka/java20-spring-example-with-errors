package pl.mpas.firstspringexample.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);
    ///calculate-sum/3/4 ->
    ///calculate-sum/5/4444444 ->
    @GetMapping("/calculate-sum/{sklad_1}/{sklad_2}")
    public int sum(@PathVariable("sklad_2") Integer a,
                   @PathVariable("sklad_1") Integer b) {
        return a + b;
    }

    public int sub(int c, int d) {
        return c - d;
    }

    // /mult?first=5&second=8 - ok
    // /mult?a=5&b=8 - not ok
    @GetMapping("/mult")
    public Long mult(@RequestParam(value = "first", defaultValue = "0") Long param1,
                     @RequestParam(value = "second", defaultValue = "0") Long param2) {

        logger.debug("debug message");
        logger.info("tutaj");
        logger.warn("maybe warn");
        logger.error("error message");
        return param1 * param2;
    }

    public Double div(Double a, Double b) {
        return a / b;
    }
}
