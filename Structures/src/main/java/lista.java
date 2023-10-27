class nodo {
    int dato;
    nodo direccion;

    public nodo(int dato) {
        this.dato = dato;
        this.direccion = null;
    }
}

public class lista {
    private nodo inicio, fin;

    public lista() {
        inicio = null;
        fin = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void insertarInicio(int e) {
        nodo nuevoNodo = new nodo(e);
        nuevoNodo.direccion = inicio;
        inicio = nuevoNodo;
        if (fin == null) {
            fin = inicio;
        }
    }

    public int eliminarInicio() {
        if (inicio == null) {
            return -1; // Lista vacía
        }
        int valorEliminado = inicio.dato;
        inicio = inicio.direccion;
        if (inicio == null) {
            fin = null;
        }
        return valorEliminado;
    }

    public int eliminarFinal() {
        if (inicio == null) {
            return -1; // Lista vacía
        }
        int valorEliminado = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            nodo recorrer = inicio;
            while (recorrer.direccion != fin) {
                recorrer = recorrer.direccion;
            }
            fin = recorrer;
            fin.direccion = null;
        }
        return valorEliminado;
    }

    // * */
    public int eliminarEspecifico(int e) {
        if (!vacia()) {
            if (inicio == fin && e == inicio.dato) {
                inicio = fin = null;
            } else if (e == inicio.dato) {
                inicio = inicio.direccion;
            } else {
                nodo anterior = inicio;
                nodo temporal = inicio.direccion;

                while (temporal != null && temporal.dato != e) {
                    anterior = anterior.direccion;
                    temporal = temporal.direccion;

                }
                if (temporal != null) {
                    anterior.direccion = temporal.direccion;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
        }

        return e;
    }// * */

    public boolean listaVacia() {
        return inicio == null;
    }

    public void insertarFinal(int e) {
        nodo nuevoNodo = new nodo(e);
        if (inicio == null) {
            inicio = fin = nuevoNodo;
        } else {
            fin.direccion = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    public void imprimirLista() {
        nodo recorrido = inicio;
        while (recorrido != null) {
            System.out.print("[" + recorrido.dato + "] --> ");
            recorrido = recorrido.direccion;
        }
        System.out.println();
    }

    public void encontrarElemento(int e) {
        nodo recorrido = inicio;
        int contador = 1;
        while (recorrido != null) {
            if (recorrido.dato == e) {
                System.out.println("El elemento " + e + " se encuentra en la posicion: " + contador);
                break;
            } else {
                contador++;
                recorrido = recorrido.direccion;
            }
        }
        if (recorrido == null) {
            System.out.println("No existe el elemento");
        }

    }
}
