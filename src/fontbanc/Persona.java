    /*
     * Esta en la clase Persona, la cual es una clase abstracta la cual me servirá porque la otra clase Usuario hereda de esta
     * clase el nombre, apellido, edad y el sexo.
     */ 

package fontbanc;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String sexo;

    //CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }    
}
