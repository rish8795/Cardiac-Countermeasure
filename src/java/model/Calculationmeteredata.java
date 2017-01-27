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
@Table(name = "calculationmeteredata")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calculationmeteredata.findAll", query = "SELECT c FROM Calculationmeteredata c"),
    @NamedQuery(name = "Calculationmeteredata.findByCalculationmeteredataId", query = "SELECT c FROM Calculationmeteredata c WHERE c.calculationmeteredataId = :calculationmeteredataId"),
    @NamedQuery(name = "Calculationmeteredata.findByMetervalue", query = "SELECT c FROM Calculationmeteredata c WHERE c.metervalue = :metervalue"),
    @NamedQuery(name = "Calculationmeteredata.findByRmetervalue", query = "SELECT c FROM Calculationmeteredata c WHERE c.rmetervalue = :rmetervalue"),
    @NamedQuery(name = "Calculationmeteredata.findByFinalpoints", query = "SELECT c FROM Calculationmeteredata c WHERE c.finalpoints = :finalpoints"),
    @NamedQuery(name = "Calculationmeteredata.findByDate", query = "SELECT c FROM Calculationmeteredata c WHERE c.date = :date")})
public class Calculationmeteredata implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "calculationmeteredata_id")
    private Integer calculationmeteredataId;
    @Column(name = "metervalue")
    private Integer metervalue;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "rmetervalue")
    private Double rmetervalue;
    @Column(name = "finalpoints")
    private Integer finalpoints;
    @Column(name = "Date")
    private String date;
    @JoinColumn(name = "p_id", referencedColumnName = "p_id")
    @ManyToOne(optional = false)
    private Patient pId;

    public Calculationmeteredata() {
    }

    public Calculationmeteredata(Integer calculationmeteredataId) {
        this.calculationmeteredataId = calculationmeteredataId;
    }

    public Integer getCalculationmeteredataId() {
        return calculationmeteredataId;
    }

    public void setCalculationmeteredataId(Integer calculationmeteredataId) {
        this.calculationmeteredataId = calculationmeteredataId;
    }

    public Integer getMetervalue() {
        return metervalue;
    }

    public void setMetervalue(Integer metervalue) {
        this.metervalue = metervalue;
    }

    public Double getRmetervalue() {
        return rmetervalue;
    }

    public void setRmetervalue(Double rmetervalue) {
        this.rmetervalue = rmetervalue;
    }

    public Integer getFinalpoints() {
        return finalpoints;
    }

    public void setFinalpoints(Integer finalpoints) {
        this.finalpoints = finalpoints;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
        hash += (calculationmeteredataId != null ? calculationmeteredataId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calculationmeteredata)) {
            return false;
        }
        Calculationmeteredata other = (Calculationmeteredata) object;
        if ((this.calculationmeteredataId == null && other.calculationmeteredataId != null) || (this.calculationmeteredataId != null && !this.calculationmeteredataId.equals(other.calculationmeteredataId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Calculationmeteredata[ calculationmeteredataId=" + calculationmeteredataId + " ]";
    }
    
}
