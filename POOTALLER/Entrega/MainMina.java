package POOTALLER.Entrega;

import java.util.Scanner;

public class MainMina {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Inventario i = new Inventario(10);
        int opcion = 0;
        do {
        System.out.println("1. Agregar mina");
        System.out.println("2. Mostrar el inventario completo");
        System.out.println("3. Mostrar las minas de una persona");
        System.out.println("4. Mostrar las minas activas");
        System.out.println("5. Mostrar las minas con menos del 30% extraido");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = sn.nextInt();
                switch(opcion) {
                        case 1:

                            System.out.print("Ingrese el nombre de la mina: ");
                            String nombre = sn.nextLine();
                        
                            System.out.print("Ingrese el propietario de la mina: ");
                            String propietario = sn.nextLine();

                            System.out.print("Ingrese el mineral que se extrae de la mina: ");
                            String mineral = sn.nextLine();

                            System.out.print("Ingrese la fecha de apertura de la mina: ");
                            String fechaApertura = sn.nextLine();

                            System.out.print("Ingrese la fecha de cierre de la mina: ");
                            String fechaCierre = sn.nextLine();

                            System.out.print("Ingrese las reservas estimadas de la mina (en toneladas): ");
                            int reservas = sn.nextInt();
                            sn.nextLine();

                            System.out.print("Ingrese las reservas extraídas de la mina (en toneladas): ");
                            int reservasExtraidas = sn.nextInt();
                            sn.nextLine();

                            System.out.print("ingrese la cantidad de pozos que forman la mina:");
                            int cantidadPozos = sn.nextInt();
                            sn.nextLine();

                            System.out.print("Ingrese la vida esperada de la mina (en años): ");
                            int vidaEsperada = sn.nextInt();
                            sn.nextLine();

                            System.out.print("ingrese el area de excavacion de la mina (en km2): ");
                            double areaExcavacion = sn.nextDouble();
                            sn.nextLine();

                            System.out.print("Ingrese la latitud de la ubicacion de la mina: ");
                            double latitud = sn.nextDouble();
                            sn.nextLine();

                            System.out.println("ingrese la longitud de la ubicacion de la mina:");
                            double longitud = sn.nextDouble();
                            sn.nextLine();

                            System.out.print("La mina esta activa? (true/false): ");
                            boolean estaActiva = sn.nextBoolean();
                            sn.nextLine();

                            Mina m = new Mina(nombre, propietario, mineral, fechaApertura, fechaCierre, reservas, reservasExtraidas, cantidadPozos, vidaEsperada, areaExcavacion, latitud, longitud, estaActiva);
                            i.agregarMina(m);
                            System.out.println("Mina agregada al inventario.");
                                                
                        break;

                        case 2:

                            System.out.println("la lista de minas es:");
                            i.inventarioCompleto();

                        break;

                        case 3:

                            System.out.print("Ingrese el nombre del propietario para listar sus minas: ");
                            String nombrePropietario = sn.next();
                            i.listMinasPersona(nombrePropietario);
                       
                        break;

                        case 4:

                            System.out.println("Minas en uso:");
                            i.listMinasEnUso();

                        break;

                        case 5:

                            System.out.print("Minas con menos del 30% extraido:");
                            i.listExtraido30();

                        break;

                        case 6:

                            System.out.println("Saliendo del programa.");

                        break;

                        default:

                            System.out.println("Opcion no valida.");

                        break;

                        }
        } while (opcion != 6);
        sn.close();
    }
}
    

