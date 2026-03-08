package trabajosP.tp3 ;
import java.util.Scanner;

public class TestPilaenergia {
   public static void main (String [] args) {
        Scanner sn = new Scanner (System.in);
        PilaEnergia pila = new PilaEnergia();
        int opcion = 0;
        do {
            System.out.println("menu de pila de energia");
            System.out.println("1. Agregar nivel de energia");
            System.out.println("2. Buscar nivel de energia");
            System.out.println("3. Contar niveles de energia");
            System.out.println("4. Salir");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese el nivel de energia a agregar");
                    int nivel = sn.nextInt();
                    pila.meter(nivel);
                    System.out.println("nivel agregado correctamente");
                    break;
                case 2:
                if(!pila.estaVacia()){
                    int nivelCima = pila.elementoCima();
                    System.out.println("el nivel de energia en la cima es: " + nivelCima);
                } else {
                    System.out.println("la pila esta vacia");
                }
                    break;
                case 3:
                    System.out.println("ingrese el nivel de energia a buscar");
                    int nivelBuscar = sn.nextInt();
                    int cantidad = pila.contarElementos(nivelBuscar);
                    System.out.println("el nivel " + nivelBuscar + " aparece " + cantidad + " veces en la pila");
                    break;
                case 4:
                    System.out.println("saliendo...");
                    break;
            }
        } while (opcion != 4);
        sn.close();
    }
}
