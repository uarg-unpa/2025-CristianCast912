package trabajosP.tp4;
import java.util.Scanner;

public class Testejercicio4CircularContar {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);    
        ejercicio4CircularContar cola = new ejercicio4CircularContar();
        int opcion = 0;
        do {
            System.out.println("1. Encolar elemento");
            System.out.println("2. Desencolar elemento");
            System.out.println("3. Contar elementos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    if (!cola.estaLlena()) {
                        System.out.print("Ingrese el elemento a encolar: ");
                        int elem = sn.nextInt();
                        cola.encolar(elem);
                    } else {
                        System.out.println("La cola esta llena.");
                    }
                    break;
                case 2:
                    if (!cola.estaVacia()) {
                        int desencolado = cola.desencolar();
                        System.out.println("Elemento desencolado: " + desencolado);
                    } else {
                        System.out.println("La cola esta vacia.");
                    }
                    break;
                case 3:
                    int cantidad = cola.contar();
                    System.out.println("Cantidad de elementos en la cola: " + cantidad);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
        sn.close();
    }    
}
