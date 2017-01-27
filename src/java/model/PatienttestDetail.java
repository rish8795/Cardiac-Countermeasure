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
@Table(name = "patienttest_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PatienttestDetail.findAll", query = "SELECT p FROM PatienttestDetail p"),
    @NamedQuery(name = "PatienttestDetail.findByPtdId", query = "SELECT p FROM PatienttestDetail p WHERE p.ptdId = :ptdId")})
public class PatienttestDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ptd_id")
    private Integer ptdId;
    @JoinColumn(name = "la_id", referencedColumnName = "la_id")
    @ManyToOne(optional = false)
    private LabAppointment laId;
    @JoinColumn(name = "lt_id", referencedColumnName = "lt_id")
    @ManyToOne(optional = false)
    private Labtest ltId;

    public PatienttestDetail() {
    }

    public PatienttestDetail(Integer ptdId) {
        this.ptdId = ptdId;
    }

    public Integer getPtdId() {
        return ptdId;
    }

    public void setPtdId(Integer ptdId) {
        this.ptdId = ptdId;
    }

    public LabAppointment getLaId() {
        return laId;
    }

    public void setLaId(LabAppointment laId) {
        this.laId = laId;
    }

    public Labtest getLtId() {
        return ltId;
    }

    public void setLtId(Labtest ltId) {
        this.ltId = ltId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ptdId != null ? ptdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PatienttestDetail)) {
            return false;
        }
        PatienttestDetail other = (PatienttestDetail) object;
        if ((this.ptdId == null && other.ptdId != null) || (this.ptdId != null && !this.ptdId.equals(other.ptdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.PatienttestDetail[ ptdId=" + ptdId + " ]";
    }
    
}
