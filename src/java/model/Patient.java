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
@Table(name = "patient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p"),
    @NamedQuery(name = "Patient.findByPId", query = "SELECT p FROM Patient p WHERE p.pId = :pId"),
    @NamedQuery(name = "Patient.findByPFirstname", query = "SELECT p FROM Patient p WHERE p.pFirstname = :pFirstname"),
    @NamedQuery(name = "Patient.findByPLastname", query = "SELECT p FROM Patient p WHERE p.pLastname = :pLastname"),
    @NamedQuery(name = "Patient.findByGender", query = "SELECT p FROM Patient p WHERE p.gender = :gender"),
    @NamedQuery(name = "Patient.findByBirthDate", query = "SELECT p FROM Patient p WHERE p.birthDate = :birthDate"),
    @NamedQuery(name = "Patient.findByContactNum", query = "SELECT p FROM Patient p WHERE p.contactNum = :contactNum"),
    @NamedQuery(name = "Patient.findByEmailId", query = "SELECT p FROM Patient p WHERE p.emailId = :emailId")})
public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "p_id")
    private Integer pId;
    @Basic(optional = false)
    @Column(name = "p_firstname")
    private String pFirstname;
    @Basic(optional = false)
    @Column(name = "p_lastname")
    private String pLastname;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "birth_date")
    private String birthDate;
    @Basic(optional = false)
    @Column(name = "contact_num")
    private String contactNum;
    @Basic(optional = false)
    @Column(name = "email_id")
    private String emailId;
    @JoinColumn(name = "Address_id", referencedColumnName = "Address_id")
    @ManyToOne(optional = false)
    private Addressdetails addressid;
    @JoinColumn(name = "used_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private Login usedId;

    public Patient() {
    }

    public Patient(Integer pId) {
        this.pId = pId;
    }

    public Patient(Integer pId, String pFirstname, String pLastname, String gender, String birthDate, String contactNum, String emailId) {
        this.pId = pId;
        this.pFirstname = pFirstname;
        this.pLastname = pLastname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.contactNum = contactNum;
        this.emailId = emailId;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getPFirstname() {
        return pFirstname;
    }

    public void setPFirstname(String pFirstname) {
        this.pFirstname = pFirstname;
    }

    public String getPLastname() {
        return pLastname;
    }

    public void setPLastname(String pLastname) {
        this.pLastname = pLastname;
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

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Addressdetails getAddressid() {
        return addressid;
    }

    public void setAddressid(Addressdetails addressid) {
        this.addressid = addressid;
    }

    public Login getUsedId() {
        return usedId;
    }

    public void setUsedId(Login usedId) {
        this.usedId = usedId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pId != null ? pId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Patient[ pId=" + pId + " ]";
    }
    
}
