package ci.digitalacademy.atosmonetab.services;

import ci.digitalacademy.atosmonetab.models.Address;

import java.util.List;
import java.util.Optional;

public interface AdressService {
//    Address save(Address address);
//    Address update(Address address);
//    Optional<Address> findOne(Long id);
//    void delete(Long id);
//    List<Address> findAll();

    Address save(Address address);
    Address update(Address address);
    Optional<Address> findOne(Long id);
    void delete(Long id);
    List<Address> findAll();
}
