package pl.mpas.firstspringexample.repository;

import org.springframework.data.repository.CrudRepository;
import pl.mpas.firstspringexample.domain.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
