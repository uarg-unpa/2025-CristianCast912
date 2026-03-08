//Escribir un método en la clase cola que tenga como argumento una cola del mismo tipo y
//devuelva verdadero o falso si las dos colas son o no idénticas (tienen el mismo tamaño y poseen los
//mismos elementos), respectivamente. Nota: no olvidar que, si bien la cola se implementa como un arreglo, no debería manejarse como tal.


package trabajosP.tp4;

public class ejercicio6Esigual {
   private final int MAX = 10;
    private int[] elementos;
    private int frente;
    private int ultimo;

        public ejercicio6Esigual() {
            elementos = new int[MAX];
            frente = 0;
            ultimo = 0;
        }

            public boolean estaVacia() {
                return (ultimo == frente);
            }

                public boolean estaLlena() {
                    int sigUltimo = siguiente(ultimo);
                    return (sigUltimo == frente);
                }

                    private int siguiente(int subind) {
                        if (subind == MAX - 1)
                            return 0;
                        else
                            return ++subind;
                    }

                        public void encolar(int elem) {
                            if (!estaLlena()) {
                            ultimo = siguiente(ultimo);
                            elementos[ultimo] = elem;
                            }
                        }

                            public int desencolar() {
                                if (!estaVacia()) {
                                frente = siguiente(frente);
                                return elementos[frente];
                                }
                                return -1; // indica que la cola estaba vacía
                            }

                                public int contar() {
                                if (ultimo >= frente) {
                                    return ultimo - frente;
                                } else {
                                    return (MAX - frente) + ultimo;
                                }
                            }
                                    public boolean esIgual(ejercicio6Esigual otra) {
                                        if (this.contar() != otra.contar()) return false;

                                        ejercicio6Esigual aux1 = new ejercicio6Esigual();
                                        ejercicio6Esigual aux2 = new ejercicio6Esigual();
                                        boolean iguales = true;

                                        while (!this.estaVacia()) {
                                            int elem1 = this.desencolar();
                                            int elem2 = otra.desencolar();

                                            if (elem1 != elem2) {
                                                iguales = false;
                                            }

                                            aux1.encolar(elem1);
                                            aux2.encolar(elem2);
                                        }

                                        //restauro ambas colas
                                        while (!aux1.estaVacia()) {
                                            this.encolar(aux1.desencolar());
                                        }
                                        while (!aux2.estaVacia()) {
                                            otra.encolar(aux2.desencolar());
                                        }

                                        return iguales;
                                    }
}  
                        
