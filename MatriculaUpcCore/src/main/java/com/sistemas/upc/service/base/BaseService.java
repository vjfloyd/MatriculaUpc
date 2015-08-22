/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.service.base;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author vjrojasb
 */
public interface BaseService<E, ID extends Serializable>{
    
   void guardar(E e) throws Exception; 
   void eliminar(ID id) throws Exception;
   E obtener(ID id) throws Exception;
   List<E> listar() throws Exception;
   
}
