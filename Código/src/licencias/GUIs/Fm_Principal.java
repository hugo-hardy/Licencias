
package licencias.GUIs;

public class Fm_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Fm_Principal
     */
    public Fm_Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbNuevoTitular = new javax.swing.JButton();
        jbEmitirLicencia = new javax.swing.JButton();
        jbImprimirLicencia = new javax.swing.JButton();
        jbLicenciaExpirada = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiLogin = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmTitulares = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jmLicencias = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE EMISIÓN DE LICENCIAS");
        setName("frPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(650, 650));
        setResizable(false);

        jbNuevoTitular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_titular.png"))); // NOI18N
        jbNuevoTitular.setText("Nuevo Titular");
        jbNuevoTitular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNuevoTitular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbNuevoTitular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbNuevoTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoTitularActionPerformed(evt);
            }
        });

        jbEmitirLicencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_licence.png"))); // NOI18N
        jbEmitirLicencia.setText("Emitir Licencia");
        jbEmitirLicencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEmitirLicencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEmitirLicencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbEmitirLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEmitirLicenciaActionPerformed(evt);
            }
        });

        jbImprimirLicencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/print_icon.png"))); // NOI18N
        jbImprimirLicencia.setText("Imprimir Licencia");
        jbImprimirLicencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbImprimirLicencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbImprimirLicencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbImprimirLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirLicenciaActionPerformed(evt);
            }
        });

        jbLicenciaExpirada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_icon.png"))); // NOI18N
        jbLicenciaExpirada.setText("Licencias Expiradas");
        jbLicenciaExpirada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLicenciaExpirada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbLicenciaExpirada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbLicenciaExpirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLicenciaExpiradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevoTitular)
                .addGap(18, 18, 18)
                .addComponent(jbEmitirLicencia)
                .addGap(18, 18, 18)
                .addComponent(jbImprimirLicencia)
                .addGap(18, 18, 18)
                .addComponent(jbLicenciaExpirada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbLicenciaExpirada)
                    .addComponent(jbImprimirLicencia)
                    .addComponent(jbEmitirLicencia)
                    .addComponent(jbNuevoTitular)))
        );

        jmArchivo.setText("Inicio");

        jmiLogin.setText("Iniciar Sesión");
        jmiLogin.setEnabled(false);
        jmArchivo.add(jmiLogin);

        jMenuItem1.setText("Administrar Usuarios");
        jMenuItem1.setEnabled(false);
        jmArchivo.add(jMenuItem1);

        jMenuBar1.add(jmArchivo);

        jmTitulares.setText("Titulares");

        jMenuItem3.setText("Nuevo Titular");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmTitulares.add(jMenuItem3);

        jMenuItem4.setText("Buscar Titular");
        jMenuItem4.setEnabled(false);
        jmTitulares.add(jMenuItem4);

        jMenuItem10.setText("Modificar Titular");
        jMenuItem10.setEnabled(false);
        jmTitulares.add(jMenuItem10);

        jMenuBar1.add(jmTitulares);

        jmLicencias.setText("Licencias");

        jMenuItem9.setText("Emitir Copia");
        jMenuItem9.setEnabled(false);
        jmLicencias.add(jMenuItem9);

        jMenuItem5.setText("Emitir Licencia");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmLicencias.add(jMenuItem5);

        jMenuItem6.setText("Licencias Expiradas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jmLicencias.add(jMenuItem6);

        jMenuItem7.setText("Licencias Vigentes");
        jMenuItem7.setEnabled(false);
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jmLicencias.add(jMenuItem7);

        jMenuItem2.setText("Renovar Licencia");
        jMenuItem2.setEnabled(false);
        jmLicencias.add(jMenuItem2);

        jMenuBar1.add(jmLicencias);

        jMenu2.setText("Imprimir");

        jMenuItem8.setText("Imprimir Licencia");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem11.setText("Imprimir Cupón");
        jMenuItem11.setEnabled(false);
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Salir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoTitularActionPerformed
        Fm_Nuevo_Titular fm_nuevo_titular = new Fm_Nuevo_Titular();
        fm_nuevo_titular.setLocationRelativeTo(null);
        fm_nuevo_titular.setVisible(true);
      
    }//GEN-LAST:event_jbNuevoTitularActionPerformed

    private void jbEmitirLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEmitirLicenciaActionPerformed
        Fm_Emitir_Licencia fm_emitir_licencia = new Fm_Emitir_Licencia();
        fm_emitir_licencia.setLocationRelativeTo(null);
        fm_emitir_licencia.setVisible(true);
    }//GEN-LAST:event_jbEmitirLicenciaActionPerformed

    private void jbImprimirLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirLicenciaActionPerformed
        Fm_Imprimir_Licencia fm_imprimir_licencia = new Fm_Imprimir_Licencia();
        fm_imprimir_licencia.setLocationRelativeTo(null);
        fm_imprimir_licencia.setVisible(true);
    }//GEN-LAST:event_jbImprimirLicenciaActionPerformed

    private void jbLicenciaExpiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLicenciaExpiradaActionPerformed
        Fm_Licencias_Expiradas fm_licencias_expiradas = new Fm_Licencias_Expiradas();
        fm_licencias_expiradas.setLocationRelativeTo(null);
        fm_licencias_expiradas.setVisible(true);
    }//GEN-LAST:event_jbLicenciaExpiradaActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Fm_Emitir_Licencia fm_emitir_licencia = new Fm_Emitir_Licencia();
        fm_emitir_licencia.setLocationRelativeTo(null);
        fm_emitir_licencia.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Fm_Imprimir_Licencia fm_imprimir_licencia = new Fm_Imprimir_Licencia();
        fm_imprimir_licencia.setLocationRelativeTo(null);
        fm_imprimir_licencia.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // Cerrar sistema
        System.exit(0);        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Fm_Nuevo_Titular fm_nuevo_titular = new Fm_Nuevo_Titular();
        fm_nuevo_titular.setLocationRelativeTo(null);
        fm_nuevo_titular.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Fm_Licencias_Expiradas fm_licencias_expiradas = new Fm_Licencias_Expiradas();
        fm_licencias_expiradas.setLocationRelativeTo(null);
        fm_licencias_expiradas.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Fm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbEmitirLicencia;
    private javax.swing.JButton jbImprimirLicencia;
    private javax.swing.JButton jbLicenciaExpirada;
    private javax.swing.JButton jbNuevoTitular;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmLicencias;
    private javax.swing.JMenu jmTitulares;
    private javax.swing.JMenuItem jmiLogin;
    // End of variables declaration//GEN-END:variables
}
