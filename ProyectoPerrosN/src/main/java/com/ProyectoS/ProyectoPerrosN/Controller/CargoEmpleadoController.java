package com.ProyectoS.ProyectoPerrosN.Controller;

import java.util.HashMap;

import com.ProyectoS.ProyectoPerrosN.service.ISCargoEmpleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.var;
@Controller

@RequestMapping("/CargoEmpleado")
public class CargoEmpleadoController {

    @Autowired
    ISCargoEmpleado ceservice;

    @GetMapping(value="/show")
    public ModelAndView show(){
    var params=new HashMap<String,Object>();
    params.put("ListCe",ceservice.getAll());
    return new ModelAndView("CargoEmpleado",params);
    }
   
    
}
