package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name="cargoEmpleado")
public class CargoEmpleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCargoEmpleado;

    @Column(name="nombreCargoEmpleado",length = 50)
    private String nombreCargoEmpleado;

    @OneToMany(mappedBy = "CargoP")
    private List<Empleado> empleados;

    public CargoEmpleado() {
    }

    public CargoEmpleado(int idCargoEmpleado, String nombreCargoEmpleado) {
        this.idCargoEmpleado = idCargoEmpleado;
        this.nombreCargoEmpleado = nombreCargoEmpleado;
    }

    public int getIdCargoEmpleado() {
        return idCargoEmpleado;
    }

    public void setIdCargoEmpleado(int idCargoEmpleado) {
        this.idCargoEmpleado = idCargoEmpleado;
    }

    public String getNombreCargoEmpleado() {
        return nombreCargoEmpleado;
    }

    public void setNombreCargoEmpleado(String nombreCargoEmpleado) {
        this.nombreCargoEmpleado = nombreCargoEmpleado;
    }

    
}
