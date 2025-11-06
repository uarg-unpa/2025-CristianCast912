//Escriba la clase Cola cuya declaración de atributos y métodos correspondan a la implementación
//Frente Fijo y Final Movible (tener en cuenta que al borrar debe correr todos los elementos).


package trabajosP.tp4;

public class ejercicio3FrenteFijo {
 private int [] elementos;
 private int frente;
 private int fin;
 private final int MAX = 10;

    public ejercicio3FrenteFijo() {
        elementos = new int [MAX];
        frente = 0;
        fin= 0;
    }
        public boolean estaVacia() {
            return fin == 0;
        }
            public boolean estaLlena(){
                return fin == MAX;
            }
                public void encolar(int elem){
                    if (!estaLlena()) {
                    elementos [fin]= elem;
                    fin ++;
                    }
                }
                    public int desencolar() {
                        if (!estaVacia()) {
                        int aux = elementos [frente];

                        for (int i = 0 ; i < fin - 1 ; i++){
                            elementos[i] = elementos [i + 1];
                        }
                        fin--;
                        return aux;
                    }
                        return -1; // indica que la cola estaba vacía
                    }
                        public int mostrar () {
                            return elementos[frente];
                        }

            }

