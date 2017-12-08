/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.jefe_seguridad;

import interfaces.admin.*;
import helpers.SourceJForm;
import interfaces.Login;
import interfaces.PreLogin;
import interfaces.admin.BienvenidaAdministracion;
import interfaces.jefe_seguridad.BienvenidaJefe;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author PaulxD27
 */
public class PropietarioForm extends SourceJForm{

    /**
     * Creates new form Fraccionamientos
     */
    public PropietarioForm() throws ClassNotFoundException, Exception {        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tx_id = new javax.swing.JTextField();
        tx_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tx_apellidos = new javax.swing.JTextField();
        tx_direcc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tx_telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cuenta_bancaria = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fraccionamientos");

        jLabel1.setText("Identificador:");

        jLabel2.setText("Nombre:");

        tx_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_idKeyPressed(evt);
            }
        });

        jLabel3.setText("Apillidos:");

        jLabel4.setText("Direccion:");

        jLabel5.setText("Telefono:");

        jLabel6.setText("Cuenta Bancaria:");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/021-search.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setEnabled(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/004-floppy-disk.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/64/018-certificate.png"))); // NOI18N

        jLabel11.setText("Propietarios");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/001-back.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/001-office-material.png"))); // NOI18N
        jButton1.setText("Registros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu2.setText("Opciones");

        jMenuItem5.setText("Pantalla Principal");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator1);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edicion");

        jMenuItem1.setText("Limpiar Formulario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tx_apellidos)
                            .addComponent(tx_direcc)
                            .addComponent(tx_id)
                            .addComponent(tx_nombre)
                            .addComponent(tx_telefono)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10))
                            .addComponent(cuenta_bancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tx_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tx_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tx_direcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tx_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cuenta_bancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(jButton1))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            
            PreparedStatement st = rawConnection.prepareStatement(""
                    + "SELECT * "
                    + "FROM propietarios"
                    + " WHERE id_propietario = ?");
            
            st.setInt(1, Integer.parseInt(tx_id.getText()));

            if(st.execute()){
                ResultSet result = st.getResultSet();
                result.first();
                tx_id.setText(result.getString("id_propietario"));
                tx_nombre.setText(result.getString("nombre"));
                tx_apellidos.setText(result.getString("apellidos"));
                tx_direcc.setText(result.getString("direccion"));
                tx_telefono.setText(result.getString("telefono_contacto"));
                cuenta_bancaria.setText(result.getString("cuenta_bancaria"));              
                
                btn_guardar.setEnabled(false);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PropietarioForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se encontro un registro con este identificador","No encontrado",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        
        try {

            PreparedStatement statement = rawConnection.prepareStatement(""
                    + "INSERT INTO propietarios values(?,?,?,?,?,?,?,?,?)");
            statement.setString(1,null);
            //CODIGO
            statement.setString(2,tx_nombre.getText());
            //NOMBRE
            statement.setString(3,tx_apellidos.getText());
            //UBICACION
            statement.setString(4,tx_direcc.getText());
            //CODIGO POSTAL
            statement.setString(5,tx_telefono.getText());
            //LOCALIDAD
            statement.setString(6,"");
            //CIUDAD
            statement.setString(7,"");
            //ESTADO
            statement.setString(8,"");
            
            statement.setString(9,cuenta_bancaria.getText());
            

            int result = statement.executeUpdate();
            if(result==1){
                JOptionPane.showMessageDialog(this,"Se ha guardado el registro","Operacion completada", JOptionPane.INFORMATION_MESSAGE);
                limpiarFormulario();
            }

        } catch (SQLException ex) {
            Logger.getLogger(PropietarioForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void tx_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_idKeyPressed

        btn_buscar.setEnabled(true);
    }//GEN-LAST:event_tx_idKeyPressed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
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
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BienvenidaJefe().setVisible(true);
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PropietariosView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

     public void limpiarFormulario(){  
        tx_nombre.setText("");
        tx_apellidos.setText("");
        tx_direcc.setText("");
        tx_telefono.setText("");
        cuenta_bancaria.setText("");
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField cuenta_bancaria;
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField tx_apellidos;
    private javax.swing.JTextField tx_direcc;
    private javax.swing.JTextField tx_id;
    private javax.swing.JTextField tx_nombre;
    private javax.swing.JTextField tx_telefono;
    // End of variables declaration//GEN-END:variables

    private String obtenerId(String itemAt) {
        try {
            PreparedStatement st = rawConnection.prepareStatement("select id_jefe from jefes_de_seguridad where nombre = ? ");
            st.setString(1, itemAt);
            ResultSet s = st.executeQuery();
            s.first();
            return s.getString("id_jefe");
             
        } catch (SQLException ex) {
            Logger.getLogger(PropietarioForm.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
    
}