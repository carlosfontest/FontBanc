/*
 * Esta es la InterfazPrincipal, aqui se van a ver las posibles transacciones que usuario puede hacer, se van a desarrollar todas las
 * mismas y se llamaran a los metodos de las clases: Deposito, Retiro y Transferencia.
*/
package fontbanc;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InterfazPrincipal extends javax.swing.JFrame {    

    
    //-------------------------------CONSTRUCTOR-------------------------------
    public InterfazPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("images/money.png")).getImage());
    }

    
    
    
    
    //-----------------------------CÓDIGO GENERADO-----------------------------
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        botonCambiarPassword = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonRetiro = new javax.swing.JButton();
        botonTransferencia = new javax.swing.JButton();
        botonDeposito = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Bienvenido Sr/a " + InterfazRegistro.usuarios.get(InterfazInicio.numUsuario).nombre
        );
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 320, 25));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Su saldo disponible es");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 17, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText(  InterfazRegistro.usuarios.get(InterfazInicio.numUsuario).getSaldo() + " $"
        );
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 43, -1, -1));

        botonSalir.setBackground(new java.awt.Color(34, 40, 49));
        botonSalir.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(240, 240, 240));
        botonSalir.setText("Salir");
        botonSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonSalir.setFocusPainted(false);
        botonSalir.setPreferredSize(new java.awt.Dimension(53, 29));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 226, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 79, 100, 10));

        botonCambiarPassword.setBackground(new java.awt.Color(34, 40, 49));
        botonCambiarPassword.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonCambiarPassword.setForeground(new java.awt.Color(240, 240, 240));
        botonCambiarPassword.setText("Cambiar contraseña");
        botonCambiarPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonCambiarPassword.setFocusPainted(false);
        botonCambiarPassword.setPreferredSize(new java.awt.Dimension(129, 29));
        botonCambiarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(botonCambiarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 226, 158, -1));

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));

        jSeparator2.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator2.setForeground(new java.awt.Color(240, 240, 240));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("N° Cuenta: " + InterfazRegistro.usuarios.get(InterfazInicio.numUsuario).getCuenta()
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(557, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        jPanel2.setBackground(new java.awt.Color(89, 199, 198));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fontbanc/images/FontBanc-gris-peque.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel6.setText("Tus intereses, nuestra prioridad.");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabel7.setText("FontBanc © | Todos los derechos reservados. ");

        botonRetiro.setBackground(new java.awt.Color(34, 40, 49));
        botonRetiro.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonRetiro.setForeground(new java.awt.Color(240, 240, 240));
        botonRetiro.setText("Retiro");
        botonRetiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonRetiro.setFocusPainted(false);
        botonRetiro.setPreferredSize(new java.awt.Dimension(99, 29));
        botonRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetiroActionPerformed(evt);
            }
        });

        botonTransferencia.setBackground(new java.awt.Color(34, 40, 49));
        botonTransferencia.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonTransferencia.setForeground(new java.awt.Color(240, 240, 240));
        botonTransferencia.setText("Transferencia");
        botonTransferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonTransferencia.setFocusPainted(false);
        botonTransferencia.setPreferredSize(new java.awt.Dimension(99, 29));
        botonTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTransferenciaActionPerformed(evt);
            }
        });

        botonDeposito.setBackground(new java.awt.Color(34, 40, 49));
        botonDeposito.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        botonDeposito.setForeground(new java.awt.Color(240, 240, 240));
        botonDeposito.setText("Deposito");
        botonDeposito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        botonDeposito.setFocusPainted(false);
        botonDeposito.setPreferredSize(new java.awt.Dimension(99, 29));
        botonDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDepositoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(jLabel5))
                .addGap(149, 149, 149))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(botonDeposito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(botonTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 650, 170));

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
   
    private void botonDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDepositoActionPerformed
        if(evt.getSource() == botonDeposito){
            this.setAlwaysOnTop(false);
            double cantidad;            
            cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto quiere depositar en la cuenta"));
            
            
            Deposito deposito = new Deposito(InterfazInicio.numUsuario, cantidad);
            deposito.depositar();
            this.setVisible(false);  
        }
    }//GEN-LAST:event_botonDepositoActionPerformed
  
    private void botonTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTransferenciaActionPerformed
        if(evt.getSource() == botonTransferencia){
            //AQUI SE HACEN TODOS LOS ALGORITMOS PARA SABER DE QUIEN (cuenta), A QUIEN (cuenta) Y DE CUANTA CANTIDAD DE DINERO EN LA
            //TRANSFERENCIA
            
            this.setAlwaysOnTop(false);
            double cantidad = 0;
            long to;                 
                    
            to = Long.parseLong(JOptionPane.showInputDialog("A quien desea transferir?"));
            
            int cont=0;
            int num=-1;
            
            //EN ESTE FOR SE BUSCA CUAL ES EL USUARIO A QUIEN SE LE VA A TRANSFERIR
            for(int i=0; i<InterfazRegistro.usuarios.size(); i++){
                
                //SE VERIFICA QUE LA CUENTA A QUIEN SE DESA TRANSFERIR EXISTA
                if(to == InterfazRegistro.usuarios.get(i).getCuenta()){
                    num=0;
                    cantidad = Double.parseDouble(JOptionPane.showInputDialog("!Cuenta existente¡" + "\nCuanto desea transferir?"));
                    
                    //SE VERIFICA QUE EL USUARIO PUEDA TRANSFERIR ESA CANTIDAD DE DINERO
                    if(cantidad > InterfazRegistro.usuarios.get(InterfazInicio.numUsuario).getSaldo()){
                        JOptionPane.showMessageDialog(null, "No puede transferir eso. \nEl monto sobrepasa su saldo", "Atención" , JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                
                //ALGORITMO PARA DECIRLE AL USUARIO QUE LA CUENTA A LA QUE QUIERE TRANFERIR NO EXISTE
                if( cont == ((InterfazRegistro.usuarios.size()) -1) && num == -1 ){
                    JOptionPane.showMessageDialog(null, "La cuenta que seleccionó no existe", "Atención" , JOptionPane.WARNING_MESSAGE);
                    return;
                }
                cont++;
            }
            
            //SI LA CANTIDAD ES DISTINTA DE CERO, QUIERE DECIR QUE LA CUENTA A QUIEN SE LE VA A TRANSFERIR EXISTE
            //DEBIDO A QUE LO PEDIMOS DENTRO DEL PRIMER IF QUE PRECISAMENTE VERIFICA QUE LA CUENTA to EXISTA.
            //
            //LUEGO SE ENVIAN LOS DATOS A UN NUEVO OBJETO DE LA CLASE TRANSFERENCIA
            if(cantidad != 0){
            Tranferencia transfer = new Tranferencia(InterfazRegistro.usuarios.get(InterfazInicio.numUsuario).getCuenta(), to, cantidad);
            transfer.transferir();
            this.setVisible(false);
            }
        }
    }//GEN-LAST:event_botonTransferenciaActionPerformed
  
    private void botonRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetiroActionPerformed
        if(evt.getSource() == botonRetiro){
            this.setAlwaysOnTop(false);
            double cantidad;
            
            cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto quiere retirar de la cuenta"));
            while(cantidad > InterfazRegistro.usuarios.get(InterfazInicio.numUsuario).getSaldo()){
                JOptionPane.showMessageDialog(null, "El saldo a retirar tiene que ser menor o igual al saldo disponible", "!GiAlerta¡", JOptionPane.WARNING_MESSAGE);
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto quiere retirar de la cuenta"));
            }
            
            Retiro retiro = new Retiro(InterfazInicio.numUsuario, cantidad);
            retiro.retirar();
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonRetiroActionPerformed

    private void botonCambiarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPasswordActionPerformed
        if(evt.getSource() == botonCambiarPassword){
            String nuevaContra;
            int resp;
            nuevaContra = String.valueOf(JOptionPane.showInputDialog("Ingrese su nueva contraseña"));
            
            resp = JOptionPane.showConfirmDialog(null, ("Esta seguro que desea cambiar su contraseña?\nDe: "+ 
                                          InterfazRegistro.usuarios.get(InterfazInicio.numUsuario).getPassword() +
                                          "\nA: " + nuevaContra) );
            
            if(resp == 0){
                InterfazRegistro.usuarios.get(InterfazInicio.numUsuario).setPassword(nuevaContra);
            }
            if(resp == 1){
                JOptionPane.showMessageDialog(null, "Su contraseña seguirá siendo: " + InterfazRegistro.usuarios.get(InterfazInicio.numUsuario).getPassword());
            }
            
            System.out.println(InterfazRegistro.usuarios.get(3).getCuenta() + " " + InterfazRegistro.usuarios.get(3).getPassword());
        }
    }//GEN-LAST:event_botonCambiarPasswordActionPerformed
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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }
    //-------------------------FIN MAIN DE LA INTERFAZ-------------------------
    
    
    
    
    
    //-----------DECLARACIÓN DE TODOS LOS COMPONENTES DE LA INTERFAZ------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiarPassword;
    private javax.swing.JButton botonDeposito;
    private javax.swing.JButton botonRetiro;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonTransferencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    //---------FIN DECLARACIÓN DE TODOS LOS COMPONENTES DE LA INTERFAZ----------
}
