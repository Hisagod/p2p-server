package com.aib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("json", "哈哈");
        return "index";
    }
}
