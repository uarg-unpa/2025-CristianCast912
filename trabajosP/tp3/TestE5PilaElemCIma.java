package trabajosP.tp3;

import java.util.Scanner;

public class TestE5PilaElemCIma {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        E5PilaElemCima pila = new E5PilaElemCima();
        int opcion = 0;
        do {
            System.out.println("1. meter elemento");
            System.out.println("2. sacar elemento");
            System.out.println("3. Ver elemento cima");
            System.out.println("4. Salir");
            System.out.println("Elija una opcion");
            opcion = sn.nextInt();
            sn.nextLine();

            switch (opcion) {
                case 1:
                    if (!pila.estaLlena()){
                        System.out.println("ingrese el numero a meter");
                        int num = sn.nextInt();
                        sn.nextLine();
                        pila.meter(num);
                    } else {
                        System.out.println("la pila esta llena");
                    }
                    break;
                case 2: 
                    if (!pila.estaVacia()){
                        int sacado = pila.sacar();
                        System.out.println("el elemento sacado es " + sacado);
                    } else {
                        System.out.println("la pila esta vacia");
                    }
                    break;
                case 3:
                    if (!pila.estaVacia()){
                        int cima = pila.elementoCima();
                        System.out.println("el elemento cima es " + cima);
                    } else {
                        System.out.println("la pila esta vacia");
                    }
                    break;
                case 4:
                    System.out.println("saliendo...");
                    break;
                }
        } while (opcion != 4);
         sn.close();
    }
}
