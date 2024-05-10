/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Keloc
 */
public class BibliotecaInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form BibliotecaInterfaz
     */
    
    private Image principalImage = new ImageIcon("src/main/resources/principalImg.png").getImage();
    private Image prestamoImage = new ImageIcon("src/main/resources/prestamoImg.png").getImage();
    private Image devolucionImage = new ImageIcon("src/main/resources/devolucionImg.png").getImage();
    private Image miembrosImage = new ImageIcon("src/main/resources/miembrosImg.png").getImage();
    private Image catalogoImage = new ImageIcon("src/main/resources/catalogoImg.png").getImage();
    private Image logsImage = new ImageIcon("src/main/resources/logsImg.png").getImage();
    private Image logoImage = new ImageIcon("src/main/resources/logo.png").getImage();
    public BibliotecaInterfaz() {
        initComponents();
        initStyles();
        initContent();
        principalImgL.setIcon(resizeImage(principalImage, principalImgL));
        prestamosImgL.setIcon(resizeImage(prestamoImage, prestamosImgL));
        devolucionesImgL.setIcon(resizeImage(devolucionImage, devolucionesImgL));
        miembrosImgL.setIcon(resizeImage(miembrosImage, miembrosImgL));
        catalogoImgL.setIcon(resizeImage(catalogoImage, catalogoImgL));
        logsImgL.setIcon(resizeImage(logsImage, logsImgL));
        logoL.setIcon(resizeImage(logoImage, logoL));
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
        menuPanel = new javax.swing.JPanel();
        menuOpciones = new javax.swing.JPanel();
        contenedorOpt = new javax.swing.JPanel();
        principalOptP = new javax.swing.JPanel();
        principalL = new javax.swing.JLabel();
        principalImgL = new javax.swing.JLabel();
        prestamosOptP = new javax.swing.JPanel();
        prestamosL = new javax.swing.JLabel();
        prestamosImgL = new javax.swing.JLabel();
        devolucionesOptP = new javax.swing.JPanel();
        devolucionesL = new javax.swing.JLabel();
        devolucionesImgL = new javax.swing.JLabel();
        miembrosOptP = new javax.swing.JPanel();
        miembrosL = new javax.swing.JLabel();
        miembrosImgL = new javax.swing.JLabel();
        catalogoOptP = new javax.swing.JPanel();
        catalogoL = new javax.swing.JLabel();
        catalogoImgL = new javax.swing.JLabel();
        logsOptP = new javax.swing.JPanel();
        logsL = new javax.swing.JLabel();
        logsImgL = new javax.swing.JLabel();
        logoL = new javax.swing.JLabel();
        barraP = new javax.swing.JPanel();
        contentP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setMinimumSize(new java.awt.Dimension(800, 500));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));

        menuPanel.setBackground(new java.awt.Color(204, 204, 204));
        menuPanel.setMinimumSize(new java.awt.Dimension(175, 500));
        menuPanel.setPreferredSize(new java.awt.Dimension(187, 500));

        menuOpciones.setBackground(new java.awt.Color(51, 102, 255));
        menuOpciones.setPreferredSize(new java.awt.Dimension(175, 500));

        contenedorOpt.setBackground(new java.awt.Color(51, 153, 255));
        contenedorOpt.setMaximumSize(new java.awt.Dimension(350, 600));
        contenedorOpt.setMinimumSize(new java.awt.Dimension(175, 300));
        contenedorOpt.setPreferredSize(new java.awt.Dimension(185, 300));
        contenedorOpt.setLayout(new javax.swing.BoxLayout(contenedorOpt, javax.swing.BoxLayout.PAGE_AXIS));

        principalOptP.setBackground(new java.awt.Color(51, 153, 255));
        principalOptP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        principalOptP.setMaximumSize(new java.awt.Dimension(350, 100));
        principalOptP.setMinimumSize(new java.awt.Dimension(175, 50));
        principalOptP.setPreferredSize(new java.awt.Dimension(175, 50));
        principalOptP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalOptPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                principalOptPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                principalOptPMouseExited(evt);
            }
        });

        principalL.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        principalL.setForeground(new java.awt.Color(255, 255, 255));
        principalL.setText("Principal");

        principalImgL.setMaximumSize(new java.awt.Dimension(30, 30));
        principalImgL.setMinimumSize(new java.awt.Dimension(30, 30));
        principalImgL.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout principalOptPLayout = new javax.swing.GroupLayout(principalOptP);
        principalOptP.setLayout(principalOptPLayout);
        principalOptPLayout.setHorizontalGroup(
            principalOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalOptPLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(principalImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(principalL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        principalOptPLayout.setVerticalGroup(
            principalOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalOptPLayout.createSequentialGroup()
                .addGroup(principalOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalOptPLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(principalL))
                    .addGroup(principalOptPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(principalImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        contenedorOpt.add(principalOptP);

        prestamosOptP.setBackground(new java.awt.Color(51, 153, 255));
        prestamosOptP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamosOptP.setMaximumSize(new java.awt.Dimension(350, 100));
        prestamosOptP.setMinimumSize(new java.awt.Dimension(175, 50));
        prestamosOptP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prestamosOptPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prestamosOptPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prestamosOptPMouseExited(evt);
            }
        });

        prestamosL.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        prestamosL.setForeground(new java.awt.Color(255, 255, 255));
        prestamosL.setText("Prestamos");

        prestamosImgL.setMaximumSize(new java.awt.Dimension(30, 30));
        prestamosImgL.setMinimumSize(new java.awt.Dimension(30, 30));
        prestamosImgL.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout prestamosOptPLayout = new javax.swing.GroupLayout(prestamosOptP);
        prestamosOptP.setLayout(prestamosOptPLayout);
        prestamosOptPLayout.setHorizontalGroup(
            prestamosOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prestamosOptPLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(prestamosImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(prestamosL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        prestamosOptPLayout.setVerticalGroup(
            prestamosOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestamosOptPLayout.createSequentialGroup()
                .addGroup(prestamosOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prestamosOptPLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(prestamosL))
                    .addGroup(prestamosOptPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(prestamosImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        contenedorOpt.add(prestamosOptP);

        devolucionesOptP.setBackground(new java.awt.Color(51, 153, 255));
        devolucionesOptP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devolucionesOptP.setMaximumSize(new java.awt.Dimension(350, 100));
        devolucionesOptP.setMinimumSize(new java.awt.Dimension(175, 50));
        devolucionesOptP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devolucionesOptPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                devolucionesOptPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                devolucionesOptPMouseExited(evt);
            }
        });

        devolucionesL.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        devolucionesL.setForeground(new java.awt.Color(255, 255, 255));
        devolucionesL.setText("Devoluciones");

        devolucionesImgL.setMaximumSize(new java.awt.Dimension(30, 30));
        devolucionesImgL.setMinimumSize(new java.awt.Dimension(30, 30));
        devolucionesImgL.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout devolucionesOptPLayout = new javax.swing.GroupLayout(devolucionesOptP);
        devolucionesOptP.setLayout(devolucionesOptPLayout);
        devolucionesOptPLayout.setHorizontalGroup(
            devolucionesOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, devolucionesOptPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(devolucionesImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(devolucionesL)
                .addContainerGap())
        );
        devolucionesOptPLayout.setVerticalGroup(
            devolucionesOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(devolucionesOptPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(devolucionesL)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, devolucionesOptPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(devolucionesImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contenedorOpt.add(devolucionesOptP);

        miembrosOptP.setBackground(new java.awt.Color(51, 153, 255));
        miembrosOptP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miembrosOptP.setMaximumSize(new java.awt.Dimension(350, 100));
        miembrosOptP.setMinimumSize(new java.awt.Dimension(175, 50));
        miembrosOptP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miembrosOptPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miembrosOptPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miembrosOptPMouseExited(evt);
            }
        });

        miembrosL.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        miembrosL.setForeground(new java.awt.Color(255, 255, 255));
        miembrosL.setText("Miembros");

        miembrosImgL.setMaximumSize(new java.awt.Dimension(30, 30));
        miembrosImgL.setMinimumSize(new java.awt.Dimension(30, 30));
        miembrosImgL.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout miembrosOptPLayout = new javax.swing.GroupLayout(miembrosOptP);
        miembrosOptP.setLayout(miembrosOptPLayout);
        miembrosOptPLayout.setHorizontalGroup(
            miembrosOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miembrosOptPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(miembrosImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(miembrosL)
                .addGap(29, 29, 29))
        );
        miembrosOptPLayout.setVerticalGroup(
            miembrosOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miembrosOptPLayout.createSequentialGroup()
                .addGroup(miembrosOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(miembrosOptPLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(miembrosL))
                    .addGroup(miembrosOptPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(miembrosImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        contenedorOpt.add(miembrosOptP);

        catalogoOptP.setBackground(new java.awt.Color(51, 153, 255));
        catalogoOptP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        catalogoOptP.setMaximumSize(new java.awt.Dimension(350, 100));
        catalogoOptP.setMinimumSize(new java.awt.Dimension(175, 50));
        catalogoOptP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catalogoOptPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                catalogoOptPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                catalogoOptPMouseExited(evt);
            }
        });

        catalogoL.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        catalogoL.setForeground(new java.awt.Color(255, 255, 255));
        catalogoL.setText("Catalogo");

        catalogoImgL.setMaximumSize(new java.awt.Dimension(30, 30));
        catalogoImgL.setMinimumSize(new java.awt.Dimension(30, 30));
        catalogoImgL.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout catalogoOptPLayout = new javax.swing.GroupLayout(catalogoOptP);
        catalogoOptP.setLayout(catalogoOptPLayout);
        catalogoOptPLayout.setHorizontalGroup(
            catalogoOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catalogoOptPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(catalogoImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(catalogoL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        catalogoOptPLayout.setVerticalGroup(
            catalogoOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catalogoOptPLayout.createSequentialGroup()
                .addGroup(catalogoOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catalogoOptPLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(catalogoL))
                    .addGroup(catalogoOptPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(catalogoImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        contenedorOpt.add(catalogoOptP);

        logsOptP.setBackground(new java.awt.Color(51, 153, 255));
        logsOptP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logsOptP.setMaximumSize(new java.awt.Dimension(350, 100));
        logsOptP.setMinimumSize(new java.awt.Dimension(175, 50));
        logsOptP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logsOptPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logsOptPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logsOptPMouseExited(evt);
            }
        });

        logsL.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        logsL.setForeground(new java.awt.Color(255, 255, 255));
        logsL.setText("Logs");

        logsImgL.setMaximumSize(new java.awt.Dimension(30, 30));
        logsImgL.setMinimumSize(new java.awt.Dimension(30, 30));
        logsImgL.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout logsOptPLayout = new javax.swing.GroupLayout(logsOptP);
        logsOptP.setLayout(logsOptPLayout);
        logsOptPLayout.setHorizontalGroup(
            logsOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logsOptPLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(logsImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(logsL)
                .addGap(63, 63, 63))
        );
        logsOptPLayout.setVerticalGroup(
            logsOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logsOptPLayout.createSequentialGroup()
                .addGroup(logsOptPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logsOptPLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(logsL))
                    .addGroup(logsOptPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logsImgL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        contenedorOpt.add(logsOptP);

        logoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen.jpg"))); // NOI18N
        logoL.setText("jLabel1");

        javax.swing.GroupLayout menuOpcionesLayout = new javax.swing.GroupLayout(menuOpciones);
        menuOpciones.setLayout(menuOpcionesLayout);
        menuOpcionesLayout.setHorizontalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addComponent(contenedorOpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        menuOpcionesLayout.setVerticalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(logoL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenedorOpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(menuOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        barraP.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout barraPLayout = new javax.swing.GroupLayout(barraP);
        barraP.setLayout(barraPLayout);
        barraPLayout.setHorizontalGroup(
            barraPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraPLayout.setVerticalGroup(
            barraPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        contentP.setMinimumSize(new java.awt.Dimension(620, 360));
        contentP.setPreferredSize(new java.awt.Dimension(620, 360));

        javax.swing.GroupLayout contentPLayout = new javax.swing.GroupLayout(contentP);
        contentP.setLayout(contentPLayout);
        contentPLayout.setHorizontalGroup(
            contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentPLayout.setVerticalGroup(
            contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 616, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(barraP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(contentP, javax.swing.GroupLayout.PREFERRED_SIZE, 611, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(barraP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(contentP, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void principalOptPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalOptPMouseEntered
        principalOptP.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_principalOptPMouseEntered

    private void principalOptPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalOptPMouseExited
        principalOptP.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_principalOptPMouseExited

    private void prestamosOptPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosOptPMouseEntered
        prestamosOptP.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_prestamosOptPMouseEntered

    private void devolucionesOptPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionesOptPMouseEntered
        devolucionesOptP.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_devolucionesOptPMouseEntered

    private void miembrosOptPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miembrosOptPMouseEntered
        miembrosOptP.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_miembrosOptPMouseEntered

    private void prestamosOptPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosOptPMouseExited
        prestamosOptP.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_prestamosOptPMouseExited

    private void devolucionesOptPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionesOptPMouseExited
        devolucionesOptP.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_devolucionesOptPMouseExited

    private void miembrosOptPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miembrosOptPMouseExited
        miembrosOptP.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_miembrosOptPMouseExited

    private void logsOptPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsOptPMouseEntered
        logsOptP.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_logsOptPMouseEntered

    private void logsOptPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsOptPMouseExited
        logsOptP.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_logsOptPMouseExited

    private void catalogoOptPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogoOptPMouseExited
        catalogoOptP.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_catalogoOptPMouseExited

    private void catalogoOptPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogoOptPMouseEntered
        catalogoOptP.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_catalogoOptPMouseEntered

    private void principalOptPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalOptPMouseClicked
        initContent();
    }//GEN-LAST:event_principalOptPMouseClicked

    private void prestamosOptPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosOptPMouseClicked
        changeContent(new Prestamos());
    }//GEN-LAST:event_prestamosOptPMouseClicked

    private void devolucionesOptPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionesOptPMouseClicked
        changeContent(new Devoluciones());
    }//GEN-LAST:event_devolucionesOptPMouseClicked

    private void miembrosOptPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miembrosOptPMouseClicked
        changeContent(new Miembros());
    }//GEN-LAST:event_miembrosOptPMouseClicked

    private void catalogoOptPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogoOptPMouseClicked
        changeContent(new CatalogoContentP());
    }//GEN-LAST:event_catalogoOptPMouseClicked

    private void logsOptPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsOptPMouseClicked
        changeContent(new Logs());
    }//GEN-LAST:event_logsOptPMouseClicked

    private ImageIcon resizeImage(Image image, JLabel label){
        ImageIcon img = new ImageIcon(image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        return img;
    }
    
    private void initStyles(){
        principalL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        prestamosL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        devolucionesL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        miembrosL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        catalogoL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
        logsL.putClientProperty( "FlatLaf.style", "font: large $large.font" );
    }
    
    private void initContent(){
        Principal p1 = new Principal();
        p1.setSize(contentP.getWidth(), contentP.getHeight());
        p1.setLocation(0, 0);
        contentP.removeAll();
        contentP.add(p1, BorderLayout.CENTER);
        contentP.revalidate();
        contentP.repaint();
    }
    
    private void changeContent(JPanel panel){
        panel.setSize(contentP.getWidth(), contentP.getHeight());
        panel.setLocation(0,0);
        contentP.removeAll();
        contentP.add(panel, BorderLayout.CENTER);
        contentP.revalidate();
        contentP.repaint();
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
            java.util.logging.Logger.getLogger(BibliotecaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BibliotecaInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraP;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel catalogoImgL;
    private javax.swing.JLabel catalogoL;
    private javax.swing.JPanel catalogoOptP;
    private javax.swing.JPanel contenedorOpt;
    private javax.swing.JPanel contentP;
    private javax.swing.JLabel devolucionesImgL;
    private javax.swing.JLabel devolucionesL;
    private javax.swing.JPanel devolucionesOptP;
    private javax.swing.JLabel logoL;
    private javax.swing.JLabel logsImgL;
    private javax.swing.JLabel logsL;
    private javax.swing.JPanel logsOptP;
    private javax.swing.JPanel menuOpciones;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel miembrosImgL;
    private javax.swing.JLabel miembrosL;
    private javax.swing.JPanel miembrosOptP;
    private javax.swing.JLabel prestamosImgL;
    private javax.swing.JLabel prestamosL;
    private javax.swing.JPanel prestamosOptP;
    private javax.swing.JLabel principalImgL;
    private javax.swing.JLabel principalL;
    private javax.swing.JPanel principalOptP;
    // End of variables declaration//GEN-END:variables
}
