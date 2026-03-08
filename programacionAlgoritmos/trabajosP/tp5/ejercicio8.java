// escribe un método recursivo que calcule la suma de los primeros n números naturales. Por ejemplo, si n = 5, el resultado debe ser 1 + 2 + 3 + 4 + 5 = 15.
// Pista: El caso base es cuando n == 0, y la suma es 0. En caso contrario, la suma de n es igual a n + suma(n - 1).

public class ejercicio8 {
    public static int sumaNNaturales(int n){
        if (n == 0){
            return 0;
        } else {
            return n + sumaNNaturales(n - 1);
        }
        }
}

