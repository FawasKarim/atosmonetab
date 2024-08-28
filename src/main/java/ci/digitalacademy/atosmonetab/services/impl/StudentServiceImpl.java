package ci.digitalacademy.atosmonetab.services.impl;

import ci.digitalacademy.atosmonetab.models.Student;
import ci.digitalacademy.atosmonetab.models.User;
import ci.digitalacademy.atosmonetab.repositories.StudentRepositories;
import ci.digitalacademy.atosmonetab.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepositories studentRepositories;


//    @Override
//    public Student save(Student student) {
//        return studentRepositories.save(student);
//    }
//
//    @Override
//    public Student update(Student student) {
////        Optional<Student> OptionalStudent = findOne(student.getId());
////        if (OptionalStudent.isPresent()){
////            Student studentToUpdate = OptionalStudent.get() ;
////            studentToUpdate.setClasse(student.getClasse());
////            studentToUpdate.setMatricule(student.getMatricule());
////            return save(studentToUpdate);
//
//
//
//        }else {
//              return null;
////            throw new IllegalArgumentException();
//        }
//    }
//
//    @Override
//    public Optional<Student> findOne(Long id) {
//        return studentRepositories.findById(id);
//    }

    @Override
    public Student save(Student student) {
        return studentRepositories.save(student);
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Optional<Student> findOne(Long id) {
        return studentRepositories.findById(id);
    }

    @Override
    public void delete(Long id) {
        studentRepositories.deleteById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepositories.findAll();
    }
}
