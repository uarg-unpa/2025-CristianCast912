package trabajosP.tp1;

import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("ingrese valor de A: ");
        int A = scanner.nextInt();

        System.out.println("ingresa valor de B:");
        int B = scanner.nextInt();

        System.out.println("ingresa valor de C: ");
        int C = scanner.nextInt() ;
        
        System.out.println("originalmente: A =" + A + " B = " + B + "C = " + C );

        int aux = C;
        B = A ;
        C = A ;
        A = aux ;

        System.out.println(" luego del cambio: A =" + A + "B = " + B + "C =" + C);
        
        scanner.close();
    }
}