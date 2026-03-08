package ejenClase.COLA;
import java.util.Scanner;

public class MainColaCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCaracter cola = new ColaCaracter();
        int opcion;
        char comando;

        do {
            System.out.println("\n--- MENÚ COLA DE COMANDOS ---");
            System.out.println("1. Encolar comando");
            System.out.println("2. Desencolar comando");
            System.out.println("3. Mostrar frente (peek)");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Estado de la cola");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (!cola.estaLlena()) {
                        System.out.print("Ingrese un comando (char): ");
                        comando = sc.next().charAt(0);
                        cola.encolar(comando);
                    } else {
                        System.out.println("La cola está llena.");
                    }
                    break;
                case 2:
                  if (!cola.estaVacia()){
                    char desencolada = cola.desencolar();
                    System.out.println("tarea desencolada" + desencolada);
                  } else {
                    System.out.println("error: la cola esta vacia. no es posible desencolar");
                  }
                    break;
                case 3:
                    char frente = cola.peek();
                    if (frente != '\0') {
                        System.out.println("Frente de la cola: " + frente);
                    }
                    break;
                case 4:
                    cola.mostrar();
                    System.out.println("estos comandos se agreagaron" + cola.mostrar()) ;
                    break;
                case 5:
                    System.out.println("¿la  Cola esta vacía? " + cola.estaVacia());
                    System.out.println("¿la Cola  esta llena? " + cola.estaLlena());
                    break;
                case 0:
                    System.out.println("cerrando...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
        sc.close();
    }
}
