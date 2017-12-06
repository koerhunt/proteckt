
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
public class Compañias extends SourceJForm {

    public Compañias() throws ClassNotFoundException, Exception {
        super();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tx_id = new javax.swing.JTextField();
        tx_nombre = new javax.swing.JTextField();
        tx_razon_social = new javax.swing.JTextField();
        tx_direccion = new javax.swing.JTextField();
        tx_contacto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tx_sector_id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Identificador");

        jLabel2.setText("Nombre");

        jLabel3.setText("Razon Social");

        jLabel4.setText("Direccion");

        jLabel5.setText("Contacto");

        tx_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_idKeyPressed(evt);
            }
        });

        jLabel6.setText("Sector");

        tx_sector_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_sector_idActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        jLabel7.setText("Compañias");

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
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_id, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tx_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(tx_razon_social, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(tx_contacto, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(tx_sector_id))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tx_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tx_razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tx_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tx_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tx_sector_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(jButton2)
                    .addComponent(btn_buscar)
                    .addComponent(salvar)
                    .addComponent(eliminar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_sector_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_sector_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_sector_idActionPerformed

    private void tx_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_idKeyPressed
        btn_buscar.setEnabled(true);
        btn_guardar.setEnabled(true);
    }//GEN-LAST:event_tx_idKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        int n = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar este registro","Advertencia", JOptionPane.NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
            try {
                PreparedStatement statement = rawConnection.prepareStatement("DELETE FROM compañias WHERE id = ? ");
                statement.setString(1,tx_id.getText());

                if(statement.executeUpdate()==1){
                    JOptionPane.showMessageDialog(this,"Se ha eliminado el registro","Operacion completada", JOptionPane.INFORMATION_MESSAGE);
                    limpiarFormulario();
                    btn_guardar.setEnabled(true);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Compañias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            PreparedStatement st = rawConnection.prepareStatement("SELECT * FROM compañias WHERE id = ?");
            st.setInt(1, Integer.parseInt(tx_id.getText()));

            if(st.execute()){
                ResultSet result = st.getResultSet();
                result.first();

                tx_nombre.setText(result.getString("nombre"));
                tx_razon_social.setText(result.getString("razon_social"));
                tx_direccion.setText(result.getString("direccion"));
                tx_contacto.setText(result.getString("persona_contacto"));

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

            PreparedStatement statement = rawConnection.prepareStatement("INSERT INTO compañias values(?,?,?,?,?,?)");
            statement.setString(1,tx_id.getText());
            //NOMBRE
            statement.setString(2,tx_nombre.getText());
            //NSS
            statement.setString(3,tx_razon_social.getText());
            //RFC
            statement.setString(4,tx_direccion.getText());
            //DOMICILIO
            statement.setString(5,tx_contacto.getText());
            
            statement.setString(6,tx_sector_id.getText());
            int result = statement.executeUpdate();

            if(result==1){
                JOptionPane.showMessageDialog(this,"Se ha guardado el registro","Operacion completada", JOptionPane.INFORMATION_MESSAGE);
                limpiarFormulario();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Compañias.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        try {
            PreparedStatement statement = rawConnection.prepareStatement(""
                + "UPDATE compañias "
                + " SET "
                + " nombre = ? ,"
                + " razon_social = ? ,"
                + " direccion = ? ,"
                + " persona_contacto = ? "
                + " WHERE id = ? ");
            //NOMBRE
            statement.setString(1,tx_nombre.getText());
            //RAZON SOCIAL
            statement.setString(2,tx_razon_social.getText());
            //DIRECCION
            statement.setString(3,tx_direccion.getText());
            //CONTACTO
            statement.setString(4,tx_contacto.getText());
            //ID
            statement.setString(5,tx_id.getText());

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
            Logger.getLogger(Compañias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarActionPerformed
    public void limpiarFormulario(){  
        tx_nombre.setText("");
        tx_razon_social.setText("");
        tx_direccion.setText("");
        tx_contacto.setText("");
        tx_sector_id.setText("");
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
            java.util.logging.Logger.getLogger(Compañias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compañias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compañias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compañias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Compañias().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Compañias.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField tx_contacto;
    private javax.swing.JTextField tx_direccion;
    private javax.swing.JTextField tx_id;
    private javax.swing.JTextField tx_nombre;
    private javax.swing.JTextField tx_razon_social;
    private javax.swing.JTextField tx_sector_id;
    // End of variables declaration//GEN-END:variables
}
