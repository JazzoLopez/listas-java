public class lista {

    protected nodo inicio, fin; // Solo dentro del mismo paquete

    public lista() {
        inicio = null; //* Apuntan a null */
        fin = null; //* Apunta a null */
    }

    public boolean vacia() {
        return inicio == null; // Si apunta a null, la lista está vacía
    }

    public void insertarInicio(int e) {
        inicio = new nodo(e, inicio); // Insertar al inicio, crear el objeto inicio
        if (fin == null) {
            fin = inicio;
        }
    }

    public void insertarFinal(int e) {
        if (!vacia()) {
            fin.direccion = new nodo(e);
        } else {
            inicio = fin = new nodo(e);
        }
    } 

    public void eliminarInicioSiCoincide() {
        if (!vacia() && inicio.dato == inicio.dato) {
            inicio = inicio.direccion;
            if (inicio == null) {
                fin = null;
            }
        }
    }

    public void inprimirLista() {
        nodo recorrido = inicio;
        System.out.println(" ");
        System.out.flush();

        while (recorrido != null) {
            System.out.print(" [ " + recorrido.dato + " ] -->");
            recorrido = recorrido.direccion;
        }
    }
}
