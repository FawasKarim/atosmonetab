package ci.digitalacademy.atosmonetab.repositories;

import ci.digitalacademy.atosmonetab.models.NoteSheet;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteSheetRepositories extends JpaRepository<NoteSheet, Long> {
}
