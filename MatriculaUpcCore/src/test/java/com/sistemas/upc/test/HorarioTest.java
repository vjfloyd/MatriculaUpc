/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.test;

import com.sistemas.upc.domain.Curso;
import com.sistemas.upc.domain.Horario;
import com.sistemas.upc.repository.HorarioRepository;
import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;
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
public class HorarioTest {
    
    @Autowired
    private HorarioRepository horarioRepository;
    
    @Test
    public void Prueba(){
        
        Curso curso = new Curso();
        curso.setIdcurso(1);
        
        Horario horario = new Horario();
        horario.setProfesor("LaWilliam");
        horario.setIdcurso(curso);
        
        horarioRepository.save(horario);
        
        
    }
    
}
