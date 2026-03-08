package trabajosP.tp3;

import java.util.Scanner;

public class Teste3pilaChar {
    public static void main(String[] args) {
    Scanner sn = new Scanner (System.in);
    E3pilaChar pila = new E3pilaChar();
    System.out.println("ingrese una palabra");
    String palabra = sn.nextLine();

        for (int i = 0 ; i < palabra.length(); i++){
            if (!pila.estaLLena()){
                pila.meter(palabra.charAt(i));
            }   else {
                    System.out.println("no ingresado"+palabra.charAt(i));
                }
                     while (!pila.estaVacia()) {
                                System.out.println(pila.sacar());
                        }
                    }
                       
                            sn.close();
    }
                                                                                                                                                    
}
