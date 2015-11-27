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
@Table(name = "titular", catalog = "licencias", schema = "")
@NamedQueries({
    @NamedQuery(name = "Titular.findAll", query = "SELECT t FROM Titular t"),
    @NamedQuery(name = "Titular.findByIdTitular", query = "SELECT t FROM Titular t WHERE t.idTitular = :idTitular"),
    @NamedQuery(name = "Titular.findByApellido", query = "SELECT t FROM Titular t WHERE t.apellido = :apellido"),
    @NamedQuery(name = "Titular.findByNombre", query = "SELECT t FROM Titular t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Titular.findByTipoDocumento", query = "SELECT t FROM Titular t WHERE t.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Titular.findByNroDocumento", query = "SELECT t FROM Titular t WHERE t.nroDocumento = :nroDocumento"),
    @NamedQuery(name = "Titular.findByClaseRequerida", query = "SELECT t FROM Titular t WHERE t.claseRequerida = :claseRequerida"),
    @NamedQuery(name = "Titular.findByDireccion", query = "SELECT t FROM Titular t WHERE t.direccion = :direccion"),
    @NamedQuery(name = "Titular.findByEsDonante", query = "SELECT t FROM Titular t WHERE t.esDonante = :esDonante"),
    @NamedQuery(name = "Titular.findByFactorRh", query = "SELECT t FROM Titular t WHERE t.factorRh = :factorRh"),
    @NamedQuery(name = "Titular.findByFechaNacimiento", query = "SELECT t FROM Titular t WHERE t.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Titular.findByGrupoSanguineo", query = "SELECT t FROM Titular t WHERE t.grupoSanguineo = :grupoSanguineo"),
    @NamedQuery(name = "Titular.findByObservacion", query = "SELECT t FROM Titular t WHERE t.observacion = :observacion"),
    @NamedQuery(name = "Titular.findByActivo", query = "SELECT t FROM Titular t WHERE t.activo = :activo"),
    @NamedQuery(name = "Titular.findByRutaImagen", query = "SELECT t FROM Titular t WHERE t.rutaImagen = :rutaImagen"),
    @NamedQuery(name = "Titular.findByClaseA", query = "SELECT t FROM Titular t WHERE t.claseA = :claseA"),
    @NamedQuery(name = "Titular.findByClaseB", query = "SELECT t FROM Titular t WHERE t.claseB = :claseB"),
    @NamedQuery(name = "Titular.findByClaseC", query = "SELECT t FROM Titular t WHERE t.claseC = :claseC"),
    @NamedQuery(name = "Titular.findByClaseD", query = "SELECT t FROM Titular t WHERE t.claseD = :claseD"),
    @NamedQuery(name = "Titular.findByClaseE", query = "SELECT t FROM Titular t WHERE t.claseE = :claseE"),
    @NamedQuery(name = "Titular.findByClaseF", query = "SELECT t FROM Titular t WHERE t.claseF = :claseF"),
    @NamedQuery(name = "Titular.findByClaseG", query = "SELECT t FROM Titular t WHERE t.claseG = :claseG")})
public class Titular implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_titular")
    private Integer idTitular;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Column(name = "nro_documento")
    private String nroDocumento;
    @Column(name = "clase_requerida")
    private String claseRequerida;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "es_donante")
    private Boolean esDonante;
    @Column(name = "factor_rh")
    private String factorRh;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "grupo_sanguineo")
    private String grupoSanguineo;
    @Column(name = "observacion")
    private String observacion;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "rutaImagen")
    private String rutaImagen;
    @Column(name = "clase_a")
    private Boolean claseA;
    @Column(name = "clase_b")
    private Boolean claseB;
    @Column(name = "clase_c")
    private Boolean claseC;
    @Column(name = "clase_d")
    private Boolean claseD;
    @Column(name = "clase_e")
    private Boolean claseE;
    @Column(name = "clase_f")
    private Boolean claseF;
    @Column(name = "clase_g")
    private Boolean claseG;

    public Titular() {
    }

    public Titular(Integer idTitular) {
        this.idTitular = idTitular;
    }

    public Integer getIdTitular() {
        return idTitular;
    }

    public void setIdTitular(Integer idTitular) {
        Integer oldIdTitular = this.idTitular;
        this.idTitular = idTitular;
        changeSupport.firePropertyChange("idTitular", oldIdTitular, idTitular);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        String oldApellido = this.apellido;
        this.apellido = apellido;
        changeSupport.firePropertyChange("apellido", oldApellido, apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        String oldTipoDocumento = this.tipoDocumento;
        this.tipoDocumento = tipoDocumento;
        changeSupport.firePropertyChange("tipoDocumento", oldTipoDocumento, tipoDocumento);
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        String oldNroDocumento = this.nroDocumento;
        this.nroDocumento = nroDocumento;
        changeSupport.firePropertyChange("nroDocumento", oldNroDocumento, nroDocumento);
    }

    public String getClaseRequerida() {
        return claseRequerida;
    }

    public void setClaseRequerida(String claseRequerida) {
        String oldClaseRequerida = this.claseRequerida;
        this.claseRequerida = claseRequerida;
        changeSupport.firePropertyChange("claseRequerida", oldClaseRequerida, claseRequerida);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public Boolean getEsDonante() {
        return esDonante;
    }

    public void setEsDonante(Boolean esDonante) {
        Boolean oldEsDonante = this.esDonante;
        this.esDonante = esDonante;
        changeSupport.firePropertyChange("esDonante", oldEsDonante, esDonante);
    }

    public String getFactorRh() {
        return factorRh;
    }

    public void setFactorRh(String factorRh) {
        String oldFactorRh = this.factorRh;
        this.factorRh = factorRh;
        changeSupport.firePropertyChange("factorRh", oldFactorRh, factorRh);
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        Date oldFechaNacimiento = this.fechaNacimiento;
        this.fechaNacimiento = fechaNacimiento;
        changeSupport.firePropertyChange("fechaNacimiento", oldFechaNacimiento, fechaNacimiento);
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        String oldGrupoSanguineo = this.grupoSanguineo;
        this.grupoSanguineo = grupoSanguineo;
        changeSupport.firePropertyChange("grupoSanguineo", oldGrupoSanguineo, grupoSanguineo);
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        String oldObservacion = this.observacion;
        this.observacion = observacion;
        changeSupport.firePropertyChange("observacion", oldObservacion, observacion);
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        Boolean oldActivo = this.activo;
        this.activo = activo;
        changeSupport.firePropertyChange("activo", oldActivo, activo);
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        String oldRutaImagen = this.rutaImagen;
        this.rutaImagen = rutaImagen;
        changeSupport.firePropertyChange("rutaImagen", oldRutaImagen, rutaImagen);
    }

    public Boolean getClaseA() {
        return claseA;
    }

    public void setClaseA(Boolean claseA) {
        Boolean oldClaseA = this.claseA;
        this.claseA = claseA;
        changeSupport.firePropertyChange("claseA", oldClaseA, claseA);
    }

    public Boolean getClaseB() {
        return claseB;
    }

    public void setClaseB(Boolean claseB) {
        Boolean oldClaseB = this.claseB;
        this.claseB = claseB;
        changeSupport.firePropertyChange("claseB", oldClaseB, claseB);
    }

    public Boolean getClaseC() {
        return claseC;
    }

    public void setClaseC(Boolean claseC) {
        Boolean oldClaseC = this.claseC;
        this.claseC = claseC;
        changeSupport.firePropertyChange("claseC", oldClaseC, claseC);
    }

    public Boolean getClaseD() {
        return claseD;
    }

    public void setClaseD(Boolean claseD) {
        Boolean oldClaseD = this.claseD;
        this.claseD = claseD;
        changeSupport.firePropertyChange("claseD", oldClaseD, claseD);
    }

    public Boolean getClaseE() {
        return claseE;
    }

    public void setClaseE(Boolean claseE) {
        Boolean oldClaseE = this.claseE;
        this.claseE = claseE;
        changeSupport.firePropertyChange("claseE", oldClaseE, claseE);
    }

    public Boolean getClaseF() {
        return claseF;
    }

    public void setClaseF(Boolean claseF) {
        Boolean oldClaseF = this.claseF;
        this.claseF = claseF;
        changeSupport.firePropertyChange("claseF", oldClaseF, claseF);
    }

    public Boolean getClaseG() {
        return claseG;
    }

    public void setClaseG(Boolean claseG) {
        Boolean oldClaseG = this.claseG;
        this.claseG = claseG;
        changeSupport.firePropertyChange("claseG", oldClaseG, claseG);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTitular != null ? idTitular.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titular)) {
            return false;
        }
        Titular other = (Titular) object;
        if ((this.idTitular == null && other.idTitular != null) || (this.idTitular != null && !this.idTitular.equals(other.idTitular))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "licencias.GUIs.Titular[ idTitular=" + idTitular + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
