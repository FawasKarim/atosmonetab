package ci.digitalacademy.atosmonetab.services;

import ci.digitalacademy.atosmonetab.models.NoteSheet;
import ci.digitalacademy.atosmonetab.models.Student;

import java.util.List;
import java.util.Optional;

public interface NoteSheetService {
    NoteSheet save(NoteSheet noteSheet);
    NoteSheet update(NoteSheet noteSheet);
    Optional<NoteSheet> findOne(Long id);
    void delete(Long id);
    List<NoteSheet> findAll();
}
