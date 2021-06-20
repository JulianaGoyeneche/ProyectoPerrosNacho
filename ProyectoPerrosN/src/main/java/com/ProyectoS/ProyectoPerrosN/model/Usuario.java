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
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name="nombreUsuario", length = 50)
    private String nombreUsuario;

    @Column(name="contrasenaUsuario",length = 50)
    private String contrasenaUsuario;
    
    @Column(name="estadoUsuario",length = 50)
    private String estadoUsuario;

    @Column(name="idRolUsuarioFK")
    private int idRolUsuarioFK;

    @ManyToOne
    @JoinColumn(name= "idRolUsuarioFK",insertable = false, updatable = false)
    private RolUsuario RolUsuarioP;

    @OneToMany(mappedBy = "UsuarioP")
    private List<Empleado> empleadosU;

    @OneToMany(mappedBy = "UsuarioP2")
    private List<Cliente> clientesU;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String contrasenaUsuario, String estadoUsuario,
            int idRolUsuarioFK) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.estadoUsuario = estadoUsuario;
        this.idRolUsuarioFK = idRolUsuarioFK;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public int getIdRolUsuarioFK() {
        return idRolUsuarioFK;
    }

    public void setIdRolUsuarioFK(int idRolUsuarioFK) {
        this.idRolUsuarioFK = idRolUsuarioFK;
    }

    
    
}
