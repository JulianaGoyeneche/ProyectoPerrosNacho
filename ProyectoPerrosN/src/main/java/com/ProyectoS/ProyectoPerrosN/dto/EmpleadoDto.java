package com.ProyectoS.ProyectoPerrosN.dto;



public class EmpleadoDto {
    
    private int idEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String direccionEmpleado;
    private int celularEmpleado;
    private int documentoEmpleado;
    private String fechaNacimiento;
    private int idUsuarioFK;
    private int idCargoEmpleadoFK;
    private CargoEmpleadoDto CargoP;
    public EmpleadoDto() {
    }
    public EmpleadoDto(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, String direccionEmpleado,
            int celularEmpleado, int documentoEmpleado, String fechaNacimiento, int idUsuarioFK, int idCargoEmpleadoFK,
            CargoEmpleadoDto cargoP) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.celularEmpleado = celularEmpleado;
        this.documentoEmpleado = documentoEmpleado;
        this.fechaNacimiento = fechaNacimiento;
        this.idUsuarioFK = idUsuarioFK;
        this.idCargoEmpleadoFK = idCargoEmpleadoFK;
        CargoP = cargoP;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }
    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }
    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }
    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }
    public int getCelularEmpleado() {
        return celularEmpleado;
    }
    public void setCelularEmpleado(int celularEmpleado) {
        this.celularEmpleado = celularEmpleado;
    }
    public int getDocumentoEmpleado() {
        return documentoEmpleado;
    }
    public void setDocumentoEmpleado(int documentoEmpleado) {
        this.documentoEmpleado = documentoEmpleado;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getIdUsuarioFK() {
        return idUsuarioFK;
    }
    public void setIdUsuarioFK(int idUsuarioFK) {
        this.idUsuarioFK = idUsuarioFK;
    }
    public int getIdCargoEmpleadoFK() {
        return idCargoEmpleadoFK;
    }
    public void setIdCargoEmpleadoFK(int idCargoEmpleadoFK) {
        this.idCargoEmpleadoFK = idCargoEmpleadoFK;
    }
    public CargoEmpleadoDto getCargoP() {
        return CargoP;
    }
    public void setCargoP(CargoEmpleadoDto cargoP) {
        CargoP = cargoP;
    }
  
    

}