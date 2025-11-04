// 5. Agregar un método en la clase Cola que elimine los elementos repetidos de la cola.
package trabajosP.tp4;

public class ejercicio5 {
 private int [] elementos;
 private int frente;
 private int fin;
 private final int MAX = 10;

    public ejercicio5 () {
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
                            public void eliminarRepetidos() {
                                ejercicio5 colaAux = new ejercicio5();

                                while(!this.estaVacia()){
                                    int elem = this.desencolar();
                                    boolean encontrado = false;
                                    
                                    // Verifico si el elemento ya está en la cola auxiliar
                                    ejercicio5 colaTemp = new ejercicio5();
                                    while(!colaAux.estaVacia()) {
                                        int auxElem = colaAux.desencolar();
                                        if(auxElem == elem) {
                                            encontrado = true;
                                        }
                                        colaTemp.encolar(auxElem);
                                    }

                                    // Restauro los elementos en la cola auxiliar
                                    while(!colaTemp.estaVacia()) {
                                        colaAux.encolar(colaTemp.desencolar());
                                    }

                                    // Si no encuentró el elemento, agrego a la cola auxiliar
                                    if(!encontrado) {
                                        colaAux.encolar(elem);
                                    }
                                }
                                //se restauran los elementos unicos de la cola original
                                while(!colaAux.estaVacia()) {
                                    this.encolar(colaAux.desencolar());
                                }
                            }

            }


