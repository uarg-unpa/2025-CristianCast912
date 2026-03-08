package trabajosP.tp1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("ingresa un valor A: ");
        int A = scanner.nextInt();

        System.out.println("ingresa un valor B: " );
        int B = scanner.nextInt();

        System.out.println("ingresa un valor C:" );
        int C = scanner.nextInt();

        int Suma = A + B + C ;
        int Producto = A * B * C ;

        System.out.println("el valor de la suma es=" + Suma);
        System.out.println("el valor del producto es=" + Producto);

        scanner.close();

    }
}
