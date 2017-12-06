/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import helpers.SourceJForm;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge-L
 */
public class cuentas_ingresos extends SourceJForm {

    /**
     * Creates new form cuentas_ingresos
     */
    public cuentas_ingresos() throws ClassNotFoundException, Exception {
        super();
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

        tx_id = new javax.swing.JTextField();
        tx_recibos_numero_recibo = new javax.swing.JTextField();
        tx_fraccionamientos_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tx_importe = new javax.swing.JTextField();
        tx_fecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tx_estado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tx_id.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tx_idInputMethodTextChanged(evt);
            }
        });
        tx_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_idActionPerformed(evt);
            }
        });
        tx_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_idKeyTyped(evt);
            }
        });

        tx_recibos_numero_recibo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tx_recibos_numero_recibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_recibos_numero_reciboActionPerformed(evt);
            }
        });

        tx_fraccionamientos_id.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tx_fraccionamientos_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_fraccionamientos_idActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha:");

        jLabel1.setText("Importe");

        jLabel3.setText("Estado");

        jLabel4.setText("Numero Recibo");

        jLabel5.setText("Id Fraccionamiento");

        tx_importe.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tx_importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_importeActionPerformed(evt);
            }
        });

        tx_fecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel9.setText("Identificador:");

        tx_estado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.setEnabled(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.setEnabled(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_guardar.setText("Nuevo");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.setEnabled(false);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingresos");

        jMenu3.setText("Opciones");

        jMenuItem5.setText("Pantalla Principal");
        jMenu3.add(jMenuItem5);

        jMenuItem7.setText("Salir");
        jMenu3.add(jMenuItem7);
        jMenu3.add(jSeparator2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edicion");

        jMenuItem3.setText("Limpiar Formulario");
        jMenu4.add(jMenuItem3);

        jMenuItem8.setText("Guardar");
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btn_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(201, 201, 201))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel9))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tx_importe)
                        .addComponent(tx_fecha)
                        .addComponent(tx_estado)
                        .addComponent(tx_recibos_numero_recibo)
                        .addComponent(tx_fraccionamientos_id, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                        .addComponent(tx_id))
                    .addContainerGap(83, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(jButton1)
                    .addComponent(btn_buscar)
                    .addComponent(salvar)
                    .addComponent(eliminar))
                .addGap(116, 116, 116))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(tx_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tx_importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tx_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tx_recibos_numero_recibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(tx_fraccionamientos_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(187, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_idInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tx_idInputMethodTextChanged

    }//GEN-LAST:event_tx_idInputMethodTextChanged

    private void tx_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_idActionPerformed

    private void tx_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_idKeyPressed
        btn_buscar.setEnabled(true);
        btn_guardar.setEnabled(true);
    }//GEN-LAST:event_tx_idKeyPressed

    private void tx_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_idKeyTyped

    }//GEN-LAST:event_tx_idKeyTyped

    private void tx_recibos_numero_reciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_recibos_numero_reciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_recibos_numero_reciboActionPerformed

    private void tx_fraccionamientos_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_fraccionamientos_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_fraccionamientos_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        int n = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar este registro","Advertencia", JOptionPane.NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
            try {
                PreparedStatement statement = rawConnection.prepareStatement("DELETE FROM cuentas_ingresos WHERE id = ? ");
                statement.setString(1,tx_id.getText());

                if(statement.executeUpdate()==1){
                    JOptionPane.showMessageDialog(this,"Se ha eliminado el registro","Operacion completada", JOptionPane.INFORMATION_MESSAGE);
                    limpiarFormulario();
                    btn_guardar.setEnabled(true);
                }

            } catch (SQLException ex) {
                Logger.getLogger(cuentas_ingresos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            PreparedStatement st = rawConnection.prepareStatement("SELECT * FROM cuentas_ingresos WHERE id = ?");
            st.setInt(1, Integer.parseInt(tx_id.getText()));

            if(st.execute()){
                ResultSet result = st.getResultSet();
                result.first();

                tx_importe.setText(result.getString("importe"));
                tx_fecha.setText(result.getString("fecha"));
                tx_estado.setText(result.getString("se_cobro"));
                tx_fraccionamientos_id.setText(result.getString("fraccionamientos_id"));
                tx_recibos_numero_recibo.setText(result.getString("recibos_numero_recibo"));
                
                salvar.setEnabled(true);
                eliminar.setEnabled(true);
                btn_guardar.setEnabled(true);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se encontro un registro con este identificador","No encontrado",JOptionPane.WARNING_MESSAGE);
            limpiarFormulario();
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        try {

            PreparedStatement statement = rawConnection.prepareStatement("INSERT INTO cuentas_ingresos values(?,?,?,?,?,?)");
            statement.setString(1,tx_id.getText());
            //NOMBRE
            statement.setString(2,tx_fecha.getText());
            //NSS
            statement.setString(3,tx_importe.getText());
            //RFC
            statement.setString(4,tx_estado.getText());
            //DOMICILIO
            statement.setString(5,tx_fraccionamientos_id.getText());

            statement.setString(6,tx_recibos_numero_recibo.getText());
            int result = statement.executeUpdate();

            if(result==1){
                JOptionPane.showMessageDialog(this,"Se ha guardado el registro","Operacion completada", JOptionPane.INFORMATION_MESSAGE);
                limpiarFormulario();
            }

        } catch (SQLException ex) {
            Logger.getLogger(cuentas_ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        try {
            PreparedStatement statement = rawConnection.prepareStatement(""
                + "UPDATE cuentas_ingresos "
                + " SET "
                + " fecha = ? ,"
                + " importe = ? ,"
                + " se_cobro = ? ,"
                + "fraccionamientos_id = ? ,"
                + "recibos_numero_recibo = ?"
                + " WHERE id = ? ");
            //NOMBRE
            statement.setString(1,tx_fecha.getText());
            //RAZON SOCIAL
            statement.setString(2,tx_importe.getText());
            //DIRECCION
            statement.setString(3,tx_estado.getText());
            //CONTACTO
            statement.setString(4,tx_fraccionamientos_id.getText());
            //ID
            statement.setString(5,tx_recibos_numero_recibo.getText());

            statement.setString(6,tx_id.getText());

            if(statement.executeUpdate()==1){
                JOptionPane.showMessageDialog(this,"Se ha actualizado la informacion", "Informacion Actualizada",JOptionPane.INFORMATION_MESSAGE);
                limpiarFormulario();
                salvar.setEnabled(false);
                btn_buscar.setEnabled(false);
                eliminar.setEnabled(false);
                btn_guardar.setEnabled(true);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"No puede Actualizar este registro","La accion no se completo",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(cuentas_ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void tx_importeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_importeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_importeActionPerformed
    public void limpiarFormulario(){  
        tx_importe.setText("");
        tx_fecha.setText("");
        tx_estado.setText("");
        tx_recibos_numero_recibo.setText("");
        tx_fraccionamientos_id.setText("");
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
            java.util.logging.Logger.getLogger(cuentas_ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuentas_ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuentas_ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuentas_ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new cuentas_ingresos().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(cuentas_ingresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField tx_estado;
    private javax.swing.JTextField tx_fecha;
    private javax.swing.JTextField tx_fraccionamientos_id;
    private javax.swing.JTextField tx_id;
    private javax.swing.JTextField tx_importe;
    private javax.swing.JTextField tx_recibos_numero_recibo;
    // End of variables declaration//GEN-END:variables
}
