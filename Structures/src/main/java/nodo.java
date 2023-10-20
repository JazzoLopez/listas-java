
public class nodo {

    public int dato; //El cuerpo

    public nodo direccion; //Hacia donde va

    public nodo(int d) {  //Constructor
        this.dato = d;
        this.direccion = null;  //La direccion siempre inicia en null
    }

    public nodo(int d, nodo n) {
        this.dato = d;  //*su identificador es d */
        this.direccion = n; //*Su identificador es n */
    }
    
}