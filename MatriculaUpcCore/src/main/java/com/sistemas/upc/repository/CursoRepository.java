/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.repository;

import com.sistemas.upc.domain.Curso;
import com.sistemas.upc.repository.custom.CursoRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vjrojasb
 */
@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>, CursoRepositoryCustom{
    
    
    
}
