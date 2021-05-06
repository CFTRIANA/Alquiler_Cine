/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bojac
 */
public class comprar extends javax.swing.JFrame {

    int totalcompras=0;
    public comprar() {
        initComponents();
         jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        int row = jTable1.rowAtPoint(evt.getPoint());
        int col = jTable1.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
          int precio = Integer.parseInt((String) jTable1.getModel().getValueAt(row, 4));
          totalcompras=precio+totalcompras;
        }
        System.out.println(totalcompras);
        datos.setTotalcompras(totalcompras);
        }
        });
         cargartabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbcancelar.setText("INICIO");
        jbcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbcancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jbcancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jbcancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbcancelarMouseClicked
        inicio f = new inicio();
        f.setVisible (true);
        comprar.this.dispose();
    }//GEN-LAST:event_jbcancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
