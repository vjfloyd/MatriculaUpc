/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.bean;

import com.sistemas.upc.domain.Horario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vjrojasb
 */
public class HorarioBean implements Serializable{
    
    
    private String nombreCurso;
    private String nombreProfesor;
    private Short opcion;
    private String horario;
    private List<Horario> horarioList;

    public HorarioBean() {
        horarioList = new ArrayList<Horario>();
    }
    
   
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public Short getOpcion() {
        return opcion;
    }

    public void setOpcion(Short opcion) {
        this.opcion = opcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    @Override
    public String toString() {
        return "HorarioBean{" + "nombreCurso=" + nombreCurso + ", nombreProfesor=" + nombreProfesor + ", opcion=" + opcion + ", horario=" + horario + ", horarioList=" + horarioList + '}';
    }
    
    
    
    
    
    
}
