package trabajosP.tp1;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("ingresar un dia de la semana (L, M, I, J, V, S, D):");
        char dia = scanner.next().toUpperCase().charAt(0);

        switch (dia){
            case 'M': 
            case 'I':
            case 'J':
                System.out.println("hoy tengo resolucion");
                break;
            case 'L':
            case 'V':
            case 'S':
            case 'D':
                System.out.println("hoy no tengo resolucion");
                break;
            default:
                System.out.println("no es un dia valido");
                break;
        }
        scanner.close();
    }
}
