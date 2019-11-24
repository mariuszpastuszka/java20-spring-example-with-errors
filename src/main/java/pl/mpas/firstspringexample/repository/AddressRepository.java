package pl.mpas.firstspringexample.repository;


import org.springframework.data.repository.CrudRepository;
import pl.mpas.firstspringexample.domain.Address;

// krok 4 - rozszerz interfejs CrudRepository
// krok 5 - pierwszy argument generyka - klasa do której tworzymy repozytorium
// krok 6 - podaj typ klucza głównego
public interface AddressRepository extends CrudRepository<Address, Long> {
}
