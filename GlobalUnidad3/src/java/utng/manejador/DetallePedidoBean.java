/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.CabeceraPedidoDAO;
import utng.datos.DetallePedidoDAO;
import utng.modelo.CabeceraPedido;
import utng.modelo.DetallePedido;


/**
 *
 * @author ZENAIDO-PC ZENAIDO-PC
 */
@ManagedBean(name = "detallePedidoBean")@SessionScoped
public class DetallePedidoBean implements Serializable{
    private List<DetallePedido> detalles;
    private DetallePedido detalle;
    private List<CabeceraPedido> cabeceras;
    
    public DetallePedidoBean(){
        detalle = new DetallePedido();
        detalle.setCabeceraPedido(new CabeceraPedido());
    } 

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public DetallePedido getDetalle() {
        return detalle;
    }

    public void setDetalle(DetallePedido detalle) {
        this.detalle = detalle;
    }

    public List<CabeceraPedido> getCabeceras() {
        return cabeceras;
    }

    public void setCabeceras(List<CabeceraPedido> cabeceras) {
        this.cabeceras = cabeceras;
    }

    
    

   
     public String listar(){
        DetallePedidoDAO dao = new DetallePedidoDAO();
        try{
            detalles= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "Detalles";
        }
     public String eliminar(){
        DetallePedidoDAO dao = new DetallePedidoDAO();
        try{
            dao.delete(detalle);
            detalles = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
     public String iniciar(){
        
       detalle= new DetallePedido();
       detalle.setCabeceraPedido(new CabeceraPedido());
       try{
           cabeceras = new CabeceraPedidoDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
      public String guardar(){
        DetallePedidoDAO dao = new DetallePedidoDAO();
        try{ 
            if(detalle.getIdDetalle()!=0){
                dao.update(detalle);
        }else{ dao.insert(detalle);}
           
        }catch(Exception e){e.printStackTrace();
        } 
        detalles = dao.getAll();
        return "Guardar";
    }
      
    public String cancelar(){ return"Cancelar";}
    public String editar(DetallePedido detalle){
        this.detalle = detalle;
        try{
           cabeceras = new CabeceraPedidoDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}//final
