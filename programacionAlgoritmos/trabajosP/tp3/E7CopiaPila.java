package trabajosP.tp3;

public class E7CopiaPila {
    private int [] elementos;
    private final int MAX = 5;
    private int cima;
    private int aux;

        public E7CopiaPila(){
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
                        cima ++ ;
                        elementos[cima] = elem;
                        }
                            public int sacar(){
                                aux = elementos[cima];
                                cima --;
                                return aux;
                                }
                                    public int elementoCima () {
                                        return elementos [cima];
                                    }
                                    //metodo que crea una copia de la pila
                                        public E7CopiaPila copia(){
                                            E7CopiaPila copia = new E7CopiaPila();
                                            int copiaElem = this.cima + 1;
                                            int [] aux = new int [copiaElem];
                                            //saco todos los elementos de la pila original
                                            for (int i = 0; i < copiaElem; i++){
                                                aux[i] = this.sacar();
                                            }
                                            //vuelvo a meter los elementos en la pila original y ademas lleno la copia
                                            for ( int i = copiaElem - 1; i >= 0; i--){
                                                this.meter(aux[i]);
                                                copia.meter (aux[i]);
                                            }
                                            return copia;
                                        }
}
