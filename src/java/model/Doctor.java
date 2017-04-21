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
@Table(name = "doctor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d"),
    @NamedQuery(name = "Doctor.findByDId", query = "SELECT d FROM Doctor d WHERE d.dId = :dId"),
    @NamedQuery(name = "Doctor.findByDFirstname", query = "SELECT d FROM Doctor d WHERE d.dFirstname = :dFirstname"),
    @NamedQuery(name = "Doctor.findByDLastname", query = "SELECT d FROM Doctor d WHERE d.dLastname = :dLastname"),
    @NamedQuery(name = "Doctor.findByGender", query = "SELECT d FROM Doctor d WHERE d.gender = :gender"),
    @NamedQuery(name = "Doctor.findByBirthDate", query = "SELECT d FROM Doctor d WHERE d.birthDate = :birthDate"),
    @NamedQuery(name = "Doctor.findByContactnum", query = "SELECT d FROM Doctor d WHERE d.contactnum = :contactnum"),
    @NamedQuery(name = "Doctor.findByEmailId", query = "SELECT d FROM Doctor d WHERE d.emailId = :emailId"),
    @NamedQuery(name = "Doctor.findByStatus", query = "SELECT d FROM Doctor d WHERE d.status = :status")})
public class Doctor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "d_id")
    private Integer dId;
    @Basic(optional = false)
    @Column(name = "d_firstname")
    private String dFirstname;
    @Basic(optional = false)
    @Column(name = "d_lastname")
    private String dLastname;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "birth_date")
    private String birthDate;
    @Basic(optional = false)
    @Column(name = "Contact_num")
    private String contactnum;
    @Basic(optional = false)
    @Column(name = "email_id")
    private String emailId;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "Address_id", referencedColumnName = "Address_id")
    @ManyToOne(optional = false)
    private Addressdetails addressid;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private Login userId;
    @JoinColumn(name = "qualification_id", referencedColumnName = "qualification_id")
    @ManyToOne(optional = false)
    private Qualification qualificationId;
    @JoinColumn(name = "speciality_id", referencedColumnName = "spec_id")
    @ManyToOne(optional = false)
    private Speciality specialityId;

    public Doctor() {
    }

    public Doctor(Integer dId) {
        this.dId = dId;
    }

    public Doctor(Integer dId, String dFirstname, String dLastname, String gender, String birthDate, String contactnum, String emailId, String status) {
        this.dId = dId;
        this.dFirstname = dFirstname;
        this.dLastname = dLastname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.contactnum = contactnum;
        this.emailId = emailId;
        this.status = status;
    }

    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

    public String getDFirstname() {
        return dFirstname;
    }

    public void setDFirstname(String dFirstname) {
        this.dFirstname = dFirstname;
    }

    public String getDLastname() {
        return dLastname;
    }

    public void setDLastname(String dLastname) {
        this.dLastname = dLastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        this.contactnum = contactnum;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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

    public Qualification getQualificationId() {
        return qualificationId;
    }

    public void setQualificationId(Qualification qualificationId) {
        this.qualificationId = qualificationId;
    }

    public Speciality getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(Speciality specialityId) {
        this.specialityId = specialityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dId != null ? dId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) object;
        if ((this.dId == null && other.dId != null) || (this.dId != null && !this.dId.equals(other.dId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Doctor[ dId=" + dId + " ]";
    }
    
}
