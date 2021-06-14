package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="materiaPrimaEntrada")

public class MateriaPrimaEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMateriaPrimaEntrada;

    @Column(name="cantidadMateriaPrima")
    private int cantidadMateriaPrima;

    @Column(name="precioMateriaPrima")
    private int precioMateriaPrima;

    @Column(name="idMateriaPrimaFK")
    private int idMateriaPrimaFK;

    @Column(name="idEntradaFK")
    private int idEntradaFK;

    @ManyToOne
    @JoinColumn(name = "idMateriaPrimaFK", insertable = false, updatable = false)
    private MateriaPrima MateriaEntrada;

    @ManyToOne
    @JoinColumn(name = "idEntradaFK", insertable = false, updatable = false)
    private Entrada EntradaP;

    public MateriaPrimaEntrada() {
    }

    public MateriaPrimaEntrada(int idMateriaPrimaEntrada, int cantidadMateriaPrima, int precioMateriaPrima,
            int idMateriaPrimaFK, int idEntradaFK) {
        this.idMateriaPrimaEntrada = idMateriaPrimaEntrada;
        this.cantidadMateriaPrima = cantidadMateriaPrima;
        this.precioMateriaPrima = precioMateriaPrima;
        this.idMateriaPrimaFK = idMateriaPrimaFK;
        this.idEntradaFK = idEntradaFK;
    }

    public int getIdMateriaPrimaEntrada() {
        return idMateriaPrimaEntrada;
    }

    public void setIdMateriaPrimaEntrada(int idMateriaPrimaEntrada) {
        this.idMateriaPrimaEntrada = idMateriaPrimaEntrada;
    }

    public int getCantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }

    public void setCantidadMateriaPrima(int cantidadMateriaPrima) {
        this.cantidadMateriaPrima = cantidadMateriaPrima;
    }

    public int getPrecioMateriaPrima() {
        return precioMateriaPrima;
    }

    public void setPrecioMateriaPrima(int precioMateriaPrima) {
        this.precioMateriaPrima = precioMateriaPrima;
    }

    public int getIdMateriaPrimaFK() {
        return idMateriaPrimaFK;
    }

    public void setIdMateriaPrimaFK(int idMateriaPrimaFK) {
        this.idMateriaPrimaFK = idMateriaPrimaFK;
    }

    public int getIdEntradaFK() {
        return idEntradaFK;
    }

    public void setIdEntradaFK(int idEntradaFK) {
        this.idEntradaFK = idEntradaFK;
    }

    
    
}