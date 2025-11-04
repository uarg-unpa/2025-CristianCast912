//Escriba la clase Cola cuya declaración de atributos y métodos correspondan a la implementación
//Frente Fijo y Final Movible (tener en cuenta que al borrar debe correr todos los elementos).


package trabajosP.tp4;

public class ejercicio3 {
 private int [] elementos;
 private int frente;
 private int fin;
 private final int MAX = 10;

    public ejercicio3() {
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
                    elementos [fin]= elem;
                    fin ++;
                }
                    public int desencolar() {
                        int aux = elementos [frente];

                        for (int i = 0 ; i < fin - 1 ; i++){
                            elementos[i] = elementos [i + 1];
                        }
                        fin--;
                        return aux;
                    }
                        public int mostrar () {
                            return elementos[frente];
                        }

            }

