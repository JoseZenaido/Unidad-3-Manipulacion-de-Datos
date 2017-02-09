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
import utng.modelo.CabeceraPedido;

/**
 *
 * @author ZENAIDO-PC
 */
@ManagedBean (name="cabeceraPedidoBean") @SessionScoped
public class CabeceraPedidoBean implements Serializable {
    
    private List<CabeceraPedido> cabeceras;
    private CabeceraPedido cabecera;
    
    
    public CabeceraPedidoBean(){
    cabecera=new CabeceraPedido();
    
    }

    public List<CabeceraPedido> getCabeceras() {
        return cabeceras;
    }

    public void setCabeceras(List<CabeceraPedido> cabeceras) {
        this.cabeceras = cabeceras;
    }

    public CabeceraPedido getCabecera() {
        return cabecera;
    }

    public void setCabecera(CabeceraPedido cabecera) {
        this.cabecera = cabecera;
    }


    


   


    
    

     public String listar(){
        CabeceraPedidoDAO dao =new CabeceraPedidoDAO();
        try{
            cabeceras=  dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Cabeceras";
    }
      public String eliminar(){
        CabeceraPedidoDAO dao = new CabeceraPedidoDAO();
        try{
            dao.delete(cabecera);
           cabeceras = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        cabecera = new CabeceraPedido();
        return "Iniciar";
        
         }
    public String guardar(){
        CabeceraPedidoDAO dao = new CabeceraPedidoDAO();
        try{
            if(cabecera.getIdCabecera()!=0){
                dao.update(cabecera);
            }else{
                dao.insert(cabecera);
            }
            cabeceras = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(CabeceraPedido cabecera){
        this.cabecera = cabecera;
        return "Editar";
            }
}//final
