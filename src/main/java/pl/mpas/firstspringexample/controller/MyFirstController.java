package pl.mpas.firstspringexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyFirstController {

    private static final Logger logger = LoggerFactory.getLogger(MyFirstController.class);

    //http://localhost:8081/welcome?name= mariusz&surname=P.
    @GetMapping("/welcome")
    String homePage(@RequestParam(value = "name", defaultValue = "Jan") String imie,
                    @RequestParam(value = "surname", defaultValue = "Nowak") String nazwisko,
                    Model model) {
        logger.info("inside homePage()");

//        String dog = "pies";
//        logger.info(String.format("Ala ma ${} oraz %s", dog, "psa"));

        logger.info("params, name=[{}], suname=[{}]", imie, nazwisko);

        model.addAttribute("hName", imie);
        model.addAttribute("hSurname", nazwisko);

        return "home";
    }

    // model
    // marka
    // stan licznika
}
