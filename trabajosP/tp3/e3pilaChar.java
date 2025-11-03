package trabajosP.tp3;

public class e3pilaChar {
    private char [] elementos;
    private int cima ;
    private final int MAX = 20;
    private char aux;

    //Contructor de la pila
    public e3pilaChar(){
        elementos = new char [MAX];
        cima = -1;
    }

    //verificacion si esta vacia
    public boolean estaVacia(){
        return cima == -1;
    }

    //verificacion si esta llena
    public boolean estaLLena(){
        return cima == MAX - 1;
    }
    
    public void meter (char elem){
        cima++;
        elementos[cima] = elem;
    }
    
    public char sacar(){
        aux = elementos [cima];
        cima -- ;
        return aux;
    }
}
