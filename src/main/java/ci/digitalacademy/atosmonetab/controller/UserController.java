package ci.digitalacademy.atosmonetab.controller;

import ci.digitalacademy.atosmonetab.models.Teacher;
import ci.digitalacademy.atosmonetab.models.User;
import ci.digitalacademy.atosmonetab.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public String user(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);

        return "users/list";
    }

    @GetMapping("/add")
    public String showAddUserForms(Model model) {
        log.debug("Request to showAddUserForms");
        model.addAttribute("user", new User());

        return "users/forms";
    }



    @GetMapping("/update")
    public String update(){
        return "users/forms";
    }

    @PostMapping
    public String saveUser(User user) {
        log.debug("Request to save User :{}", user);
        user.setCreationdate(Instant.now());
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}")
    public String showUpdateUserForms(Model model, @PathVariable Long id) {
        log.debug("Request to showUpdateUserForms");
        Optional<User> user = userService.findOne(id);
        if (user.isPresent()) {
            model.addAttribute("user", user.get());
            return "users/forms";
        } else {
            return "redirect:/users";
        }
    }

    @PostMapping("/delete/{id}")
    public String userTeacher(@PathVariable Long id){
        log.debug("Request to delete User {} ", id);
        userService.delete(id);
        return "redirect:/users";
    }

}
