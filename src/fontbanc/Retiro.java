/*
 * Esta en la clase Retiro que se crea para hacer todos los algoritmos necesarios para disminuir el saldo del usuario
 * que realizó dicho retiro a su cuenta
*/
package fontbanc;

public class Retiro {
    private int from;
    private double cantidad;

    
    public Retiro(int from, double cantidad) {
        this.from = from;
        this.cantidad = cantidad;
    }
    
    public void retirar(){
        double saldo;
        saldo = InterfazRegistro.usuarios.get(from).getSaldo();
        //SE OBTIENE EL SALDO DISPONIBLE Y SE LE RESTA LA CANTIDAD A RETIRAR
        InterfazRegistro.usuarios.get(from).setSaldo(saldo - cantidad);
        
        InterfazPrincipal principal = new InterfazPrincipal();
        principal.setVisible(true);
 
    }
    
    
    
}
