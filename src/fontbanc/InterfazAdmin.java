/*
 * Esta en la InterfazAdmin la cual aun no tiene contraseña para poder ingresar, esta al alcance de todos los usuarios. En esta
 * interfaz se muestran todos los usuarios que estan registrados en el software, con su nombre, apellido, numero de cuenta, 
 * contraseña y el saldo disponible en su cuenta.
 *
 * Es una interfaz de administración, por eso nu nombre.
*/
package fontbanc;

import javax.swing.ImageIcon;

public class InterfazAdmin extends javax.swing.JFrame {

    
    //-------------------------------CONSTRUCTOR-------------------------------
    public InterfazAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("images/money.png")).getImage());
        
        //--------CREACIÓN DEL CODIGO QUE SE VA A MOSTRAR EN EL TEXTAREA--------
        String texto = "";
        for (int i = 0; i < InterfazRegistro.usuarios.size(); i++) {
            if(i==0)
                texto = "\n";
            
            texto = texto + ("» " + InterfazRegistro.usuarios.get(i).getNombre() + " " + InterfazRegistro.usuarios.get(i).getApellido() + 
                             "\n  " + InterfazRegistro.usuarios.get(i).getCuenta() + "  PASS: '" + InterfazRegistro.usuarios.get(i).getPassword() + "'" +
                             "\n  SALDO: " + InterfazRegistro.usuarios.get(i).getSaldo() + " $\n\n");
            
            textAreaUsuarios.setText(texto);
        }
    }


    
    
    
    //-----------------------------CÓDIGO GENERADO-----------------------------
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaUsuarios = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(57, 62, 70));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaUsuarios.setEditable(false);
        textAreaUsuarios.setBackground(new java.awt.Color(231, 230, 230));
        textAreaUsuarios.setColumns(20);
        textAreaUsuarios.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        textAreaUsuarios.setRows(5);
        textAreaUsuarios.setBorder(null);
        textAreaUsuarios.setFocusable(false);
        jScrollPane1.setViewportView(textAreaUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 52, 244, 270));

        jPanel1.setBackground(new java.awt.Color(57, 62, 70));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Banco de Usuarios");

        botonSalir.setBackground(new java.awt.Color(34, 40, 49));
        botonSalir.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(240, 240, 240));
        botonSalir.setText("Salir");
        botonSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setFocusPainted(false);
        botonSalir.setPreferredSize(new java.awt.Dimension(53, 29));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontbanc/images/FontBanc-blanco-peque.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //---------------------------FIN CÓDIGO GENERADO---------------------------
    
    
    
    
    
    //--------------------------EVENTOS DE LOS BOTONES--------------------------
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        if(evt.getSource() == botonSalir){
            InterfazInicio inicio = new InterfazInicio();
            inicio.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonSalirActionPerformed
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
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdmin().setVisible(true);
            }
        });
    }
    //-------------------------FIN MAIN DE LA INTERFAZ-------------------------
    
    
    
    
    
    //-----------DECLARACIÓN DE TODOS LOS COMPONENTES DE LA INTERFAZ------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaUsuarios;
    // End of variables declaration//GEN-END:variables
    //---------FIN DECLARACIÓN DE TODOS LOS COMPONENTES DE LA INTERFAZ----------
}