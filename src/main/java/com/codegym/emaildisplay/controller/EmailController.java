package com.codegym.emaildisplay.controller;

import com.codegym.emaildisplay.Model.EmailSettings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/settings")
public class EmailController {

    @GetMapping("")
    public String showSettingsForm(Model model) {
        model.addAttribute("emailSettings", new EmailSettings());
        return "/email";
    }

    @PostMapping("")
    public String submitSettingsForm(EmailSettings emailSettings, Model model) {
        model.addAttribute("emailSettings", emailSettings);
        return "/results";
    }
}
