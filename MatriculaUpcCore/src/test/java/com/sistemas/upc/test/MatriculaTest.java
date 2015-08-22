/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.test;

import com.sistemas.upc.domain.Alumno;
import com.sistemas.upc.domain.Curso;
import com.sistemas.upc.domain.Horario;
import com.sistemas.upc.domain.Matricula;
import com.sistemas.upc.repository.MatriculaRepository;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author vjrojasb
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/java//com/sistemas/upc/configuration/SpringContext.xml"})
public class MatriculaTest {
   
    @Autowired
    private MatriculaRepository matriculaRepository;
    
    @Test
    public void Prueba(){
        Alumno alumno = new Alumno();
        alumno.setIdalumno(2);
        
        Horario horario = new Horario();
        horario.setIdhorario(2);
        
        Matricula matricula = new Matricula();
        matricula.setIdalumno(alumno);
        matricula.setIdhorario(horario);
        matricula.setCodigo("cod2016-2 the last");
        
        matriculaRepository.save(matricula);
        
        
    }
    
    
}
