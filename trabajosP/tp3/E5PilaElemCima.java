// Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila. Nota:
// no olvidar que si bien la pila se implementa como un arreglo, no debería manejarse como tal.




package trabajosP.tp3;

public class E5PilaElemCima {
    private int [] elementos;
    private final int MAX = 10;
    private int cima;
    private int aux;

    public E5PilaElemCima(){
        elementos = new int [MAX];
        cima = -1;
    }
    
        public boolean estaVacia(){
            return cima == -1;
        }
            public boolean estaLlena(){
                return cima == MAX - 1;
            }

                public void meter(int elem){
                    cima ++ ;
                    elementos[cima] = elem;
                }
                    public int sacar(){
                        aux = elementos[cima];
                        cima --;
                        return aux;
                    }
                       public int elementoCima(){
                       int x;
                        if(!this.estaVacia()){
                        x= this.sacar();
                        this.meter(x);
                        return x;
                        }else{
                            return 0;
                        }
                    }
}