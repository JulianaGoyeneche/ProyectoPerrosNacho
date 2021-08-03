package com.ProyectoS.ProyectoPerrosN.Controller;

import java.util.HashMap;
import java.util.List;

import com.ProyectoS.ProyectoPerrosN.dto.CargoEmpleadoDto;
import com.ProyectoS.ProyectoPerrosN.dto.EmpleadoDto;
import com.ProyectoS.ProyectoPerrosN.form.EmpleadoForm;
import com.ProyectoS.ProyectoPerrosN.service.IMSCargoEmpleado;
import com.ProyectoS.ProyectoPerrosN.service.IMSEmpleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Empleado")
public class EmpleadoController {
    
    @Autowired
    IMSCargoEmpleado ceservice;

    @Autowired
    IMSEmpleado emservice;

    @GetMapping("/show")
    public ModelAndView showEmpleado(){

        List<EmpleadoDto> empleados=emservice.getAll();
        List<CargoEmpleadoDto> cargoempleados=ceservice.getAll();

        var params= new HashMap<String,Object>();
        params.put("listEm", empleados);
        params.put("listCe", cargoempleados);

        return new ModelAndView("view/List/Empleado", params);
    }

    @GetMapping("/new")
    public ModelAndView newEmpleado(){
        EmpleadoForm form=new EmpleadoForm();
        form.setEmpleado(new EmpleadoDto());
        form.setLcemple(ceservice.getAll());

        var params=new HashMap<String,Object>();
        params.put("form",form);

        return new ModelAndView("view/Formularios/RegistrarEmpleado",params);
    }
    @GetMapping("/edit/{idEmpleado}")
    public ModelAndView editEmpleado(@ModelAttribute("idEmpleado")Integer idEmpleado){
        EmpleadoForm form=new EmpleadoForm();
        form.setEmpleado(emservice.get(idEmpleado));
        form.setLcemple(ceservice.getAll());

        var params=new HashMap<String,Object>();
        params.put("form",form);

        return new ModelAndView("view/Formularios/RegistrarEmpleado",params);
    }

    @PostMapping("/save")
    public ModelAndView saveEmpleado(EmpleadoForm emForm){
        emservice.save(emForm.getEmpleado());
        return new ModelAndView("redirect:/Empleado/show");
    }

    @GetMapping("/delete/{idEmpleado}")
    public ModelAndView deleteEmpleado(@ModelAttribute("idEmpleado")Integer idEmpleado){
        emservice.delete(idEmpleado);
        return new ModelAndView("redirect:/Empleado/show");
    }

   
    
}
