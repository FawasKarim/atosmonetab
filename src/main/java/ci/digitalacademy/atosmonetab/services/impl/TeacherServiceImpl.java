package ci.digitalacademy.atosmonetab.services.impl;

import ci.digitalacademy.atosmonetab.models.Teacher;
import ci.digitalacademy.atosmonetab.models.User;
import ci.digitalacademy.atosmonetab.repositories.TeacherRepositories;
import ci.digitalacademy.atosmonetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepositories teacherRepositories;

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepositories.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher) {
        return null;
    }

    @Override
    public Optional<Teacher> findOne(Long id) {
        return teacherRepositories.findById(id);
    }

    @Override
    public void delete(Long id) {
        teacherRepositories.deleteById(id);

    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepositories.findAll() ;
    }
//
//    @Override
//    public Teacher update(Teacher teacher) {
////        Optional<Teacher> OptionalTeacher = findOne(teacher.getId());
////        if (OptionalTeacher.isPresent()){
////            Teacher teacherToUpdate = OptionalTeacher.get();
////            teacherToUpdate.setProchainCours(teacher.getProchainCours());
////            teacherToUpdate.setProchainCours(teacher.getProchainCours());
////            teacherToUpdate.setSujetProchaineReunion(teacherToUpdate.getSujetProchaineReunion());
////            return save(teacherToUpdate);
//
//              return null;
//
//        }else {
////            throw new IllegalArgumentException();
//        }
//
//    }

//    @Override
//    public Optional<Teacher> findOne(Long id) {
//        return teacherRepositories.findById(id);
//    }
//
//    @Override
//    public void delete(Long id) {
//        teacherRepositories.deleteById(id);
//
//    }
//
//    @Override
//    public List<Teacher> findAll() {
//        return teacherRepositories.findAll();
//    }
}
