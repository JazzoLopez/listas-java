import javax.swing.JOptionPane;

public class ListaEnlazada {
    public static void main(String[] args) {
        lista lsl = new lista();

        int e, op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Selecciona:\n1. Agregar al inicio\n2. Agregar al final\n3. Eliminar al inicio \n 4. Mostrar \n4. Salir"));

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
                    lsl.eliminarInicioSiCoincide(); // Elimina automáticamente si el valor del elemento coincide
                    break;
                case 4:
                    lsl.inprimirLista();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Nos vemos pronto", "Adiós", 2);
                    break;
                default:
                    break;
            }
        } while (op != 5);
    }
}
