/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.gui;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import org.clases.EstadoCuenta;
import org.clases.ListaSE;
import org.clases.Miembro;
import org.clases.Operacion;
import org.clases.Prestamo;

/**
 *
 * @author Keloc
 */
public class Registro extends javax.swing.JPanel {

    /**
     * Creates new form Registro
     */
    private ListaSE<Miembro> listaM;
    public Registro(ListaSE<Miembro> listaM) {
        initComponents();
        initStyles();
        this.listaM = listaM;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titleL = new javax.swing.JLabel();
        nombreL = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        apePL = new javax.swing.JLabel();
        apeP = new javax.swing.JTextField();
        apeML = new javax.swing.JLabel();
        apeM = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        emailL = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        registroBtn = new javax.swing.JPanel();
        btnName = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(611, 362));
        setPreferredSize(new java.awt.Dimension(611, 362));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        titleL.setForeground(new java.awt.Color(0, 0, 0));
        titleL.setText("Registro de un Nuevo Miembro");

        nombreL.setText("Nombre:");

        apePL.setText("Apellido Paterno");

        apeML.setText("Apellido Materno:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        emailL.setText("Correo Electrónico:");

        registroBtn.setBackground(new java.awt.Color(51, 153, 255));
        registroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registroBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registroBtnMouseExited(evt);
            }
        });

        btnName.setForeground(new java.awt.Color(255, 255, 255));
        btnName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnName.setText("Registrar");

        javax.swing.GroupLayout registroBtnLayout = new javax.swing.GroupLayout(registroBtn);
        registroBtn.setLayout(registroBtnLayout);
        registroBtnLayout.setHorizontalGroup(
            registroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registroBtnLayout.setVerticalGroup(
            registroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(nombreL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(179, 179, 179))
                            .addComponent(nombreTF)
                            .addComponent(apeP)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(apeML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(129, 129, 129))
                            .addComponent(apeM)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(apePL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(135, 135, 135)))
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(emailL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(124, 124, 124))
                            .addComponent(emailTF)
                            .addComponent(registroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(97, 97, 97)))
                .addGap(38, 38, 38))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(titleL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(nombreL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apePL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apeP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apeML)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apeM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(emailL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(registroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroBtnMouseClicked
        try {
            File miembros = new File("src/main/java/org/persistencia/miembros");
            FileOutputStream mOut = new FileOutputStream(miembros);
            ObjectOutputStream miemOut = new ObjectOutputStream(mOut);
            int n = (int) Math.floor(Math.random()*10000);
            String id = "M".concat(String.valueOf(n));
            String nombre = nombreTF.getText();
            String apellidos = apeP.getText().concat(" "+apeM.getText());
            String email = emailTF.getText();
            ListaSE<Operacion> historial = new ListaSE();
            ListaSE<Prestamo> prestamosA = new ListaSE();
            Miembro m = new Miembro(id, nombre, apellidos, email, prestamosA, historial, EstadoCuenta.ACTIVA);
            listaM.Agregar(m);
            miemOut.writeObject(listaM);
            JOptionPane.showMessageDialog(null, "¡Miembro agregado satisfactoriamente!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_registroBtnMouseClicked

    private void registroBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroBtnMouseEntered
        registroBtn.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_registroBtnMouseEntered

    private void registroBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroBtnMouseExited
        registroBtn.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_registroBtnMouseExited
    
    private void initStyles(){
        titleL.putClientProperty( "FlatLaf.style", "font: h1 $h1.font" );
        btnName.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        nombreL.putClientProperty( "FlatLaf.style", "font: medium $medium.font" );
        apePL.putClientProperty( "FlatLaf.style", "font: medium $medium.font" );
        apeML.putClientProperty( "FlatLaf.style", "font: medium $medium.font" );
        emailL.putClientProperty( "FlatLaf.style", "font: medium $medium.font" );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apeM;
    private javax.swing.JLabel apeML;
    private javax.swing.JTextField apeP;
    private javax.swing.JLabel apePL;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnName;
    private javax.swing.JLabel emailL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreL;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JPanel registroBtn;
    private javax.swing.JLabel titleL;
    // End of variables declaration//GEN-END:variables
}
