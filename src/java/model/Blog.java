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
import javax.persistence.Lob;
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
@Table(name = "blog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Blog.findAll", query = "SELECT b FROM Blog b"),
    @NamedQuery(name = "Blog.findByBlogId", query = "SELECT b FROM Blog b WHERE b.blogId = :blogId"),
    @NamedQuery(name = "Blog.findByBlogname", query = "SELECT b FROM Blog b WHERE b.blogname = :blogname"),
    @NamedQuery(name = "Blog.findByBlogView", query = "SELECT b FROM Blog b WHERE b.blogView = :blogView"),
    @NamedQuery(name = "Blog.findByBlogDate", query = "SELECT b FROM Blog b WHERE b.blogDate = :blogDate"),
    @NamedQuery(name = "Blog.findByImageUrl", query = "SELECT b FROM Blog b WHERE b.imageUrl = :imageUrl")})
public class Blog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "blog_id")
    private Integer blogId;
    @Basic(optional = false)
    @Column(name = "blogname")
    private String blogname;
    @Column(name = "blog_view")
    private Integer blogView;
    @Basic(optional = false)
    @Lob
    @Column(name = "blogdescription")
    private String blogdescription;
    @Column(name = "blog_date")
    private String blogDate;
    @Column(name = "image_url")
    private String imageUrl;
    @JoinColumn(name = "d_id", referencedColumnName = "d_id")
    @ManyToOne(optional = false)
    private Doctor dId;

    public Blog() {
    }

    public Blog(Integer blogId) {
        this.blogId = blogId;
    }

    public Blog(Integer blogId, String blogname, String blogdescription) {
        this.blogId = blogId;
        this.blogname = blogname;
        this.blogdescription = blogdescription;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname;
    }

    public Integer getBlogView() {
        return blogView;
    }

    public void setBlogView(Integer blogView) {
        this.blogView = blogView;
    }

    public String getBlogdescription() {
        return blogdescription;
    }

    public void setBlogdescription(String blogdescription) {
        this.blogdescription = blogdescription;
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Doctor getDId() {
        return dId;
    }

    public void setDId(Doctor dId) {
        this.dId = dId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (blogId != null ? blogId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Blog)) {
            return false;
        }
        Blog other = (Blog) object;
        if ((this.blogId == null && other.blogId != null) || (this.blogId != null && !this.blogId.equals(other.blogId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Blog[ blogId=" + blogId + " ]";
    }
    
}
