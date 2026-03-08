package trabajosP.tp3;

import java.util.Scanner;
public class Teste4PilaArreglo {
    public static void main (String args []) {
        Scanner sn = new Scanner (System.in);
        E4pilaArreglo pila = new E4pilaArreglo ();
        int opcion = 0;
        do {
            System.out.println("1. meter elemento");
            System.out.println("2. sacar elemento");
            System.out.println("3. Ver cantidad de elemntos");
            System.out.println("4. Salir");
            System.out.println("Elija una opcion");
            opcion = sn.nextInt();

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
                    System.out.println("la pila tiene " + pila.getCantidad());
                    System.out.println("a la pila le faltan " + pila.getFaltantes() + " elemntos para llenarse");
                    break;
                case 2: 
                    if (!pila.estaVacia()){
                        int sacado = pila.sacar();
                        System.out.println("el elemento sacado es " + sacado);
                    } else {
                        System.out.println("la pila esta vacia");
                    }
                    System.out.println("la pila tiene " + pila.getCantidad());
                    System.out.println("a la pila le faltan " + pila.getFaltantes() + " elemntos para llenarse");
                    break;
                case 3:
                    System.out.println("la pila tiene " + pila.getCantidad());
                    System.out.println("a la pila le faltan " + pila.getFaltantes() + " elemntos para llenarse");
                    break;
                case 4:
                    System.out.println("saliendo...");
                    break;
                }
        } while (opcion != 4);
         sn.close();
    }
}