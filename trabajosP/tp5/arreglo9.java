//Escribe un método recursivo que determine si un número está presente en un arreglo. Devuelve
//true si el número se encuentra en el arreglo y false en caso contrario.
//Pista: El caso base es cuando el tamaño del arreglo es 0, en cuyo caso el número no está presente. De
//lo contrario, verifica el primer elemento del arreglo y llama recursivamente con el resto del arreglo


public class arreglo9 {
    public static boolean presente (int [] arr, int n , int indice){
        if (indice == arr.length){
            return false;
        } if (arr[indice] == n) {
            return true;
        } else {
            return presente(arr, n, indice + 1);
        }
        
    }    
}
