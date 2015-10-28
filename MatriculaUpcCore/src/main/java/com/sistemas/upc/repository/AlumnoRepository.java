/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.repository;

import com.sistemas.upc.domain.Alumno;
import com.sistemas.upc.repository.custom.AlumnoRepositoryCustom;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vjrojasb
 */
@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>, AlumnoRepositoryCustom{
    
    List<Alumno> findByCodigoAndClave(String codigo, String password); 
    
}
