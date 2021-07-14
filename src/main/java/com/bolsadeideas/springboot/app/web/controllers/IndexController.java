package com.bolsadeideas.springboot.app.web.controllers;

import org.springframework.stereotype.Controller;


@Controller
public class IndexController {

    // Cada controlador necesita un handler para representarlos en una vista




    public String  index(){

        return "index";
    }



}
