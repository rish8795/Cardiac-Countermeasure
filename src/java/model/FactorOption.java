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
 * @author rishabh
 */
@Entity
@Table(name = "factor_option")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FactorOption.findAll", query = "SELECT f FROM FactorOption f"),
    @NamedQuery(name = "FactorOption.findByFoptionId", query = "SELECT f FROM FactorOption f WHERE f.foptionId = :foptionId"),
    @NamedQuery(name = "FactorOption.findByFactorOption", query = "SELECT f FROM FactorOption f WHERE f.factorOption = :factorOption"),
    @NamedQuery(name = "FactorOption.findByMen", query = "SELECT f FROM FactorOption f WHERE f.men = :men"),
    @NamedQuery(name = "FactorOption.findByWomen", query = "SELECT f FROM FactorOption f WHERE f.women = :women")})
public class FactorOption implements Serializable {
    @OneToMany(mappedBy = "foptionid")
    private Collection<AbsoluteRiskFemale> absoluteRiskFemaleCollection;
    @OneToMany(mappedBy = "foptionid")
    private Collection<AbsulateRiskMale> absulateRiskMaleCollection;
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "foption_id")
    private Integer foptionId;
    @Basic(optional = false)
    @Column(name = "factor_option")
    private String factorOption;
    @Column(name = "men")
    private Integer men;
    @Column(name = "women")
    private Integer women;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "factorOptionId")
    private Collection<PatientfactorAnswer> patientfactorAnswerCollection;
    @JoinColumn(name = "factor_id", referencedColumnName = "factor_id")
    @ManyToOne(optional = false)
    private FactorDetails factorId;

    public FactorOption() {
    }

    public FactorOption(Integer foptionId) {
        this.foptionId = foptionId;
    }

    public FactorOption(Integer foptionId, String factorOption) {
        this.foptionId = foptionId;
        this.factorOption = factorOption;
    }

    public Integer getFoptionId() {
        return foptionId;
    }

    public void setFoptionId(Integer foptionId) {
        this.foptionId = foptionId;
    }

    public String getFactorOption() {
        return factorOption;
    }

    public void setFactorOption(String factorOption) {
        this.factorOption = factorOption;
    }

    public Integer getMen() {
        return men;
    }

    public void setMen(Integer men) {
        this.men = men;
    }

    public Integer getWomen() {
        return women;
    }

    public void setWomen(Integer women) {
        this.women = women;
    }

    @XmlTransient
    public Collection<PatientfactorAnswer> getPatientfactorAnswerCollection() {
        return patientfactorAnswerCollection;
    }

    public void setPatientfactorAnswerCollection(Collection<PatientfactorAnswer> patientfactorAnswerCollection) {
        this.patientfactorAnswerCollection = patientfactorAnswerCollection;
    }

    public FactorDetails getFactorId() {
        return factorId;
    }

    public void setFactorId(FactorDetails factorId) {
        this.factorId = factorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foptionId != null ? foptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FactorOption)) {
            return false;
        }
        FactorOption other = (FactorOption) object;
        if ((this.foptionId == null && other.foptionId != null) || (this.foptionId != null && !this.foptionId.equals(other.foptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.FactorOption[ foptionId=" + foptionId + " ]";
    }

    @XmlTransient
    public Collection<AbsulateRiskMale> getAbsulateRiskMaleCollection() {
        return absulateRiskMaleCollection;
    }

    public void setAbsulateRiskMaleCollection(Collection<AbsulateRiskMale> absulateRiskMaleCollection) {
        this.absulateRiskMaleCollection = absulateRiskMaleCollection;
    }

    @XmlTransient
    public Collection<AbsoluteRiskFemale> getAbsoluteRiskFemaleCollection() {
        return absoluteRiskFemaleCollection;
    }

    public void setAbsoluteRiskFemaleCollection(Collection<AbsoluteRiskFemale> absoluteRiskFemaleCollection) {
        this.absoluteRiskFemaleCollection = absoluteRiskFemaleCollection;
    }
    
}
