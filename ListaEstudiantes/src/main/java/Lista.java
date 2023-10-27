class Nodo{
    int dni;
    String name, lastname;
    Nodo direccion;
    
    public Nodo (int dni, String name, String lastname){
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.direccion = null;
    }
}


public class Lista {
    private Nodo inicio, fin;
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    public boolean vacia() {
        return inicio == null;
    }
    
    public void insertarInicio (int dni, String name, String lastname){
        Nodo nuevoNodo = new Nodo(dni, name, lastname);
        nuevoNodo.direccion = inicio;
        inicio = nuevoNodo;
        if(fin == null){
            fin = inicio;
        }
    }
    
    public void imprimirLista(){
        Nodo recorrido = inicio;
        while (recorrido != null){
            System.out.print(recorrido.dni +"\n"+ recorrido.name + "\n" + recorrido.lastname + "-->");
            recorrido = recorrido.direccion;
        }
    }
    
}
