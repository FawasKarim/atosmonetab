package ci.digitalacademy.atosmonetab.services;

import ci.digitalacademy.atosmonetab.models.Student;
import ci.digitalacademy.atosmonetab.models.User;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student save(Student student);
    Student update(Student student);
    Optional<Student> findOne(Long id);
    void delete(Long id);
    List<Student> findAll();

}
