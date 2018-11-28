    /*
     * Esta es la clase Usuario, la clase mas importante del programa, todos los usuarios creados son objetos de esta clase
     * los cuales tienen una cuenta banacaria que se las da el software con un algoritmo que esta en InterfazRegistro el cual
     * dependiendo del numero de usuario que sea le da un numero mas de cuenta, la primera cuenta es 11110001, la segunda es 
     * 11110002 y asi sucesivamente, también tienen una contraseña que la ingresan en el momento de registrarse, un saldo inicial
     * que al igual que la contraseña la ingresan al registrarse.
     *
     * Hacemos los getters y setters los cuales se usarán mucho en todo el programa.
     *
     */ 

package fontbanc;

public class Usuario extends Persona {
    private String password;
    private long cuenta;
    private double saldo;
    private int numeroUsuario;

    //-------------------------------CONSTRUCTOR-------------------------------
    public Usuario (String nombre, String apellido, int edad, String sexo, String password, double saldo, int numeroUsuario) {
        super(nombre, apellido, edad, sexo);
        
        this.numeroUsuario = numeroUsuario;
        this.password = password;
        this.cuenta = 11110001 + numeroUsuario;
        this.saldo = saldo;
    }

    //----------------------------GETTERS Y SETTERS----------------------------
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
}
