/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.CabeceraPedido;


/**
 *
 * @author ZENAIDO-PC
 */
public class CabeceraPedidoDAO extends DAO<CabeceraPedido>{
    public CabeceraPedidoDAO(){
        super(new CabeceraPedido());
    }
     public CabeceraPedido getOneById(CabeceraPedido cabecera)
            throws HibernateException{
        return super.getOneById(cabecera.getIdCabecera());
    }
}//final
