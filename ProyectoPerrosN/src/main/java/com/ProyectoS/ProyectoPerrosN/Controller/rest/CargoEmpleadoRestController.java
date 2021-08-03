package com.ProyectoS.ProyectoPerrosN.Controller.rest;

import java.util.List;

import com.ProyectoS.ProyectoPerrosN.dto.CargoEmpleadoDto;
import com.ProyectoS.ProyectoPerrosN.service.IMSCargoEmpleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/CargoEmpleado")
public class CargoEmpleadoRestController {

    @Autowired
    IMSCargoEmpleado ceservice;

    @GetMapping("/all")
    public List<CargoEmpleadoDto>getAll(){
        return ceservice.getAll();
    }

    @GetMapping("/{idCargoEmpleado}")
    public CargoEmpleadoDto getCargoEmpleado(@PathVariable("idCargoEmpleado")Integer idCargoEmpleado){
        return ceservice.get(idCargoEmpleado);
    }

    @PostMapping("/new")
    public CargoEmpleadoDto newCargoEmpleado(@RequestBody CargoEmpleadoDto cargoe){
        return ceservice.save(cargoe);
    }

    @PutMapping("/update")
    public CargoEmpleadoDto updateCargoEmpleado(@RequestBody CargoEmpleadoDto cargoe){
        return ceservice.save(cargoe);
    }
    
    @DeleteMapping("/delete/{idCargoEmpleado}")
    public void deleteCargoEmpleado(@PathVariable("idCargoEmpleado")Integer idCargoEmpleado){
    ceservice.delete(idCargoEmpleado);
    }
}
