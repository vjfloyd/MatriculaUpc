/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.service.impl;

import com.sistemas.upc.domain.Curso;
import com.sistemas.upc.repository.CursoRepository;
import com.sistemas.upc.service.CursoService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vjrojasb
 */
@Service("cursoService")
public class CursoServiceImpl implements CursoService, Serializable{

   @Autowired
   private CursoRepository cursoRepository;
    
   
    
    public int contarTotalRegistros() throws Exception {
        return cursoRepository.contarFilas();
    }

    public void guardar(Curso e) throws Exception {
        cursoRepository.save(e);
    }

    public void eliminar(Integer id) throws Exception {
        cursoRepository.delete(id);
    }

    public Curso obtener(Integer id) throws Exception {
        return cursoRepository.findOne(id);
    }

    public List<Curso> listar() throws Exception {
        return cursoRepository.findAll();
    }
    
    
}
