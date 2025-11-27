public class minimo10 {
    public static int valorMinimo(int [] arr, int indice){
        if (indice == arr.length - 1) {
            return arr[indice];
        } else {
            int minResto = valorMinimo(arr, indice);
            if (arr[indice] < minResto) {
                return arr[indice];
            } else {
                return minResto;
            }
        }
    }
}
