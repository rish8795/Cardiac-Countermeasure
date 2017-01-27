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
@Table(name = "test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Test.findAll", query = "SELECT t FROM Test t"),
    @NamedQuery(name = "Test.findByTId", query = "SELECT t FROM Test t WHERE t.tId = :tId"),
    @NamedQuery(name = "Test.findByTestName", query = "SELECT t FROM Test t WHERE t.testName = :testName"),
    @NamedQuery(name = "Test.findByTestDescription", query = "SELECT t FROM Test t WHERE t.testDescription = :testDescription")})
public class Test implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tId")
    private Collection<TestRecommend> testRecommendCollection;
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "t_id")
    private Integer tId;
    @Basic(optional = false)
    @Column(name = "test_name")
    private String testName;
    @Basic(optional = false)
    @Column(name = "test_description")
    private String testDescription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tId")
    private Collection<Labtest> labtestCollection;

    public Test() {
    }

    public Test(Integer tId) {
        this.tId = tId;
    }

    public Test(Integer tId, String testName, String testDescription) {
        this.tId = tId;
        this.testName = testName;
        this.testDescription = testDescription;
    }

    public Integer getTId() {
        return tId;
    }

    public void setTId(Integer tId) {
        this.tId = tId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestDescription() {
        return testDescription;
    }

    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

    @XmlTransient
    public Collection<Labtest> getLabtestCollection() {
        return labtestCollection;
    }

    public void setLabtestCollection(Collection<Labtest> labtestCollection) {
        this.labtestCollection = labtestCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tId != null ? tId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test)) {
            return false;
        }
        Test other = (Test) object;
        if ((this.tId == null && other.tId != null) || (this.tId != null && !this.tId.equals(other.tId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Test[ tId=" + tId + " ]";
    }

    @XmlTransient
    public Collection<TestRecommend> getTestRecommendCollection() {
        return testRecommendCollection;
    }

    public void setTestRecommendCollection(Collection<TestRecommend> testRecommendCollection) {
        this.testRecommendCollection = testRecommendCollection;
    }
    
}
