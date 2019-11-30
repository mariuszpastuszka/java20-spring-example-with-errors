package pl.mpas.firstspringexample.repository;

import org.springframework.data.repository.CrudRepository;
import pl.mpas.firstspringexample.domain.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
