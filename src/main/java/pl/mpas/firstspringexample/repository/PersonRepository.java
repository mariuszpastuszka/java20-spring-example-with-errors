package pl.mpas.firstspringexample.repository;

import org.springframework.data.repository.CrudRepository;
import pl.mpas.firstspringexample.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
