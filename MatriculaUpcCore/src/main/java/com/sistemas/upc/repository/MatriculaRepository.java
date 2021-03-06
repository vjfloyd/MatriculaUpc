/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.repository;

import com.sistemas.upc.domain.Matricula;
import com.sistemas.upc.repository.custom.MatriculaRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vjrojasb
 */
@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer>, MatriculaRepositoryCustom{
    
}
