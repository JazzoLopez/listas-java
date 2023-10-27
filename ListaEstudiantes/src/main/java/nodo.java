public class Nodo {
    private int dato;
    public int dni;
    public String name;
    public String lastname;
    public Nodo direccion;

    public Nodo(int dni, String name, String lastname) {
        //CUERPO
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.direccion = null;

    }

    public Nodo(int dni, String name, String lastname, Nodo n) {
        this.dni = dni;  //*su identificador es d */
        this.name = name;
        this.lastname = lastname;
        this.direccion = n;
    }
}
