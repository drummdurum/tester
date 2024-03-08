package com.example.boghandel.controller;

import com.example.boghandel.repository.VareBoghanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boghandelController {

    @Autowired
    VareBoghanelRepository vareBoghanelRepository;

    @GetMapping("/boghandel")
    public String visVareListe(Model model) {
        model.addAttribute("vare", vareBoghanelRepository.getAll());
        return "bookStore";
    }

}