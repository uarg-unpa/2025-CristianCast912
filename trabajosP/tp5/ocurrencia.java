//Escribe un método recursivo que cuente cuantas veces esta presente un numero en un array. Devuelve la cantidad de veces que se conto



public class ocurrencia {
    public static int ocurrencias (int [] arr, int n , int indice){
        if (indice == arr.length){
            return 0;
        } if (arr[indice] == n) {
            return 1 + ocurrencias(arr, n, indice + 1);
        } else {
            return ocurrencias(arr, n, indice + 1);
        }
        
    }    
}