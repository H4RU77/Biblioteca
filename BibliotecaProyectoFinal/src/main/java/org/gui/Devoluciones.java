/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.gui;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.clases.*;

/**
 *  
 * @author Keloc
 */
public class Devoluciones extends javax.swing.JPanel {
 
    
    private String hoy;
    private LocalDate now = LocalDate.now();

    
    
    private Biblioteca biblio;
    
    private ListaSE<Prestamo> prestamos = new ListaSE<>();

    /**
     * Creates new form Devoluciones
     */
    public Devoluciones(Biblioteca biblio) {
        initComponents();
        this.biblio = biblio;
        setHoy();
        prestamos = biblio.getActivos();
    }
    
    private void setHoy(){
        Locale spanishLocale = new Locale("es", "ES");
        this.hoy = now.format(DateTimeFormatter.ofPattern("dd'/'MMMM'/'yyyy", spanishLocale));
    }
    
    private String getHoy(){
        return hoy;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        devolucionesIP = new javax.swing.JPanel();
        devolucionesTextL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        libroIdText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        folioIdText = new javax.swing.JTextField();
        btnDevolver = new javax.swing.JButton();
        folioTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(611, 362));
        setPreferredSize(new java.awt.Dimension(611, 362));

        devolucionesIP.setBackground(new java.awt.Color(255, 255, 255));
        devolucionesIP.setMinimumSize(new java.awt.Dimension(611, 362));
        devolucionesIP.setPreferredSize(new java.awt.Dimension(611, 362));

        devolucionesTextL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        devolucionesTextL.setText("Devolución de Libro");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ISBN Libro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID de Usuario");

        btnDevolver.setBackground(new java.awt.Color(51, 51, 255));
        btnDevolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDevolver.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout devolucionesIPLayout = new javax.swing.GroupLayout(devolucionesIP);
        devolucionesIP.setLayout(devolucionesIPLayout);
        devolucionesIPLayout.setHorizontalGroup(
            devolucionesIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(devolucionesIPLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(devolucionesIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(devolucionesTextL, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(devolucionesIPLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(devolucionesIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(libroIdText)
                            .addComponent(folioTxt)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDevolver, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        devolucionesIPLayout.setVerticalGroup(
            devolucionesIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(devolucionesIPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(devolucionesTextL)
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(libroIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(devolucionesIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(devolucionesIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed

        String folio = folioTxt.getText();
        String bookId = libroIdText.getText();
        
        //Buscar miembro
        Miembro miembro = buscarMiembro(folio);
        if (miembro == null) {
            JOptionPane.showMessageDialog(this, "Miembro no encontrado");
            return;
        }
        
        //Buscar libro
        Libro libro = buscarLibro(bookId);
        if (libro == null) {
            JOptionPane.showMessageDialog(this, "Libro no encontrado");
            return;
        }
        
        //Buscar prestamo activo
        Prestamo prestamo = buscarPrestamo(miembro, libro);
        if (prestamo == null) {
            JOptionPane.showMessageDialog(this, "El miembro no tiene este libro en prestamo");
            return;
        }
        
        //Realizar devolucion
        realizarDevolucion(prestamo);
        
        JOptionPane.showMessageDialog(this, "Devolucion realizada con exito");
    }//GEN-LAST:event_btnDevolverActionPerformed


    //Buscar miembro por su folio(ID)
    private Miembro buscarMiembro(String folio) {
        for (int i = 0; i < biblio.getMiembroLista().tamanio(); i++) {
            Miembro miembro = biblio.getMiembroLista().Obtener(i);
            if (miembro.getID().equals(folio)) {
                return miembro;
            }
        }
        return null;
    }
    
    //Buscar libro por su ID
    private Libro buscarLibro(String libroID) {
        for (int i = 0; i < biblio.getCatalogo().getListaLibros().tamanio(); i++) {
            Libro libro = biblio.getCatalogo().getListaLibros().Obtener(i);
            if (libro.getISBN().equals(libroID)) {
                return libro;
            }
        }
        return null;
    }
    
    //Buscar prestamos activos
    private Prestamo buscarPrestamo (Miembro miembro, Libro libro) {
        for (int i = 0; i < prestamos.tamanio(); i++) {
            Prestamo prestamo = prestamos.Obtener(i);
            if (prestamo.getFolio().getID().equals(miembro.getID()) && prestamo.getLibro().getISBN().equals(libro.getISBN())) {
                return prestamo;
            }
        }
        return null;
    }
    
    //Realizar devolucion
    private void realizarDevolucion(Prestamo p) {
        try {
            //Ficheros
            File logs = new File("src/main/java/org/persistencia/logs.txt");
            File logsP = new File("src/main/java/org/persistencia/logsP.ser");
            File prestamosActivos = new File("src/main/java/org/persistencia/prestamosActivos.ser");
            FileOutputStream preActOut = new FileOutputStream(prestamosActivos);
            ObjectOutputStream paOut = new ObjectOutputStream(preActOut);
            FileOutputStream lOut= new FileOutputStream(logsP);
            ObjectOutputStream logsOut = new ObjectOutputStream(lOut);
            FileWriter fw = new FileWriter(logs, true);
            PrintWriter pw = new PrintWriter(fw, true);
            
            //Marcar devuelto
            p.setDevuelto(true);
            LocalDate limite = p.getDate();
            Devolucion dev = new Devolucion(p.getLibro(), hoy, calcularMonto(now, limite), p.getFolio());

            //Mensaje de pago
            if (calcularMonto(now, limite) > 0){
                JOptionPane.showMessageDialog(null, "El miembro debe pagar la siguiente cantdidas debido a una entrega extemporanea: "+calcularMonto(now, limite));
            }

            //Elimar prestamo
            Miembro miembro = p.getFolio();
            if (p.getLibro() instanceof LibroFisico){
                LibroFisico lib = (LibroFisico) p.getLibro();
                lib.setCantidad(lib.getCantidad()+1);
            }
            ListaSE<Prestamo> prestamoActivo = miembro.getPrestamosActivos();
            prestamoActivo.Eliminar(prestamoActivo.indiceDe(p));
            biblio.getActivos().Eliminar(biblio.getActivos().indiceDe(p));

            //Agregar al historial
            miembro.getHistorialPrestamos().Agregar(dev);
            biblio.getOperaciones().Agregar(dev);
            pw.print(dev.mostrar()+"\n");
            logsOut.writeObject(biblio.getOperaciones());
            paOut.writeObject(biblio.getActivos());
        } catch(IOException io){
            JOptionPane.showMessageDialog(null, io.getMessage());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
    
    private double calcularMonto(LocalDate now, LocalDate lim){
        double monto = 0;
        if (now.isAfter(lim)){
            long dias = ChronoUnit.DAYS.between(lim, now);
            System.out.println("Dias: "+dias);
            monto = 100 + 12.5*dias;
        }
        return monto;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolver;
    private javax.swing.JPanel devolucionesIP;
    private javax.swing.JLabel devolucionesTextL;
    private javax.swing.JTextField folioIdText;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField libroIdText;
    // End of variables declaration//GEN-END:variables
}
