/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.service.impl;

import com.sistemas.service.AlumnoService;
import com.sistemas.upc.domain.Alumno;
import com.sistemas.upc.repository.AlumnoRepository;
import com.sistemas.upc.util.SystemException;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vjrojasb
 */
@Service("alumnoService")
public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    private AlumnoRepository alumnoRepository;
    
    @Override
    public Alumno buscarAlumno(String codigo, String password) throws SystemException{
     
        List<Alumno> alumnos = alumnoRepository.findByCodigoAndClave(codigo, password);
        if ( alumnos.size() > 0) {
            return alumnos.get(0);
        }
        return null;
    }

    public void guardar(Alumno e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(Serializable id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Alumno obtener(Serializable id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Alumno> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
