package trabajosP.tp4;

public class ejercicio7Cola {
    private final int MAXC = 10;
    private int [] elementos;
    private int frente;
    private int ultimo;

        public ejercicio7Cola() {
            elementos = new int [MAXC];
            frente = 0;
            ultimo = 0;
        }
            public boolean estaVacia() {
                return ultimo == frente;
            }
                public boolean estaLlena() {
                    int sigUltimo = siguiente(ultimo);
                    return sigUltimo == frente;
                }
                    private int siguiente(int subind) {
                        if (subind == MAXC - 1)
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
                                    return (MAXC - frente) + ultimo;
                                }
                            }
}
