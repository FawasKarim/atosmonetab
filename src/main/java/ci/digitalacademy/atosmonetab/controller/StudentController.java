package ci.digitalacademy.atosmonetab.controller;


import ci.digitalacademy.atosmonetab.models.Student;
import ci.digitalacademy.atosmonetab.models.Teacher;
import ci.digitalacademy.atosmonetab.services.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public String student(Model model) {

        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);

        return "students/list";
    }

    @GetMapping("/add")
    public String showAddStudentForm(Model model) {
        log.info("Showing add student form");
        model.addAttribute("student", new Student());

        return "students/forms";
    }


    @GetMapping("/{id}")
    public String showUpdateStudentForm(Model model,@PathVariable Long id) {
        log.info("Showing update student form");
        Optional<Student> student = studentService.findOne(id);
        if (student.isPresent()) {
            model.addAttribute("student", student.get());
            return "students/forms";
        } else {
            return "redirect:/students";
        }


    }

    @GetMapping("/update")
    public String update() {
        return "students/forms";
    }


    @PostMapping
    public String saveStudent(Student student) {
        log.debug("Request to save Teacher :{}", student);
        studentService.save(student);
        return "redirect:/students";
    }

    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        log.debug("Request to delete Student {} ", id);
        studentService.delete(id);
        return "redirect:/students";
    }

}
