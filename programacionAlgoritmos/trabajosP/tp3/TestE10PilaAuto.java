package trabajosP.tp3;

import java.util.Scanner;

public class TestE10PilaAuto {
    public static void main (String [] args) {
    Scanner sn = new Scanner(System.in);
    E10PilaAuto pila = new E10PilaAuto();
    int opcion = 0; 
        do {
            System.out.println("bienvenido al menu de la pila de autos");
            System.out.println("1. Agregar auto");
            System.out.println("2. Buscar auto por patente");
            System.out.println("3. Salir");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1: 
                    System.out.println("ingrese la patente");
                    int patente = sn.nextInt();
                    sn.nextLine();
                    System.out.println("ingrese la marca");
                    String marca = sn.nextLine();
                    System.out.println("ingrese el modelo");
                    String modelo = sn.nextLine();
                    System.out.println("ingrese el año");
                    int año = sn.nextInt();
                    sn.nextLine();
                    Auto auto = new Auto(patente, marca, modelo, año);
                    pila.meter(auto);
                    System.out.println("su auto fue agregado correctamente a la pila");
                    break;
                case 2:
                    System.out.println("ingrese la patente a buscar");
                    int patBuscar = sn.nextInt();
                    sn.nextLine();
                    Auto autoEncontrado = pila.buscarpatente(patBuscar);
                    if (autoEncontrado != null){
                        System.out.println("auto encontrado: " + autoEncontrado.toString());
                    } else {
                        System.out.println("auto no encontrado en la pila");
                    }
                    break;
                case 3:
                    System.out.println("saliendo...");
                    break;
            }
    } while (opcion != 3);
    sn.close();
}
} 

