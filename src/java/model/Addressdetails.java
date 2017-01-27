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
@Table(name = "Address_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Addressdetails.findAll", query = "SELECT a FROM Addressdetails a"),
    @NamedQuery(name = "Addressdetails.findByAddressid", query = "SELECT a FROM Addressdetails a WHERE a.addressid = :addressid"),
    @NamedQuery(name = "Addressdetails.findByLine1", query = "SELECT a FROM Addressdetails a WHERE a.line1 = :line1"),
    @NamedQuery(name = "Addressdetails.findByLine2", query = "SELECT a FROM Addressdetails a WHERE a.line2 = :line2"),
    @NamedQuery(name = "Addressdetails.findByPincode", query = "SELECT a FROM Addressdetails a WHERE a.pincode = :pincode")})
public class Addressdetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "Address_id")
    private Integer addressid;
    @Basic(optional = false)
    @Column(name = "line1")
    private String line1;
    @Column(name = "line2")
    private String line2;
    @Basic(optional = false)
    @Column(name = "pincode")
    private String pincode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addressid")
    private Collection<Doctor> doctorCollection;
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    @ManyToOne(optional = false)
    private City cityId;
    @JoinColumn(name = "s_id", referencedColumnName = "s_id")
    @ManyToOne(optional = false)
    private State sId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addressid")
    private Collection<Patient> patientCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addressid")
    private Collection<Lab> labCollection;

    public Addressdetails() {
    }

    public Addressdetails(Integer addressid) {
        this.addressid = addressid;
    }

    public Addressdetails(Integer addressid, String line1, String pincode) {
        this.addressid = addressid;
        this.line1 = line1;
        this.pincode = pincode;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @XmlTransient
    public Collection<Doctor> getDoctorCollection() {
        return doctorCollection;
    }

    public void setDoctorCollection(Collection<Doctor> doctorCollection) {
        this.doctorCollection = doctorCollection;
    }

    public City getCityId() {
        return cityId;
    }

    public void setCityId(City cityId) {
        this.cityId = cityId;
    }

    public State getSId() {
        return sId;
    }

    public void setSId(State sId) {
        this.sId = sId;
    }

    @XmlTransient
    public Collection<Patient> getPatientCollection() {
        return patientCollection;
    }

    public void setPatientCollection(Collection<Patient> patientCollection) {
        this.patientCollection = patientCollection;
    }

    @XmlTransient
    public Collection<Lab> getLabCollection() {
        return labCollection;
    }

    public void setLabCollection(Collection<Lab> labCollection) {
        this.labCollection = labCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressid != null ? addressid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addressdetails)) {
            return false;
        }
        Addressdetails other = (Addressdetails) object;
        if ((this.addressid == null && other.addressid != null) || (this.addressid != null && !this.addressid.equals(other.addressid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Addressdetails[ addressid=" + addressid + " ]";
    }
    
}
