/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.admin;

import com.mysql.jdbc.StringUtils;
import helpers.SourceJForm;
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
public class PropiedadesOficinaForm extends SourceJForm {
    
    Connection rw;
    Properties props;

    /**
     * Creates new form JefeDeSeguridadForm
     */
    public PropiedadesOficinaForm() throws ClassNotFoundException, Exception {        
        super();
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        PreparedStatement st = rawConnection.prepareStatement("SELECT nombre FROM fraccionamientos");
        ResultSet rs = st.executeQuery();
        rs.first();
        
        while(rs.next()){
            cbx_fraccionamientos.addItem(rs.getString("nombre"));
        }
        
        st = rawConnection.prepareStatement("SELECT nombre FROM propietarios");
        rs = st.executeQuery();
        rs.first();
        
        while(rs.next()){
            cbx_propietarios.addItem(rs.getString("nombre"));
        }
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tx_numport = new javax.swing.JTextField();
        tx_planta = new javax.swing.JTextField();
        tx_letra = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tx_id = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cbx_fraccionamientos = new javax.swing.JComboBox<>();
        chek_recide = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        cbx_propietarios = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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

        jLabel1.setText("Numero de Portal:");

        jLabel2.setText("Planta:");

        jLabel3.setText("Letra:");

        jLabel5.setText("Propietario:");

        tx_numport.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tx_planta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tx_letra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/004-floppy-disk.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

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

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Vivienda");
        jRadioButton1.setEnabled(false);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Oficina");
        jRadioButton2.setEnabled(false);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Comercio");
        jRadioButton3.setEnabled(false);

        jLabel4.setText("Tipo de Propiedad:");

        chek_recide.setText("El propietario recide en la propiedad");

        jLabel6.setText("Fraccionamiento:");

        cbx_propietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_propietariosActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/32/001-back.png"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Propiedades - Oficina");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/64/003-home.png"))); // NOI18N

        jMenu1.setText("Opciones");

        jMenuItem4.setText("Pantalla Principal");
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
                        .addGap(195, 195, 195)
                        .addComponent(jRadioButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jRadioButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addComponent(jButton3)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tx_numport, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                .addComponent(tx_planta)
                                .addComponent(tx_letra)
                                .addComponent(tx_id)
                                .addComponent(cbx_fraccionamientos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbx_propietarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chek_recide)))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tx_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tx_numport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tx_planta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tx_letra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_fraccionamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_propietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chek_recide)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(salvar)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(btn_guardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        try {
        
            PreparedStatement statement = rawConnection.prepareStatement(""
                    + "INSERT INTO jefes_de_seguridad values(?,?,?,?,?,?,?,?,?)");
            statement.setString(1,null);
            //NOMBRE
            statement.setString(2,tx_numport.getText());
            //NSS
            statement.setString(3,tx_planta.getText());
            //RFC
            statement.setString(4,tx_letra.getText());
            //DOMICILIO
            statement.setString(5,"OFICINA");
            //TELEFONO
            statement.setString(6,null);
            //USUARIO
            statement.setBoolean(7,chek_recide.isSelected());
            
//CONTRASENA
            statement.setString(8,obtenerId(cbx_fraccionamientos.getItemAt(cbx_fraccionamientos.getSelectedIndex())));
            statement.setString(9,obtenerPropietarioId(cbx_propietarios.getItemAt(cbx_propietarios.getSelectedIndex())));
            
            int result = statement.executeUpdate();
            if(result==1){
                JOptionPane.showMessageDialog(this,"Se ha guardado el registro","Operacion completada", JOptionPane.INFORMATION_MESSAGE);
                limpiarFormulario();
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(PropiedadesOficinaForm.class.getName()).log(Level.SEVERE, null, ex);
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

    private void tx_idInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tx_idInputMethodTextChanged

    }//GEN-LAST:event_tx_idInputMethodTextChanged

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        try {
            PreparedStatement statement = rawConnection.prepareStatement(""
                    + "UPDATE propiedades "
                    + " SET "
                    + " numero_portal = ? ,"
                    + " planta   = ? ,"
                    + " letra = ? ,"
                    + " propietario_recide = ? ,"
                    + " fraccionamiento_id = ? ,"
                    + " propietario_id = ? ,"
                    + " WHERE id_propiedad = ? ");
            //NOMBRE
            statement.setString(1,tx_numport.getText());
            //NSS
            statement.setString(2,tx_planta.getText());
            //RFC
            statement.setString(3,tx_letra.getText());
            
            statement.setBoolean(4,chek_recide.isSelected());
            
            statement.setString(5,obtenerId(cbx_fraccionamientos.getItemAt(cbx_fraccionamientos.getSelectedIndex())));
            statement.setString(6,obtenerPropietarioId(cbx_propietarios.getItemAt(cbx_propietarios.getSelectedIndex())));
            
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
            Logger.getLogger(PropiedadesOficinaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        
        int n = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar este registro","Advertencia", JOptionPane.NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
            try {
                    PreparedStatement statement = rawConnection.prepareStatement("DELETE FROM propiedades WHERE id_propiedad = ? ");
                statement.setString(1,tx_id.getText());
                
                if(statement.executeUpdate()==1){
                    JOptionPane.showMessageDialog(this,"Se ha eliminado el registro","Operacion completada", JOptionPane.INFORMATION_MESSAGE);
                    limpiarFormulario();
                    btn_guardar.setEnabled(true);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(PropiedadesOficinaForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BienvenidaAdministracion().setVisible(true);
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(PropiedadesOficinaForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbx_propietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_propietariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_propietariosActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            PreparedStatement st = rawConnection.prepareStatement(""
                    + "SELECT propiedades.*,"
                    + "fraccionamientos.nombre as fraccionamiento,"
                    + "propietarios.nombre as propietario "
                    + " FROM propiedades, propietarios, fraccionamientos "
                    + "WHERE id_propiedad = ?"
                    + "AND propiedades.fraccionamiento_id = fraccionamientos.id  "
                    + "AND propiedades.propietario_id = propietarios.id_propietario");
            st.setInt(1, Integer.parseInt(tx_id.getText()));

            if(st.execute()){
                ResultSet result = st.getResultSet();
                result.first();

                tx_numport.setText(result.getString("numero_portal"));
                tx_planta.setText(result.getString("planta"));
                tx_letra.setText(result.getString("letra"));
                
                cbx_fraccionamientos.setSelectedItem(result.getString("fraccionamiento"));
                cbx_propietarios.setSelectedItem(result.getString("propietario"));
                
                

                salvar.setEnabled(true);
                eliminar.setEnabled(true);
                btn_guardar.setEnabled(false);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se encontro un registro con este identificador","No encontrado",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed
   
    public void limpiarFormulario(){  
        tx_numport.setText("");
        tx_planta.setText("");
        tx_letra.setText("");
    }
    
            
        private String obtenerPropietarioId(String itemAt) {
        try {
            PreparedStatement st = rawConnection.prepareStatement(""
                    + "select id_propietario from propietarios where nombre = ? ");
            st.setString(1, itemAt);
            ResultSet s = st.executeQuery();
            s.first();
            return s.getString("id_propietario");
             
        } catch (SQLException ex) {
            Logger.getLogger(Fraccionamientos.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
        
            
        private String obtenerId(String itemAt) {
        try {
            PreparedStatement st = rawConnection.prepareStatement(""
                    + "select id from fraccionamientos where nombre = ? ");
            st.setString(1, itemAt);
            ResultSet s = st.executeQuery();
            s.first();
            return s.getString("id");
             
        } catch (SQLException ex) {
            Logger.getLogger(Fraccionamientos.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_fraccionamientos;
    private javax.swing.JComboBox<String> cbx_propietarios;
    private javax.swing.JCheckBox chek_recide;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField tx_id;
    private javax.swing.JTextField tx_letra;
    private javax.swing.JTextField tx_numport;
    private javax.swing.JTextField tx_planta;
    // End of variables declaration//GEN-END:variables
}


