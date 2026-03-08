public class recurividadej4 {


public static int Suma (int n){
    if (n == 0){
        return 0;
    } else {
        return n + Suma (n - 1);
    }
}
}