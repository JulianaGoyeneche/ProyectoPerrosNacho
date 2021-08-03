package com.ProyectoS.ProyectoPerrosN.service;

import java.util.List;
import java.util.stream.Collectors;

import com.ProyectoS.ProyectoPerrosN.dto.EmpleadoDto;
import com.ProyectoS.ProyectoPerrosN.model.Empleado;
import com.ProyectoS.ProyectoPerrosN.model.EmpleadoJpaRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IMSEmpleado implements ISEmpleado{

    @Autowired
    private EmpleadoJpaRepository repoEm;

    
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EmpleadoDto save(EmpleadoDto Empleado) {
        Empleado emEntity = modelMapper.map(Empleado, Empleado.class);
        emEntity = repoEm.save(emEntity);

        return modelMapper.map(emEntity,EmpleadoDto.class);
    }

    @Override
    public EmpleadoDto get(Integer id) {
        Empleado emEntity = repoEm.getById(id);
        EmpleadoDto eDto =modelMapper.map(emEntity, EmpleadoDto.class);


        return eDto;
    }

    @Override
    public List<EmpleadoDto> getAll() {
       List<Empleado>listEmEntity =repoEm.findAll();
       List<EmpleadoDto> listEmDto = listEmEntity.stream().map(Emplea -> modelMapper.map(Emplea, EmpleadoDto.class)).collect(Collectors.toList());
        return  listEmDto;
    }

    @Override
    public void delete(Integer id) {
       
        repoEm.deleteById(id);
    }
    
    
}
