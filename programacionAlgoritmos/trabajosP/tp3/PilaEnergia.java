package trabajosP.tp3;

public class PilaEnergia {
    private int [] elementos;
    private final int MAX = 20;
    private int cima;
    private int aux ;

        public PilaEnergia(){
            elementos = new int [MAX];
            cima = -1;
        }

            public boolean estaVacia(){
                return cima == -1;
            }
                public boolean estaLlena(){
                    return cima == MAX - 1;
             }
                    //metodo para agregar nuevos niveles a la pila
                    public void meter(int elem){
                        cima ++ ;
                        elementos[cima] = elem;
                        }
                            public int sacar(){
                                aux = elementos[cima];
                                cima --;
                                return aux;
                                }

                                //metodo que muestra el nivel en el que se encuentra la pila
                                    public int elementoCima () {
                                        int x;
                                        x= this.sacar();
                                        this.meter(x);
                                        return x;
                                    }

                                        //metodo para pedirle a un usuario el valor x para contar la cantidad de veces que aparece en la pila
                                        public int contarElementos(int x){
                                            int cont = 0;
                                            PilaEnergia auxPila = new PilaEnergia();

                                                while (!this.estaVacia()){
                                                    int elementoAux = this.sacar();
                                                    if (elementoAux == x) {
                                                        cont++;
                                                    }
                                                    auxPila.meter(elementoAux);
                                                }
                                                //relleno la pila nuevamente
                                                while (!auxPila.estaVacia()){
                                                    this.meter(auxPila.sacar());
                                                }
                                                return cont;
                                                }
}
