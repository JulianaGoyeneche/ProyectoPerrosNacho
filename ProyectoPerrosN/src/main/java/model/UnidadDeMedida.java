package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="unidaddemedida")
public class UnidadDeMedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUnidadDeMedida;

    @Column(name= "nombreUnidadDeMedida", length = 50)
    private String nombreUnidadDeMedida;

    @OneToMany(mappedBy = "UnidadMedidaP")
    private List<MateriaPrima> materiaPrima;


    public UnidadDeMedida() {
    }

    public UnidadDeMedida(int idUnidadDeMedida, String nombreUnidadDeMedida) {
        this.idUnidadDeMedida = idUnidadDeMedida;
        this.nombreUnidadDeMedida = nombreUnidadDeMedida;
    }

    public int getIdUnidadDeMedida() {
        return idUnidadDeMedida;
    }

    public void setIdUnidadDeMedida(int idUnidadDeMedida) {
        this.idUnidadDeMedida = idUnidadDeMedida;
    }

    public String getNombreUnidadDeMedida() {
        return nombreUnidadDeMedida;
    }

    public void setNombreUnidadDeMedida(String nombreUnidadDeMedida) {
        this.nombreUnidadDeMedida = nombreUnidadDeMedida;
    }


    
}
