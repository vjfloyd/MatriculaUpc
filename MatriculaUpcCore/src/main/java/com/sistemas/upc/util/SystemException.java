/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.util;

/**
 *
 * @author vjrojasb
 */
public class SystemException extends Exception{
    
    public SystemException(){
        
    }
    public SystemException(String message){
        super(message);
    }
    public SystemException(String message, Throwable cause){
        super(message, cause);
    }
    public SystemException(Throwable cause){
        super(cause);
    }
    public SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
