package ejenClase.COLA;

public class ColaInt {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;
    
        public ColaInt () {
            elementos = new int[MAX];
            frente = 0;
            fin = 0;
        }

            public boolean estaVacia () {
                return fin == 0;
            }

                public boolean estallena (){
                    return fin == MAX;
                }
                    public void encolar(int elem){
                        elementos[fin] = elem;
                        fin ++;
                    }
                        public int desencolar () {
                            int aux = elementos[frente]; //toma el primer elemento

                            for ( int i = 0 ; i < fin - 1 ; i++){   //desplaza los elementos restantes hacia la izquierda
                                elementos[i] = elementos [i + 1];
                            }
                            fin--;                                  //reduce fin tras el desplazamiento
                            return aux;
                        }

                            public int mostrar () {
                                return elementos[frente]; 
                            }

                            public static void main(String[] args) {
                                ColaInt cola = new ColaInt();
                                    if(!cola.estaVacia()){
                                        cola.desencolar();
                                    } else {
                                        System.out.println("la cola esta vacia");
                                    }                               
                                
                            }
}
