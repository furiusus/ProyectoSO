/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ventana.entidades.ListaProceso;
import ventana.entidades.Proceso;

/**
 *
 * @author furiusus
 */
public class TablasEnEjecucion extends javax.swing.JFrame {
    /**
     * Creates new form TablasEnEjecucion
     */
    public TablasEnEjecucion() {
        initComponents();
        
    }
    
    public void cargarListas(ListaProceso l1,ListaProceso l2){
        try {
            l2.setListaProceso(new ArrayList<>());
            for(Proceso p:l1.getListaProceso()){
                l2.getListaProceso().add(p);
            }
        } catch (Exception e) {
        }
        
    }
    
    public void cargarListaEnTabla(ListaProceso l,JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        Object[] dato = new Object[4];
        for(Proceso p : l.getListaProceso()){
            if(true){
                dato[0]=String.valueOf(p.getOrdenEjecucion());
                dato[1]=String.valueOf(p.getPid());
                dato[2]=String.valueOf(p.getTiempoFaltane());
                dato[3]=String.valueOf(p.getEstado());
                modelo.addRow(dato);
            }
        }
        tabla.setModel(modelo);
    }
    public void actualizarSJB(ListaProceso list1){
        borrarTablas(outputTablaEjecucionSJB);
        cargarListaEnTabla(list1, outputTablaEjecucionSJB);   
    }
    public void actualizarRR(ListaProceso list2){
        borrarTablas(outputTablaEjecucionRR);
        cargarListaEnTabla(list2, outputTablaEjecucionRR);
    }
    public void actualizarFCFS(ListaProceso list3){
        borrarTablas(outputTablaEjecucionFCFS);
        cargarListaEnTabla(list3, outputTablaEjecucionFCFS);
    }
    public void borrarTablas(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTablaEjecucionFCFS = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTablaEjecucionSJB = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputTablaEjecucionRR = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLocation(new java.awt.Point(1200, 250));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        outputTablaEjecucionFCFS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "orden Ejecucion", "Tiempo Ejecucion", "Estado"
            }
        ));
        jScrollPane1.setViewportView(outputTablaEjecucionFCFS);

        outputTablaEjecucionSJB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(outputTablaEjecucionSJB);

        outputTablaEjecucionRR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(outputTablaEjecucionRR);

        jLabel1.setText("FCFS");

        jLabel2.setText("SJB");

        jLabel3.setText("RR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable outputTablaEjecucionFCFS;
    private javax.swing.JTable outputTablaEjecucionRR;
    private javax.swing.JTable outputTablaEjecucionSJB;
    // End of variables declaration//GEN-END:variables
}
