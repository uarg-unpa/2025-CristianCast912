package trabajosP.tp4;
import java.util.Scanner;

public class TestEjercicio5 {
    public static void main ( String args[]){
        Scanner sc = new Scanner(System.in);
        ejercicio5 cola = new ejercicio5();
        int opcion = 0;
        do {
            System.out.println("1. Encolar elemento");
            System.out.println("2. Desencolar elemento");
            System.out.println("3. Mostrar frente");
            System.out.println("4. Eliminar repetidos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (!cola.estaLlena()) {
                        System.out.print("Ingrese el elemento a encolar: ");
                        int elem = sc.nextInt();
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
                    if (!cola.estaVacia()) {
                        int frente = cola.mostrar();
                        System.out.println("Elemento en el frente: " + frente);
                    } else {
                        System.out.println("La cola esta vacia.");
                    }
                    break;
                case 4:
                    cola.eliminarRepetidos();
                    System.out.println("Elementos repetidos eliminados.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 5);
        sc.close();
    }    
}
