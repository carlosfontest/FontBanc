/*
 * Esta es la InterfazRegistro en la cual entran todos los nuevos usuarios para registrarse. En esta interfaz hay algo muy importante
 * del programa, el ArrayList de usuarios, en la cual se almacenaran todos los usuarios del software, para luego buscarlos cuando sea
 * necesario
*/

package fontbanc;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InterfazRegistro extends javax.swing.JFrame {
    //--------------------CREACIÓN DEL ARRAY LIST "usuarios"--------------------
    static public ArrayList<Usuario> usuarios = new ArrayList<Usuario>(); 

    
    //-------------------------------CONSTRUCTOR-------------------------------
    public InterfazRegistro() {
        initComponents();       
        this.setBounds(0, 0, 350, 450);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(false);
        setIconImage(new ImageIcon(getClass().getResource("images/money.png")).getImage());
    }

    
    
    
    //-----------------------------CÓDIGO GENERADO-----------------------------
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JTextField();
        textFieldApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textFieldSaldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        comboEdad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        botonAtras = new javax.swing.JButton();
        registro = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Iniciar Sesion");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Iniciar Sesion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, 25));

        jPanel1.setBackground(new java.awt.Color(57, 62, 70));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 50)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Registro");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Nombre");

        textFieldNombre.setBackground(new java.awt.Color(57, 62, 70));
        textFieldNombre.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        textFieldNombre.setForeground(new java.awt.Color(240, 240, 240));
        textFieldNombre.setBorder(null);
        textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Password");

        textFieldPassword.setBackground(new java.awt.Color(57, 62, 70));
        textFieldPassword.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        textFieldPassword.setForeground(new java.awt.Color(240, 240, 240));
        textFieldPassword.setBorder(null);
        textFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPasswordActionPerformed(evt);
            }
        });

        textFieldApellido.setBackground(new java.awt.Color(57, 62, 70));
        textFieldApellido.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        textFieldApellido.setForeground(new java.awt.Color(240, 240, 240));
        textFieldApellido.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Apellido");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontbanc/images/FontBanc-blanco-peque.png"))); // NOI18N

        textFieldSaldo.setBackground(new java.awt.Color(57, 62, 70));
        textFieldSaldo.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        textFieldSaldo.setForeground(new java.awt.Color(240, 240, 240));
        textFieldSaldo.setText("100.0");
        textFieldSaldo.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Saldo inicial");

        comboEdad.setBackground(new java.awt.Color(204, 204, 204));
        comboEdad.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        comboEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80" }));
        comboEdad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Sexo");

        comboSexo.setBackground(new java.awt.Color(204, 204, 204));
        comboSexo.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        comboSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboSexo.setInheritsPopupMenu(true);
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });

        botonAtras.setBackground(new java.awt.Color(34, 40, 49));
        botonAtras.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(240, 240, 240));
        botonAtras.setText("Atras");
        botonAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonAtras.setFocusPainted(false);
        botonAtras.setPreferredSize(new java.awt.Dimension(59, 29));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        registro.setBackground(new java.awt.Color(34, 40, 49));
        registro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        registro.setForeground(new java.awt.Color(240, 240, 240));
        registro.setText("Registrarme");
        registro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        registro.setFocusPainted(false);
        registro.setPreferredSize(new java.awt.Dimension(91, 29));
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(comboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(textFieldApellido)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator3)
                                    .addComponent(textFieldPassword)
                                    .addComponent(jLabel6)
                                    .addComponent(jSeparator4)
                                    .addComponent(textFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //---------------------------FIN CÓDIGO GENERADO---------------------------
    
    
    
    
    
    //--------------------------EVENTOS DE LOS BOTONES--------------------------
    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
    }//GEN-LAST:event_comboSexoActionPerformed

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
              //REGISTRO DE LOS USUARIOS
        if(evt.getSource() == registro){                    
            String nombre, apellido, sexo, password, saldoTxt;
            int edad;
            double saldo;
                       
            nombre = textFieldNombre.getText().trim();
            apellido = textFieldApellido.getText().trim();
            edad = Integer.parseInt(comboEdad.getSelectedItem().toString());
            sexo = comboSexo.getSelectedItem().toString();
            password = textFieldPassword.getText();
            saldoTxt = textFieldSaldo.getText().trim();
            
            //EN ESTOS IF ANIDADOS SE VERIFICA QUE EL USUARIO INGRESE TODOS SUS DATOS EN EL FORMULARIO DE REGISTRO
            //PARA ASÍ NO TENER ERRORES EN EL REGISTRO DE LOS USUARIOS Y ASEGURARSE QUE TODOS PONGAN LA INFORMACIÓN
            //PEDIDA.
            if( nombre.equals("") ){
                JOptionPane.showMessageDialog(null, "Debe llenar todos los componentes");
            }
            else if( apellido.equals("") ){
                JOptionPane.showMessageDialog(null, "Debe llenar todos los componentes");
            }
            else if( sexo.equals("") ){
                JOptionPane.showMessageDialog(null, "Debe llenar todos los componentes");
            }           
            else if( password.equals("") ){
                JOptionPane.showMessageDialog(null, "Debe llenar todos los componentes");
            }
            else if( saldoTxt.equals("") ){
                JOptionPane.showMessageDialog(null, "Debe llenar todos los componentes");
            }
            else if(Double.parseDouble(saldoTxt) < 100){
                JOptionPane.showMessageDialog(null, "El saldo inicial debe ser mayor o igual a 100$");
            }
            else{
            //EN CASO DE QUE TODOS LOS CAMPOS ESTEN COMPLETOS SE PASA A CREAR U NUEVO USUARIO Y POSTERIORMENTE
            //AÑADIRLO EN EL ARRAYLIST usuarios, LUEGO DE AÑADIRLO EN EL ARRAYLIST SE PASA A LA INTERFAZ DE 
            //INICIO PARA QUE EL MISMO USUARIO O CUALQUIER OTRO PUEDA INGRESAR.
            saldo = Double.parseDouble(saldoTxt);
            
            Usuario user = new Usuario(nombre, apellido, edad, sexo, password, saldo, usuarios.size() ); 
            //SE AGREGA EL OBJETO "user" AL ARRAYLIST "usuarios"
            usuarios.add(user);  
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO.\n\nBienvenido " + user.nombre + "\nN°de cuenta: " + user.getCuenta());
            InterfazInicio inicio = new InterfazInicio(); 
            inicio.setVisible(true);
            this.setVisible(false);
            } 
        }
    }//GEN-LAST:event_registroActionPerformed

    private void textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreActionPerformed

    }//GEN-LAST:event_textFieldNombreActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        InterfazInicio inicio = new InterfazInicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void textFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPasswordActionPerformed
    //------------------------FIN EVENTOS DE LOS BOTONES------------------------
    
    
    
    
    
    //---------------------------MAIN DE LA INTERFAZ---------------------------
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistro().setVisible(true);
            }
        });
    }
    //-------------------------FIN MAIN DE LA INTERFAZ-------------------------
    
    
    
    
    
    //-----------DECLARACIÓN DE TODOS LOS COMPONENTES DE LA INTERFAZ------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JComboBox<String> comboEdad;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton registro;
    private javax.swing.JTextField textFieldApellido;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldSaldo;
    // End of variables declaration//GEN-END:variables
    //---------FIN DECLARACIÓN DE TODOS LOS COMPONENTES DE LA INTERFAZ----------
}
