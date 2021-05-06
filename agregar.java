
package examen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class agregar extends javax.swing.JFrame {
    String a;
    String t1 = null;
    String t2 = null;
    String t3 = null;
    String t4 = null;
    String t5 = null;
    String peliculas = "peliculas.txt";
        File file = new File(peliculas);
    public agregar() {
        initComponents();
         jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        int row = jTable1.rowAtPoint(evt.getPoint());
        int col = jTable1.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
          
        }
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ta = new javax.swing.JTextField();
        tb = new javax.swing.JTextField();
        tc = new javax.swing.JTextField();
        td = new javax.swing.JTextField();
        te = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbcancelar.setText("AÑADIR");
        jbcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbcancelarMouseClicked(evt);
            }
        });
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("GENERO");

        jLabel3.setText("PELICULA");

        jLabel4.setText("ALQUILER");

        jLabel5.setText("COMPRAR");

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
                        .addGap(174, 174, 174)
                        .addComponent(jbcancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(td))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(te))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(td, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(te, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jbcancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbcancelarMouseClicked
        inicio f = new inicio();
        f.setVisible (true);
        agregar.this.dispose();
        
        texto1();
        texto2();
        texto3();
        texto4();
        texto5();
        escribir(file, a);
    }//GEN-LAST:event_jbcancelarMouseClicked

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JTextField ta;
    private javax.swing.JTextField tb;
    private javax.swing.JTextField tc;
    private javax.swing.JTextField td;
    private javax.swing.JTextField te;
    // End of variables declaration//GEN-END:variables

     private void cargartabla() {
       
        
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

    private void escribir(File Ffichero,String a) {
    
  try {
   if(!Ffichero.exists()){
               Ffichero.createNewFile();
           }
      try (BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero,true), "utf-8"))) {
          
          a=  t1+"/"+t2+"/"+t3+"/"+t4+"/"+t5;
          Fescribe.write(a +"\r\n");
        }
       } catch (IOException ex) {
          System.out.println(ex.getMessage());
       
}
        
    }

    private void texto1() {
    t1=(ta.getText());        
  }

    private void texto2() {
    t2=(tb.getText());  
    }

    private void texto3() {
    t3=(tc.getText());
    }

    private void texto4() {
    t4=(td.getText());
    }

    private void texto5() {
    t5=(te.getText());
    }
    }
