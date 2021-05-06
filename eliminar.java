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

public class eliminar extends javax.swing.JFrame {

    int row, col;
  
            File f1 = new File("D:\\examen\\peliculas.txt");
            String SnombFichNuev="D:\\examen\\1.txt";
            File f2=new File(SnombFichNuev);
            File ftemp=new File("peliculas.txt");
    private Object Flee;
            

    public eliminar() {
        initComponents();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                row = jTable1.rowAtPoint(evt.getPoint());
                col = jTable1.columnAtPoint(evt.getPoint());
            }
        });
              
        cargartabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbeliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbeliminar.setText("ELIMINAR");
        jbeliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbeliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbeliminar)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jbeliminar)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbeliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbeliminarMouseClicked
        inicio f = new inicio();
        f.setVisible(true);
        eliminar.this.dispose();
        
        modificarArchivo();
        
        eliminar1();
        cambiarnombre();
    }//GEN-LAST:event_jbeliminarMouseClicked



    private void cargartabla() {

        try {
            
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String firstLine = br.readLine().trim();
            String[] columsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setColumnIdentifiers(columsName);

            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
                br.close();
            }

        } catch (Exception ex) {
            Logger.getLogger(alquilar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbeliminar;
    // End of variables declaration//GEN-END:variables

    public void modificarArchivo() {
        String Antigualinea =  jTable1.getModel().getValueAt(row, 0) +"/"+ jTable1.getModel().getValueAt(row, 1)+"/"+ jTable1.getModel().getValueAt(row, 2)+"/"+ jTable1.getModel().getValueAt(row, 3)+"/"+ jTable1.getModel().getValueAt(row, 4);

        try {
            if(f1.exists()){
                BufferedReader Flee= new BufferedReader(new FileReader(f1));
                String Slinea;
                while((Slinea=Flee.readLine())!=null) { 
                    if (!Slinea.toUpperCase().trim().equals(Antigualinea.toUpperCase().trim())) {
                       EcribirFichero(f2,Slinea);
                    }else{
                    }             
                }

                //f1.delete();
                //f2.renameTo(ftemp);
                
                Flee.close();
            }else{
                System.out.println("Fichero No Existe");
            }
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
    }
        
        public static void EcribirFichero(File Ffichero,String SCadena){
  try {
           if(!Ffichero.exists()){
               Ffichero.createNewFile();
           }
      try (BufferedWriter lee = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero,true), "utf-8"))) {
          lee.write(SCadena + "\r\n");
          lee.close();
      }
       } catch (IOException ex) {
          System.out.println(ex.getMessage());
       } 

}

    private void cambiarnombre() {
        if(f2.renameTo(ftemp)){
         System.out.println("si");   
        }
    }

    private void eliminar1() {
        if(f1.delete()){
        System.out.println("si");
    }
    }
        
    
}