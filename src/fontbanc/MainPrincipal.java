    /*
     * Software simple para banco, con posibilidad de depositar, retirar y transferir entre cuentas.
     * Capacidad para mas de 200.000 usuarios.
     * Interfaz de administrador donde se visualizan todos los usuarios registrados.
     * 
     * Elaborado por Carlos Fontes
     * carlos.fontes.99@gmail.com
     * @carlosfontest 
     * 24-12-2017
    */

    /*
     * Este es el main principal aquí comienza todo el programa, se crea un nuevo objeto de tipo InterfazInicio para que el programa
     * empiece en la interfaz de inicio.
     *
     * Posteriormente creé 4 usuarios predefinidos para poder trabajar con ellos sin tener que registrarlos en el programa a cada rato
     * y así hacer mas comodo el proceso      
     */ 
package fontbanc;

import static fontbanc.InterfazRegistro.usuarios;

public class MainPrincipal {
    
    public MainPrincipal(){
        InterfazInicio inicio = new InterfazInicio();
        inicio.setVisible(true);
        
            Usuario user = new Usuario("Carlos", "Fontes", 12, "Masculino", "1", 200, usuarios.size() );           
            usuarios.add(user);
            Usuario user2 = new Usuario("Pepa", "Salgado", 12, "Femenino", "2",150, usuarios.size() );           
            usuarios.add(user2);
            Usuario user3 = new Usuario("Jose", "Guillén", 12, "Masculino", "3", 120, usuarios.size() );           
            usuarios.add(user3);
            Usuario user4 = new Usuario("Juan", "Andrades", 12, "Masculino", "4", 100, usuarios.size() );           
            usuarios.add(user4);
            
            /*
             * Este codigo es para que al principio se muestre la cuenta y la contraseña de los 4 usuarios creados anteriormente
             * System.out.println(user.getCuenta() + " " + user.getPassword());
             * System.out.println(user2.getCuenta() + " " + user2.getPassword());
             * System.out.println(user3.getCuenta() + " " + user3.getPassword());
             * System.out.println(user4.getCuenta() + " " + user4.getPassword());
            */
    }
  
    public static void main(String[] args) {
        MainPrincipal main = new MainPrincipal();
            
    }
    
}
