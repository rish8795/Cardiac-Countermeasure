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
@Table(name = "absolute_risk_female")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AbsoluteRiskFemale.findAll", query = "SELECT a FROM AbsoluteRiskFemale a"),
    @NamedQuery(name = "AbsoluteRiskFemale.findByAbsoluteRiskFemaleId", query = "SELECT a FROM AbsoluteRiskFemale a WHERE a.absoluteRiskFemaleId = :absoluteRiskFemaleId"),
    @NamedQuery(name = "AbsoluteRiskFemale.findByPoint", query = "SELECT a FROM AbsoluteRiskFemale a WHERE a.point = :point"),
    @NamedQuery(name = "AbsoluteRiskFemale.findByGreen", query = "SELECT a FROM AbsoluteRiskFemale a WHERE a.green = :green"),
    @NamedQuery(name = "AbsoluteRiskFemale.findByViolet", query = "SELECT a FROM AbsoluteRiskFemale a WHERE a.violet = :violet"),
    @NamedQuery(name = "AbsoluteRiskFemale.findByYellow", query = "SELECT a FROM AbsoluteRiskFemale a WHERE a.yellow = :yellow"),
    @NamedQuery(name = "AbsoluteRiskFemale.findByRed", query = "SELECT a FROM AbsoluteRiskFemale a WHERE a.red = :red"),
    @NamedQuery(name = "AbsoluteRiskFemale.findByRGreen", query = "SELECT a FROM AbsoluteRiskFemale a WHERE a.rGreen = :rGreen"),
    @NamedQuery(name = "AbsoluteRiskFemale.findByRViolet", query = "SELECT a FROM AbsoluteRiskFemale a WHERE a.rViolet = :rViolet"),
    @NamedQuery(name = "AbsoluteRiskFemale.findByRYellow", query = "SELECT a FROM AbsoluteRiskFemale a WHERE a.rYellow = :rYellow"),
    @NamedQuery(name = "AbsoluteRiskFemale.findByRRed", query = "SELECT a FROM AbsoluteRiskFemale a WHERE a.rRed = :rRed")})
public class AbsoluteRiskFemale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "absolute_risk_female_id")
    private Integer absoluteRiskFemaleId;
    @Column(name = "point")
    private Integer point;
    @Column(name = "green")
    private Integer green;
    @Column(name = "violet")
    private Integer violet;
    @Column(name = "yellow")
    private Integer yellow;
    @Column(name = "red")
    private Integer red;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "r_green")
    private Double rGreen;
    @Column(name = "r_violet")
    private Double rViolet;
    @Column(name = "r_yellow")
    private Double rYellow;
    @Column(name = "r_red")
    private Double rRed;
    @JoinColumn(name = "foptionid", referencedColumnName = "foption_id")
    @ManyToOne
    private FactorOption foptionid;

    public AbsoluteRiskFemale() {
    }

    public AbsoluteRiskFemale(Integer absoluteRiskFemaleId) {
        this.absoluteRiskFemaleId = absoluteRiskFemaleId;
    }

    public Integer getAbsoluteRiskFemaleId() {
        return absoluteRiskFemaleId;
    }

    public void setAbsoluteRiskFemaleId(Integer absoluteRiskFemaleId) {
        this.absoluteRiskFemaleId = absoluteRiskFemaleId;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getGreen() {
        return green;
    }

    public void setGreen(Integer green) {
        this.green = green;
    }

    public Integer getViolet() {
        return violet;
    }

    public void setViolet(Integer violet) {
        this.violet = violet;
    }

    public Integer getYellow() {
        return yellow;
    }

    public void setYellow(Integer yellow) {
        this.yellow = yellow;
    }

    public Integer getRed() {
        return red;
    }

    public void setRed(Integer red) {
        this.red = red;
    }

    public Double getRGreen() {
        return rGreen;
    }

    public void setRGreen(Double rGreen) {
        this.rGreen = rGreen;
    }

    public Double getRViolet() {
        return rViolet;
    }

    public void setRViolet(Double rViolet) {
        this.rViolet = rViolet;
    }

    public Double getRYellow() {
        return rYellow;
    }

    public void setRYellow(Double rYellow) {
        this.rYellow = rYellow;
    }

    public Double getRRed() {
        return rRed;
    }

    public void setRRed(Double rRed) {
        this.rRed = rRed;
    }

    public FactorOption getFoptionid() {
        return foptionid;
    }

    public void setFoptionid(FactorOption foptionid) {
        this.foptionid = foptionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (absoluteRiskFemaleId != null ? absoluteRiskFemaleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AbsoluteRiskFemale)) {
            return false;
        }
        AbsoluteRiskFemale other = (AbsoluteRiskFemale) object;
        if ((this.absoluteRiskFemaleId == null && other.absoluteRiskFemaleId != null) || (this.absoluteRiskFemaleId != null && !this.absoluteRiskFemaleId.equals(other.absoluteRiskFemaleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AbsoluteRiskFemale[ absoluteRiskFemaleId=" + absoluteRiskFemaleId + " ]";
    }
    
}
