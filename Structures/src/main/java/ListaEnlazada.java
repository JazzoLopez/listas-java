import javax.swing.JOptionPane;

public class ListaEnlazada {
    public static void main(String[] args) {
        lista lsl = new lista();

        int e, op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                            "Selecciona:\n1. Agregar al inicio\n2. Agregar al final\n3. Eliminar al inicio \n4. Eliminar al final \n5. Eliminar nodo especifico \n6. Mostrar lista \n7. Mostrar elemento especifico \n 8.Salir"));

            switch (op) {
                case 1:
                    e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato"));
                    lsl.insertarInicio(e);
                    break;
                case 2:
                    e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato"));
                    lsl.insertarFinal(e);
                    break;
                case 3:
                    lsl.eliminarInicio(); // Elimina automáticamente si el valor del elemento coincide
                    break;
                case 4:
                    lsl.eliminarFinal();
                    break;
                case 5:
                    lsl.imprimirLista();
                    System.out.println("Escribe el numero que deseas eliminar");
                    e = Integer.parseInt(JOptionPane.showInputDialog("busca y escribe cual eliminaras")); 
                    lsl.eliminarEspecifico(e);
                    break;
                case 6:
                   lsl.imprimirLista();

                break;
                case 7:
                lsl.imprimirLista();
                System.out.println("Comprueba si lo que ingresas existe jeje :)");
                  e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato"));
                    lsl.encontrarElemento(e);
                    
                break;
                case 8:
                    JOptionPane.showMessageDialog(null,"Nos vemos pronto","Adios",2);
                break;
                default:
                break;
            }
        } while (op != 8);
    }
}