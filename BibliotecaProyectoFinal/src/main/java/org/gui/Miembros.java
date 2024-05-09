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
        buscadorTF = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JPanel();
        buscarL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nuevoBtn = new javax.swing.JPanel();
        nuevoL = new javax.swing.JLabel();
        ediatBtn = new javax.swing.JPanel();
        editL = new javax.swing.JLabel();
        borrarBtn = new javax.swing.JPanel();
        borrarL = new javax.swing.JLabel();

        miembrosTextL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miembrosTextL.setText("Miembros");

        buscadorTF.setBackground(new java.awt.Color(255, 255, 255));
        buscadorTF.setForeground(new java.awt.Color(153, 153, 153));
        buscadorTF.setText("Ingrese un dato de búsqueda...");

        buscarBtn.setBackground(new java.awt.Color(51, 153, 255));

        buscarL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscarL.setForeground(new java.awt.Color(255, 255, 255));
        buscarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarL.setText("Buscar");
        buscarL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout buscarBtnLayout = new javax.swing.GroupLayout(buscarBtn);
        buscarBtn.setLayout(buscarBtnLayout);
        buscarBtnLayout.setHorizontalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarL, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        buscarBtnLayout.setVerticalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Email", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        nuevoBtn.setBackground(new java.awt.Color(51, 153, 255));

        nuevoL.setBackground(new java.awt.Color(51, 153, 255));
        nuevoL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nuevoL.setForeground(new java.awt.Color(255, 255, 255));
        nuevoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoL.setText("Añadir");
        nuevoL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout nuevoBtnLayout = new javax.swing.GroupLayout(nuevoBtn);
        nuevoBtn.setLayout(nuevoBtnLayout);
        nuevoBtnLayout.setHorizontalGroup(
            nuevoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        nuevoBtnLayout.setVerticalGroup(
            nuevoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoL, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        ediatBtn.setBackground(new java.awt.Color(0, 153, 255));

        editL.setBackground(new java.awt.Color(51, 153, 255));
        editL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editL.setForeground(new java.awt.Color(255, 255, 255));
        editL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editL.setText("Editar");
        editL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout ediatBtnLayout = new javax.swing.GroupLayout(ediatBtn);
        ediatBtn.setLayout(ediatBtnLayout);
        ediatBtnLayout.setHorizontalGroup(
            ediatBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editL, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );
        ediatBtnLayout.setVerticalGroup(
            ediatBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editL, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        borrarBtn.setBackground(new java.awt.Color(51, 153, 255));

        borrarL.setBackground(new java.awt.Color(51, 153, 255));
        borrarL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        borrarL.setForeground(new java.awt.Color(255, 255, 255));
        borrarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrarL.setText("Borrar");
        borrarL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout borrarBtnLayout = new javax.swing.GroupLayout(borrarBtn);
        borrarBtn.setLayout(borrarBtnLayout);
        borrarBtnLayout.setHorizontalGroup(
            borrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrarL, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );
        borrarBtnLayout.setVerticalGroup(
            borrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrarL, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout miembrosIPLayout = new javax.swing.GroupLayout(miembrosIP);
        miembrosIP.setLayout(miembrosIPLayout);
        miembrosIPLayout.setHorizontalGroup(
            miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miembrosIPLayout.createSequentialGroup()
                .addGroup(miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(miembrosIPLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuevoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ediatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(miembrosIPLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, miembrosIPLayout.createSequentialGroup()
                                .addComponent(miembrosTextL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, miembrosIPLayout.createSequentialGroup()
                                .addComponent(buscadorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(21, 21, 21))
        );
        miembrosIPLayout.setVerticalGroup(
            miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miembrosIPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(miembrosTextL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscadorTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miembrosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nuevoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(borrarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ediatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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
    private javax.swing.JPanel borrarBtn;
    private javax.swing.JLabel borrarL;
    private javax.swing.JTextField buscadorTF;
    private javax.swing.JPanel buscarBtn;
    private javax.swing.JLabel buscarL;
    private javax.swing.JPanel ediatBtn;
    private javax.swing.JLabel editL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel miembrosIP;
    private javax.swing.JLabel miembrosTextL;
    private javax.swing.JPanel nuevoBtn;
    private javax.swing.JLabel nuevoL;
    // End of variables declaration//GEN-END:variables
}
