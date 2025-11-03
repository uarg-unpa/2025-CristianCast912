// 8. Implementar una clase Cadena que permita ingresar una cadena de caracteres (String) y que tenga el
//método esPalindromo() que retorna verdadero si la secuencia de caracteres se lee igual de izquierda a derecha y viceversa.




package trabajosP.tp3;

public class E8Cadena {
    private char [] elementos;
    private final int MAX = 20;
    private int cima;
    private char aux;

        public E8Cadena(){
            elementos = new char [MAX];
            cima = -1;
        }
            public boolean estaVacia(){
                return cima == -1;
            }
                public boolean estaLlena(){
                    return cima == MAX - 1;
             }
                    public void meter(char elem){
                        cima ++ ;
                        elementos[cima] = elem;
                        }
                            public char sacar(){
                                aux = elementos[cima];
                                cima --;
                                return aux;
                                }
                                    public char elementoCima () {
                                    char x;
                                    x= this.sacar();
                                    this.meter(x);
                                    return x;
                                    }

                                        public boolean esPalindromo (){

                                            int CopiaElem = cima + 1;
                                            char [] aux = new char [CopiaElem];

                                            System.out.println("Copiando elementos en aux");
                                                for (int i = 0; i < CopiaElem; i++) {
                                                    aux [i] = sacar ();
                                                    System.out.println("Elemento en posición " + i + " es " + aux[i]);
                                                }

                                                    System.out.println("Volviendo a meter los elementos en la pila");
                                                    for (int i = 0; i < CopiaElem; i++){
                                                        meter (aux [i]);
                                                    }

                                                    System.out.println("Verificando si es palindromo");
                                                        for (int i = 0; i < CopiaElem / 2 ; i++){
                                                            if (aux [i] != aux [CopiaElem - 1 - i]) {
                                                                System.out.println("No es palindromo, diferentes en posicion " + i);
                                                                return false;
                                                            }
                                                        }
                                                                System.out.println("Es palindromo");
                                                                return true;        
                                        }

}