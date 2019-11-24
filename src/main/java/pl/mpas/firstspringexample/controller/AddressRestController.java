package pl.mpas.firstspringexample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mpas.firstspringexample.domain.Address;

@RestController
@RequestMapping("/address")
public class AddressRestController {

    // /address/my-address
    @PostMapping("/my-address")
    public Address getMyAddress() {
        return new Address("Warszawa", "unknown",
                "22-222");
    }
}
