/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.clases.Biblioteca;
import org.clases.Devolucion;
import org.clases.EstadoCuenta;
import org.clases.ListaSE;
import org.clases.Miembro;
import org.clases.Operacion;
import org.clases.Prestamo;

/**
 *
 * @author Keloc
 */

public class Miembros extends javax.swing.JPanel {

    /**
     * Creates new form Miembros
     */
    private ListaSE<Miembro> listaMiembros;
    private ListaSE<Miembro> filtered = new ListaSE();

    public ListaSE<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(ListaSE<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }
    
    public Miembros(Biblioteca biblio) {
        listaMiembros = biblio.getMiembroLista();
        initComponents();
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

        editP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        editNombre = new javax.swing.JTextField();
        editApeP = new javax.swing.JTextField();
        editApeM = new javax.swing.JTextField();
        editEmail = new javax.swing.JTextField();
        editEstado = new javax.swing.JComboBox<>();
        inspectP = new javax.swing.JPanel();
        miembroL = new javax.swing.JLabel();
        historialL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historialPrestamos = new javax.swing.JTable();
        miembrosIP = new javax.swing.JPanel();
        miembrosTextL = new javax.swing.JLabel();
        buscadorTF = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JPanel();
        buscarL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMiembros = new javax.swing.JTable();
        nuevoBtn = new javax.swing.JPanel();
        nuevoL = new javax.swing.JLabel();
        editarBtn = new javax.swing.JPanel();
        editL = new javax.swing.JLabel();
        borrarBtn = new javax.swing.JPanel();
        borrarL = new javax.swing.JLabel();
        inspectBtn = new javax.swing.JPanel();
        inspectL = new javax.swing.JLabel();

        editP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno:");

        jLabel4.setText("Correo Electrónico:");

        jLabel5.setText("Estado de Membresia:");

        editApeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editApePActionPerformed(evt);
            }
        });

        editEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVA", "CONGELADA", "CERRADA" }));

        javax.swing.GroupLayout editPLayout = new javax.swing.GroupLayout(editP);
        editP.setLayout(editPLayout);
        editPLayout.setHorizontalGroup(
            editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(editPLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editEmail))
                    .addGroup(editPLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editEstado, 0, 185, Short.MAX_VALUE))
                    .addGroup(editPLayout.createSequentialGroup()
                        .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editApeM, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(editNombre)
                            .addComponent(editApeP))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        editPLayout.setVerticalGroup(
            editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(editNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(editApeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(editApeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(editEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(editPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(editEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        inspectP.setBackground(new java.awt.Color(255, 255, 255));

        miembroL.setText("Miembro");

        historialL.setText("Historial:");

        historialPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titulo", "ISBN", "Tiempo", "Sanción", "Operación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(historialPrestamos);

        javax.swing.GroupLayout inspectPLayout = new javax.swing.GroupLayout(inspectP);
        inspectP.setLayout(inspectPLayout);
        inspectPLayout.setHorizontalGroup(
            inspectPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inspectPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(miembroL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(407, 407, 407))
            .addGroup(inspectPLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(inspectPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(historialL)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        inspectPLayout.setVerticalGroup(
            inspectPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inspectPLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(miembroL)
                .addGap(18, 18, 18)
                .addComponent(historialL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(611, 362));

        miembrosIP.setBackground(new java.awt.Color(255, 255, 255));
        miembrosIP.setMinimumSize(new java.awt.Dimension(620, 360));
        miembrosIP.setPreferredSize(new java.awt.Dimension(620, 360));

        miembrosTextL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miembrosTextL.setText("Miembros");

        buscadorTF.setBackground(new java.awt.Color(255, 255, 255));
        buscadorTF.setForeground(new java.awt.Color(153, 153, 153));
        buscadorTF.setText("Ingrese un dato de búsqueda...");
        buscadorTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscadorTFFocusLost(evt);
            }
        });
        buscadorTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscadorTFMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscadorTFMouseExited(evt);
            }
        });
        buscadorTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorTFActionPerformed(evt);
            }
        });

        buscarBtn.setBackground(new java.awt.Color(51, 153, 255));
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtn.setMaximumSize(new java.awt.Dimension(100, 27));
        buscarBtn.setMinimumSize(new java.awt.Dimension(100, 27));
        buscarBtn.setPreferredSize(new java.awt.Dimension(100, 27));
        buscarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarBtnMouseExited(evt);
            }
        });

        buscarL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscarL.setForeground(new java.awt.Color(255, 255, 255));
        buscarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarL.setText("Buscar");
        buscarL.setMaximumSize(new java.awt.Dimension(100, 27));
        buscarL.setMinimumSize(new java.awt.Dimension(100, 27));

        javax.swing.GroupLayout buscarBtnLayout = new javax.swing.GroupLayout(buscarBtn);
        buscarBtn.setLayout(buscarBtnLayout);
        buscarBtnLayout.setHorizontalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarL, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        buscarBtnLayout.setVerticalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarL, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        tablaMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Email", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMiembros);

        nuevoBtn.setBackground(new java.awt.Color(51, 153, 255));
        nuevoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoBtnMouseExited(evt);
            }
        });

        nuevoL.setBackground(new java.awt.Color(51, 153, 255));
        nuevoL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nuevoL.setForeground(new java.awt.Color(255, 255, 255));
        nuevoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoL.setText("Añadir");

        javax.swing.GroupLayout nuevoBtnLayout = new javax.swing.GroupLayout(nuevoBtn);
        nuevoBtn.setLayout(nuevoBtnLayout);
        nuevoBtnLayout.setHorizontalGroup(
            nuevoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        nuevoBtnLayout.setVerticalGroup(
            nuevoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        editarBtn.setBackground(new java.awt.Color(0, 153, 255));
        editarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarBtnMouseExited(evt);
            }
        });

        editL.setBackground(new java.awt.Color(51, 153, 255));
        editL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editL.setForeground(new java.awt.Color(255, 255, 255));
        editL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editL.setText("Editar");

        javax.swing.GroupLayout editarBtnLayout = new javax.swing.GroupLayout(editarBtn);
        editarBtn.setLayout(editarBtnLayout);
        editarBtnLayout.setHorizontalGroup(
            editarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editarBtnLayout.setVerticalGroup(
            editarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        borrarBtn.setBackground(new java.awt.Color(51, 153, 255));
        borrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrarBtnMouseExited(evt);
            }
        });

        borrarL.setBackground(new java.awt.Color(51, 153, 255));
        borrarL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        borrarL.setForeground(new java.awt.Color(255, 255, 255));
        borrarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrarL.setText("Borrar");

        javax.swing.GroupLayout borrarBtnLayout = new javax.swing.GroupLayout(borrarBtn);
        borrarBtn.setLayout(borrarBtnLayout);
        borrarBtnLayout.setHorizontalGroup(
            borrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        borrarBtnLayout.setVerticalGroup(
            borrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrarL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        inspectBtn.setBackground(new java.awt.Color(51, 153, 255));
        inspectBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inspectBtn.setMinimumSize(new java.awt.Dimension(50, 31));
        inspectBtn.setPreferredSize(new java.awt.Dimension(50, 31));
        inspectBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inspectBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inspectBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inspectBtnMouseExited(evt);
            }
        });

        inspectL.setBackground(new java.awt.Color(51, 153, 255));
        inspectL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inspectL.setForeground(new java.awt.Color(255, 255, 255));
        inspectL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inspectL.setText("Inspeccionar");
        inspectL.setMinimumSize(new java.awt.Dimension(50, 31));
        inspectL.setPreferredSize(new java.awt.Dimension(50, 31));

        javax.swing.GroupLayout inspectBtnLayout = new javax.swing.GroupLayout(inspectBtn);
        inspectBtn.setLayout(inspectBtnLayout);
        inspectBtnLayout.setHorizontalGroup(
            inspectBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inspectL, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        inspectBtnLayout.setVerticalGroup(
            inspectBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inspectBtnLayout.createSequentialGroup()
                .addComponent(inspectL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout miembrosIPLayout = new javax.swing.GroupLayout(miembrosIP);
        miembrosIP.setLayout(miembrosIPLayout);
        miembrosIPLayout.setHorizontalGroup(
            miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miembrosIPLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(miembrosIPLayout.createSequentialGroup()
                        .addComponent(inspectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(nuevoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(miembrosIPLayout.createSequentialGroup()
                        .addComponent(buscadorTF)
                        .addGap(18, 18, 18)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, miembrosIPLayout.createSequentialGroup()
                        .addComponent(miembrosTextL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(392, 392, 392)))
                .addGap(21, 21, 21))
        );
        miembrosIPLayout.setVerticalGroup(
            miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miembrosIPLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(miembrosTextL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscadorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nuevoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(borrarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inspectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miembrosIP, javax.swing.GroupLayout.PREFERRED_SIZE, 611, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miembrosIP, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoBtnMouseEntered
        nuevoBtn.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_nuevoBtnMouseEntered

    private void editarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBtnMouseEntered
        editarBtn.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_editarBtnMouseEntered

    private void borrarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarBtnMouseEntered
        borrarBtn.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_borrarBtnMouseEntered

    private void buscadorTFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscadorTFMouseExited
        
    }//GEN-LAST:event_buscadorTFMouseExited

    private void buscarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseExited
        buscarBtn.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_buscarBtnMouseExited

    private void nuevoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoBtnMouseExited
       nuevoBtn.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_nuevoBtnMouseExited

    private void editarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBtnMouseExited
        editarBtn.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_editarBtnMouseExited

    private void borrarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarBtnMouseExited
        borrarBtn.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_borrarBtnMouseExited

    private void buscarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseEntered
        buscarBtn.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_buscarBtnMouseEntered

    private void buscadorTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscadorTFMouseClicked
        if (buscadorTF.getText().equals("Ingrese un dato de búsqueda...")){
            buscadorTF.setText("");
            buscadorTF.setForeground(Color.black);
        }
    }//GEN-LAST:event_buscadorTFMouseClicked

    private void buscadorTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorTFActionPerformed

    private void nuevoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoBtnMouseClicked
        changePanel(new Registro(listaMiembros));
    }//GEN-LAST:event_nuevoBtnMouseClicked

    private void editarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBtnMouseClicked
        try {
            File miembros = new File("src/main/java/org/persistencia/miembros");
            FileOutputStream mOut = new FileOutputStream(miembros);
            ObjectOutputStream miemOut = new ObjectOutputStream(mOut);
            int row = tablaMiembros.getSelectedRow();
            if (row == -1){
                JOptionPane.showMessageDialog(null, "Selecciona una fila para editar");
            } else {
                String id = (String) tablaMiembros.getValueAt(row, 0);
                String nom = (String) tablaMiembros.getValueAt(row, 1);
                String ape = (String) tablaMiembros.getValueAt(row, 2);
                String email = (String) tablaMiembros.getValueAt(row, 3);
                editNombre.setText(nom);
                editApeP.setText(ape.substring(0, ape.indexOf(" ")));
                editApeM.setText(ape.substring(ape.indexOf(" ")));
                editEmail.setText(email);
                int res = JOptionPane.showConfirmDialog(null, editP, "Edición de datos de un Miembro", JOptionPane.OK_CANCEL_OPTION);
                if (res == JOptionPane.OK_OPTION){
                    nom = editNombre.getText();
                    ape = editApeP.getText().concat(" "+editApeM.getText());
                    email = editEmail.getText();
                    EstadoCuenta estado = EstadoCuenta.valueOf(editEstado.getSelectedItem().toString());
                    int pos = buscarPorId(id);
                    Miembro anterior = listaMiembros.Obtener(pos);
                    Miembro editado = new Miembro(id, nom, ape, email, anterior.getPrestamosActivos(), anterior.getHistorialPrestamos(), estado);
                    listaMiembros.editar(editado, pos);
                    miemOut.writeObject(listaMiembros);
                    setTable(listaMiembros);
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_editarBtnMouseClicked

    private void editApePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editApePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editApePActionPerformed

    private void borrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarBtnMouseClicked
        try {
            File miembros = new File("src/main/java/org/persistencia/miembros");
            FileOutputStream mOut = new FileOutputStream(miembros);
            ObjectOutputStream miemOut = new ObjectOutputStream(mOut);
            int row = tablaMiembros.getSelectedRow();
            if (row == -1){
                JOptionPane.showMessageDialog(null, "Selecciona una fila para borrar");
            } else {
                String id = (String) tablaMiembros.getValueAt(row, 0);
                int pos = buscarPorId(id);
                int res = JOptionPane.showConfirmDialog(null, "Esta acción eliminará al miembro seleccionado, ¿Desea continuar?", "Advertencia", JOptionPane.OK_CANCEL_OPTION);
                if (res == JOptionPane.OK_OPTION){
                    listaMiembros.Eliminar(pos);
                    miemOut.writeObject(listaMiembros);
                    JOptionPane.showMessageDialog(null, "Miembro eliminado satisfactoriamente");
                    setTable(listaMiembros);
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_borrarBtnMouseClicked

    private void inspectBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inspectBtnMouseClicked
        try {
            int row = tablaMiembros.getSelectedRow();
            if (row == -1){
                JOptionPane.showMessageDialog(null, "Selecciona una fila para insepccionar");
            } else {
                String id = (String) tablaMiembros.getValueAt(row, 0);
                int pos = buscarPorId(id);
                String nom = listaMiembros.Obtener(pos).getNombre();
                String ape = listaMiembros.Obtener(pos).getApellidos();
                String fullNom = nom.concat(" "+ape);
                ListaSE prestamos = listaMiembros.Obtener(pos).getPrestamosActivos();
                ListaSE historial = listaMiembros.Obtener(pos).getHistorialPrestamos();
                miembroL.setText(fullNom);
                setHistorial(historial);
                JOptionPane.showMessageDialog(null, inspectP);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getCause());
        }
    }//GEN-LAST:event_inspectBtnMouseClicked

    private void inspectBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inspectBtnMouseEntered
        inspectBtn.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_inspectBtnMouseEntered

    private void inspectBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inspectBtnMouseExited
        inspectBtn.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_inspectBtnMouseExited

    private void buscarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseClicked
        try {
            if (buscadorTF.getText().isEmpty() || buscadorTF.getText().equals("Ingrese un dato de búsqueda...")){
                
            } else {
                String filter = buscadorTF.getText().toUpperCase();
                for(int i = 0; i < listaMiembros.tamanio(); i++){
                    Miembro m = listaMiembros.Obtener(i);
                    if (m.getNombre().toUpperCase().contains(filter) || m.getApellidos().toUpperCase().contains(filter) || m.getID().toUpperCase().contains(filter) || m.getEmail().toUpperCase().contains(filter)){
                        filtered.Agregar(m);
                    }
                }
                setTable(filtered);
                filtered.borrarTodo();
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_buscarBtnMouseClicked

    private void buscadorTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscadorTFFocusLost
        try {
            if (buscadorTF.getText().isEmpty()){
                buscadorTF.setText("Ingrese un dato de búsqueda...");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_buscadorTFFocusLost
    
    private void changePanel(JPanel p){
        p.setSize(this.getWidth(), this.getHeight());
        p.setLocation(0,0);
        
        this.removeAll();
        this.add(p, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
    private void initStyles(){
        miembrosTextL.putClientProperty( "FlatLaf.style", "font: h1 $h1.font" );
        miembroL.putClientProperty( "FlatLaf.style", "font: h2 $h2.font" );
        historialL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        buscarL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        nuevoL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        editL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        borrarL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        buscadorTF.putClientProperty( "FlatLaf.style", "font: medium $medium.font" );
    }
    
    public void setTable(ListaSE<Miembro> list){
        String[] tblH = {"ID", "Nombre", "Apellidos", "Email", "Estado Cuenta"};
        DefaultTableModel model = new DefaultTableModel(tblH, 0);
        for (int i = 0; i < list.tamanio(); i++){
            Miembro miembro = list.Obtener(i);
            Object[] row = {miembro.getID(), miembro.getNombre(), miembro.getApellidos(), miembro.getEmail(), miembro.getEstado()};
            model.addRow(row);
        }
        tablaMiembros.setModel(model);
    }
    
    private void setHistorial(ListaSE<Prestamo> h){
        String op = "";
        String[] tblH = {"Titulo", "ISBN", "Fecha Límite/Entrega", "Sanción", "Operación"};
        DefaultTableModel model = new DefaultTableModel(tblH, 0);
        for (int i = 0; i < h.tamanio(); i++){
            Operacion o = h.Obtener(i);
            if (o instanceof Devolucion){
                op = "DEVOLUCIÓN";
                Object[] row = {o.getLibro().getTitulo(), o.getLibro().getISBN(), o.getTiempo(),((Devolucion) o).getMonto(), op};
                model.addRow(row);
            } else {
                op = "PRESTAMO";
                Object[] row = {o.getLibro().getTitulo(), o.getLibro().getISBN(), o.getTiempo(), "-", op};
                model.addRow(row);
            }
        }
        historialPrestamos.setModel(model);
    }
    
    public int buscarPorId(String id){
        for (int i = 0; i < listaMiembros.tamanio(); i++){
            if (listaMiembros.Obtener(i).getID() == id){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borrarBtn;
    private javax.swing.JLabel borrarL;
    private javax.swing.JTextField buscadorTF;
    private javax.swing.JPanel buscarBtn;
    private javax.swing.JLabel buscarL;
    private javax.swing.JTextField editApeM;
    private javax.swing.JTextField editApeP;
    private javax.swing.JTextField editEmail;
    private javax.swing.JComboBox<String> editEstado;
    private javax.swing.JLabel editL;
    private javax.swing.JTextField editNombre;
    private javax.swing.JPanel editP;
    private javax.swing.JPanel editarBtn;
    private javax.swing.JLabel historialL;
    private javax.swing.JTable historialPrestamos;
    private javax.swing.JPanel inspectBtn;
    private javax.swing.JLabel inspectL;
    private javax.swing.JPanel inspectP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel miembroL;
    private javax.swing.JPanel miembrosIP;
    private javax.swing.JLabel miembrosTextL;
    private javax.swing.JPanel nuevoBtn;
    private javax.swing.JLabel nuevoL;
    private javax.swing.JTable tablaMiembros;
    // End of variables declaration//GEN-END:variables
}
