/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ZENAIDO-PC
 */
@Entity
@Table(name = "detalle_pedido")
public class DetallePedido implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_detalle")
    private Long idDetalle;
    @Column(name = "secuencia", length = 10)
    private String secuencia;
    @Column(length = 15)
     private String cantidad;
    @Column(length = 15)
     private String precio;

    @ManyToOne
    @JoinColumn(name = "id_cabecera")
    private CabeceraPedido cabeceraPedido;

    public DetallePedido() {
        this.idDetalle=0L;
    }

    public Long getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Long idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public CabeceraPedido getCabeceraPedido() {
        return cabeceraPedido;
    }

    public void setCabeceraPedido(CabeceraPedido cabeceraPedido) {
        this.cabeceraPedido = cabeceraPedido;
    }

    

    
     
}//final
