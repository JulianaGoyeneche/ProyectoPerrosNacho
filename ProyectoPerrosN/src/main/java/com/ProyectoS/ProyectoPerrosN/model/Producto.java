package com.ProyectoS.ProyectoPerrosN.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="producto")

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(name="nombreComboProducto", length = 100)
    private String nombreComboProducto;

    @Column(name="cantidadProducto")
    private int cantidadProductos;

    @Column(name="precioProducto")
    private String precioProductos;

    @Column(name="descripcionProducto", length = 100)
    private String descripcionProducto;

    @Column(name="estadoProducto")
    private String estadoProducto;

    @OneToMany(mappedBy = "ProductoP")
    private List<ProductoPedido> productoPedidos2;

    @OneToMany(mappedBy = "ProductoMateria")
    private List<ProductoMateriaPrima> productoMaterias;

    public Producto() {
    }

    public Producto(int idProducto, String nombreComboProducto, int cantidadProductos, String precioProductos,
            String descripcionProducto, String estadoProducto) {
        this.idProducto = idProducto;
        this.nombreComboProducto = nombreComboProducto;
        this.cantidadProductos = cantidadProductos;
        this.precioProductos = precioProductos;
        this.descripcionProducto = descripcionProducto;
        this.estadoProducto = estadoProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreComboProducto() {
        return nombreComboProducto;
    }

    public void setNombreComboProducto(String nombreComboProducto) {
        this.nombreComboProducto = nombreComboProducto;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public String getPrecioProductos() {
        return precioProductos;
    }

    public void setPrecioProductos(String precioProductos) {
        this.precioProductos = precioProductos;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    
    
}