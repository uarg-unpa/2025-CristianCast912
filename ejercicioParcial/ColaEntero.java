//crear un metodo de la clase cola de enteros, que reciba la otra cola q2 de enteros tambien, calcule y retorne verdadero si la cola tiene mas elementos que la cola q2 que se envia-
//como parametro, o falo si q2 tiene mas elemnentos. las colas deben quedar como estaban originalmente. public boolean masElementos(ColaEntero q2)


package ejercicioParcial;

public class ColaEntero {
    private int [] elementos;
    private int frente;
    private int ultimo;
    private final int MAX = 50;

    public ColaEntero() {
        this.elementos = new int[MAX];
        this.frente = 0;
        this.ultimo = 0;
    }
        public boolean estaVacia(){
            return ultimo == frente;
        }
            public boolean estaLLena(){
                int sigUltimo = siguiente(ultimo);
                return sigUltimo == frente;
            }

                public int siguiente (int subindice){
                    if (subindice + 1 == MAX){
                        return 0;
                    } else { 
                        return ++subindice;
                    }
                }

                    public void encolar (int elem){
                        ultimo = siguiente(ultimo);
                        elementos [ultimo] = elem;
                    }

                        public int desencolar(){ 
                            if(!estaVacia()){
                            frente = siguiente(frente);
                            return elementos [frente];
                            }
                            return -1;
                        }
                        //creo las colas auxiliares para contar los elementos
                        public boolean masElementos(ColaEntero q2){
                            int count1 = 0;
                            int count2 = 0;
                            ColaEntero colaAux1 = new ColaEntero();
                            ColaEntero colaAux2 = new ColaEntero();
                            
                            //cuento los elemento de las colas originale y se las paso a un aux
                            while(!this.estaVacia()){
                                int elem = this.desencolar();
                                count1++;
                                colaAux1.encolar(elem);
                            }
                            while(!q2.estaVacia()){
                                int elem2 = q2.desencolar();
                                count2++;
                                colaAux2.encolar(elem2);
                            }
                            //vuelvo a llenar los elementos a las colas originales
                            while(!colaAux1.estaVacia()){
                                this.encolar(colaAux1.desencolar());
                            }
                            while(!colaAux2.estaVacia()){
                                q2.encolar(colaAux2.desencolar());
                            }
                            return count1 > count2;
                            }
                        }
