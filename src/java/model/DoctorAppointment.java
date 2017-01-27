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
@Table(name = "doctor_appointment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DoctorAppointment.findAll", query = "SELECT d FROM DoctorAppointment d"),
    @NamedQuery(name = "DoctorAppointment.findByDaId", query = "SELECT d FROM DoctorAppointment d WHERE d.daId = :daId"),
    @NamedQuery(name = "DoctorAppointment.findByTime", query = "SELECT d FROM DoctorAppointment d WHERE d.time = :time"),
    @NamedQuery(name = "DoctorAppointment.findByDate", query = "SELECT d FROM DoctorAppointment d WHERE d.date = :date"),
    @NamedQuery(name = "DoctorAppointment.findByStatus", query = "SELECT d FROM DoctorAppointment d WHERE d.status = :status")})
public class DoctorAppointment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "da_id")
    private Integer daId;
    @Column(name = "time")
    private String time;
    @Column(name = "date")
    private String date;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "d_id", referencedColumnName = "d_id")
    @ManyToOne(optional = false)
    private Doctor dId;
    @JoinColumn(name = "p_id", referencedColumnName = "p_id")
    @ManyToOne(optional = false)
    private Patient pId;

    public DoctorAppointment() {
    }

    public DoctorAppointment(Integer daId) {
        this.daId = daId;
    }

    public DoctorAppointment(Integer daId, String status) {
        this.daId = daId;
        this.status = status;
    }

    public Integer getDaId() {
        return daId;
    }

    public void setDaId(Integer daId) {
        this.daId = daId;
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

    public Doctor getDId() {
        return dId;
    }

    public void setDId(Doctor dId) {
        this.dId = dId;
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
        hash += (daId != null ? daId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DoctorAppointment)) {
            return false;
        }
        DoctorAppointment other = (DoctorAppointment) object;
        if ((this.daId == null && other.daId != null) || (this.daId != null && !this.daId.equals(other.daId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DoctorAppointment[ daId=" + daId + " ]";
    }
    
}
