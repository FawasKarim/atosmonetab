package ci.digitalacademy.atosmonetab.services;

import ci.digitalacademy.atosmonetab.models.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    Teacher save(Teacher teacher);
    Teacher update(Teacher teacher);
    Optional<Teacher> findOne(Long id);
    void delete(Long id);
    List<Teacher> findAll();
}
