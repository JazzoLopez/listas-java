import javax.swing.JOptionPane;


public class ListaEstudiantes {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Lista lsl = new Lista();
        int dni, op;
        String name, lastname;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Selecciona \n1. Agregar al inicio. \n2. Agregar al final. \n3. Eliminar inicio \n4. Eliminar final \n5. Eliminar especifico \n6. Mostrar \n7. Mostrar datos epecifico \n8. Salir "));
               
            switch (op){

                case 1:

                    dni =  Integer.parseInt(JOptionPane.showInputDialog("Intorduce tu dni"));
                    name = JOptionPane.showInputDialog("Ingresa el nombre");
                    lastname =  JOptionPane.showInputDialog("Ingresa los apellidos");
                    lsl.insertarInicio(dni, name, lastname);

                break;

                case 2:

                    lsl.imprimirLista();

                break;
                
                case 3:

                    lsl.imprimirLista();

                break;

                case 4:

                    lsl.imprimirLista();

                break;
                
                case 5:

                lsl.imprimirLista();

                break;

                case 6:

                lsl.imprimirLista();

                break;

                case 7:

                dni = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dni para buscar"));
                lsl.encontrarElemento(dni);
            
                break;

                case 8:

                JOptionPane.showMessageDialog(null, "Nos vemos pronto","Adios",1);

                break;

                default:

                break;
            }
         
        }while(op != 8);
    }
}
