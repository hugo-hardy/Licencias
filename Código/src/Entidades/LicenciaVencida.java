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
@Table(name = "licencia_vencida", catalog = "licencias", schema = "")
@NamedQueries({
    @NamedQuery(name = "LicenciaVencida.findAll", query = "SELECT l FROM LicenciaVencida l"),
    @NamedQuery(name = "LicenciaVencida.findByIdLicenciaVencida", query = "SELECT l FROM LicenciaVencida l WHERE l.idLicenciaVencida = :idLicenciaVencida"),
    @NamedQuery(name = "LicenciaVencida.findByFechaAlta", query = "SELECT l FROM LicenciaVencida l WHERE l.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "LicenciaVencida.findByClase", query = "SELECT l FROM LicenciaVencida l WHERE l.clase = :clase"),
    @NamedQuery(name = "LicenciaVencida.findByVigencia", query = "SELECT l FROM LicenciaVencida l WHERE l.vigencia = :vigencia"),
    @NamedQuery(name = "LicenciaVencida.findByFechaBaja", query = "SELECT l FROM LicenciaVencida l WHERE l.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "LicenciaVencida.findByObservacion", query = "SELECT l FROM LicenciaVencida l WHERE l.observacion = :observacion"),
    @NamedQuery(name = "LicenciaVencida.findByValor", query = "SELECT l FROM LicenciaVencida l WHERE l.valor = :valor"),
    @NamedQuery(name = "LicenciaVencida.findByIdTitular", query = "SELECT l FROM LicenciaVencida l WHERE l.idTitular = :idTitular"),
    @NamedQuery(name = "LicenciaVencida.findByApellidoNombre", query = "SELECT l FROM LicenciaVencida l WHERE l.apellidoNombre = :apellidoNombre"),
    @NamedQuery(name = "LicenciaVencida.findByNroDocumento", query = "SELECT l FROM LicenciaVencida l WHERE l.nroDocumento = :nroDocumento")})
public class LicenciaVencida implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_licencia_vencida")
    private Integer idLicenciaVencida;
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
    @Column(name = "valor")
    private Short valor;
    @Column(name = "id_titular")
    private Integer idTitular;
    @Column(name = "apellido_Nombre")
    private String apellidoNombre;
    @Column(name = "nro_documento")
    private String nroDocumento;

    public LicenciaVencida() {
    }

    public LicenciaVencida(Integer idLicenciaVencida) {
        this.idLicenciaVencida = idLicenciaVencida;
    }

    public Integer getIdLicenciaVencida() {
        return idLicenciaVencida;
    }

    public void setIdLicenciaVencida(Integer idLicenciaVencida) {
        Integer oldIdLicenciaVencida = this.idLicenciaVencida;
        this.idLicenciaVencida = idLicenciaVencida;
        changeSupport.firePropertyChange("idLicenciaVencida", oldIdLicenciaVencida, idLicenciaVencida);
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

    public Short getValor() {
        return valor;
    }

    public void setValor(Short valor) {
        Short oldValor = this.valor;
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

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        String oldApellidoNombre = this.apellidoNombre;
        this.apellidoNombre = apellidoNombre;
        changeSupport.firePropertyChange("apellidoNombre", oldApellidoNombre, apellidoNombre);
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        String oldNroDocumento = this.nroDocumento;
        this.nroDocumento = nroDocumento;
        changeSupport.firePropertyChange("nroDocumento", oldNroDocumento, nroDocumento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLicenciaVencida != null ? idLicenciaVencida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LicenciaVencida)) {
            return false;
        }
        LicenciaVencida other = (LicenciaVencida) object;
        if ((this.idLicenciaVencida == null && other.idLicenciaVencida != null) || (this.idLicenciaVencida != null && !this.idLicenciaVencida.equals(other.idLicenciaVencida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "licencias.GUIs.LicenciaVencida[ idLicenciaVencida=" + idLicenciaVencida + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
