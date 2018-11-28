/*
 * Esta en la clase Deposito que se crea para hacer todos los algoritmos necesarios para aumentar el saldo del usuario
 * que realizó dicho deposito a su cuenta
*/
package fontbanc;

public class Deposito {
    private int from;
    private double cantidad;

    
    public Deposito(int from, double cantidad) {
        this.from = from;
        this.cantidad = cantidad;
    }
    
    public void depositar(){
        double saldo;
        saldo = InterfazRegistro.usuarios.get(from).getSaldo();
        //SE OBTIENE EL SALDO DISPONIBLE Y SE LE SUMA LA CANTIDAD A DEPOSITAR
        InterfazRegistro.usuarios.get(from).setSaldo(saldo + cantidad);
        
        InterfazPrincipal principal = new InterfazPrincipal();
        principal.setVisible(true);
    }
}
