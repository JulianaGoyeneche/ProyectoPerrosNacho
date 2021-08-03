package com.ProyectoS.ProyectoPerrosN.service;

import java.util.List;
import java.util.stream.Collectors;

import com.ProyectoS.ProyectoPerrosN.dto.CargoEmpleadoDto;
import com.ProyectoS.ProyectoPerrosN.model.CargoEmpleado;
import com.ProyectoS.ProyectoPerrosN.model.CargoEmpleadoJpaRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IMSCargoEmpleado implements ISCargoEmpleado {

    @Autowired
    private CargoEmpleadoJpaRepository repotd;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CargoEmpleadoDto save(CargoEmpleadoDto CargoEmpleado) {
        CargoEmpleado ceEntity=modelMapper.map(CargoEmpleado,CargoEmpleado.class);
        repotd.save(ceEntity);
        return modelMapper.map(ceEntity,CargoEmpleadoDto.class);
    }

    @Override
    public CargoEmpleadoDto get(Integer id) {

        CargoEmpleado ceEntity=repotd.getById(id);
        CargoEmpleadoDto cDto=modelMapper.map(ceEntity, CargoEmpleadoDto.class);

        
        return cDto;
    }

    @Override
    public List<CargoEmpleadoDto> getAll() {
        List<CargoEmpleado> listCeEntity=repotd.findAll();
        List<CargoEmpleadoDto> listCeDto=listCeEntity.stream().map(role -> modelMapper.map(role, CargoEmpleadoDto.class))
                .collect(Collectors.toList());
        return listCeDto;
    }

    @Override
    public void delete(Integer id) {
        
        repotd.deleteById(id);
        
    }
    
}
