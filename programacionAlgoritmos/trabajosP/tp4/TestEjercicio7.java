package trabajosP.tp4;

public class TestEjercicio7 {
    public static void main(String[] args) {
        ejercicio7Pila pila = new ejercicio7Pila();
        ejercicio7Cola cola = new ejercicio7Cola();
        ejercicio7Pila aux = new ejercicio7Pila();

        // Ejemplo: cargar algunos valores
        pila.meter(5);
        pila.meter(8);
        pila.meter(3);
        pila.meter(10);
        pila.meter(7);
        pila.meter(2);
        pila.meter(4);

        // Paso los elementos a la cola si son pares
        while (!pila.estaVacia()) {
            int elem = pila.sacar();
            if (elem % 2 == 0) {
                cola.encolar(elem);
            }
            aux.meter(elem); // Guardamos todo para no perder la pila original
        }

        // Restaurar la pila original (opcional)
        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }
        // Mostrar los elementos pares en la cola
        System.out.println("Elementos pares en la cola:");
        while (!cola.estaVacia()) {
            System.out.println(cola.desencolar());
        }
    
    }
}

