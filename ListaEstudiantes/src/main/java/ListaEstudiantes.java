import javax.swing.JOptionPane;


public class ListaEstudiantes {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Lista lsl = new Lista();
        int dni, op;
        String name, lastname;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Selecciona \n1. Agregar al inicio \n2. mostrar"));
               
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
                default:
                   break;
            }
         
        }while(op != 3);
    }
}
