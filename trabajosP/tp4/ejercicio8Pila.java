package trabajosP.tp4;

public class ejercicio8Pila {

 private char [] elementos;
 private final int MAX = 50;
 private int cima; 
 private char aux;
 
    public ejercicio8Pila(){
        elementos = new char [MAX];
        cima = -1;
    }
        public boolean estaVacia(){
            return cima == -1;
        }
            public boolean estaLlena(){
                return cima == MAX - 1;
         }
                public void meter(char elem){
                    if (!estaLlena()) {
                    cima ++ ;
                    elementos[cima] = elem;
                    }
                }
                        public char sacar(){
                            if(!estaVacia()) {
                            aux = elementos[cima];
                            cima --;
                            return aux;
                            }
                            return 0;
                        }
                                public int elementoCima () {
                                    if(!estaVacia()) {
                                    char x = sacar();
                                    meter(x);
                                    return x;
                                    }
                                    return -1;
                                }
}



