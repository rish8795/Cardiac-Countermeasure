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
@Table(name = "absulate_risk_male")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AbsulateRiskMale.findAll", query = "SELECT a FROM AbsulateRiskMale a"),
    @NamedQuery(name = "AbsulateRiskMale.findByAbsoluteRiskMaleId", query = "SELECT a FROM AbsulateRiskMale a WHERE a.absoluteRiskMaleId = :absoluteRiskMaleId"),
    @NamedQuery(name = "AbsulateRiskMale.findByPoint", query = "SELECT a FROM AbsulateRiskMale a WHERE a.point = :point"),
    @NamedQuery(name = "AbsulateRiskMale.findByGreen", query = "SELECT a FROM AbsulateRiskMale a WHERE a.green = :green"),
    @NamedQuery(name = "AbsulateRiskMale.findByViolet", query = "SELECT a FROM AbsulateRiskMale a WHERE a.violet = :violet"),
    @NamedQuery(name = "AbsulateRiskMale.findByYellow", query = "SELECT a FROM AbsulateRiskMale a WHERE a.yellow = :yellow"),
    @NamedQuery(name = "AbsulateRiskMale.findByRed", query = "SELECT a FROM AbsulateRiskMale a WHERE a.red = :red"),
    @NamedQuery(name = "AbsulateRiskMale.findByRGreen", query = "SELECT a FROM AbsulateRiskMale a WHERE a.rGreen = :rGreen"),
    @NamedQuery(name = "AbsulateRiskMale.findByRViolet", query = "SELECT a FROM AbsulateRiskMale a WHERE a.rViolet = :rViolet"),
    @NamedQuery(name = "AbsulateRiskMale.findByRYellow", query = "SELECT a FROM AbsulateRiskMale a WHERE a.rYellow = :rYellow"),
    @NamedQuery(name = "AbsulateRiskMale.findByRRed", query = "SELECT a FROM AbsulateRiskMale a WHERE a.rRed = :rRed")})
public class AbsulateRiskMale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "absolute_risk_male_id")
    private Integer absoluteRiskMaleId;
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

    public AbsulateRiskMale() {
    }

    public AbsulateRiskMale(Integer absoluteRiskMaleId) {
        this.absoluteRiskMaleId = absoluteRiskMaleId;
    }

    public Integer getAbsoluteRiskMaleId() {
        return absoluteRiskMaleId;
    }

    public void setAbsoluteRiskMaleId(Integer absoluteRiskMaleId) {
        this.absoluteRiskMaleId = absoluteRiskMaleId;
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
        hash += (absoluteRiskMaleId != null ? absoluteRiskMaleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AbsulateRiskMale)) {
            return false;
        }
        AbsulateRiskMale other = (AbsulateRiskMale) object;
        if ((this.absoluteRiskMaleId == null && other.absoluteRiskMaleId != null) || (this.absoluteRiskMaleId != null && !this.absoluteRiskMaleId.equals(other.absoluteRiskMaleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AbsulateRiskMale[ absoluteRiskMaleId=" + absoluteRiskMaleId + " ]";
    }
    
}
