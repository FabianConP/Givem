/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package givem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author fabian
 */
@Entity
@Table(name = "Test2", catalog = "GivemDB", schema = "")
@NamedQueries({
    @NamedQuery(name = "Test2.findAll", query = "SELECT t FROM Test2 t"),
    @NamedQuery(name = "Test2.findByIdTest2", query = "SELECT t FROM Test2 t WHERE t.idTest2 = :idTest2"),
    @NamedQuery(name = "Test2.findByTest2col", query = "SELECT t FROM Test2 t WHERE t.test2col = :test2col")})
public class Test2 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTest2")
    private Integer idTest2;
    @Column(name = "Test2col")
    private String test2col;

    public Test2() {
    }

    public Test2(Integer idTest2) {
        this.idTest2 = idTest2;
    }

    public Integer getIdTest2() {
        return idTest2;
    }

    public void setIdTest2(Integer idTest2) {
        Integer oldIdTest2 = this.idTest2;
        this.idTest2 = idTest2;
        changeSupport.firePropertyChange("idTest2", oldIdTest2, idTest2);
    }

    public String getTest2col() {
        return test2col;
    }

    public void setTest2col(String test2col) {
        String oldTest2col = this.test2col;
        this.test2col = test2col;
        changeSupport.firePropertyChange("test2col", oldTest2col, test2col);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTest2 != null ? idTest2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test2)) {
            return false;
        }
        Test2 other = (Test2) object;
        if ((this.idTest2 == null && other.idTest2 != null) || (this.idTest2 != null && !this.idTest2.equals(other.idTest2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "givem.Test2[ idTest2=" + idTest2 + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
