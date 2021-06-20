package com.ProyectoS.ProyectoPerrosN.dto;

public class CargoEmpleadoDto {
    
    private int idCargoEmpleado;
    private String nombreCargoEmpleado;
    public CargoEmpleadoDto() {
    }
    public CargoEmpleadoDto(int idCargoEmpleado, String nombreCargoEmpleado) {
        this.idCargoEmpleado = idCargoEmpleado;
        this.nombreCargoEmpleado = nombreCargoEmpleado;
    }
    public int getIdCargoEmpleado() {
        return idCargoEmpleado;
    }
    public void setIdCargoEmpleado(int idCargoEmpleado) {
        this.idCargoEmpleado = idCargoEmpleado;
    }
    public String getNombreCargoEmpleado() {
        return nombreCargoEmpleado;
    }
    public void setNombreCargoEmpleado(String nombreCargoEmpleado) {
        this.nombreCargoEmpleado = nombreCargoEmpleado;
    }


    
}
