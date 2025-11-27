//en el main, ya se creo una pila de caracteres p, determinar y mostrar la cantidad de vocale que hay en la pila. La pila P debe quedar como estaba originalmente.



package ejercicioParcial;

public class mainPilaCaracteres {
    public static void main(String[] args) {
        pilaCaracteres p= new pilaCaracteres();
        p.apilar('a');
        p.apilar('b');
        p.apilar('e');
        p.apilar('i');
        p.apilar('o');
        p.apilar('u');
        p.apilar('c');  

        pilaCaracteres aux = new pilaCaracteres();
        int contVocal = 0;

        while (!p.estaVacia()) {
            char caracter = p.desapilar();
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                contVocal++;
            }
            aux.apilar(caracter);
        }

        while (!aux.estaVacia()) {
            p.apilar(aux.desapilar());
        }

        System.out.println("Cantidad de vocales: " + contVocal);
    }
}
