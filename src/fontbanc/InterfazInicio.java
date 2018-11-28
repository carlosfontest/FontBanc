/*
 * Esta es la InterfazInicio, esta interfaz es la primera que se ejecuta, la cual da opción de iniciar sesión a los usuarios
 * que ya estan registrados u poseen un número de cuenta. También da opción a poder registrarse y a acceder a la InterfazAdmin
 * la cual se explicará en el codigo de la misma.
 *
 * En esta interfa se crea una variable importante para el software, la cual es "numUsuario", esta variable le da la informacion a
 * InterfazPrincipal de cual es el usuario que ingreso, le da el numero de usuario, con el cual se puede buscar en el arrayList
 * todas las caracteristicas que querramos de dicho usuario que inicio sesión.
*/
package fontbanc;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InterfazInicio extends javax.swing.JFrame {
    //-------------------CREACIÓN DE LA VARIABLE "numUsuario"-------------------
    public static int numUsuario;

    
    //-------------------------------CONSTRUCTOR-------------------------------
    public InterfazInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(false);
        setIconImage(new ImageIcon(getClass().getResource("images/money.png")).getImage());
    }


    
    
    
    //-----------------------------CÓDIGO GENERADO-----------------------------
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonAcerca = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonInicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        botonAdmin = new javax.swing.JButton();
        textFieldCuenta = new javax.swing.JTextField();
        textFieldPassword = new javax.swing.JPasswordField();
        botonRegistro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(34, 40, 49));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(89, 199, 198));

        jSeparator1.setBackground(new java.awt.Color(57, 62, 70));
        jSeparator1.setForeground(new java.awt.Color(57, 62, 70));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabel5.setText("FontBanc © | Todos los derechos reservados. ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontbanc/images/dollar.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontbanc/images/FontBanc-gris-peque.png"))); // NOI18N

        botonAcerca.setBackground(new java.awt.Color(34, 40, 49));
        botonAcerca.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonAcerca.setForeground(new java.awt.Color(240, 240, 240));
        botonAcerca.setText("Acerca de FontBanc");
        botonAcerca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonAcerca.setFocusPainted(false);
        botonAcerca.setPreferredSize(new java.awt.Dimension(161, 29));
        botonAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcercaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(botonAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 420));

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Iniciar Sesion");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("¡Aun no soy miembro!");

        botonInicio.setBackground(new java.awt.Color(34, 40, 49));
        botonInicio.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonInicio.setForeground(new java.awt.Color(240, 240, 240));
        botonInicio.setText("Inicio");
        botonInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicio.setFocusable(false);
        botonInicio.setPreferredSize(new java.awt.Dimension(57, 29));
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("CONTRASEÑA");

        botonAdmin.setBackground(new java.awt.Color(34, 40, 49));
        botonAdmin.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonAdmin.setForeground(new java.awt.Color(240, 240, 240));
        botonAdmin.setText("Acceso Admin");
        botonAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAdmin.setFocusPainted(false);
        botonAdmin.setPreferredSize(new java.awt.Dimension(100, 29));
        botonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdminActionPerformed(evt);
            }
        });

        textFieldCuenta.setBackground(new java.awt.Color(57, 62, 70));
        textFieldCuenta.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        textFieldCuenta.setForeground(new java.awt.Color(240, 240, 240));
        textFieldCuenta.setText("Ingrese su numero de cuenta");
        textFieldCuenta.setToolTipText("");
        textFieldCuenta.setBorder(null);
        textFieldCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldCuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldCuentaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldCuentaFocusLost(evt);
            }
        });
        textFieldCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldCuentaMouseClicked(evt);
            }
        });
        textFieldCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCuentaActionPerformed(evt);
            }
        });

        textFieldPassword.setBackground(new java.awt.Color(57, 62, 70));
        textFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textFieldPassword.setForeground(new java.awt.Color(240, 240, 240));
        textFieldPassword.setText("Ingrese su contraseña");
        textFieldPassword.setBorder(null);
        textFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldPasswordFocusLost(evt);
            }
        });
        textFieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldPasswordMouseClicked(evt);
            }
        });
        textFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPasswordActionPerformed(evt);
            }
        });

        botonRegistro.setBackground(new java.awt.Color(34, 40, 49));
        botonRegistro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(240, 240, 240));
        botonRegistro.setText("Registro nuevo");
        botonRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistro.setFocusable(false);
        botonRegistro.setPreferredSize(new java.awt.Dimension(105, 29));
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("NUMERO DE CUENTA");

        jSeparator4.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator4.setForeground(new java.awt.Color(240, 240, 240));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontbanc/images/icono-contraseña.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontbanc/images/icono-cuenta.png"))); // NOI18N

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(240, 240, 240));
        jTextPane2.setFont(new java.awt.Font("Calibri Light", 0, 10)); // NOI18N
        jTextPane2.setText("Las cuentas empiezan desde la\n\"11110001\" hasta que la cantidad\nde usuarios que se registren. Ejm:\n11110001 - 11110002- 11110003");
        jTextPane2.setAutoscrolls(false);
        jTextPane2.setFocusable(false);
        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(textFieldCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(botonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textFieldCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 360, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //---------------------------FIN CÓDIGO GENERADO---------------------------
    
    
    
    
    
    //--------------------------EVENTOS DE LOS BOTONES--------------------------
    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        if(evt.getSource() == botonRegistro){
            this.setAlwaysOnTop(false);
            InterfazRegistro registro = new InterfazRegistro();
            registro.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void textFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPasswordActionPerformed

    }//GEN-LAST:event_textFieldPasswordActionPerformed

    private void textFieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldPasswordMouseClicked

    }//GEN-LAST:event_textFieldPasswordMouseClicked

    private void textFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPasswordFocusLost

    }//GEN-LAST:event_textFieldPasswordFocusLost

    private void textFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPasswordFocusGained
        textFieldPassword.setText("");
    }//GEN-LAST:event_textFieldPasswordFocusGained

    private void textFieldCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCuentaActionPerformed

    }//GEN-LAST:event_textFieldCuentaActionPerformed

    private void textFieldCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldCuentaMouseClicked

    }//GEN-LAST:event_textFieldCuentaMouseClicked

    private void textFieldCuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCuentaFocusLost

    }//GEN-LAST:event_textFieldCuentaFocusLost

    private void textFieldCuentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCuentaFocusGained
        textFieldCuenta.setText("");
    }//GEN-LAST:event_textFieldCuentaFocusGained

    private void botonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdminActionPerformed
        InterfazAdmin admin = new InterfazAdmin();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAdminActionPerformed

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        if(evt.getSource() == botonInicio){
            //----------------ALGORITMO PARA EL INICIO DE SESIÓN----------------
            int cuenta = 0, cont=0;
            String pass;


            //VERIFICA QUE SE HAYA INGRESADO ALGO EN LOS TEXTFIELDS DE CUENTA Y PASSWORD
            do{
                if(textFieldCuenta.getText().equals("Ingrese su numero de cuenta") && textFieldPassword.getText().equals("Ingrese su contraseña")){
                    JOptionPane.showMessageDialog(null, "Debe ingresar su numero de cuenta y contraseña");
                }
            }while( (textFieldPassword.getText().equals("Ingrese su contraseña") || textFieldCuenta.getText().equals("Ingrese su numero de cuenta")) && (evt.getSource() != botonInicio) );

            
            if(textFieldCuenta.getText().equals("Ingrese su numero de cuenta") == false || textFieldPassword.getText().equals("Ingrese su contraseña") == false){
            try{
            cuenta = Integer.parseInt(textFieldCuenta.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "En la casilla de cuenta debe ingresar un numero");}
            }
            
            
            
            pass = textFieldPassword.getText();

            //EN ESTE FOR SE BUSCA CUAL ES EL USUARIOS QUE ESTA INGRESANDO, USANDO LA VARIABLE "numUsuario" COMO
            //BANDERA PARA VERIFICAR SI EN ALGUN MOMENTO ENTRO EN EL PRIMER IF.
            //
            //EL FOR RECORRE TODO EL ARRAYLIST DE usuarios Y VERIFICA SI ALGUNAS DE LAS CUENTAS DE LOS USUARIOS
            //YA REGISTRADOS ES IGUAL A LA CUENTA QUE SE ESTA INGRESANDO, SI ES ASÍ, ENTRA EN EL PRIMER IF Y 
            //SE BUSCA CUAL ES EL NUMERO DE ESE USUARIO EN EL ARRAY, CAMBIANDO EL VALOR DE 2"numUsuario" DE -1
            //A LA POSICIÓN EN EL ARRAY DEL USUARIO.
            //
            //TAMBIÉN SE VERIFICA SI LA CUENTA INGRESADA NO ES IGUAL A NINGUNA DE LAS CUENTAS EN LOS USUARIOS
            //DE ESE SER EL CASO SE SABE QUE LA CUENTA QUE SE INGRESÓ NO EXISTE Y SE LE DA A CONOCER ESO AL USUARIO
            //DE IGUAL MANERA SI LA CUENTA EXISTE PERO LA CONTRASEÑA ES INCORRECTA TAMBIÉN SE LE DA ESA INFORMACIÓN
            //AL USUARIO.
            //
            //EN CASO DE QUE LA CUENTA Y LA CONTRASEÑA SEAN CORRECTAS, SE ENTRA A LA INTERFAZ PRINCIPAL DE ESE USUARIO.
            numUsuario = -1;
            for(int i=0; i<InterfazRegistro.usuarios.size(); i++){

                if(cuenta == InterfazRegistro.usuarios.get(i).getCuenta()){
                    numUsuario = i;

                    if( pass.equals(InterfazRegistro.usuarios.get(numUsuario).getPassword()) ){
                        InterfazPrincipal principal = new InterfazPrincipal();
                        principal.setVisible(true);
                        this.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                        textFieldPassword.setText("");
                    }
                }

                if( cont == ((InterfazRegistro.usuarios.size()) -1) && numUsuario == -1 && cuenta !=0){
                    JOptionPane.showMessageDialog(null, "Cuenta no existente");
                    textFieldCuenta.setText("");
                    textFieldPassword.setText("");
                }
                cont++;
            }
        }
    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcercaActionPerformed
        if(evt.getSource() == botonAcerca){
            JOptionPane.showMessageDialog(null, "El software de FontBanc ha sido creado por\n            Carlos Fontes el 24/12/2017"); 
            System.out.println(botonAcerca.toString());
        }
    }//GEN-LAST:event_botonAcercaActionPerformed
    //------------------------FIN EVENTOS DE LOS BOTONES------------------------
    
    
    
    
    
    //---------------------------MAIN DE LA INTERFAZ---------------------------
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInicio().setVisible(true);
            }
        });
    }
    //-------------------------FIN MAIN DE LA INTERFAZ-------------------------
    
    
    
    
    
    //-----------DECLARACIÓN DE TODOS LOS COMPONENTES DE LA INTERFAZ------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcerca;
    private javax.swing.JButton botonAdmin;
    public javax.swing.JButton botonInicio;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextField textFieldCuenta;
    private javax.swing.JPasswordField textFieldPassword;
    // End of variables declaration//GEN-END:variables
    //---------FIN DECLARACIÓN DE TODOS LOS COMPONENTES DE LA INTERFAZ----------
}
