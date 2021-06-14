package model;

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
@Table(name="materiaprima")
public class MateriaPrima {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMateriaPrima;

    @Column(name= "nombreMateriaPrima", length = 50)
    private String nombreMateriaPrima;

    @Column(name="precioMateriaPrima")
    private int precioMateriaPrima;

    @Column(name= "descripcionMateriaPrima", length = 200)
    private String descripcionMateriaPrima;

    @Column(name="cantidadMateriaPrima")
    private int cantidadMateriaPrima;

    @Column(name= "estadoMateriaPrima", length = 100)
    private String estadoMateriaPrima;

    @Column(name="idUnidadDeMedidaFK")
    private int idUnidadDeMedidaFK;


    @ManyToOne
    @JoinColumn(name = "idUnidadDeMedidaFK", insertable = false, updatable = false)
    private UnidadDeMedida UnidadMedidaP;

    @OneToMany(mappedBy = "MateriaP")
    private List<ProductoMateriaPrima> productoMateriaP;

    @OneToMany(mappedBy = "MateriaEntrada")
    private List<MateriaPrimaEntrada> materiaprimaEntradas;



    public MateriaPrima() {
    }

    public MateriaPrima(int idMateriaPrima, String nombreMateriaPrima, int precioMateriaPrima,
            String descripcionMateriaPrima, int cantidadMateriaPrima, String estadoMateriaPrima,
            int idUnidadDeMedidaFK) {
        this.idMateriaPrima = idMateriaPrima;
        this.nombreMateriaPrima = nombreMateriaPrima;
        this.precioMateriaPrima = precioMateriaPrima;
        this.descripcionMateriaPrima = descripcionMateriaPrima;
        this.cantidadMateriaPrima = cantidadMateriaPrima;
        this.estadoMateriaPrima = estadoMateriaPrima;
        this.idUnidadDeMedidaFK = idUnidadDeMedidaFK;
    }

    public int getIdMateriaPrima() {
        return idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public String getNombreMateriaPrima() {
        return nombreMateriaPrima;
    }

    public void setNombreMateriaPrima(String nombreMateriaPrima) {
        this.nombreMateriaPrima = nombreMateriaPrima;
    }

    public int getPrecioMateriaPrima() {
        return precioMateriaPrima;
    }

    public void setPrecioMateriaPrima(int precioMateriaPrima) {
        this.precioMateriaPrima = precioMateriaPrima;
    }

    public String getDescripcionMateriaPrima() {
        return descripcionMateriaPrima;
    }

    public void setDescripcionMateriaPrima(String descripcionMateriaPrima) {
        this.descripcionMateriaPrima = descripcionMateriaPrima;
    }

    public int getCantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }

    public void setCantidadMateriaPrima(int cantidadMateriaPrima) {
        this.cantidadMateriaPrima = cantidadMateriaPrima;
    }

    public String getEstadoMateriaPrima() {
        return estadoMateriaPrima;
    }

    public void setEstadoMateriaPrima(String estadoMateriaPrima) {
        this.estadoMateriaPrima = estadoMateriaPrima;
    }

    public int getIdUnidadDeMedidaFK() {
        return idUnidadDeMedidaFK;
    }

    public void setIdUnidadDeMedidaFK(int idUnidadDeMedidaFK) {
        this.idUnidadDeMedidaFK = idUnidadDeMedidaFK;
    }


    
}
