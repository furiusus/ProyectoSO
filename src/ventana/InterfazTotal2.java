/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventana.entidades.AlgoritmoFcfs;
import ventana.entidades.AlgoritmoRR;
import ventana.entidades.AlgoritmoSJB;
import ventana.entidades.ListaProceso;
import ventana.entidades.Proceso;

/**
 *
 * @author furiusus
 */
public class InterfazTotal2 extends javax.swing.JFrame {

    private final ListaProceso listaDeProcesosFCFS = new ListaProceso();
    private final ListaProceso listaDeProcesosRR = new ListaProceso();
    private final ListaProceso listaDeProcesosSJB = new ListaProceso();
    private final TablasEnEjecucion tablasEnEjecucion = new TablasEnEjecucion();
    private final TablaProceso tablaProceso = new TablaProceso();
    public Thread principalFCFS=new Thread(new HiloFCFS()); 
    
    
    
    /**
     * Creates new form InterfazTotal2
     */
    public InterfazTotal2() {
        initComponents();
        listaDeProcesosFCFS.setListaProceso(new ArrayList<>());
        listaDeProcesosSJB.setListaProceso(new ArrayList<>());
        listaDeProcesosRR.setListaProceso(new ArrayList<>());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputTiempoEjecucion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sistemas Operativos");

        inputTiempoEjecucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTiempoEjecucionActionPerformed(evt);
            }
        });

        jLabel2.setText("Tiempo de ejecucion");

        jButton1.setText("Tablas en ejecucionm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("AñadirProceso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Lista de procesos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(inputTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton3))
                            .addComponent(jButton1))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTiempoEjecucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTiempoEjecucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTiempoEjecucionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               tablasEnEjecucion.setVisible(true);
            }
        });
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Se esta guardando el proceso en un objeto y este es guardado a la  vez en una lista
        
        int cantidadProcesos;
        Proceso nuevoProceso = new Proceso();
        nuevoProceso.setEstado("Listo");
        nuevoProceso.setTiempoEjecucion(Double.parseDouble(inputTiempoEjecucion.getText()));
        nuevoProceso.setTamanioProceso(0d);
        nuevoProceso.setTiempoFaltane(Double.parseDouble(inputTiempoEjecucion.getText()));
        
        AlgoritmoFcfs algoritmoFcfs = new AlgoritmoFcfs();
        cantidadProcesos = algoritmoFcfs.obtenerCantidad(listaDeProcesosFCFS);
        nuevoProceso.setPid(cantidadProcesos);
        nuevoProceso.setOrdenEjecucion(cantidadProcesos);
        Proceso nuevoProceso1 =new Proceso(nuevoProceso);
        algoritmoFcfs.anadirProceso(nuevoProceso1,listaDeProcesosFCFS);
        
        AlgoritmoSJB algoritmoSJB = new AlgoritmoSJB();
        cantidadProcesos = algoritmoSJB.obtenerCantidad(listaDeProcesosSJB);
        nuevoProceso.setPid(cantidadProcesos);
        nuevoProceso.setOrdenEjecucion(cantidadProcesos);
        Proceso nuevoProceso2 =new Proceso(nuevoProceso);
        algoritmoSJB.anadirProceso(nuevoProceso2,listaDeProcesosSJB);
        
        AlgoritmoRR algoritmoRR = new AlgoritmoRR();
        cantidadProcesos = algoritmoRR.obtenerCantidad(listaDeProcesosRR);
        nuevoProceso.setPid(cantidadProcesos);
        nuevoProceso.setOrdenEjecucion(cantidadProcesos);
        Proceso nuevoProceso3 =new Proceso(nuevoProceso);
        algoritmoRR.anadirProceso(nuevoProceso3,listaDeProcesosRR);
        
        tablasEnEjecucion.actualizarFCFS(listaDeProcesosFCFS);
        tablasEnEjecucion.actualizarSJB(listaDeProcesosSJB);
        tablasEnEjecucion.actualizarRR(listaDeProcesosRR);
        
        
        inputTiempoEjecucion.setText(null);
        try {
            if(!principalFCFS.isAlive()){
               principalFCFS.start();
            }
        } catch (IllegalThreadStateException e) {
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                tablaProceso.setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed
//corrigeme :'v 
    private class HiloFCFS implements Runnable{
        public void run(){
            try{
                while(listaDeProcesosFCFS.getListaProceso().size()>=1){
                for(Proceso proc : listaDeProcesosFCFS.getListaProceso()){
                    if(proc.getEstado().equals("Listo")){
                        proc.setEstado("Ejecutando");
                        tablasEnEjecucion.actualizarFCFS(listaDeProcesosFCFS);
                        tablasEnEjecucion.actualizarSJB(listaDeProcesosSJB);
                        tablasEnEjecucion.actualizarRR(listaDeProcesosRR);
                         try {
                             for(int i = 0; i<proc.getTiempoEjecucion();i++){
                                 Thread.sleep(500);
                                 proc.setTiempoFaltane(proc.getTiempoFaltane()-1);
                                tablasEnEjecucion.actualizarFCFS(listaDeProcesosFCFS);
                                tablasEnEjecucion.actualizarSJB(listaDeProcesosSJB);
                                tablasEnEjecucion.actualizarRR(listaDeProcesosRR);
                                 
                             }
                         } catch (InterruptedException e) {
                         }finally{
                            proc.setEstado("Terminado");
                            System.out.println("Terminado");
                            tablasEnEjecucion.actualizarFCFS(listaDeProcesosFCFS);
                            tablasEnEjecucion.actualizarSJB(listaDeProcesosSJB);
                            tablasEnEjecucion.actualizarRR(listaDeProcesosRR);
                            break;
                         }
                    }
                }
                }
            }catch(NullPointerException e){}
        }
    }
 
 
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
            java.util.logging.Logger.getLogger(InterfazTotal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazTotal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazTotal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazTotal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazTotal2().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputTiempoEjecucion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

