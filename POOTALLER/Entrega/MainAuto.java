package POOTALLER.Entrega;

import java.util.Scanner;

public class MainAuto {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Estacionamiento e = new Estacionamiento(10);
        int opcion = 0;
        do {
        System.out.println("1. Agregar auto");
        System.out.println("2. Eliminar auto");
        System.out.println("3. Buscar auto");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = sn.nextInt();
                switch(opcion) {
                        case 1:
                        System.out.print("Ingrese la patente del auto: ");
                        String patente = sn.next();
                        if (!e.buscarAuto(patente)) {
                        System.out.print("Ingrese la hora de ingreso del auto: ");
                        int horaIngreso = sn.nextInt();
                        sn.nextLine();
                        Auto a = new Auto(patente, horaIngreso, 0);
                        e.agregarAuto(a, horaIngreso);
                        System.out.println("Auto agregado al estacionamiento.");
                        } else {
                        System.out.println("El auto ya esta en el estacionamiento.");
                        }
                        break;
                        case 2:
                        System.out.print("Ingrese la patente del auto: ");
                        patente = sn.next();
                        if (e.buscarAuto(patente)) {
                        System.out.print("Ingrese la hora de salida del auto: ");
                        int horaSalida = sn.nextInt();
                        sn.nextLine();
                        int valorPagar = e.calcularValor(e.buscarHoraEntrada(patente), horaSalida);
                        System.out.println("Valor a pagar de el auto " + patente + " es de: $" + valorPagar);
                        e.sacarAuto(patente, horaSalida);
                        System.out.println("Auto sacado del estacionamiento.");
                        } else {
                        System.out.println("El auto no esta en el estacionamiento.");
                        }
                        break;
                        case 3:
                        System.out.print("Ingrese la patente del auto: ");
                        patente = sn.next();
                        if (e.buscarAuto(patente)) {
                        System.out.println("El auto esta en el estacionamiento.");
                        } else {
                        System.out.println("El auto no esta en el estacionamiento.");
                        }
                        break;
                        case 4:
                        System.out.println("Saliendo del programa.");
                        break;
                        default:
                        System.out.println("Opcion no valida.");
                        break;
                        }
                        } while (opcion != 4);
                        sn.close();
                        }
                        }