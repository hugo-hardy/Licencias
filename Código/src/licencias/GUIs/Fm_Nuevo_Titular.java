package licencias.GUIs;
import Entidades.Titular;
import Entidades.Contribuyente;
import javax.swing.JOptionPane;
import java.sql.Date;
import licencias.Imagen;
import licencias.Validacion;
import javax.persistence.*;
import jdk.nashorn.internal.parser.TokenType;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.File;
import java.util.TimeZone;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import static licencias.Validacion.isValidAyN;
import static licencias.Validacion.isValidDom;
import static licencias.Validacion.isValidInsert;
import static licencias.Validacion.isValidNroDoc;

public class Fm_Nuevo_Titular extends javax.swing.JFrame {
    /**
     * Creates new form Fm_Nuevo_Titular
     */
        
    
    
    public Fm_Nuevo_Titular() {
        initComponents();        
        //Colocar fecha maxima la de hoy
        Calendar c = Calendar.getInstance();
        dtpNacimiento.setMaxDate(c);
        
        Imagen im = new Imagen(jpImagen,"add_titular.png");
        jpImagen.add(im).repaint();
        
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("licencias?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        titularQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Titular t");
        titularList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : titularQuery.getResultList();
        titularQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Titular t");
        titularList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : titularQuery1.getResultList();
        titularQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Titular t");
        titularList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : titularQuery2.getResultList();
        contribuyenteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Contribuyente c");
        contribuyenteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : contribuyenteQuery.getResultList();
        titularQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Titular t");
        titularList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : titularQuery3.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jbOk = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jpImagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtbApellido = new javax.swing.JTextField();
        jtbNroDoc = new javax.swing.JTextField();
        jcbTipo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtbDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbGrupoSang = new javax.swing.JComboBox();
        jcbFactor = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jcbClaseA = new javax.swing.JCheckBox();
        jcbClaseB = new javax.swing.JCheckBox();
        jcbClaseC = new javax.swing.JCheckBox();
        jcbClaseE = new javax.swing.JCheckBox();
        jcbClaseD = new javax.swing.JCheckBox();
        jcbClaseF = new javax.swing.JCheckBox();
        jcbClaseG = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jtbImagen = new javax.swing.JTextField();
        jbCancelar1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtbObs = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtbNombre = new javax.swing.JTextField();
        dtpNacimiento = new datechooser.beans.DateChooserCombo();
        jcbDonante = new javax.swing.JCheckBox();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INGRESAR NUEVO TITULAR");

        jLabel1.setText("Tipo");

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

        jpImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpImagenLayout = new javax.swing.GroupLayout(jpImagen);
        jpImagen.setLayout(jpImagenLayout);
        jpImagenLayout.setHorizontalGroup(
            jpImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        jpImagenLayout.setVerticalGroup(
            jpImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jLabel2.setText("Nro. Documento");

        jLabel3.setText("Apellido");

        jtbApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbApellidoActionPerformed(evt);
            }
        });

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "DNI", "LC", "LE" }));
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Dirección");

        jLabel6.setText("Grupo Sanguíneo");

        jLabel7.setText("Factor");

        jcbGrupoSang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "0", "A", "B", "AB" }));

        jcbFactor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "RH +", "RH -" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Tipos de Licencia")));

        jcbClaseA.setText("Clase A");
        jcbClaseA.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbClaseB.setText("Clase B");
        jcbClaseB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbClaseC.setText("Clase C");
        jcbClaseC.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbClaseE.setText("Clase E");
        jcbClaseE.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbClaseD.setText("Clase D");
        jcbClaseD.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbClaseF.setText("Clase F");
        jcbClaseF.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jcbClaseG.setText("Clase G");
        jcbClaseG.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbClaseB)
                    .addComponent(jcbClaseA)
                    .addComponent(jcbClaseC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbClaseE)
                    .addComponent(jcbClaseD)
                    .addComponent(jcbClaseF))
                .addGap(41, 41, 41)
                .addComponent(jcbClaseG)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcbClaseD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbClaseE)
                            .addComponent(jcbClaseG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbClaseF)
                            .addComponent(jcbClaseC)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcbClaseA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbClaseB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("Ruta Imagen");

        jtbImagen.setEditable(false);

        jbCancelar1.setText("...");
        jbCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Observación");

        jLabel11.setText("Nombre");

        dtpNacimiento.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dtpNacimiento.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);

    jcbDonante.setText("Donante");
    jcbDonante.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    jcbDonante.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcbDonanteActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(jLabel10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jtbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCancelar1))
                        .addComponent(jtbObs, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbOk)
                            .addGap(81, 81, 81)
                            .addComponent(jbCancelar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbGrupoSang, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(134, 134, 134))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dtpNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtbNroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addGap(168, 168, 168)
            .addComponent(jcbDonante)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtbNroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addComponent(jpImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dtpNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jtbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbGrupoSang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(jcbFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jcbDonante)
            .addGap(1, 1, 1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addComponent(jbCancelar1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jtbObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbOk)
                .addComponent(jbCancelar))
            .addGap(23, 23, 23))
    );

    getAccessibleContext().setAccessibleDescription("");

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar1ActionPerformed
       File archivo; 
       int resultado;

       Fm_Cargar_Foto ventana = new Fm_Cargar_Foto();
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
       ventana.jfcCargarFoto.setFileFilter(filtro);
       resultado= ventana.jfcCargarFoto.showOpenDialog(null);

       if (JFileChooser.APPROVE_OPTION == resultado){
       archivo = ventana.jfcCargarFoto.getSelectedFile();
        try{
            jtbImagen.setText(archivo.getPath());
        }catch(Exception ex){
           
        JOptionPane.showMessageDialog(null, "Error seleccionando la imagen "+ ex);
                 
        }
    
     }
    }//GEN-LAST:event_jbCancelar1ActionPerformed
    
    //Retorna verdadero si encuentra un contribuyente
    private boolean findContribuyente() {
         Query qc = entityManager.createQuery("select c from Contribuyente C where c.numeroDocumento=?1");
        qc.setParameter(1, jtbNroDoc.getText());
               
        return qc.getResultList().size()>0;
           
  }
   
    //Retorna verdadero si existe el titular con tipo y nro de documento
    private boolean existeTitular() {
        Query qt = entityManager.createQuery("select t from Titular T where t.tipoDocumento=?1 and t.nroDocumento=?2");
        
        qt.setParameter(1, jcbTipo.getSelectedItem().toString());
        qt.setParameter(2, jtbNroDoc.getText());       
        return qt.getResultList().size()>0;
           
  }
    
    //Verificar que este en lista de contribuyente
    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
       try {
         
        if(jcbTipo.getSelectedIndex() == 0 || jcbGrupoSang.getSelectedIndex() == 0 || jcbFactor.getSelectedIndex() == 0){
           JOptionPane.showMessageDialog(null, "Complete los datos"); 
        }   
        else{
        if(((!isValidNroDoc(jtbNroDoc.getText()))) 
           || (!isValidInsert(jtbApellido.getText()))
           || !isValidAyN(jtbApellido.getText())
           || (!isValidAyN(jtbNombre.getText())
           || (!isValidDom(jtbDireccion.getText())) 
           || (!isValidInsert(jtbNombre.getText())) 
           || (!isValidInsert(jtbDireccion.getText())) 
           || (!isValidInsert(jtbNroDoc.getText())) 
           || (!isValidInsert(jtbObs.getText())))){
               
            JOptionPane.showMessageDialog(null, "Error en el ingreso de datos");          
        }
        else{
        if(! findContribuyente())
        {
          JOptionPane.showMessageDialog(null, "El Titular no es Contribuyente");
        }
        else
        {
         if(existeTitular()){
            JOptionPane.showMessageDialog(null, "Ya existe un Titular con este documento"); 
         }  
         else{
             
         
              
      // Crea un nuevo titular
      Date fecha = new Date(dtpNacimiento.getCurrent().get(Calendar.YEAR)-1900, dtpNacimiento.getCurrent().get(Calendar.MONTH)
                         , dtpNacimiento.getCurrent().get(Calendar.DAY_OF_MONTH));
      Titular titular = new Titular();
      titular.setActivo(true);
      titular.setClaseRequerida("");
      titular.setDireccion(jtbDireccion.getText());
      titular.setEsDonante(jcbDonante.isSelected());
      titular.setFactorRh(jcbFactor.getSelectedItem().toString());
      titular.setFechaNacimiento(fecha);
      titular.setGrupoSanguineo(jcbGrupoSang.getSelectedItem().toString());
      titular.setNroDocumento(jtbNroDoc.getText());
      titular.setObservacion(jtbObs.getText());
      titular.setTipoDocumento(jcbTipo.getSelectedItem().toString());
      titular.setNombre(jtbNombre.getText());
      titular.setApellido(jtbApellido.getText());
      titular.setRutaImagen(jtbImagen.getText());
      titular.setClaseA(jcbClaseA.isSelected());
      titular.setClaseB(jcbClaseB.isSelected());
      titular.setClaseC(jcbClaseC.isSelected());
      titular.setClaseD(jcbClaseD.isSelected());
      titular.setClaseE(jcbClaseE.isSelected());
      titular.setClaseF(jcbClaseF.isSelected());
      titular.setClaseG(jcbClaseG.isSelected());
      EntityTransaction etx = entityManager.getTransaction();
      etx.begin();
        entityManager.persist(titular);
        entityManager.close();
      etx.commit();
      
          JOptionPane.showMessageDialog(null, "Titular guardado correctamente");
          dispose();
        }
        }
        }
        }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
       
    }//GEN-LAST:event_jbOkActionPerformed

    private void jtbApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbApellidoActionPerformed

    private void jcbDonanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDonanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDonanteActionPerformed

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoActionPerformed

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
            java.util.logging.Logger.getLogger(Fm_Nuevo_Titular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fm_Nuevo_Titular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fm_Nuevo_Titular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fm_Nuevo_Titular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fm_Nuevo_Titular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<Entidades.Contribuyente> contribuyenteList;
    private javax.persistence.Query contribuyenteQuery;
    private datechooser.beans.DateChooserCombo dtpNacimiento;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCancelar1;
    private javax.swing.JButton jbOk;
    private javax.swing.JCheckBox jcbClaseA;
    private javax.swing.JCheckBox jcbClaseB;
    private javax.swing.JCheckBox jcbClaseC;
    private javax.swing.JCheckBox jcbClaseD;
    private javax.swing.JCheckBox jcbClaseE;
    private javax.swing.JCheckBox jcbClaseF;
    private javax.swing.JCheckBox jcbClaseG;
    private javax.swing.JCheckBox jcbDonante;
    private javax.swing.JComboBox jcbFactor;
    private javax.swing.JComboBox jcbGrupoSang;
    private javax.swing.JComboBox jcbTipo;
    private javax.swing.JPanel jpImagen;
    private javax.swing.JTextField jtbApellido;
    private javax.swing.JTextField jtbDireccion;
    private javax.swing.JTextField jtbImagen;
    private javax.swing.JTextField jtbNombre;
    private javax.swing.JTextField jtbNroDoc;
    private javax.swing.JTextField jtbObs;
    private java.util.List<Entidades.Titular> titularList;
    private java.util.List<Entidades.Titular> titularList1;
    private java.util.List<Entidades.Titular> titularList2;
    private java.util.List<Entidades.Titular> titularList3;
    private javax.persistence.Query titularQuery;
    private javax.persistence.Query titularQuery1;
    private javax.persistence.Query titularQuery2;
    private javax.persistence.Query titularQuery3;
    // End of variables declaration//GEN-END:variables
    
}
