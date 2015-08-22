/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.test;

import com.sistemas.upc.domain.Curso;
import com.sistemas.upc.repository.CursoRepository;
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
@ContextConfiguration(locations = {"file:src/main/java//com/sistemas/upc/configuration/SpringContext.xml"})
public class CursoTest {
    
    @Autowired
    private CursoRepository cursoRepository;
    
    @Test
    public void Prueba(){
        try {
            Curso curso = new Curso();
            curso.setNombre("Evo");
            cursoRepository.save(curso);
        } catch (Exception e) {
        }
    }
    
    
}
