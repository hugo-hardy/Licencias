/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

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
@Table(name = "licencia", catalog = "licencias", schema = "")
@NamedQueries({
    @NamedQuery(name = "Licencia.findAll", query = "SELECT l FROM Licencia l"),
    @NamedQuery(name = "Licencia.findByIdLicencia", query = "SELECT l FROM Licencia l WHERE l.idLicencia = :idLicencia"),
    @NamedQuery(name = "Licencia.findByFechaAlta", query = "SELECT l FROM Licencia l WHERE l.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "Licencia.findByClase", query = "SELECT l FROM Licencia l WHERE l.clase = :clase"),
    @NamedQuery(name = "Licencia.findByVigencia", query = "SELECT l FROM Licencia l WHERE l.vigencia = :vigencia"),
    @NamedQuery(name = "Licencia.findByFechaBaja", query = "SELECT l FROM Licencia l WHERE l.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "Licencia.findByObservacion", query = "SELECT l FROM Licencia l WHERE l.observacion = :observacion"),
    @NamedQuery(name = "Licencia.findByValor", query = "SELECT l FROM Licencia l WHERE l.valor = :valor"),
    @NamedQuery(name = "Licencia.findByIdTitular", query = "SELECT l FROM Licencia l WHERE l.idTitular = :idTitular"),
    @NamedQuery(name = "Licencia.findByImpresa", query = "SELECT l FROM Licencia l WHERE l.impresa = :impresa")})
public class Licencia implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_licencia")
    private Integer idLicencia;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "clase")
    private String clase;
    @Column(name = "vigencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigencia;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Column(name = "observacion")
    private String observacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Double valor;
    @Column(name = "id_titular")
    private Integer idTitular;
    @Column(name = "impresa")
    private Boolean impresa;

    public Licencia() {
    }

    public Licencia(Integer idLicencia) {
        this.idLicencia = idLicencia;
    }

    public Integer getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Integer idLicencia) {
        Integer oldIdLicencia = this.idLicencia;
        this.idLicencia = idLicencia;
        changeSupport.firePropertyChange("idLicencia", oldIdLicencia, idLicencia);
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        Date oldFechaAlta = this.fechaAlta;
        this.fechaAlta = fechaAlta;
        changeSupport.firePropertyChange("fechaAlta", oldFechaAlta, fechaAlta);
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        String oldClase = this.clase;
        this.clase = clase;
        changeSupport.firePropertyChange("clase", oldClase, clase);
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        Date oldVigencia = this.vigencia;
        this.vigencia = vigencia;
        changeSupport.firePropertyChange("vigencia", oldVigencia, vigencia);
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        Date oldFechaBaja = this.fechaBaja;
        this.fechaBaja = fechaBaja;
        changeSupport.firePropertyChange("fechaBaja", oldFechaBaja, fechaBaja);
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        String oldObservacion = this.observacion;
        this.observacion = observacion;
        changeSupport.firePropertyChange("observacion", oldObservacion, observacion);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        Double oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public Integer getIdTitular() {
        return idTitular;
    }

    public void setIdTitular(Integer idTitular) {
        Integer oldIdTitular = this.idTitular;
        this.idTitular = idTitular;
        changeSupport.firePropertyChange("idTitular", oldIdTitular, idTitular);
    }

    public Boolean getImpresa() {
        return impresa;
    }

    public void setImpresa(Boolean impresa) {
        Boolean oldImpresa = this.impresa;
        this.impresa = impresa;
        changeSupport.firePropertyChange("impresa", oldImpresa, impresa);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLicencia != null ? idLicencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Licencia)) {
            return false;
        }
        Licencia other = (Licencia) object;
        if ((this.idLicencia == null && other.idLicencia != null) || (this.idLicencia != null && !this.idLicencia.equals(other.idLicencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "licencias.GUIs.Licencia[ idLicencia=" + idLicencia + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
