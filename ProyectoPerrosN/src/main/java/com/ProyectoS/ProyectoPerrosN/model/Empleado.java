package com.ProyectoS.ProyectoPerrosN.model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;

    @Column(name="nombreEmpleado",length=50)
    private String nombreEmpleado;

    @Column(name="apellidoEmpleado",length = 50)
    private String apellidoEmpleado;

    @Column(name="direccionEmpleado",length = 100)
    private String direccionEmpleado;

    @Column(name="celularEmpleado")
    private int celularEmpleado;

    @Column(name="documentoEmpleado")
    private int documentoEmpleado;

    @Column(name="fechaNacimiento",length = 100)
    private String fechaNacimiento;

    @Column(name="idUsuarioFK")
    private int idUsuarioFK;

    @Column(name="idCargoEmpleadoFK")
    private int idCargoEmpleadoFK;

    @ManyToOne
    @JoinColumn(name= "idCargoEmpleadoFK",insertable = false, updatable = false)
    private CargoEmpleado CargoP;

    @ManyToOne
    @JoinColumn(name= "idUsuarioFK",insertable = false, updatable = false)
    private Usuario UsuarioP;

    @OneToMany(mappedBy = "EmpleadoP")
    private List<Pedido> pedidos;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, String direccionEmpleado,
            int celularEmpleado, int documentoEmpleado, String fechaNacimiento, int idUsuarioFK, int idCargoEmpleadoFK,
            CargoEmpleado cargoP, Usuario usuarioP, List<Pedido> pedidos) {
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
        UsuarioP = usuarioP;
        this.pedidos = pedidos;
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

    public CargoEmpleado getCargoP() {
        return CargoP;
    }

    public void setCargoP(CargoEmpleado cargoP) {
        CargoP = cargoP;
    }

    public Usuario getUsuarioP() {
        return UsuarioP;
    }

    public void setUsuarioP(Usuario usuarioP) {
        UsuarioP = usuarioP;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
