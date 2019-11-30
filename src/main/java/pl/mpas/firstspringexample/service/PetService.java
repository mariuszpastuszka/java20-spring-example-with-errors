package pl.mpas.firstspringexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.mpas.firstspringexample.domain.Pet;
import pl.mpas.firstspringexample.repository.PetRepository;

import java.util.Optional;

@Service
public class PetService {

    private static final Logger logger = LoggerFactory.getLogger(PetService.class);

    private PetRepository datasource;

    public PetService(PetRepository datasource) {
        this.datasource = datasource;
    }

    public Optional<Pet> findPetById(Long id) {
        logger.info("trying to find Pet of id: [{}]", id);
        Optional<Pet> result = datasource.findById(id);
        logger.info("Pet from repo: [{}]", result);

        return result;
    }
}
