/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.test;

import com.sistemas.service.AlumnoService;
import com.sistemas.upc.domain.Alumno;
import com.sistemas.upc.service.impl.AlumnoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author vjrojasb
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/java//com/sistemas/upc/configuration/SpringContext.xml")
public class AlumnoServiceTest {
    
    @Autowired
    private AlumnoService alumnoService;
    
    @Test
    public void Prueba(){
        
        try {
             Alumno al =  alumnoService.buscarAlumno("2199", "1234");
             if (al.getNombre().equalsIgnoreCase("vj")) {
                 System.out.println("########TEST####" + al.getNombre());
                
            }
        } catch (Exception e) {
        }
        
    }
    
}
