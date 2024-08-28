package ci.digitalacademy.atosmonetab.controller;


import ci.digitalacademy.atosmonetab.models.Student;
import ci.digitalacademy.atosmonetab.models.Teacher;
import ci.digitalacademy.atosmonetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/teachers")
public class TeachersController {


    private final TeacherService teacherService;

    @GetMapping
    public String showTeacherList(Model model) {
        List<Teacher> teachers = teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "teachers/list";
    }

    @PostMapping
    public String saveTeacher(Teacher teacher) {
        log.debug("Request to save Teacher :{}", teacher);
        teacherService.save(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/add")
    public String showAddTeacherForms( Model model) {
        log.debug("Request to showAddTeacherForms");
        model.addAttribute("teacher", new Teacher());
        return "teachers/forms";
    }

    @GetMapping("/{id}")
    public String showUpdateTeacherForms(Model model, @PathVariable Long id) {
        log.debug("Request to showUpdateTeacherForms");
        Optional<Teacher> teacher = teacherService.findOne(id);
        if (teacher.isPresent()) {
            model.addAttribute("teacher", teacher.get());
            return "teachers/forms";
        } else {
            return "redirect:/teachers";
        }

    }

    @GetMapping("/update")
    public String update(){
        return "teachers/forms";
    }

    @PostMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable Long id){
        log.debug("Request to delete Teacher {} ", id);
        teacherService.delete(id);
        return "redirect:/teachers";
    }
}
