package com.bolsadeideas.springboot.app.web.controllers;

import com.bolsadeideas.springboot.app.web.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/app")
public class IndexController {

    // Cada controlador necesita un handler para representarlos en una vista



    @GetMapping({ "/index", "/a", "",  "/home"})
    public String  index(Model model){
        model.addAttribute("titulo", "Hola Spring Framework 5!");
        return "index";
    }


    @RequestMapping("/perfil")
    public String perfil(Model model){

        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Castillo");
        usuario.setEmail("Test1@test.com");

        model.addAttribute( "usuario", usuario );
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));


        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar (Model model){


        model.addAttribute("titulo", "Listado de usuarios");


        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Daniel","Castillo","test1@test.com"));
        usuarios.add(new Usuario("Michel","Castillo","test2@test.com"));
        usuarios.add(new Usuario("Samira","Castillo","test3@test.com"));
        return usuarios;
    }



}
