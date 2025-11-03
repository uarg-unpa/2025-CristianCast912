// Utilizando la clase Pila implementada con arreglo únicamente (no utiliza índice cima), escribir un
//programa que permita meter y sacar elementos de la pila. Cada vez que se realice una operación deberá
//informar cuantos elementos hay en la pila y cuantos elementos le faltan para llegar al máximo.

package trabajosP.tp3;

public class E4pilaArreglo {
    private int [] elementos;
    private final int MAX= 10;
    private int cantidad;
    private int aux;
    
        public E4pilaArreglo (){
            elementos = new int [MAX];
            cantidad = 0;
        }
            public boolean estaVacia(){
                return cantidad == 0;
            }
                public boolean estaLlena (){
                    return cantidad == MAX - 1;
                }
                    public void meter (int elem){
                        elementos [cantidad] = elem;
                        cantidad++;
                    }
                        public int sacar (){
                            aux = elementos [cantidad - 1];
                            cantidad -- ;
                            return aux;
                        }
                            public int getCantidad (){
                                return cantidad;
                            }
                                public int getFaltantes (){
                                    return MAX - cantidad;
                                }

    }


