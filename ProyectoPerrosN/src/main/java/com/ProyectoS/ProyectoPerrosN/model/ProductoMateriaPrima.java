package com.ProyectoS.ProyectoPerrosN.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productoMateriaPrima")

public class ProductoMateriaPrima {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProductoMateriaPrima;

    @Column(name="cantidadMateriaPrima")
    private int cantidadMateriaPrima;

    @Column(name="idProductoFK")
    private int idProductoFK;

    @Column(name="idMateriaPrimaFK")
    private int idMateriaPrimaFK;

    @ManyToOne
    @JoinColumn(name= "idProductoFK",insertable = false, updatable = false)
    private Producto ProductoMateria;

    @ManyToOne
    @JoinColumn(name= "idMateriaPrimaFK",insertable = false, updatable = false)
    private MateriaPrima MateriaP;

    public ProductoMateriaPrima() {
    }

    public ProductoMateriaPrima(int idProductoMateriaPrima, int cantidadMateriaPrima, int idProductoFK,
            int idMateriaPrimaFK) {
        this.idProductoMateriaPrima = idProductoMateriaPrima;
        this.cantidadMateriaPrima = cantidadMateriaPrima;
        this.idProductoFK = idProductoFK;
        this.idMateriaPrimaFK = idMateriaPrimaFK;
    }

    public int getIdProductoMateriaPrima() {
        return idProductoMateriaPrima;
    }

    public void setIdProductoMateriaPrima(int idProductoMateriaPrima) {
        this.idProductoMateriaPrima = idProductoMateriaPrima;
    }

    public int getCantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }

    public void setCantidadMateriaPrima(int cantidadMateriaPrima) {
        this.cantidadMateriaPrima = cantidadMateriaPrima;
    }

    public int getIdProductoFK() {
        return idProductoFK;
    }

    public void setIdProductoFK(int idProductoFK) {
        this.idProductoFK = idProductoFK;
    }

    public int getIdMateriaPrimaFK() {
        return idMateriaPrimaFK;
    }

    public void setIdMateriaPrimaFK(int idMateriaPrimaFK) {
        this.idMateriaPrimaFK = idMateriaPrimaFK;
    }
}