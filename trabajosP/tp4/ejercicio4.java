//En base a la implementación Frente y Final movible, escribir un método contar que devuelva la
//cantidad de elementos en la cola. Nota: no olvidar que, si bien la cola se implementa como un arreglo,
//no debería manejarse como tal.

package trabajosP.tp4;


public class ejercicio4 {
private int [] elementos;
private int frente;
private int ultimo;
private final int MAX = 10;


    public ejercicio4() {
        elementos = new int [MAX];
        frente = 0;
        ultimo= 0;
    }
        public boolean estaVacia(){
            return ultimo == frente;
        }
            private int siguiente (int subindice){
                if (subindice + 1 == MAX){
                    return 0;
                } else { 
                    return ++subindice;
                }
            }
        
                public boolean estaLlena(){
                    int sigUltimo = siguiente(ultimo);
                    return sigUltimo == frente;
                }
                    public void encolar (int elem){
                        ultimo = siguiente(ultimo);
                        elementos [ultimo] = elem;
                    }
                        public int desencolar(){
                            frente = siguiente(frente);
                            return elementos [frente];
                        }

                        public int contar1() {
                                    int i = frente;
                                    int count = 0;
                                    while (i != ultimo) {
                                        i = siguiente(i);
                                        count++;
                                    }
                                    return count;
                                }
                            
                            public int contar(){
                                int cont = 0;
                                ejercicio4 colaAux = new ejercicio4();
                                //recorro la cola usando una secundaria para no manejarla como array
                                while(!this.estaVacia()){
                                    int elem = this.desencolar();
                                    colaAux.encolar(elem);
                                    cont++;
                                }
                                // restauro la cola original
                                while (!colaAux.estaVacia()){
                                    this.encolar(colaAux.desencolar());
                                }
                                return cont;
                            }
    }