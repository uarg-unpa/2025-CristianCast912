package trabajosP.tp4;

import java.util.Scanner;

public class TestEjercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ejercicio8Pila pila = new ejercicio8Pila();
        ejercicio8Cola cola = new ejercicio8Cola();

        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = sc.nextLine();

        // Guardamos cada carácter en la pila y en la cola
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            pila.meter(c);
            cola.encolar(c);
        }

        boolean esPalindromo = true;

        // Comparamos elementos de pila y cola
        while (!pila.estaVacia() && !cola.estaVacia()) {
            char desdePila = pila.sacar();
            char desdeCola = cola.desencolar();
            if (desdePila != desdeCola) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        sc.close();
    }
}



