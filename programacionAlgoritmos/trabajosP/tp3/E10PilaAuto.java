//10. Implementar una pila de autos, la cual puede guardar hasta 10 autos. En un main permitir al usuario
//ingresar autos y buscar un auto por número de patente y si se encuentra en la pila sacarlo y mostrar la información del mismo.



package trabajosP.tp3;

public class E10PilaAuto {
    private Auto [] elementos;
    private final int MAX = 10;
    private int cima;
    private Auto aux;

        public E10PilaAuto(){
            elementos = new Auto [MAX];
            cima = -1;
        }
            public boolean estaVacia(){
                return cima == -1;
            }
                public boolean estaLlena(){
                    return cima == MAX - 1;
             }
                    public void meter(Auto elem){
                        if(!estaLlena()) {
                        cima ++ ;
                        elementos[cima] = elem;
                        }
                    }
                            public Auto sacar(){
                                if (!estaVacia()) {
                                aux = elementos[cima];
                                cima --;
                                return aux;
                                } else {
                                return null;
                                }
                            }
                                    public Auto AutoCima () {
                                        if (!estaVacia()) {
                                        Auto x;
                                        x= this.sacar();
                                        this.meter(x);
                                        return x;
                                        } else {
                                        return null;
                                        }
                                    }


                                        public Auto buscarpatente (int patente) {
                                            E10PilaAuto aux = new E10PilaAuto();
                                            Auto patEncontrada = null;
                                            //saco hasta encontrar la patente o vaciar la pila
                                            while (!estaVacia()) {
                                                Auto actual = sacar();
                                                if (actual.getPatente() == patente) {
                                                    patEncontrada = actual;
                                                } else {
                                                    aux.meter(actual);
                                                }
                                            }
                                            //restauro los restantes en el orden en el que estaban
                                            while (!aux.estaVacia()) {
                                                meter(aux.sacar());
                                            }
                                            return patEncontrada;
                                        
                                        }
                                            public int getCantidad(){
                                                return cima + 1;
                                            }
                                    }
                                    
                                