/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.service;

import com.sistemas.upc.domain.Alumno;
import com.sistemas.upc.service.base.BaseService;
import com.sistemas.upc.util.SystemException;
import java.io.Serializable;

/**
 *
 * @author vjrojasb
 */
public interface AlumnoService extends BaseService<Alumno, Serializable>{
    
    Alumno buscarAlumno(String codigo, String password) throws SystemException;
}
