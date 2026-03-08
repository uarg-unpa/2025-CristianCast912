//en el main, ya se creo una pila de caracteres p, determinar y mostrar la cantidad de vocale que hay en la pila. La pila P debe quedar como estaba originalmente.


package ejercicioParcial;

public class pilaCaracteres {
    private char [] elementos; 
    private int cima ;
    private final int Max = 20;
    private char aux;

        public pilaCaracteres(){
            elementos = new char [Max];
            cima = -1;
        }
            public boolean estaVacia(){
                return cima == -1;
            }
                public boolean estaLlena(){
                    return cima == Max -1;
                }
                    public void apilar (char elem){
                        if (!estaLlena()){
                            cima++;
                            elementos [cima] = elem;
                        }
                    }
                        public char desapilar(){
                            if (!estaVacia()){
                                aux = elementos [cima];
                                cima--;
                            }
                            return aux;
                        }
}       
