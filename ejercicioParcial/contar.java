//programar un algoritmo recursivo que permita contar lo elementos negativos de un vector de n elementos


package ejercicioParcial;

public class contar {
    
    public static int contarNegativos ( int [] arr, int indice){
        if (indice == arr.length){
            return 0;
        } if (arr[indice] < 0) {
            return 1 + contarNegativos(arr, indice + 1);
        } else {
            return contarNegativos(arr, indice + 1);
        }
    }


    public static void main (String [] args){
        int [] array = { -2, -3, -5, 6, -1, 4, -2, -8};
        int cantidadNegativos = contarNegativos(array, 0);
        System.out.println("Cantidad de elementos negativos: " + cantidadNegativos);
    }
}
