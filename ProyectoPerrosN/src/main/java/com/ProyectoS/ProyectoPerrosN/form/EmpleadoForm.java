package com.ProyectoS.ProyectoPerrosN.form;

import java.util.List;

import com.ProyectoS.ProyectoPerrosN.dto.CargoEmpleadoDto;
import com.ProyectoS.ProyectoPerrosN.dto.EmpleadoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoForm {
    private EmpleadoDto Empleado;
    private CargoEmpleadoDto cargoEmpleado;
    private List<CargoEmpleadoDto> lcemple;
}

