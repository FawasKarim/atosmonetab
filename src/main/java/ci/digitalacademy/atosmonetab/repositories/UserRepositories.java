package ci.digitalacademy.atosmonetab.repositories;

import ci.digitalacademy.atosmonetab.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<User, Long> {
}
