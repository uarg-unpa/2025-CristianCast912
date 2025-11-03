package trabajosP.tp3;
import java.util.Scanner;

public class TestE8Cadena {
    public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    E8Cadena pila = new E8Cadena();
    int opcion = 0;
    do {
        System.out.println("1. meter elemento");
        System.out.println("2. sacar elemento");
        System.out.println("3. Ver elemento cima");
        System.out.println("4. Palindromo");
        System.out.println("5. Salir");
        System.out.println("Elija una opcion");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                if (!pila.estaLlena()){
                    System.out.println("ingrese el caracter a meter");
                    char letra = sc.next().charAt(0);
                    sc.nextLine();
                    pila.meter(letra);
                    System.out.println("el caracter " + letra + " se ha metido en la pila");
                } else {
                    System.out.println("la pila esta llena");
                }
                break;
            case 2: 
                if (!pila.estaVacia()){
                    char sacado = pila.sacar();
                    System.out.println("el caracter sacado es " + sacado);
                } else {
                    System.out.println("la pila esta vacia");
                }
                break;
            case 3:
                if (!pila.estaVacia()){
                    char cima = pila.elementoCima();
                    System.out.println("el caracter de la cima es " + cima);
                } else {
                    System.out.println("la pila esta vacia");
                }
                break;
            case 4:
                if (pila.esPalindromo()){
                    System.out.println("la pila es palindromo");
                } else {
                    System.out.println("la pila no es palindromo");
                }
                break;
        }
    } while (opcion != 5);
        sc.close();
    }
}

