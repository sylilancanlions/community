package com.lion.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.jws.WebParam;

@Controller
public class IndexController {
    @GetMapping("/")
    public String indexController(Model model){

        return "index";
    }
}
