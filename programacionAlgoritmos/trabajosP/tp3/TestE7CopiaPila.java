package trabajosP.tp3;
import java.util.Scanner;
public class TestE7CopiaPila {
    public static void main (String  args[]) {
        Scanner sc = new Scanner (System.in);
        E7CopiaPila pila = new E7CopiaPila();
        int opcion = 0;
        do {
            System.out.println("1. meter elemento");
            System.out.println("2. sacar elemento");
            System.out.println("3. Ver elemento cima");
            System.out.println("4. Hacer copia de la pila");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (!pila.estaLlena()){
                        System.out.println("ingrese el numero a meter");
                        int num = sc.nextInt();
                        sc.nextLine();
                        pila.meter(num);
                        System.out.println("el numero " + num + " se ha metido en la pila");
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
                    if (!pila.estaVacia()) {
                    E7CopiaPila copiaPila = pila.copia();
                    System.out.println("se ha creado una copia de la pila");
                    } else {
                        System.out.println("la pila esta vacia, no se puede copiar");
                    }
                    break;
                case 5:
                    System.out.println("saliendo...");
                    break;
                }
            } while (opcion != 5);
            sc.close();
        }
}
