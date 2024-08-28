package ci.digitalacademy.atosmonetab.services.impl;

import ci.digitalacademy.atosmonetab.models.NoteSheet;
import ci.digitalacademy.atosmonetab.models.Teacher;
import ci.digitalacademy.atosmonetab.repositories.NoteSheetRepositories;
import ci.digitalacademy.atosmonetab.repositories.StudentRepositories;
import ci.digitalacademy.atosmonetab.services.NoteSheetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class NoteSheetServiceImpl implements NoteSheetService {
    private final NoteSheetRepositories noteSheetRepositories;


    @Override
    public NoteSheet save(NoteSheet noteSheet) {
        return noteSheetRepositories.save(noteSheet);
    }

    @Override
    public NoteSheet update(NoteSheet noteSheet) {
        Optional<NoteSheet> OptionalNoteSheet = findOne(noteSheet.getId());
        if (OptionalNoteSheet.isPresent()){
            NoteSheet noteSheetToUpdate = OptionalNoteSheet.get();
            noteSheetToUpdate.setNote(noteSheetToUpdate.getNote());
            noteSheetToUpdate.setAnnee(noteSheetToUpdate.getAnnee());
            return save(noteSheetToUpdate);

        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Optional<NoteSheet> findOne(Long id) {
        return noteSheetRepositories.findById(id);
    }

    @Override
    public void delete(Long id) {
        noteSheetRepositories.deleteById(id);

    }

    @Override
    public List<NoteSheet> findAll() {
        return noteSheetRepositories.findAll();
    }
}
