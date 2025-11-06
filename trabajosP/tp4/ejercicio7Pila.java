// 7. Se tiene una pila de enteros positivos. Con las operaciones básicas de pilas y colas, escribir un programa que coloque todos los elementos pares de la pila en la cola.


package trabajosP.tp4;

public class ejercicio7Pila {
 private int [] elementos;
 private final int MAX = 10;
 private int cima; 
 private int aux;
 
    public ejercicio7Pila(){
        elementos = new int [MAX];
        cima = -1;
    }
        public boolean estaVacia(){
            return cima == -1;
        }
            public boolean estaLlena(){
                return cima == MAX - 1;
         }
                public void meter(int elem){
                    if (!estaLlena()) {
                    cima ++ ;
                    elementos[cima] = elem;
                    }
                }
                        public int sacar(){
                            if(!estaVacia()) {
                            aux = elementos[cima];
                            cima --;
                            return aux;
                            }
                            return -1;
                        }
                                public int elementoCima () {
                                    if(!estaVacia()) {
                                    int x = sacar();
                                    meter(x);
                                    return x;
                                    }
                                    return -1;
                                }
}

