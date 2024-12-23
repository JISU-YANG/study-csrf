package com.security.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public String handleFormSubmit(
            @RequestParam("name") String name,
            @RequestParam("_csrf") String csrfToken
    ) {
        System.out.println("name = " + name + ", csrfToken = " + csrfToken);
        return "result";
    }

}
