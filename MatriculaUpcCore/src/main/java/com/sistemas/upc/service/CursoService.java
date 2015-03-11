/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.service;

import com.sistemas.upc.domain.Curso;
import com.sistemas.upc.service.base.BaseService;

/**
 *
 * @author vjrojasb
 */
public interface CursoService extends BaseService<Curso, Integer>{
    
    int contarTotalRegistros() throws Exception;
}
