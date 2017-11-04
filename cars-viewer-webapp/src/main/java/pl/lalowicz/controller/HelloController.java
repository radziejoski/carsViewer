package pl.lalowicz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by radoslaw.lalowicz on 2017-11-04.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    String home(ModelMap modal) {
        modal.addAttribute("title", "Dear Learner");
        modal.addAttribute("message", "Welcome to SpringBoot");
        return "hello";
    }
}
