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
@Table(name = "test_recommend")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TestRecommend.findAll", query = "SELECT t FROM TestRecommend t"),
    @NamedQuery(name = "TestRecommend.findByTRid", query = "SELECT t FROM TestRecommend t WHERE t.tRid = :tRid"),
    @NamedQuery(name = "TestRecommend.findByColor", query = "SELECT t FROM TestRecommend t WHERE t.color = :color")})
public class TestRecommend implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "t_rid")
    private Integer tRid;
    @Basic(optional = false)
    @Column(name = "color")
    private String color;
    @JoinColumn(name = "t_id", referencedColumnName = "t_id")
    @ManyToOne(optional = false)
    private Test tId;

    public TestRecommend() {
    }

    public TestRecommend(Integer tRid) {
        this.tRid = tRid;
    }

    public TestRecommend(Integer tRid, String color) {
        this.tRid = tRid;
        this.color = color;
    }

    public Integer getTRid() {
        return tRid;
    }

    public void setTRid(Integer tRid) {
        this.tRid = tRid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        hash += (tRid != null ? tRid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestRecommend)) {
            return false;
        }
        TestRecommend other = (TestRecommend) object;
        if ((this.tRid == null && other.tRid != null) || (this.tRid != null && !this.tRid.equals(other.tRid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TestRecommend[ tRid=" + tRid + " ]";
    }
    
}
