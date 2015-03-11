/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.repository.custom.impl;

import com.sistemas.upc.repository.custom.CursoRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author vjrojasb
 */
public class CursoCustomImpl implements CursoRepositoryCustom{

    @Autowired
    private JdbcTemplate jdbcTemplate;
            
    public int contarFilas() throws Exception {
        return jdbcTemplate.queryForInt("SELECT count(*) FROM Curso");
    }
 
    
}

