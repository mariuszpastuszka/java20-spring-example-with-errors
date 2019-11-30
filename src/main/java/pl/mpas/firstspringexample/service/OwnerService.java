package pl.mpas.firstspringexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.mpas.firstspringexample.domain.Owner;
import pl.mpas.firstspringexample.repository.OwnerRepository;

import java.util.List;

@Service
public class OwnerService {
    private static final Logger logger = LoggerFactory.getLogger(OwnerService.class);

    private OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public List<Owner> allOwners() {
        List<Owner> result = (List<Owner>) ownerRepository.findAll();

        logger.info("results from db: [{}]", result);
        return result;
    }
}
