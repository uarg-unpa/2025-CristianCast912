package tp1;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresar valor de NRO1");
        int NRO1 = scanner.nextInt();

        System.out.println("ingresar valor de NRO2");
        int NRO2 = scanner.nextInt();

        System.out.println("ingresa valor de NRO3");
        int NRO3 = scanner.nextInt();

        if ( NRO1 > NRO2 && NRO1 > NRO3){
            System.out.println("el mayor es NRO1 =" + NRO1);}
        else{ 
            if ( NRO2 > NRO1 && NRO2 > NRO3) {
                System.out.println(" el mayor es NRO2 = "+ NRO2);}
            else {
                System.out.println(" el mayo es NRO3 = " + NRO3);}    
        }
        scanner.close();
    }
}
