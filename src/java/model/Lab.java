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
@Table(name = "lab")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lab.findAll", query = "SELECT l FROM Lab l"),
    @NamedQuery(name = "Lab.findByLId", query = "SELECT l FROM Lab l WHERE l.lId = :lId"),
    @NamedQuery(name = "Lab.findByLabName", query = "SELECT l FROM Lab l WHERE l.labName = :labName"),
    @NamedQuery(name = "Lab.findByContactNum", query = "SELECT l FROM Lab l WHERE l.contactNum = :contactNum"),
    @NamedQuery(name = "Lab.findByWebsite", query = "SELECT l FROM Lab l WHERE l.website = :website"),
    @NamedQuery(name = "Lab.findByStatus", query = "SELECT l FROM Lab l WHERE l.status = :status")})
public class Lab implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "l_id")
    private Integer lId;
    @Basic(optional = false)
    @Column(name = "lab_name")
    private String labName;
    @Basic(optional = false)
    @Column(name = "contact_num")
    private String contactNum;
    @Basic(optional = false)
    @Column(name = "website")
    private String website;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "Address_id", referencedColumnName = "Address_id")
    @ManyToOne(optional = false)
    private Addressdetails addressid;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private Login userId;

    public Lab() {
    }

    public Lab(Integer lId) {
        this.lId = lId;
    }

    public Lab(Integer lId, String labName, String contactNum, String website, String status) {
        this.lId = lId;
        this.labName = labName;
        this.contactNum = contactNum;
        this.website = website;
        this.status = status;
    }

    public Integer getLId() {
        return lId;
    }

    public void setLId(Integer lId) {
        this.lId = lId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Addressdetails getAddressid() {
        return addressid;
    }

    public void setAddressid(Addressdetails addressid) {
        this.addressid = addressid;
    }

    public Login getUserId() {
        return userId;
    }

    public void setUserId(Login userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lId != null ? lId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lab)) {
            return false;
        }
        Lab other = (Lab) object;
        if ((this.lId == null && other.lId != null) || (this.lId != null && !this.lId.equals(other.lId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Lab[ lId=" + lId + " ]";
    }
    
}
