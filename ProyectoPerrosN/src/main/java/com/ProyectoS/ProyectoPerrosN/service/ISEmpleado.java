package com.ProyectoS.ProyectoPerrosN.service;

import java.util.List;

import com.ProyectoS.ProyectoPerrosN.dto.EmpleadoDto;

public interface ISEmpleado {
    
    public EmpleadoDto save(EmpleadoDto Empleado);//registrar y actualizar
    public EmpleadoDto get(Integer id);//consultar un registro por su id 
    public List<EmpleadoDto> getAll();//consultar todos los registros 
    public void delete(Integer id);// eliminar un registro por su id
    
}
