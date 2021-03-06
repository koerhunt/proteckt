/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.admin;

import helpers.SourceJForm;
import interfaces.Login;
import interfaces.PreLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author KoerHunt
 */
public class JefeDeSeguridadForm extends SourceJForm {
    
    Connection rw;
    Properties props;

    /**
     * Creates new form JefeDeSeguridadForm
     */
    public JefeDeSeguridadForm() throws ClassNotFoundException, Exception {        
        super();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tx_nombre = new javax.swing.JTextField();
        tx_nss = new javax.swing.JTextField();
        tx_rfc = new javax.swing.JTextField();
        tx_dom = new javax.swing.JTextField();
        tx_tel = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tx_usuario = new javax.swing.JTextField();
        pwd_user = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        tx_id = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_buscar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jefes de seguridad");

        jLabel1.setText("Nombre:");

        jLabel2.setText("NSS:");

        jLabel3.setText("RFC:");

        jLabel4.setText("Domicilio:");

        jLabel5.setText("Telefono:");

        tx_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tx_nss.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tx_rfc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tx_dom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tx_dom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_domActionPerformed(evt);
            }
        });

        tx_tel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/004-floppy-disk.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/001-back.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Datos de acceso:");

        jLabel7.setText("Nombre de Usuario:");

        jLabel8.setText("Contraseña:");

        jLabel9.setText("Identificador:");

        tx_id.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tx_idInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tx_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_idActionPerformed(evt);
            }
        });
        tx_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_idKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_idKeyPressed(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/021-search.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setEnabled(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/003-rotate.png"))); // NOI18N
        salvar.setText("Actualizar");
        salvar.setEnabled(false);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/002-delete.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setEnabled(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel10.setText("Jefes de Seguridad");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/64/004-policeman.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/001-office-material.png"))); // NOI18N
        jButton1.setText("Registros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Opciones");

        jMenuItem4.setText("Pantalla Principal");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edicion");

        jMenuItem1.setText("Limpiar Formulario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_usuario)
                            .addComponent(pwd_user)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tx_nombre)
                                    .addComponent(tx_nss)
                                    .addComponent(tx_rfc)
                                    .addComponent(tx_dom)
                                    .addComponent(tx_tel, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(tx_id)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel10)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tx_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tx_nss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tx_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tx_dom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tx_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tx_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pwd_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(salvar)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eliminar)
                        .addComponent(btn_guardar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx_domActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_domActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_domActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        try {
        
            PreparedStatement statement = rawConnection.prepareStatement("INSERT INTO jefes_de_seguridad values(?,?,?,?,?,?,?,?)");
            statement.setString(1,null);
            //NOMBRE
            statement.setString(2,tx_nombre.getText());
            //NSS
            statement.setString(3,tx_nss.getText());
            //RFC
            statement.setString(4,tx_rfc.getText());
            //DOMICILIO
            statement.setString(5,tx_dom.getText());
            //TELEFONO
            statement.setString(6,tx_tel.getText());
            //USUARIO
            statement.setString(7,tx_usuario.getText());
            //CONTRASENA
            statement.setString(8,pwd_user.getText());
            
            int result = statement.executeUpdate();
            
            if(result==1){
                JOptionPane.showMessageDialog(this,"Se ha guardado el registro","Operacion completada", JOptionPane.INFORMATION_MESSAGE);
                limpiarFormulario();
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(JefeDeSeguridadForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void tx_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_idActionPerformed

    private void tx_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_idKeyPressed
        btn_buscar.setEnabled(true);
    }//GEN-LAST:event_tx_idKeyPressed

    private void tx_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_idKeyTyped

    }//GEN-LAST:event_tx_idKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            PreparedStatement st = rawConnection.prepareStatement("SELECT * FROM jefes_de_seguridad WHERE id_jefe = ?");
            st.setInt(1, Integer.parseInt(tx_id.getText()));
            
            if(st.execute()){
                ResultSet result = st.getResultSet();
                result.first();
                            
                tx_nombre.setText(result.getString("nombre"));
                tx_nss.setText(result.getString("nss"));
                tx_rfc.setText(result.getString("rfc"));
                tx_dom.setText(result.getString("domicilio"));
                tx_tel.setText(result.getString("telefono"));
                tx_usuario.setText(result.getString("usuario"));
                
                salvar.setEnabled(true);
                eliminar.setEnabled(true);
                btn_guardar.setEnabled(false);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se encontro un registro con este identificador","No encontrado",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tx_idInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tx_idInputMethodTextChanged

    }//GEN-LAST:event_tx_idInputMethodTextChanged

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        try {
            PreparedStatement statement = rawConnection.prepareStatement(""
                    + "UPDATE jefes_de_seguridad "
                    + " SET "
                    + " nombre = ? ,"
                    + " nss = ? ,"
                    + " rfc = ? ,"
                    + " domicilio = ? ,"
                    + " telefono = ? ,"
                    + " usuario = ? "
                    + " WHERE id_jefe = ? ");
            //NOMBRE
            statement.setString(1,tx_nombre.getText());
            //NSS
            statement.setString(2,tx_nss.getText());
            //RFC
            statement.setString(3,tx_rfc.getText());
            //DOMICILIO
            statement.setString(4,tx_dom.getText());
            //TELEFONO
            statement.setString(5,tx_tel.getText());
            //USUARIO
            statement.setString(6,tx_usuario.getText());
            //CONTRASENA
            statement.setString(7,tx_id.getText());
            
            if(statement.executeUpdate()==1){
                JOptionPane.showMessageDialog(this,"Se ha actualizado la informacion", "Informacion Actualizada",JOptionPane.INFORMATION_MESSAGE);
                limpiarFormulario();
                salvar.setEnabled(false);
                btn_buscar.setEnabled(false);
                eliminar.setEnabled(false);
                btn_guardar.setEnabled(true);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"No puede eliminar este registro","La accion no se completo",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(JefeDeSeguridadForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        
        int n = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar este registro","Advertencia", JOptionPane.NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
            try {
                PreparedStatement statement = rawConnection.prepareStatement("DELETE FROM jefes_de_seguridad WHERE id_jefe = ? ");
                statement.setString(1,tx_id.getText());
                
                if(statement.executeUpdate()==1){
                    JOptionPane.showMessageDialog(this,"Se ha eliminado el registro","Operacion completada", JOptionPane.INFORMATION_MESSAGE);
                    limpiarFormulario();
                    btn_guardar.setEnabled(true);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(JefeDeSeguridadForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BienvenidaAdministracion().setVisible(true);
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PreLogin().setVisible(true);
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JefeDeSeguridadView().setVisible(true);                    
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed
   
    public void limpiarFormulario(){  
        tx_nombre.setText("");
        tx_nss.setText("");
        tx_rfc.setText("");
        tx_dom.setText("");
        tx_tel.setText("");
        tx_usuario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField pwd_user;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField tx_dom;
    private javax.swing.JTextField tx_id;
    private javax.swing.JTextField tx_nombre;
    private javax.swing.JTextField tx_nss;
    private javax.swing.JTextField tx_rfc;
    private javax.swing.JTextField tx_tel;
    private javax.swing.JTextField tx_usuario;
    // End of variables declaration//GEN-END:variables
}


