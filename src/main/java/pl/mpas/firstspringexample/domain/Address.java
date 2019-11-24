package pl.mpas.firstspringexample.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Krok 1 - nadaj encje nad klasą
@Entity
public class Address {

    // Krok 2-  Utwórz klucz główny
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String street;
    private String postalCode;

    // Krok 3 - konstruktor bezargumentowy
    public Address() {
    }

    public Address(String city, String street, String postalCode) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    @JsonProperty("miasto")
    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
