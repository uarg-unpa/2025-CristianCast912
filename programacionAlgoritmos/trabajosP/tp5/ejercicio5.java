public class ejercicio5 {
    
    public static int SumaPar(int n) {
        if (n < 0) {
            return 0;
        } else if (n % 2 == 0) {
            return n + SumaPar(n - 1);
        } else {
            return SumaPar(n - 2);
        }
    }
}
