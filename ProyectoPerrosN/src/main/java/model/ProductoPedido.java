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
@Table(name="productoPedido")

public class ProductoPedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProductoPedido;

    @Column(name="cantidadProducto")
    private int cantidadProducto;

    @Column(name="precioProducto")
    private int precioProducto;

    @Column(name="iProductoFK")
    private int idProductoFK;

    @Column(name="idPedidoFK")
    private int idPedidoFK;

    @ManyToOne
    @JoinColumn(name= "iProductoFK",insertable = false, updatable = false)
    private Producto ProductoP;

    @ManyToOne
    @JoinColumn(name= "idPedidoFK",insertable = false, updatable = false)
    private Pedido PedidoProducto;



    public ProductoPedido() {
    }

    public ProductoPedido(int idProductoPedido, int cantidadProducto, int precioProducto, int idProductoFK,
            int idPedidoFK) {
        this.idProductoPedido = idProductoPedido;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.idProductoFK = idProductoFK;
        this.idPedidoFK = idPedidoFK;
    }

    public int getIdProductoPedido() {
        return idProductoPedido;
    }

    public void setIdProductoPedido(int idProductoPedido) {
        this.idProductoPedido = idProductoPedido;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getIdProductoFK() {
        return idProductoFK;
    }

    public void setIdProductoFK(int idProductoFK) {
        this.idProductoFK = idProductoFK;
    }

    public int getIdPedidoFK() {
        return idPedidoFK;
    }

    public void setIdPedidoFK(int idPedidoFK) {
        this.idPedidoFK = idPedidoFK;
    }

    
}