package ci.digitalacademy.atosmonetab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("report")
public class RepportController {
    @GetMapping
    public String report() {
        return "report/default";
    }
}
