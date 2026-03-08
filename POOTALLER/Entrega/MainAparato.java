package POOTALLER.Entrega;

import java.util.Scanner;

public class MainAparato {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        Clinica c = new Clinica(10);
        int opcion = 0;
        do {
        System.out.println("1. Agregar aparato");
        System.out.println("2. Mostrar aparatos en uso");
        System.out.println("3. Mostrar total de aparatos");
        System.out.println("4. Mostrar aparatos por año de compra");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = sn.nextInt();
        sn.nextLine();
                switch(opcion) {
                    case 1:
                        
                        System.out.print("Ingrese la funcion del aparato: ");
                        String funcion = sn.nextLine();

                        System.out.print("Ingrese la marca del aparato: ");
                        String marca = sn.nextLine();

                        System.out.print("Ingrese el año de compra del aparato: ");
                        String añoCompra = sn.nextLine();

                        System.out.print("Ingrese si esta en uso (true/false): ");
                        boolean enUso = sn.nextBoolean();
                        sn.nextLine();

                        Aparato a = new Aparato(funcion, marca, enUso, añoCompra);
                        c.agregarAparato(a);
                        System.out.println("Aparato agregado a la clinica.");

                        break;

                    case 2:

                        System.out.println("Aparatos en uso:");
                        c.listAparatosUso();

                        break;

                    case 3:

                        System.out.println("Total de aparatos: " + c.totalAparatos());

                        break;

                    case 4:

                        System.out.print("Ingrese el año de compra a buscar: ");
                        String añoBuscado = sn.nextLine();
                        c.listAparatosA(añoBuscado);

                        break;

                    case 5:
                        System.out.println("Saliendo del programa.");
                        break;

                    default:
                        System.out.println("Opcion no valida.");
                        break;
                        
                        }
                        
        }while (opcion != 5);
        sn.close();

    }

}
