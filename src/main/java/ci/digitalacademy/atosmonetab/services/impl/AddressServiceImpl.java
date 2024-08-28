package ci.digitalacademy.atosmonetab.services.impl;

import ci.digitalacademy.atosmonetab.models.Address;
import ci.digitalacademy.atosmonetab.repositories.NoteSheetRepositories;
import ci.digitalacademy.atosmonetab.services.AdressService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Slf4j
public class AddressServiceImpl implements AdressService {

    private final NoteSheetRepositories noteSheetRepositories;


    @Override
    public Address save(Address address) {
        return null;
    }

    @Override
    public Address update(Address address) {
        return null;
    }

    @Override
    public Optional<Address> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Address> findAll() {
        return List.of();
    }
}

