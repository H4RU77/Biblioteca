/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.gui;

/**
 *
 * @author Keloc
 */
public class Miembros extends javax.swing.JPanel {

    /**
     * Creates new form Miembros
     */
    public Miembros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miembrosIP = new javax.swing.JPanel();
        miembrosTextL = new javax.swing.JLabel();

        miembrosTextL.setText("Panel de los miembros");

        javax.swing.GroupLayout miembrosIPLayout = new javax.swing.GroupLayout(miembrosIP);
        miembrosIP.setLayout(miembrosIPLayout);
        miembrosIPLayout.setHorizontalGroup(
            miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miembrosIPLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(miembrosTextL, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        miembrosIPLayout.setVerticalGroup(
            miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miembrosIPLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(miembrosTextL)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miembrosIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miembrosIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel miembrosIP;
    private javax.swing.JLabel miembrosTextL;
    // End of variables declaration//GEN-END:variables
}
