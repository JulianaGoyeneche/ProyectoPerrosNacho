package com.ProyectoS.ProyectoPerrosN.service;

import java.util.List;

import com.ProyectoS.ProyectoPerrosN.dto.CargoEmpleadoDto;

public interface ISCargoEmpleado {
    
    public CargoEmpleadoDto save(CargoEmpleadoDto CargoEmpleado);//registrar y actualizar
    public CargoEmpleadoDto get(Integer id);//consultar un registro por su id 
    public List<CargoEmpleadoDto> getAll();//consultar todos los registros 
    public void delete(Integer id);// eliminr un registro por su id

}
