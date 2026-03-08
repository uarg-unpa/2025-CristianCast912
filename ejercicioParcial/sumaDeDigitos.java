//escribit un metodo recursivo que calcule la uma de los digito de un numero entero postivo
//por ejemplo, si el numero es 1234, el resultado debe ser 1 + 2 + 3 + 4 = 10



package ejercicioParcial;

public class sumaDeDigitos {
    public static int sumaDigitos(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return (numero % 10) + sumaDigitos(numero / 10);
        }
    }

    
    public static void main(String[] args) {
        int numero = 964721;
        int resultado = sumaDigitos(numero);
        System.out.println("La suma de los digitos de " + numero + " es: " + resultado);
    }
}
