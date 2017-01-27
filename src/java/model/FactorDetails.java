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
@Table(name = "factor_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FactorDetails.findAll", query = "SELECT f FROM FactorDetails f"),
    @NamedQuery(name = "FactorDetails.findByFactorId", query = "SELECT f FROM FactorDetails f WHERE f.factorId = :factorId"),
    @NamedQuery(name = "FactorDetails.findByFactorName", query = "SELECT f FROM FactorDetails f WHERE f.factorName = :factorName"),
    @NamedQuery(name = "FactorDetails.findByFactorDescription", query = "SELECT f FROM FactorDetails f WHERE f.factorDescription = :factorDescription"),
    @NamedQuery(name = "FactorDetails.findByImage", query = "SELECT f FROM FactorDetails f WHERE f.image = :image")})
public class FactorDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "factor_id")
    private Integer factorId;
    @Basic(optional = false)
    @Column(name = "factor_name")
    private String factorName;
    @Column(name = "factor_description")
    private String factorDescription;
    @Column(name = "image")
    private String image;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "factorId")
    private Collection<PatientfactorAnswer> patientfactorAnswerCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "factorId")
    private Collection<FactorOption> factorOptionCollection;

    public FactorDetails() {
    }

    public FactorDetails(Integer factorId) {
        this.factorId = factorId;
    }

    public FactorDetails(Integer factorId, String factorName) {
        this.factorId = factorId;
        this.factorName = factorName;
    }

    public Integer getFactorId() {
        return factorId;
    }

    public void setFactorId(Integer factorId) {
        this.factorId = factorId;
    }

    public String getFactorName() {
        return factorName;
    }

    public void setFactorName(String factorName) {
        this.factorName = factorName;
    }

    public String getFactorDescription() {
        return factorDescription;
    }

    public void setFactorDescription(String factorDescription) {
        this.factorDescription = factorDescription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @XmlTransient
    public Collection<PatientfactorAnswer> getPatientfactorAnswerCollection() {
        return patientfactorAnswerCollection;
    }

    public void setPatientfactorAnswerCollection(Collection<PatientfactorAnswer> patientfactorAnswerCollection) {
        this.patientfactorAnswerCollection = patientfactorAnswerCollection;
    }

    @XmlTransient
    public Collection<FactorOption> getFactorOptionCollection() {
        return factorOptionCollection;
    }

    public void setFactorOptionCollection(Collection<FactorOption> factorOptionCollection) {
        this.factorOptionCollection = factorOptionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (factorId != null ? factorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FactorDetails)) {
            return false;
        }
        FactorDetails other = (FactorDetails) object;
        if ((this.factorId == null && other.factorId != null) || (this.factorId != null && !this.factorId.equals(other.factorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.FactorDetails[ factorId=" + factorId + " ]";
    }
    
}
