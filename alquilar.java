/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class alquilar extends javax.swing.JFrame {
     int totalalquiler=0;
   
    public alquilar() {
        
        initComponents();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        int row = jTable1.rowAtPoint(evt.getPoint());
        int col = jTable1.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
          int precio = Integer.parseInt((String) jTable1.getModel().getValueAt(row, 3));
          totalalquiler=precio+totalalquiler;
        }
        System.out.println(totalalquiler);
        datos.setTotalalquiler(totalalquiler);
        }
        });
        
        cargartabla();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbcancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbcancelar.setText("INICIO");
        jbcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbcancelarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jbcancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jbcancelar)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbcancelarMouseClicked
             inicio f = new inicio();
            f.setVisible (true);
             alquilar.this.dispose();
    }//GEN-LAST:event_jbcancelarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbcancelar;
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


