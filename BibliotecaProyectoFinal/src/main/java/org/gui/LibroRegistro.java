/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.gui;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.clases.Libro;
import org.clases.LibroDigital;
import org.clases.LibroFisico;
import org.clases.ListaSE;

/**
 *
 * @author mocha
 */
public class LibroRegistro extends javax.swing.JPanel {

    /**
     * Creates new form LibroRegistro
     */
    private ListaSE<Libro> listaCatalogo;
    private ListaSE<JCheckBox> formatos = new ListaSE();
    public LibroRegistro(ListaSE<Libro> listaCatalogo) {
        initComponents();
        this.listaCatalogo = listaCatalogo;
        grupo.add(fisico);
        grupo.add(digital);
        formatos.Agregar(pdf);
        formatos.Agregar(epub);
        formatos.Agregar(mobi);
        formatos.Agregar(rtf);
        formatos.Agregar(swf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        formatosP = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pdf = new javax.swing.JCheckBox();
        epub = new javax.swing.JCheckBox();
        mobi = new javax.swing.JCheckBox();
        rtf = new javax.swing.JCheckBox();
        swf = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        tituloTF = new javax.swing.JTextField();
        autorTF = new javax.swing.JTextField();
        generoTF = new javax.swing.JTextField();
        idiomaTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fisico = new javax.swing.JRadioButton();
        digital = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        descTA = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel8.setText("Selecciona los formatos disponibles:");

        pdf.setText("PDF");

        epub.setText("EPUB");
        epub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epubActionPerformed(evt);
            }
        });

        mobi.setText("MOBI");

        rtf.setText("RTF");

        swf.setText("SWF");
        swf.setActionCommand("SWF");

        javax.swing.GroupLayout formatosPLayout = new javax.swing.GroupLayout(formatosP);
        formatosP.setLayout(formatosPLayout);
        formatosPLayout.setHorizontalGroup(
            formatosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formatosPLayout.createSequentialGroup()
                .addGroup(formatosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formatosPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(formatosPLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(formatosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(epub)
                            .addComponent(pdf)
                            .addComponent(mobi)
                            .addComponent(rtf)
                            .addComponent(swf))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        formatosPLayout.setVerticalGroup(
            formatosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formatosPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pdf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(epub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(swf)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Titulo");

        jLabel2.setText("Autor");

        jLabel3.setText("Genero");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Idioma");

        fisico.setSelected(true);
        fisico.setText("Libro Físico");
        fisico.setActionCommand("fisico");

        digital.setText("Libro Digital");
        digital.setActionCommand("digital");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        descTA.setColumns(20);
        descTA.setRows(5);
        jScrollPane1.setViewportView(descTA);

        jLabel7.setText("Tipo de Libro:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Registrando Libro Nuevo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(tituloTF)
                        .addComponent(autorTF)
                        .addComponent(generoTF)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(idiomaTF)
                        .addComponent(digital)
                        .addComponent(fisico)
                        .addComponent(jLabel7)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idiomaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fisico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(digital)
                                .addGap(60, 60, 60)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(generoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tituloTF.getText().isBlank() || autorTF.getText().isBlank() || generoTF.getText().isBlank() || descTA.getText().isBlank() || idiomaTF.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Por Favor llena todos los campos");
        } else {
            File cat = new File("src/main/java/org/persistencia/catalogo.ser");
            String titulo = tituloTF.getText();
            String autor = autorTF.getText();
            String genero = generoTF.getText();
            String desc = descTA.getText();
            String idioma = idiomaTF.getText();
            String tipo = grupo.getSelection().getActionCommand();
            int n = (int) Math.floor(Math.random()*10000);
            String ISBN = "L".concat(String.valueOf(n));
            if (tipo.equals("fisico")){
                try {
                    FileOutputStream cOut= new FileOutputStream(cat);
                    ObjectOutputStream catOut = new ObjectOutputStream(cOut);
                    int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de libros"));
                    LibroFisico libro = new LibroFisico(titulo, autor, genero, idioma, desc, ISBN, cant);
                    listaCatalogo.Agregar(libro);
                    catOut.writeObject(listaCatalogo);
                    JOptionPane.showMessageDialog(null, "¡Catalogo Actualizado!");
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                try {
                    FileOutputStream cOut= new FileOutputStream(cat);
                    ObjectOutputStream catOut = new ObjectOutputStream(cOut);
                    int res = JOptionPane.showConfirmDialog(null, formatosP, "Selección de Formatos", JOptionPane.OK_CANCEL_OPTION);
                    if (res == JOptionPane.OK_OPTION){
                        String formats = "";
                        for (int i = 0; i<formatos.tamanio(); i++){
                            if (formatos.Obtener(i).isSelected()){
                                formats += " - "+formatos.Obtener(i).getText();
                            }
                        }
                        LibroDigital libro = new LibroDigital(titulo, autor, genero, idioma, desc, ISBN, formats);
                        listaCatalogo.Agregar(libro);
                        catOut.writeObject(listaCatalogo);
                        JOptionPane.showMessageDialog(null, "¡Catalogo Actualizado!");
                    } 
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void epubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epubActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorTF;
    private javax.swing.JTextArea descTA;
    private javax.swing.JRadioButton digital;
    private javax.swing.JCheckBox epub;
    private javax.swing.JRadioButton fisico;
    private javax.swing.JPanel formatosP;
    private javax.swing.JTextField generoTF;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JTextField idiomaTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox mobi;
    private javax.swing.JCheckBox pdf;
    private javax.swing.JCheckBox rtf;
    private javax.swing.JCheckBox swf;
    private javax.swing.JTextField tituloTF;
    // End of variables declaration//GEN-END:variables
}
