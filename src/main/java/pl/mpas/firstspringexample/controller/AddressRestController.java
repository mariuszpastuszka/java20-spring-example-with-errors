package pl.mpas.firstspringexample.controller;


import org.springframework.web.bind.annotation.*;
import pl.mpas.firstspringexample.domain.Address;
import pl.mpas.firstspringexample.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressRestController {

    private AddressService addressService;

    public AddressRestController(AddressService addressService) {
        this.addressService = addressService;
    }

    // /address/my-address
    @GetMapping("/my-address")
    public Address getMyAddress() {
        return new Address("Warszawa", "unknown",
                "22-222");
    }

    // /address/save?city=Ciechocinek&street=Wakacyjna&postalCode=500
    @GetMapping("/save")
    public Address saveNewAddress(@RequestParam("city") String city,
                                  @RequestParam("street") String street,
                                  @RequestParam("postalCode") String postalCode) {

        Address toSave = new Address(city, street, postalCode);
        return addressService.saveNewAddress(toSave);
    }
}
