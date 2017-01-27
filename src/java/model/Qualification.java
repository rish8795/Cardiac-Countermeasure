/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rishabh
 */
@Entity
@Table(name = "Qualification")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Qualification.findAll", query = "SELECT q FROM Qualification q"),
    @NamedQuery(name = "Qualification.findByQualificationId", query = "SELECT q FROM Qualification q WHERE q.qualificationId = :qualificationId"),
    @NamedQuery(name = "Qualification.findByQualificationName", query = "SELECT q FROM Qualification q WHERE q.qualificationName = :qualificationName")})
public class Qualification implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "qualification_id")
    private Integer qualificationId;
    @Basic(optional = false)
    @Column(name = "qualification_name")
    private String qualificationName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "qualificationId")
    private Collection<Doctor> doctorCollection;

    public Qualification() {
    }

    public Qualification(Integer qualificationId) {
        this.qualificationId = qualificationId;
    }

    public Qualification(Integer qualificationId, String qualificationName) {
        this.qualificationId = qualificationId;
        this.qualificationName = qualificationName;
    }

    public Integer getQualificationId() {
        return qualificationId;
    }

    public void setQualificationId(Integer qualificationId) {
        this.qualificationId = qualificationId;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }

    @XmlTransient
    public Collection<Doctor> getDoctorCollection() {
        return doctorCollection;
    }

    public void setDoctorCollection(Collection<Doctor> doctorCollection) {
        this.doctorCollection = doctorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qualificationId != null ? qualificationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Qualification)) {
            return false;
        }
        Qualification other = (Qualification) object;
        if ((this.qualificationId == null && other.qualificationId != null) || (this.qualificationId != null && !this.qualificationId.equals(other.qualificationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Qualification[ qualificationId=" + qualificationId + " ]";
    }
    
}
