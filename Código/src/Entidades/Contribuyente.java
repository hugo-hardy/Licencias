
package Entidades;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "contribuyente", catalog = "licencias", schema = "")
@NamedQueries({
    @NamedQuery(name = "Contribuyente.findAll", query = "SELECT c FROM Contribuyente c"),
    @NamedQuery(name = "Contribuyente.findByIdContribuyente", query = "SELECT c FROM Contribuyente c WHERE c.idContribuyente = :idContribuyente"),
    @NamedQuery(name = "Contribuyente.findByNumeroDocumento", query = "SELECT c FROM Contribuyente c WHERE c.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "Contribuyente.findByApellido", query = "SELECT c FROM Contribuyente c WHERE c.apellido = :apellido"),
    @NamedQuery(name = "Contribuyente.findByNombre", query = "SELECT c FROM Contribuyente c WHERE c.nombre = :nombre")})
public class Contribuyente implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_contribuyente")
    private Integer idContribuyente;
    @Column(name = "numero_documento")
    private String numeroDocumento;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "nombre")
    private String nombre;

    public Contribuyente() {
    }

    public Contribuyente(Integer idContribuyente) {
        this.idContribuyente = idContribuyente;
    }

    public Integer getIdContribuyente() {
        return idContribuyente;
    }

    public void setIdContribuyente(Integer idContribuyente) {
        Integer oldIdContribuyente = this.idContribuyente;
        this.idContribuyente = idContribuyente;
        changeSupport.firePropertyChange("idContribuyente", oldIdContribuyente, idContribuyente);
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        String oldNumeroDocumento = this.numeroDocumento;
        this.numeroDocumento = numeroDocumento;
        changeSupport.firePropertyChange("numeroDocumento", oldNumeroDocumento, numeroDocumento);
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContribuyente != null ? idContribuyente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contribuyente)) {
            return false;
        }
        Contribuyente other = (Contribuyente) object;
        if ((this.idContribuyente == null && other.idContribuyente != null) || (this.idContribuyente != null && !this.idContribuyente.equals(other.idContribuyente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "licencias.GUIs.Contribuyente[ idContribuyente=" + idContribuyente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
   
  
    
}
