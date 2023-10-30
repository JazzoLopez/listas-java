import javax.swing.JOptionPane;

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
            System.out.print(recorrido.dni +"  |  "+ recorrido.name + "  |  " + recorrido.lastname + "  -->  ");
            recorrido = recorrido.direccion;
        }
    }
    public void encontrarElemento(int dni) {
        Nodo recorrido = inicio;
        int contador = 1;
        while (recorrido != null) {
            if (recorrido.dni == dni) {
               
                JOptionPane.showMessageDialog(null, "Los datos del dni "+ recorrido.dni+" Son: \n"+"DNI: "+recorrido.dni +"\n"+"Nombre: "+recorrido.name +"\n"+"Apellidos: "+ recorrido.lastname+"\nSu posicion en la lista enlazada es: "+contador,"Datos",3);
                break;
            } else {
                contador++;
                recorrido = recorrido.direccion;
            }
        }
        if (recorrido == null) {
            JOptionPane.showMessageDialog(null, "El usuario no existe","Error",2);
        }

    }
    
}
