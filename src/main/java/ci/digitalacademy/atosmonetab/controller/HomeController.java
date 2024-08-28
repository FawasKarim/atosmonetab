package ci.digitalacademy.atosmonetab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dashboard")
public class HomeController {

    @GetMapping
    public String dashboard() {
        return "home/dashboard";
    }


}
