/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rishabh
 */
@Entity
@Table(name = "patientfactor_answer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PatientfactorAnswer.findAll", query = "SELECT p FROM PatientfactorAnswer p"),
    @NamedQuery(name = "PatientfactorAnswer.findByPfactansId", query = "SELECT p FROM PatientfactorAnswer p WHERE p.pfactansId = :pfactansId")})
public class PatientfactorAnswer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "pfactans_id")
    private Integer pfactansId;
    @JoinColumn(name = "calculationmeteredata_id", referencedColumnName = "calculationmeteredata_id")
    @ManyToOne
    private Calculationmeteredata calculationmeteredataId;
    @JoinColumn(name = "factor_id", referencedColumnName = "factor_id")
    @ManyToOne(optional = false)
    private FactorDetails factorId;
    @JoinColumn(name = "factor_option_id", referencedColumnName = "foption_id")
    @ManyToOne(optional = false)
    private FactorOption factorOptionId;
    @JoinColumn(name = "p_id", referencedColumnName = "p_id")
    @ManyToOne(optional = false)
    private Patient pId;

    public PatientfactorAnswer() {
    }

    public PatientfactorAnswer(Integer pfactansId) {
        this.pfactansId = pfactansId;
    }

    public Integer getPfactansId() {
        return pfactansId;
    }

    public void setPfactansId(Integer pfactansId) {
        this.pfactansId = pfactansId;
    }

    public Calculationmeteredata getCalculationmeteredataId() {
        return calculationmeteredataId;
    }

    public void setCalculationmeteredataId(Calculationmeteredata calculationmeteredataId) {
        this.calculationmeteredataId = calculationmeteredataId;
    }

    public FactorDetails getFactorId() {
        return factorId;
    }

    public void setFactorId(FactorDetails factorId) {
        this.factorId = factorId;
    }

    public FactorOption getFactorOptionId() {
        return factorOptionId;
    }

    public void setFactorOptionId(FactorOption factorOptionId) {
        this.factorOptionId = factorOptionId;
    }

    public Patient getPId() {
        return pId;
    }

    public void setPId(Patient pId) {
        this.pId = pId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pfactansId != null ? pfactansId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PatientfactorAnswer)) {
            return false;
        }
        PatientfactorAnswer other = (PatientfactorAnswer) object;
        if ((this.pfactansId == null && other.pfactansId != null) || (this.pfactansId != null && !this.pfactansId.equals(other.pfactansId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.PatientfactorAnswer[ pfactansId=" + pfactansId + " ]";
    }
    
}
