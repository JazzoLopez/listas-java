
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author jazzi
 */
public class ListaEnlazada {

    public static void main(String[] args) {

        lista lsl = new lista();

        int op, e;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "selecciona \n 1. Agregar al inicio \n 2. Agregar al final \n 3. Mostrar \n 4.Salir"));

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
                    lsl.inprimirLista();

                    break;
                case 4:

                    JOptionPane.showMessageDialog(null, "Nos vemos pronto", "Adios", 2);
                    break;

                default:

                    break;
            }
        } while (op != 4);
    }
}
