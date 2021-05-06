
package examen;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class inicio extends javax.swing.JFrame {

   
    public inicio() {
        initComponents();
        cargartabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbalquilar = new javax.swing.JButton();
        jbcomprar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbagregar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jbcaja = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PELICULAS");

        jbalquilar.setText("ALQUILAR");
        jbalquilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbalquilarMouseClicked(evt);
            }
        });
        jbalquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbalquilarActionPerformed(evt);
            }
        });

        jbcomprar.setText("COMPRAR");
        jbcomprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbcomprarMouseClicked(evt);
            }
        });
        jbcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcomprarActionPerformed(evt);
            }
        });

        jbeliminar.setText("ELIMINAR");
        jbeliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbeliminarMouseClicked(evt);
            }
        });
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbagregar.setText("AGREGAR");
        jbagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbagregarMouseClicked(evt);
            }
        });

        jbsalir.setText("SALIR");
        jbsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbsalirMouseClicked(evt);
            }
        });
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbcaja.setText("CAJA");
        jbcaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbcajaMouseClicked(evt);
            }
        });
        jbcaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcajaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbalquilar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbcomprar)
                            .addComponent(jbcaja))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbeliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbagregar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jbsalir))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbalquilar)
                    .addComponent(jbcomprar)
                    .addComponent(jbeliminar)
                    .addComponent(jbagregar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsalir)
                    .addComponent(jbcaja))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbalquilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbalquilarMouseClicked
           alquilar f = new alquilar();
            f.setVisible (true);
            inicio.this.dispose();
    }//GEN-LAST:event_jbalquilarMouseClicked

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbalquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbalquilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbalquilarActionPerformed

    private void jbcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcomprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcomprarActionPerformed

    private void jbcomprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbcomprarMouseClicked
            comprar f = new comprar();
            f.setVisible (true);
            inicio.this.dispose();
    }//GEN-LAST:event_jbcomprarMouseClicked

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbeliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbeliminarMouseClicked
            eliminar f = new eliminar();
            f.setVisible (true);
            inicio.this.dispose();
    }//GEN-LAST:event_jbeliminarMouseClicked

    private void jbagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbagregarMouseClicked
            agregar f = new agregar();
            f.setVisible (true);
            inicio.this.dispose();
    }//GEN-LAST:event_jbagregarMouseClicked

    private void jbcajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcajaActionPerformed
        
    }//GEN-LAST:event_jbcajaActionPerformed

    private void jbcajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbcajaMouseClicked
        caja f = new caja();
            f.setVisible (true);
            inicio.this.dispose();
    }//GEN-LAST:event_jbcajaMouseClicked

    private void jbsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbsalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jbsalirMouseClicked

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbagregar;
    private javax.swing.JButton jbalquilar;
    private javax.swing.JButton jbcaja;
    private javax.swing.JButton jbcomprar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbsalir;
    // End of variables declaration//GEN-END:variables

    private void cargartabla() {
       String peliculas = "peliculas.txt";
        File file = new File(peliculas);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setColumnIdentifiers(columsName);
            
            
            Object[] tableLines = br.lines().toArray();
            
            for(int i = 0;i<tableLines.length;i++){
                String line =tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(alquilar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
