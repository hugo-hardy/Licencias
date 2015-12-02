/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias.GUIs;
import Entidades.ImprimirLicencia;
import licencias.Imagen;
import Entidades.Licencia;
import Entidades.Titular;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import jdk.nashorn.internal.objects.NativeArray;
/**
 *
 * @author HARDY
 */
public class Fm_Imprimir_Licencia extends javax.swing.JFrame {

    /**
     * Creates new form Fm_Imprimir_Licencia
     */
    public Fm_Imprimir_Licencia() {
        initComponents();
        Imagen im = new Imagen(jpImagen,"print_icon.png");
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
        licenciaQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Licencia l");
        licenciaList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : licenciaQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jtbDoc = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jpImagen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IMPRIMIR LICENCIA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nro. Documento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar)
                    .addComponent(jLabel1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jbCancelar.setText("Imprimir");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpImagenLayout = new javax.swing.GroupLayout(jpImagen);
        jpImagen.setLayout(jpImagenLayout);
        jpImagenLayout.setHorizontalGroup(
            jpImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jpImagenLayout.setVerticalGroup(
            jpImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        String dato=String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0));
        int id_lic = Integer.parseInt(dato);
        
        if(id_lic != -1){
        Fm_Imprimir fm_imprimir = new Fm_Imprimir(id_lic);
        fm_imprimir.setLocationRelativeTo(null);
        //fm_imprimir.setVisible(true);
        fm_imprimir.show();
        realizarBusqueda();
        
        }    
        else{
            JOptionPane.showMessageDialog(null, "Seleccione una Licencia para imprimir");
            }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private List<Titular> getTitulares(){
    Query qt = entityManager.createQuery("select t from Titular T");
    return qt.getResultList();                
    }
    
     public void componentClose(ComponentEvent e) {
       this.realizarBusqueda();

    }
       
    
    private void realizarBusqueda(){
        String[] columnNames = {"ID","Clase","Apellido","Nombre","Documento","Fecha Alta","Vencimiento"};
                List<Licencia> listLic;
                
                if("".equals(jtbDoc.getText())){
                listLic = getLicencias();
                }
                else{
                listLic = getLicenciasDNI();
                }
                
                DefaultTableModel dtmLic = new DefaultTableModel(null, columnNames);
                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
                  
                for (int row = 0; row <= listLic.size()-1;row++)
                {                    
                    Titular t = entityManager.find(Titular.class,listLic.get(row).getIdTitular());
                    String[] fila = {listLic.get(row).getIdLicencia().toString(),
                                     listLic.get(row).getClase(),
                                     t.getApellido(),
                                     t.getNombre(),
                                     t.getNroDocumento(),
                                     formatoDelTexto.format(listLic.get(row).getFechaAlta()),
                                     formatoDelTexto.format(listLic.get(row).getVigencia()),
                                                                       
                    }; 
                            
                        dtmLic.addRow(fila);
                }
                 jTable1.setModel(dtmLic);           
                                
                if("".equals(jtbDoc.getText())){
                TableRowSorter trsfiltro = new TableRowSorter(jTable1.getModel());
                List filters = new ArrayList<RowFilter<Object,Object>>(); 
   
                filters.add(RowFilter.regexFilter(jtbDoc.getText(), 4));
                trsfiltro.setRowFilter(RowFilter.andFilter(filters));
   
                jTable1.setRowSorter(trsfiltro);
                } 
    }
    
    private List<Licencia> getLicencias(){
    Query qt = entityManager.createQuery("select l from Licencia L where l.impresa=false");
    return qt.getResultList();
                
    }
    
    private List<Licencia> getLicenciasDNI(){
    //Query qt = entityManager.createQuery("select l from Licencia as L inner join Titular AS t on ON  where l.impresa=false ");
    Query qt = entityManager.createQuery("SELECT l FROM Licencia l, Titular t WHERE l.idTitular = t.idTitular and l.impresa=0 and t.nroDocumento=?1");
          qt.setParameter(1, jtbDoc.getText());
    return qt.getResultList();
                
    }
    
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       realizarBusqueda();               
                
    }//GEN-LAST:event_jbBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Fm_Imprimir_Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fm_Imprimir_Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fm_Imprimir_Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fm_Imprimir_Licencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fm_Imprimir_Licencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JPanel jpImagen;
    private javax.swing.JTextField jtbDoc;
    private java.util.List<Entidades.Licencia> licenciaList;
    private java.util.List<Entidades.Licencia> licenciaList1;
    private javax.persistence.Query licenciaQuery;
    private javax.persistence.Query licenciaQuery1;
    // End of variables declaration//GEN-END:variables
}
