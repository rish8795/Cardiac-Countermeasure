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
@Table(name = "speciality")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Speciality.findAll", query = "SELECT s FROM Speciality s"),
    @NamedQuery(name = "Speciality.findBySpecId", query = "SELECT s FROM Speciality s WHERE s.specId = :specId"),
    @NamedQuery(name = "Speciality.findBySpecName", query = "SELECT s FROM Speciality s WHERE s.specName = :specName")})
public class Speciality implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "spec_id")
    private Integer specId;
    @Basic(optional = false)
    @Column(name = "spec_name")
    private String specName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "specialityId")
    private Collection<Doctor> doctorCollection;

    public Speciality() {
    }

    public Speciality(Integer specId) {
        this.specId = specId;
    }

    public Speciality(Integer specId, String specName) {
        this.specId = specId;
        this.specName = specName;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
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
        hash += (specId != null ? specId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Speciality)) {
            return false;
        }
        Speciality other = (Speciality) object;
        if ((this.specId == null && other.specId != null) || (this.specId != null && !this.specId.equals(other.specId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Speciality[ specId=" + specId + " ]";
    }
    
}
