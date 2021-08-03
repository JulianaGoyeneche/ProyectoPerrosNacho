package com.ProyectoS.ProyectoPerrosN.Controller;

import java.util.HashMap;

import com.ProyectoS.ProyectoPerrosN.dto.CargoEmpleadoDto;
import com.ProyectoS.ProyectoPerrosN.form.CargoEmpleadoForm;
import com.ProyectoS.ProyectoPerrosN.service.ISCargoEmpleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.var;
@Controller

@RequestMapping("/CargoEmpleado")
public class CargoEmpleadoController {

    @Autowired
    ISCargoEmpleado ceservice;

    @GetMapping("/show")
    public ModelAndView showCargoEmpleado(){
    var params=new HashMap<String,Object>();
    params.put("listCe",ceservice.getAll());
    return new ModelAndView("view/List/CargoEmpleado",params);
    }

    @GetMapping("/new")

    public ModelAndView newCargoEmpleado(){
        var params=new HashMap<String,Object>();
        CargoEmpleadoForm form=new CargoEmpleadoForm();
        form.setCemple(new CargoEmpleadoDto());
        params.put("form",form);
        return new ModelAndView("view/Formularios/RegistrarCargoEmpleado", params);
    }
    @GetMapping("/edit/{idCargoEmpleado}")
    public ModelAndView editCargoEmpleado(@ModelAttribute("idCargoEmpleado") Integer idCargoEmpleado){
    var params=new HashMap<String,Object>();
    CargoEmpleadoForm form=new CargoEmpleadoForm();
    form.setCemple(ceservice.get(idCargoEmpleado));
    params.put("form",form);
    return new ModelAndView("view/Formularios/RegistrarCargoEmpleado", params);
    }
    @PostMapping("/save")
    public ModelAndView saveCargoEmpleado(CargoEmpleadoForm form){
        ceservice.save(form.getCemple());
        return new ModelAndView("redirect:/CargoEmpleado/show");

    }

    @GetMapping("/delete/{idCargoEmpleado}")
    public ModelAndView deleteCargoEmpleado(@ModelAttribute("idCargoEmpleado") Integer idCargoEmpleado){
        ceservice.delete(idCargoEmpleado);
        return new ModelAndView("redirect:/CargoEmpleado/show");
        
    }
   
    
}
