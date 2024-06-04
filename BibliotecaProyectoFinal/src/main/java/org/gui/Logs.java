/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.gui;

import org.clases.ListaSE;
import org.clases.Operacion;

/**
 *
 * @author Keloc
 */
public class Logs extends javax.swing.JPanel {

    /**
     * Creates new form Logs
     */
    private ListaSE<Operacion> operaciones;
    public Logs(ListaSE<Operacion> operaciones) {
        initComponents();
        this.operaciones = operaciones;
        initOp();
        initStyles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logsIP = new javax.swing.JPanel();
        logsTextL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logsTP = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(611, 362));

        logsIP.setBackground(new java.awt.Color(255, 255, 255));
        logsIP.setMinimumSize(new java.awt.Dimension(611, 362));
        logsIP.setPreferredSize(new java.awt.Dimension(611, 362));

        logsTextL.setForeground(new java.awt.Color(0, 0, 0));
        logsTextL.setText("Logs de Operaciones");

        logsTP.setEditable(false);
        jScrollPane1.setViewportView(logsTP);

        javax.swing.GroupLayout logsIPLayout = new javax.swing.GroupLayout(logsIP);
        logsIP.setLayout(logsIPLayout);
        logsIPLayout.setHorizontalGroup(
            logsIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logsIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logsIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logsIPLayout.createSequentialGroup()
                        .addComponent(logsTextL, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addGap(472, 472, 472))
                    .addGroup(logsIPLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        logsIPLayout.setVerticalGroup(
            logsIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logsIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logsTextL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logsIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logsIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void initOp(){
        String res = "";
        for (int i = 0; i<operaciones.tamanio(); i++){
            res = res.concat(operaciones.Obtener(i).mostrar()+"\n");
        }
        logsTP.setText(res);
    }
    
    private void initStyles(){
        logsTextL.putClientProperty("FlatLaf.style", "font: h1 $h1.font");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logsIP;
    private javax.swing.JTextPane logsTP;
    private javax.swing.JLabel logsTextL;
    // End of variables declaration//GEN-END:variables
}
