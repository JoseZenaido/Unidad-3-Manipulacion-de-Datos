/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.DetallePedido;

/**
 *
 * @author ZENAIDO-PC
 */
public class DetallePedidoDAO extends DAO<DetallePedido>{
    public DetallePedidoDAO(){
        super(new DetallePedido());
       
    }
    
    public DetallePedido getOneById(DetallePedido detalle)
            throws HibernateException{
        return super.getOneById(detalle.getIdDetalle());
    }
     
}//final
