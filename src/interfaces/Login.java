/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.admin.BienvenidaAdministracion;
import java.sql.Connection;
import javax.swing.JOptionPane;
import helpers.MysqlConnection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import helpers.Encriptador;
import helpers.SourceJForm;
import java.io.FileOutputStream;
import java.util.Arrays;
/**
 *
 * @author KoerHunt
 */
public class Login extends javax.swing.JFrame {
    
    /**
     * Creates new form Login
     */
    
    //Declaracion
    Encriptador crypt;
    
    //Escritor
    FileOutputStream propFileOutUsr;
    FileOutputStream propFileOutPwd;
    
    //Archivo de credenciales
    private final String USER_DATA = "src/config/user_data.db";
    private final String PWD = "src/config/pass.db";
    
    public Login() throws Exception {
        initComponents();
        
        //Centrar formulario
        setLocationRelativeTo(null);
        
        //inicializar encriptador
        crypt = new Encriptador();
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
        jLabel3 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        tf_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Identificacion");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(280, 225));
        setName("login_frame"); // NOI18N
        setResizable(false);

        jLabel1.setText("Panel de adminsitracion");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");

        tf_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_passKeyPressed(evt);
            }
        });

        jButton1.setText("Acceder");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/64/014-shield.png"))); // NOI18N

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_user)
                            .addComponent(tf_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        acceder();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passKeyPressed
        if(evt.getKeyCode()==10){
            acceder();
        }
    }//GEN-LAST:event_tf_passKeyPressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField tf_pass;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables

    private void acceder() {
               
        //validate user and password presence
        if(tf_user.getText().equals("")){
            JOptionPane.showMessageDialog(
                    this,
                    "Favor de introducir un nombre de usuario",
                    "Informacion Incompleta",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        
        try {
            
            //Establish connection to the db
            Connection cn = new MysqlConnection(tf_user.getText(),tf_pass.getText()).conectar();
            
            //Save the credentials
            byte[] pwfcifrada = crypt.cifra(tf_pass.getText());
            
            //En este punto la conexion y los datos son correctos
            String out = "db.user="+tf_user.getText()+"\n";
            
            //save user
            propFileOutUsr = new FileOutputStream(USER_DATA);
            propFileOutUsr.write(out.getBytes("UTF-8"));
            propFileOutUsr.close();
            
            //save password
            propFileOutPwd = new FileOutputStream(PWD);
            propFileOutPwd.write(pwfcifrada);
            propFileOutPwd.close();
            
            
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

            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            
            //Loger details for debug
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            
            //exception cause: wrong sintaxis or bad login credentials
            if(ex.getErrorCode()==1045||ex.getErrorCode()==1044){
                 JOptionPane.showMessageDialog(
                    this, 
                    "Los datos de acceso proporcionados no son validos", 
                    "Informacion Incorrecta", 
                    JOptionPane.ERROR_MESSAGE
                );
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
