
/*
Jazzi
 */
public class lista {

    protected nodo inicio, fin; //Solo dentro del mismo paquete

    public lista() {
        inicio = null; //*Apuntan a  null */
        fin = null; //*Apunta a null */
    }

    public boolean vacia() {
        if (inicio == null) //*si apunta a null es verdadero */
            return true;
         else 
            return false;
        

    }

    public void insertarInicio(int e) {
        inicio = new nodo (e, inicio);  //*Entonnces insertamos en el inicio, creamos el objeto inicio */
        if (fin == null) { //*Si fin es null, fin ahora es inicio */
            fin = inicio;
        }
        
        

    }

    public boolean listaVacia(){
        if(inicio == null){
            return true;
        }
        else{
            return false;
        }
    }


    public void insertarFinal(int e){
        if (!listaVacia()){
            fin.direccion = new nodo(e);
            
        }
        else{
            inicio = fin = new nodo (e);
        }
    }
     public void inprimirLista(){ 
            nodo recorrido = inicio; //*Creamos un nodo y le asignamos el valor de inicio */
            System.out.println(" ");  
            System.out.flush(); 
           
            while (recorrido != null){ //*;Mientras el recorrido no sea null imprimimos lo que contenga */
                
            System.out.print(" [ "+recorrido.dato+" ] -->");
                recorrido = recorrido.direccion;
                
            }
            
        }
     
}
