/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias.GUIs;
import licencias.Imagen;
import Entidades.Titular;
import Entidades.Licencia;
import Entidades.TipoLicencia;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import java.text.SimpleDateFormat;
/**
 *
 * @author HARDY
 */
public class Fm_Emitir_Licencia extends javax.swing.JFrame {
    private int id_titular = 0;
    /**
     * Creates new form Fm_Emitir_Licencia
     */
    public Fm_Emitir_Licencia() {
        initComponents();
        Imagen im = new Imagen(jpImagen,"add_licence.png");
        jpImagen.add(im).repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("licencias?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        licenciaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Licencia l");
        licenciaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : licenciaQuery.getResultList();
        titularQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Titular t");
        titularList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : titularQuery.getResultList();
        licenciaQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Licencia l");
        licenciaList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : licenciaQuery1.getResultList();
        jpImagen = new javax.swing.JPanel();
        jbOk = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcbTipo = new javax.swing.JComboBox();
        jtbNroDoc = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtbApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtbDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbGrupo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jcbFactor = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jcbA = new javax.swing.JCheckBox();
        jcbB = new javax.swing.JCheckBox();
        jcbC = new javax.swing.JCheckBox();
        jcbE = new javax.swing.JCheckBox();
        jcbD = new javax.swing.JCheckBox();
        jcbF = new javax.swing.JCheckBox();
        jcbG = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jtbObs = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtbNombre = new javax.swing.JTextField();
        jchbDonante = new javax.swing.JCheckBox();
        jftNacimiento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMITIR LICENCIA");

        javax.swing.GroupLayout jpImagenLayout = new javax.swing.GroupLayout(jpImagen);
        jpImagen.setLayout(jpImagenLayout);
        jpImagenLayout.setHorizontalGroup(
            jpImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jpImagenLayout.setVerticalGroup(
            jpImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jbOk.setText("Aceptar");
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Titular"));

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DNI", "CI", "PASAPORTE", "LE" }));

        jtbNroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbNroDocActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtbNroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtbNroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Apellido");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Dirección");

        jLabel6.setText("Grupo Sanguíneo");

        jcbGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "0", "A", "B", "AB" }));
        jcbGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGrupoActionPerformed(evt);
            }
        });

        jLabel7.setText("Factor");

        jcbFactor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "RH +", "RH -" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Tipos de Licencia")));

        jcbA.setText("Clase A");
        jcbA.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbB.setText("Clase B");
        jcbB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbC.setText("Clase C");
        jcbC.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbE.setText("Clase E");
        jcbE.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbD.setText("Clase D");
        jcbD.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jcbD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDActionPerformed(evt);
            }
        });

        jcbF.setText("Clase F");
        jcbF.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbG.setText("Clase G");
        jcbG.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbB)
                    .addComponent(jcbA)
                    .addComponent(jcbC))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcbE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbG))
                    .addComponent(jcbD)
                    .addComponent(jcbF))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcbD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbE)
                            .addComponent(jcbG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbF)
                            .addComponent(jcbC)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcbA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("Observación");

        jLabel10.setText("Nombre");

        jchbDonante.setText("Es donante");
        jchbDonante.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jftNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtbObs, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jchbDonante))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbOk)
                        .addGap(81, 81, 81)
                        .addComponent(jbCancelar)))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jpImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jftNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jchbDonante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtbObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbOk)
                    .addComponent(jbCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private Titular buscarTitular(String tipoDoc, String nroDoc) {                                           
        Titular titu = new Titular();
        
        Query q = entityManager.createQuery("select t from Titular T where t.activo = true and t.nroDocumento=?1 and t.tipoDocumento=?2");
        q.setParameter(1, nroDoc);
        q.setParameter(2, tipoDoc);
        if(q.getFirstResult() ==0)
        {
            titu = (Titular)q.getSingleResult();
        }
        return titu;
    }
    
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        //Buscar Titular y cargar los datos
        Titular t =  buscarTitular(jcbTipo.getSelectedItem().toString(), jtbNroDoc.getText());
        
        if (t.getNroDocumento() == null)
        {
          JOptionPane.showMessageDialog(null, "No se encontró Titular");
        }
        else
        {
        id_titular = t.getIdTitular();
                       
        jtbApellido.setText(t.getApellido());
        jtbNombre.setText(t.getNombre());
        jtbDireccion.setText(t.getDireccion());
        if(t.getFechaNacimiento()!=null)
        {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = formatter.format(t.getFechaNacimiento());
        jftNacimiento.setText(dateString);
        }
        jcbFactor.setSelectedItem(t.getFactorRh());
        jcbGrupo.setSelectedItem(t.getGrupoSanguineo());
        jchbDonante.setSelected(t.getEsDonante());
        jtbObs.setText(t.getObservacion());
        jcbA.setSelected(t.getClaseA());
        jcbB.setSelected(t.getClaseB());
        jcbC.setSelected(t.getClaseC());
        jcbD.setSelected(t.getClaseD());
        jcbE.setSelected(t.getClaseE());
        jcbF.setSelected(t.getClaseF());
        jcbG.setSelected(t.getClaseG());
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    
    private int edad(String fecha_nac) {     //fecha_nac debe tener el formato dd/MM/yyyy
   
    Date fechaActual = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String hoy = formato.format(fechaActual);
    String[] dat1 = fecha_nac.split("/");
    String[] dat2 = hoy.split("/");
    int anos = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
    int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
    if (mes < 0) {
      anos = anos - 1;
    } else if (mes == 0) {
      int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
      if (dia > 0) {
        anos = anos - 1;
      }
    }
    return anos;
  }
    
    private void jcbGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbGrupoActionPerformed

    private void jcbDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDActionPerformed

    private void emitirLicenciaConClase(String clase) {                                         
         try {
      // Crea un nueva licencia
      Licencia lic = new Licencia();
      lic.setFechaAlta(new Date());
      lic.setVigencia(null);
      lic.setFechaBaja(null);
      lic.setIdTitular(id_titular);
      lic.setObservacion(jtbObs.getText());
      lic.setValor(null);
      lic.setClase(clase);      
      lic.setImpresa(false);
      
      EntityTransaction etx = entityManager.getTransaction();
      etx.begin();
        entityManager.persist(lic);
        //entityManager.close();
      etx.commit();
                
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    } 
    
    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        // Emitir Licencia despues de validar
       int countEmitidas = 0;
       int tituEdad = 0;
       tituEdad = edad(jftNacimiento.getText());
      
       if(jcbA.isSelected())
       {
           //Validar clase A
           if(TipoLicencia.cumpleEdadMinima("Clase A", tituEdad))
           emitirLicenciaConClase("Clase A");
           countEmitidas++;
       }
       if(jcbB.isSelected())
       {
           //Validar clase B
           emitirLicenciaConClase("Clase B");
           countEmitidas++;
       }
       if(jcbC.isSelected())
       {
           //Validar clase C
           emitirLicenciaConClase("Clase C");
           countEmitidas++;
       }
       if(jcbD.isSelected())
       {
           //Validar clase D
           emitirLicenciaConClase("Clase D");
           countEmitidas++;
       }
       if(jcbE.isSelected())
       {
           //Validar clase E
           emitirLicenciaConClase("Clase E");
           countEmitidas++;
       }
       if(jcbF.isSelected())
       {
           //Validar clase F
           emitirLicenciaConClase("Clase F");
           countEmitidas++;
       }
       if(jcbG.isSelected())
       {
           //Validar clase G
           emitirLicenciaConClase("Clase G");
           countEmitidas++;
       }
       if(countEmitidas > 0)
       {
        JOptionPane.showMessageDialog(null, "Se han Emitido "+ countEmitidas +" Licencias");
        dispose();
       }
       entityManager.close();
        
    }//GEN-LAST:event_jbOkActionPerformed

    private void jtbNroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbNroDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbNroDocActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fm_Emitir_Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fm_Emitir_Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fm_Emitir_Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fm_Emitir_Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fm_Emitir_Licencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbOk;
    private javax.swing.JCheckBox jcbA;
    private javax.swing.JCheckBox jcbB;
    private javax.swing.JCheckBox jcbC;
    private javax.swing.JCheckBox jcbD;
    private javax.swing.JCheckBox jcbE;
    private javax.swing.JCheckBox jcbF;
    private javax.swing.JComboBox jcbFactor;
    private javax.swing.JCheckBox jcbG;
    private javax.swing.JComboBox jcbGrupo;
    private javax.swing.JComboBox jcbTipo;
    private javax.swing.JCheckBox jchbDonante;
    private javax.swing.JFormattedTextField jftNacimiento;
    private javax.swing.JPanel jpImagen;
    private javax.swing.JTextField jtbApellido;
    private javax.swing.JTextField jtbDireccion;
    private javax.swing.JTextField jtbNombre;
    private javax.swing.JTextField jtbNroDoc;
    private javax.swing.JTextField jtbObs;
    private java.util.List<Entidades.Licencia> licenciaList;
    private java.util.List<Entidades.Licencia> licenciaList1;
    private javax.persistence.Query licenciaQuery;
    private javax.persistence.Query licenciaQuery1;
    private java.util.List<Entidades.Titular> titularList;
    private javax.persistence.Query titularQuery;
    // End of variables declaration//GEN-END:variables
}
