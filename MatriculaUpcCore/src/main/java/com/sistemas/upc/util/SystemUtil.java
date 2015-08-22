/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

/**
 *
 * @author vjrojasb
 */
public final class SystemUtil {
    
    private SystemUtil(){
        
    }
    //Metodo para leer un archivo de properties
    public static final String obtenerPropiedad(String archivo, String clave){
        ResourceBundle rs = ResourceBundle.getBundle(archivo);
        return rs.getString(clave);
    }
    //Dar formato a una fecha
    public static final String convertirDate(Date fecha, String formato){
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format(fecha);
    }
    //Metodo para validar nulos
    public static final String validarNull(String texto){
        return texto == null ? "" : texto;     
    }
    //Metodo para obtener un ID del error
    public static final String idError(){
        return convertirDate(new Date(), "ddMMyyyyhhmmss");
    }
    
}
