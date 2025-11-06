package trabajosP.tp4;

public class ejercicio8Cola {
    private final int MAX = 50;
    private char[] elementos;
    private int frente;
    private int fin;

        public ejercicio8Cola() {
            elementos = new char[MAX];
            frente = 0;
            fin = 0;
        }

            public boolean estaVacia() {
                return fin == 0;
            }

                public boolean estaLlena() {
                    return fin == MAX;
                }

                    public void encolar(char elem) {
                        if (!estaLlena()) {
                            elementos[fin] = elem;
                            fin++;
                        }
                    }

                        public char desencolar() {
                            char aux = elementos[frente];
                            for (int i = 0; i < fin - 1; i++) {
                                elementos[i] = elementos[i + 1];
                            }
                            fin--;
                            return aux;
                        }

                            public char elementoFrente() {
                                if (!estaVacia()) {
                                    char x = desencolar();
                                    encolar(x);
                                    return x;
                                }
                                return 0;
                            }
                        }