/*
 * Esta en la clase Transferencia que se crea para hacer todos los algoritmos necesarios para disminuir el saldo del usuario
 * que realizó dicha transferencia y aumentar el saldo de la cuenta a la que se realizó la transferencia
*/
package fontbanc;

public class Tranferencia {
    private long from;
    private long to;
    private double cantidad;

    
    public Tranferencia(long from, long to, double cantidad) {
        this.from = from;
        this.to = to;
        this.cantidad = cantidad;
    }
    
    public void transferir(){
        double saldoFrom, saldoTo;
        int numeroUsuarioFrom = 0, numeroUsuarioTo = 0;
        
        //ESTE FOR BUSCA LOS NUMEROS DE USUARIOS DE LA CUENTA from Y DE LA CUENTA to, PARA ASI PODER ACCEDER LUEGO A SUS
        //SALDOS Y PODER MODIFICARLOS 
        for(int i=0; i<InterfazRegistro.usuarios.size(); i++){          
                
                if(from == InterfazRegistro.usuarios.get(i).getCuenta()){
                    numeroUsuarioFrom = i;
                }
                if(to == InterfazRegistro.usuarios.get(i).getCuenta()){
                    numeroUsuarioTo = i;
                }       
        }
        
        //SE OBTIENEN LOS SALDOS DISPONIBLES DE LAS DOS CUENTAS from Y to
        saldoFrom = InterfazRegistro.usuarios.get(numeroUsuarioFrom).getSaldo();
        saldoTo = InterfazRegistro.usuarios.get(numeroUsuarioTo).getSaldo();
        
        //SE MODIFICAN LOS SALDOS CON LA RESPECTIVA CANTIDAD QUE SE TRANSFIRIÓ
        InterfazRegistro.usuarios.get(numeroUsuarioFrom).setSaldo(saldoFrom - cantidad);
        InterfazRegistro.usuarios.get(numeroUsuarioTo).setSaldo(saldoTo + cantidad);
        
        InterfazPrincipal principal = new InterfazPrincipal();
        principal.setVisible(true);
    }
}
