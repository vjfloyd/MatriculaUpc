/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vjrojasb
 */
@Entity
@Table(name = "Horario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h"),
    @NamedQuery(name = "Horario.findByIdhorario", query = "SELECT h FROM Horario h WHERE h.idhorario = :idhorario"),
    @NamedQuery(name = "Horario.findByDia", query = "SELECT h FROM Horario h WHERE h.dia = :dia"),
    @NamedQuery(name = "Horario.findByAula", query = "SELECT h FROM Horario h WHERE h.aula = :aula"),
    @NamedQuery(name = "Horario.findByProfesor", query = "SELECT h FROM Horario h WHERE h.profesor = :profesor"),
    @NamedQuery(name = "Horario.findByHorariocol", query = "SELECT h FROM Horario h WHERE h.horariocol = :horariocol")})
public class Horario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhorario")
    private Integer idhorario;
    @Column(name = "dia")
    private String dia;
    @Column(name = "aula")
    private String aula;
    @Column(name = "profesor")
    private String profesor;
    @Column(name = "Horariocol")
    private String horariocol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhorario", fetch = FetchType.LAZY)
    private List<Matricula> matriculaList;
    @JoinColumn(name = "idcurso", referencedColumnName = "idcurso")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Curso idcurso;

    public Horario() {
    }

    public Horario(Integer idhorario) {
        this.idhorario = idhorario;
    }

    public Integer getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(Integer idhorario) {
        this.idhorario = idhorario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getHorariocol() {
        return horariocol;
    }

    public void setHorariocol(String horariocol) {
        this.horariocol = horariocol;
    }

    @XmlTransient
    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    public Curso getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Curso idcurso) {
        this.idcurso = idcurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhorario != null ? idhorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.idhorario == null && other.idhorario != null) || (this.idhorario != null && !this.idhorario.equals(other.idhorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sistemas.upc.domain.Horario[ idhorario=" + idhorario + " ]";
    }
    
}
