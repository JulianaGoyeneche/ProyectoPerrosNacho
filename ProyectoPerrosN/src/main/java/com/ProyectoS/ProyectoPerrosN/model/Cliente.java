package com.ProyectoS.ProyectoPerrosN.model;

import java.time.LocalDateTime;
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
@Table(name="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(name= "nombreCliente", length = 50)
    private String nombreCliente;

    @Column(name= "apellidoCliente", length = 50)
    private String apellidoCliente;

    @Column(name= "celularCliente")
    private int celularCliente;

    @Column(name= "direccionCliente", length = 100)
    private String direccionCliente;

    @Column(name= "correoCliente", length = 100)
    private String correoCliente;

    @Column (name="fechaNacimiento")
    private LocalDateTime fechaNacimiento;

    @Column (name="idUsuarioFK")
    private int idUsuarioFK; 

    @OneToMany(mappedBy = "ClienteP")
    private List<Pedido> pedidos;

    @ManyToOne
    @JoinColumn(name= "idUsuarioFK",insertable = false, updatable = false)
    private Usuario UsuarioP2;

    

    public Cliente() {
    }

    public Cliente(int idCliente, String nombreCliente, String apellidoCliente, int celularCliente,
            String direccionCliente, String correoCliente, LocalDateTime fechaNacimiento, int idUsuarioFK) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.celularCliente = celularCliente;
        this.direccionCliente = direccionCliente;
        this.correoCliente = correoCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.idUsuarioFK = idUsuarioFK;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(int celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdUsuarioFK() {
        return idUsuarioFK;
    }

    public void setIdUsuarioFK(int idUsuarioFK) {
        this.idUsuarioFK = idUsuarioFK;
    }


    
}
