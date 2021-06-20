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
@Table(name="pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    @Column (name="fechaPedido")
    private LocalDateTime fechaPedido;

    @Column(name="direccionPedido",length = 50)
    private String direccionPedido;
    
    @Column(name="idClienteFK") 
    private int idClienteFK;

    @Column(name="idEmpleadoFK") 
    private int idEmpleadoFK;

    @Column(name="estadoPedido",length = 50)
    private String estadoPedido;

    @ManyToOne
    @JoinColumn(name= "idClienteFK",insertable = false, updatable = false)
    private Cliente ClienteP;

    @ManyToOne
    @JoinColumn(name= "idEmpleadoFK",insertable = false, updatable = false)
    private Empleado EmpleadoP;

    @OneToMany(mappedBy = "PedidoProducto")
    private List<ProductoPedido> productoPedidos;

    public Pedido() {
    }

    public Pedido(int idPedido, LocalDateTime fechaPedido, String direccionPedido, int idClienteFK, int idEmpleadoFK,
            String estadoPedido) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.direccionPedido = direccionPedido;
        this.idClienteFK = idClienteFK;
        this.idEmpleadoFK = idEmpleadoFK;
        this.estadoPedido = estadoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getDireccionPedido() {
        return direccionPedido;
    }

    public void setDireccionPedido(String direccionPedido) {
        this.direccionPedido = direccionPedido;
    }

    public int getIdClienteFK() {
        return idClienteFK;
    }

    public void setIdClienteFK(int idClienteFK) {
        this.idClienteFK = idClienteFK;
    }

    public int getIdEmpleadoFK() {
        return idEmpleadoFK;
    }

    public void setIdEmpleadoFK(int idEmpleadoFK) {
        this.idEmpleadoFK = idEmpleadoFK;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    

    
    
}
