/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.upc.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vjrojasb
 */
@Entity
@Table(name = "Matricula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matricula.findAll", query = "SELECT m FROM Matricula m"),
    @NamedQuery(name = "Matricula.findByCodigo", query = "SELECT m FROM Matricula m WHERE m.codigo = :codigo"),
    @NamedQuery(name = "Matricula.findByFecha", query = "SELECT m FROM Matricula m WHERE m.fecha = :fecha")})
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "idCurso", referencedColumnName = "idalumno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Alumno idCurso;
    @JoinColumn(name = "idhorario", referencedColumnName = "idhorario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Horario idhorario;

    public Matricula() {
    }

    public Matricula(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Alumno getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Alumno idCurso) {
        this.idCurso = idCurso;
    }

    public Horario getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(Horario idhorario) {
        this.idhorario = idhorario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matricula)) {
            return false;
        }
        Matricula other = (Matricula) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sistemas.upc.domain.Matricula[ codigo=" + codigo + " ]";
    }
    
}
