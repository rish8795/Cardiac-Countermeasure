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
@Table(name = "labtest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Labtest.findAll", query = "SELECT l FROM Labtest l"),
    @NamedQuery(name = "Labtest.findByLtId", query = "SELECT l FROM Labtest l WHERE l.ltId = :ltId"),
    @NamedQuery(name = "Labtest.findByTestFees", query = "SELECT l FROM Labtest l WHERE l.testFees = :testFees")})
public class Labtest implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ltId")
    private Collection<PatienttestDetail> patienttestDetailCollection;
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "lt_id")
    private Integer ltId;
    @Basic(optional = false)
    @Column(name = "test_fees")
    private double testFees;
    @JoinColumn(name = "l_id", referencedColumnName = "l_id")
    @ManyToOne(optional = false)
    private Lab lId;
    @JoinColumn(name = "t_id", referencedColumnName = "t_id")
    @ManyToOne(optional = false)
    private Test tId;

    public Labtest() {
    }

    public Labtest(Integer ltId) {
        this.ltId = ltId;
    }

    public Labtest(Integer ltId, double testFees) {
        this.ltId = ltId;
        this.testFees = testFees;
    }

    public Integer getLtId() {
        return ltId;
    }

    public void setLtId(Integer ltId) {
        this.ltId = ltId;
    }

    public double getTestFees() {
        return testFees;
    }

    public void setTestFees(double testFees) {
        this.testFees = testFees;
    }

    public Lab getLId() {
        return lId;
    }

    public void setLId(Lab lId) {
        this.lId = lId;
    }

    public Test getTId() {
        return tId;
    }

    public void setTId(Test tId) {
        this.tId = tId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ltId != null ? ltId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Labtest)) {
            return false;
        }
        Labtest other = (Labtest) object;
        if ((this.ltId == null && other.ltId != null) || (this.ltId != null && !this.ltId.equals(other.ltId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Labtest[ ltId=" + ltId + " ]";
    }

    @XmlTransient
    public Collection<PatienttestDetail> getPatienttestDetailCollection() {
        return patienttestDetailCollection;
    }

    public void setPatienttestDetailCollection(Collection<PatienttestDetail> patienttestDetailCollection) {
        this.patienttestDetailCollection = patienttestDetailCollection;
    }
    
}
