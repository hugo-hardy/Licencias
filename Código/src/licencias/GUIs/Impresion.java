/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias.GUIs;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author HARDY
 */
@Entity
@Table(name = "impresion", catalog = "licencias", schema = "")
@NamedQueries({
    @NamedQuery(name = "Impresion.findAll", query = "SELECT i FROM Impresion i"),
    @NamedQuery(name = "Impresion.findByIdImpresion", query = "SELECT i FROM Impresion i WHERE i.idImpresion = :idImpresion"),
    @NamedQuery(name = "Impresion.findByFecha", query = "SELECT i FROM Impresion i WHERE i.fecha = :fecha"),
    @NamedQuery(name = "Impresion.findByIdLicencia", query = "SELECT i FROM Impresion i WHERE i.idLicencia = :idLicencia"),
    @NamedQuery(name = "Impresion.findByNroCopia", query = "SELECT i FROM Impresion i WHERE i.nroCopia = :nroCopia")})
public class Impresion implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_impresion")
    private Integer idImpresion;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "id_licencia")
    private Integer idLicencia;
    @Column(name = "nro_copia")
    private Integer nroCopia;

    public Impresion() {
    }

    public Impresion(Integer idImpresion) {
        this.idImpresion = idImpresion;
    }

    public Integer getIdImpresion() {
        return idImpresion;
    }

    public void setIdImpresion(Integer idImpresion) {
        Integer oldIdImpresion = this.idImpresion;
        this.idImpresion = idImpresion;
        changeSupport.firePropertyChange("idImpresion", oldIdImpresion, idImpresion);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public Integer getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Integer idLicencia) {
        Integer oldIdLicencia = this.idLicencia;
        this.idLicencia = idLicencia;
        changeSupport.firePropertyChange("idLicencia", oldIdLicencia, idLicencia);
    }

    public Integer getNroCopia() {
        return nroCopia;
    }

    public void setNroCopia(Integer nroCopia) {
        Integer oldNroCopia = this.nroCopia;
        this.nroCopia = nroCopia;
        changeSupport.firePropertyChange("nroCopia", oldNroCopia, nroCopia);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idImpresion != null ? idImpresion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Impresion)) {
            return false;
        }
        Impresion other = (Impresion) object;
        if ((this.idImpresion == null && other.idImpresion != null) || (this.idImpresion != null && !this.idImpresion.equals(other.idImpresion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "licencias.GUIs.Impresion[ idImpresion=" + idImpresion + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
