
package Presentacion;

import Logica.*;
import Persistencia.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class VentanaRegistrarHabitacion extends javax.swing.JFrame {
    private Hotel hotel;
    private Ventana ventanamain;
    
    public VentanaRegistrarHabitacion(Ventana ventana) {
        initComponents();
        hotel=new Hotel();
        this.ventanamain=ventana;
        
    }
    public JLabel getlblNumH(){
        return lblNumH;
    }
    public JLabel getlblTipoH(){
        return lblTipoH;
    }
    public JLabel getlblEstado(){
        return lblEstado;
    }
    public JLabel getlblPrecioN(){
        return lblPrecioN;
    }
    public Hotel getHotel(){
        return hotel;
    }
    
    public JButton getbtnRegistrarGrupo(){
        return btnRegistrarGrupo;
    }
    
    public JLabel getlblCodigoReserva(){
        return lblCodigoReserva;
    }
    
    public JFormattedTextField getftxtCodigoReserva(){
        return ftxtCodigoReserva;
    }
    
    public JButton getbtnGuardarHabitacion(){
        return btnGuardarHabitacion;
    }
    
    public JButton getbtnVaciarHabitacion(){
        return btnVaciarHabitacion;
    }
    
    public JLabel getlblgr(){
        return lblgr;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistrarHabitacion = new javax.swing.JPanel();
        pnlAzul = new javax.swing.JPanel();
        lblDetallesHabitacion = new javax.swing.JLabel();
        lblNumeroHabitacion = new javax.swing.JLabel();
        lblNumH = new javax.swing.JLabel();
        lblEstadoHabitacion = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblTipoHabitacion = new javax.swing.JLabel();
        lblPrecioNoche = new javax.swing.JLabel();
        lblTipoH = new javax.swing.JLabel();
        lblPrecioN = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        lblgr = new javax.swing.JLabel();
        lblCodigoReserva = new javax.swing.JLabel();
        ftxtCodigoReserva = new javax.swing.JFormattedTextField();
        btnGuardarHabitacion = new javax.swing.JButton();
        btnRegistrarGrupo = new javax.swing.JButton();
        btnVaciarHabitacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlRegistrarHabitacion.setBackground(new java.awt.Color(255, 255, 255));

        pnlAzul.setBackground(new java.awt.Color(0, 153, 153));

        lblDetallesHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDetallesHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        lblDetallesHabitacion.setText("Detalles Habitación");

        lblNumeroHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumeroHabitacion.setForeground(new java.awt.Color(0, 0, 153));
        lblNumeroHabitacion.setText("Numero Habitación:");

        lblNumH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumH.setForeground(new java.awt.Color(255, 255, 255));
        lblNumH.setText("101");

        lblEstadoHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstadoHabitacion.setForeground(new java.awt.Color(0, 0, 153));
        lblEstadoHabitacion.setText("Estado:");

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Disponible");

        lblTipoHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoHabitacion.setForeground(new java.awt.Color(0, 0, 153));
        lblTipoHabitacion.setText("Tipo de Habitación:");

        lblPrecioNoche.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecioNoche.setForeground(new java.awt.Color(0, 0, 153));
        lblPrecioNoche.setText("Precio por Noche:");

        lblTipoH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipoH.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoH.setText("Sencilla");

        lblPrecioN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrecioN.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioN.setText("$100000");

        lblGrupo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGrupo.setForeground(new java.awt.Color(0, 0, 153));
        lblGrupo.setText("Grupo:");

        lblgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblgr.setForeground(new java.awt.Color(255, 255, 255));
        lblgr.setText("Sin Asignar");

        javax.swing.GroupLayout pnlAzulLayout = new javax.swing.GroupLayout(pnlAzul);
        pnlAzul.setLayout(pnlAzulLayout);
        pnlAzulLayout.setHorizontalGroup(
            pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAzulLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAzulLayout.createSequentialGroup()
                        .addComponent(lblDetallesHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblgr))
                    .addGroup(pnlAzulLayout.createSequentialGroup()
                        .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlAzulLayout.createSequentialGroup()
                                .addComponent(lblEstadoHabitacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblNumeroHabitacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNumH, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAzulLayout.createSequentialGroup()
                                .addComponent(lblTipoHabitacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAzulLayout.createSequentialGroup()
                                .addComponent(lblPrecioNoche)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrecioN, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAzulLayout.setVerticalGroup(
            pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAzulLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDetallesHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrupo)
                    .addComponent(lblgr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroHabitacion)
                    .addComponent(lblNumH)
                    .addComponent(lblTipoHabitacion)
                    .addComponent(lblTipoH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoHabitacion)
                    .addComponent(lblEstado)
                    .addComponent(lblPrecioNoche)
                    .addComponent(lblPrecioN))
                .addContainerGap())
        );

        lblCodigoReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigoReserva.setForeground(new java.awt.Color(51, 51, 51));
        lblCodigoReserva.setText("Codigo Reserva:");

        ftxtCodigoReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnGuardarHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarHabitacion.setText("Guardar Registro de Habitación");
        btnGuardarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHabitacionActionPerformed(evt);
            }
        });

        btnRegistrarGrupo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarGrupo.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarGrupo.setText("Registrar Grupo");
        btnRegistrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarGrupoActionPerformed(evt);
            }
        });

        btnVaciarHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVaciarHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        btnVaciarHabitacion.setText("Vaciar Habitacion");
        btnVaciarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarHabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistrarHabitacionLayout = new javax.swing.GroupLayout(pnlRegistrarHabitacion);
        pnlRegistrarHabitacion.setLayout(pnlRegistrarHabitacionLayout);
        pnlRegistrarHabitacionLayout.setHorizontalGroup(
            pnlRegistrarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlRegistrarHabitacionLayout.createSequentialGroup()
                .addGroup(pnlRegistrarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarHabitacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardarHabitacion))
                    .addGroup(pnlRegistrarHabitacionLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblCodigoReserva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegistrarHabitacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistrarGrupo))
                    .addGroup(pnlRegistrarHabitacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVaciarHabitacion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegistrarHabitacionLayout.setVerticalGroup(
            pnlRegistrarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarHabitacionLayout.createSequentialGroup()
                .addComponent(pnlAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnRegistrarGrupo)
                .addGap(21, 21, 21)
                .addGroup(pnlRegistrarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtCodigoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarHabitacion)
                .addGap(27, 27, 27)
                .addComponent(btnVaciarHabitacion)
                .addGap(0, 73, Short.MAX_VALUE))
        );

        lblCodigoReserva.setVisible(false);
        ftxtCodigoReserva.setVisible(false);
        btnGuardarHabitacion.setVisible(false);
        if(lblEstado.getText().equals("Ocupado")){
            btnRegistrarGrupo.setVisible(false);
        }
        btnVaciarHabitacion.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistrarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRegistrarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarGrupoActionPerformed
        lblCodigoReserva.setVisible(true);
        ftxtCodigoReserva.setVisible(true);
        btnGuardarHabitacion.setVisible(true);
    }//GEN-LAST:event_btnRegistrarGrupoActionPerformed

    private void btnGuardarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHabitacionActionPerformed
        hotel.getHabitaciones().put(Integer.parseInt(lblNumH.getText()),new Habitacion("Ocupado",Integer.parseInt(ftxtCodigoReserva.getText()),lblTipoH.getText()));
        Habitacion ha=(Habitacion)hotel.getHabitaciones().get(Integer.parseInt(lblNumH.getText()));
        btnVaciarHabitacion.setVisible(true);
        btnGuardarHabitacion.setVisible(false);
        lblCodigoReserva.setVisible(false);
        ftxtCodigoReserva.setVisible(false);
        btnRegistrarGrupo.setVisible(false);
        lblEstado.setText("Ocupado");
        lblgr.setText(String.valueOf(ha.getGrupo()));
        
    }//GEN-LAST:event_btnGuardarHabitacionActionPerformed

    private void btnVaciarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarHabitacionActionPerformed
        btnVaciarHabitacion.setVisible(false);
        btnGuardarHabitacion.setVisible(true);
        lblCodigoReserva.setVisible(true);
        ftxtCodigoReserva.setVisible(true);
        btnRegistrarGrupo.setVisible(true);
        ftxtCodigoReserva.setText("");
        hotel.getHabitaciones().put(Integer.parseInt(lblNumH.getText()), new Habitacion("Disponible",0,lblTipoH.getText()));
        Habitacion ha=(Habitacion)hotel.getHabitaciones().get(Integer.parseInt(lblNumH.getText()));
        System.out.println(ha.getEstado()+" a");
        lblEstado.setText("Disponible");
        lblgr.setText("Sin Asignar");
    }//GEN-LAST:event_btnVaciarHabitacionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Habitacion h=(Habitacion)hotel.getHabitaciones().get(Integer.parseInt(lblNumH.getText()));
        ventanamain.getBoton(lblNumH.getText()).setText(h.getEstado());
        if(h.getEstado().equals("Disponible")){
            ventanamain.getBoton(lblNumH.getText()).setBackground(new Color(51, 102, 0));
            ventanamain.getPanel(lblNumH.getText()).setBackground(new Color(50, 153, 0));
        }
        else if(h.getEstado().equals("Ocupado")){
        ventanamain.getBoton(lblNumH.getText()).setBackground(new Color(153,51,0));
        ventanamain.getPanel(lblNumH.getText()).setBackground(new Color(204,51,0));
        }
        dispose();
        
    }//GEN-LAST:event_formWindowClosing

    
    
   
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
            java.util.logging.Logger.getLogger(VentanaRegistrarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarHabitacion;
    private javax.swing.JButton btnRegistrarGrupo;
    private javax.swing.JButton btnVaciarHabitacion;
    private javax.swing.JFormattedTextField ftxtCodigoReserva;
    private javax.swing.JLabel lblCodigoReserva;
    private javax.swing.JLabel lblDetallesHabitacion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoHabitacion;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblNumH;
    private javax.swing.JLabel lblNumeroHabitacion;
    private javax.swing.JLabel lblPrecioN;
    private javax.swing.JLabel lblPrecioNoche;
    private javax.swing.JLabel lblTipoH;
    private javax.swing.JLabel lblTipoHabitacion;
    private javax.swing.JLabel lblgr;
    private javax.swing.JPanel pnlAzul;
    private javax.swing.JPanel pnlRegistrarHabitacion;
    // End of variables declaration//GEN-END:variables
}
