/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.service;

import com.sistemas.upc.domain.Curso;
import com.sistemas.upc.util.SystemException;
import java.util.List;

/**
 *
 * @author vjrojasb
 */
public interface CursoService {
    
    List<Curso> listaCursos() throws SystemException;
}
