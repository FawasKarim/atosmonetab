package ci.digitalacademy.atosmonetab.repositories;

import ci.digitalacademy.atosmonetab.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepositories extends JpaRepository<Address, Long> {
}
