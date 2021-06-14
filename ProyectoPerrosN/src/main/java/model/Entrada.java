package model;

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
@Table(name="entrada")

public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEntrada;

    @Column(name="fechadelaEntrada")
    private LocalDateTime fechadelaEntrada;

    @Column(name="idProveedorFK")
    private int idProveedorFK;

    @ManyToOne
    @JoinColumn(name= "idProveedorFK",insertable = false, updatable = false)
    private Proveedor ProveedorP;

    @OneToMany(mappedBy = "EntradaP")
    private List<MateriaPrimaEntrada> materiaPrimaEntradas2;

    public Entrada() {
    }

    public Entrada(int idEntrada, LocalDateTime fechadelaEntrada, int idProveedorFK) {
        this.idEntrada = idEntrada;
        this.fechadelaEntrada = fechadelaEntrada;
        this.idProveedorFK = idProveedorFK;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public LocalDateTime getFechadelaEntrada() {
        return fechadelaEntrada;
    }

    public void setFechadelaEntrada(LocalDateTime fechadelaEntrada) {
        this.fechadelaEntrada = fechadelaEntrada;
    }

    public int getIdProveedorFK() {
        return idProveedorFK;
    }

    public void setIdProveedorFK(int idProveedorFK) {
        this.idProveedorFK = idProveedorFK;
    }

    
}