package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.informaticonfig.spring.app1.springboot_applications.models.Empleados;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        Empleados empleado1 = new Empleados("Juan", "Rodriguez", null, "Gerente", 35, 967887654, 34);

        model.addAttribute("empleado", empleado1);

        return "detalles_info";
    }
}
