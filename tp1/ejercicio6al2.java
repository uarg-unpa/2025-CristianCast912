package tp1;

import java.util.Scanner;
public class ejercicio6al2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int prod = 1, suma= 0, cont = 1, Num;

        while (cont <= 3); {
            Num = scanner.nextInt();
            suma= suma + Num ;
            prod= prod * Num ;
            cont= cont + 1 ;
        }
        System.out.println("el valor de la suma es=" + suma);
        System.out.println("el valor del producto es=" + prod);

        scanner.close();
    }
}
