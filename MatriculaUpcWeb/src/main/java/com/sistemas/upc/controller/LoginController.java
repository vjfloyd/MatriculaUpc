/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.sistemas.upc.domain.Alumno;
import com.sistemas.service.AlumnoService;

/**
 *
 * @author vjrojasb
 */
@Component("cLogin")
@Scope("session")
public class LoginController extends BaseController{
    
    private Alumno alumno;
    private String codigo;
    private String password;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
    
    @Autowired
    private AlumnoService alumnoService;
    
    public String autenticar(){
        try {
            alumno = alumnoService.buscarAlumno(codigo, password);
            if ( alumno != null ) {
                return "registrar";
            }else{
                LOGGER.info("Credenciales invalidas");
                addMessage("Credenciales invalidas");
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            addMessage("Ocurrio un error");
        }
        return null;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
