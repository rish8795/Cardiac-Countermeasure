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
@Table(name = "lab_appointment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LabAppointment.findAll", query = "SELECT l FROM LabAppointment l"),
    @NamedQuery(name = "LabAppointment.findByLaId", query = "SELECT l FROM LabAppointment l WHERE l.laId = :laId"),
    @NamedQuery(name = "LabAppointment.findByTime", query = "SELECT l FROM LabAppointment l WHERE l.time = :time"),
    @NamedQuery(name = "LabAppointment.findByDate", query = "SELECT l FROM LabAppointment l WHERE l.date = :date"),
    @NamedQuery(name = "LabAppointment.findByStatus", query = "SELECT l FROM LabAppointment l WHERE l.status = :status")})
public class LabAppointment implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "laId")
    private Collection<PatienttestDetail> patienttestDetailCollection;
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "la_id")
    private Integer laId;
    @Column(name = "time")
    private String time;
    @Column(name = "date")
    private String date;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "l_id", referencedColumnName = "l_id")
    @ManyToOne
    private Lab lId;
    @JoinColumn(name = "p_id", referencedColumnName = "p_id")
    @ManyToOne(optional = false)
    private Patient pId;

    public LabAppointment() {
    }

    public LabAppointment(Integer laId) {
        this.laId = laId;
    }

    public LabAppointment(Integer laId, String status) {
        this.laId = laId;
        this.status = status;
    }

    public Integer getLaId() {
        return laId;
    }

    public void setLaId(Integer laId) {
        this.laId = laId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Lab getLId() {
        return lId;
    }

    public void setLId(Lab lId) {
        this.lId = lId;
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
        hash += (laId != null ? laId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LabAppointment)) {
            return false;
        }
        LabAppointment other = (LabAppointment) object;
        if ((this.laId == null && other.laId != null) || (this.laId != null && !this.laId.equals(other.laId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.LabAppointment[ laId=" + laId + " ]";
    }

    @XmlTransient
    public Collection<PatienttestDetail> getPatienttestDetailCollection() {
        return patienttestDetailCollection;
    }

    public void setPatienttestDetailCollection(Collection<PatienttestDetail> patienttestDetailCollection) {
        this.patienttestDetailCollection = patienttestDetailCollection;
    }
    
}
