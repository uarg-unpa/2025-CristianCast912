package ejenClase;

public class PilaReal {
        private double[] elementos; // Array para almacenar los elementos
        private int cima;
        private double aux;
        private final int MAX = 10; // Capacidad máxima de la pila

        // Constructor: inicializa el array y la cima
        public PilaReal() {
            elementos = new double[MAX]; // Crear el array
            cima = - 1;
            // Completar: inicializar cima
        }

        // Verifica si la pila está vacía
        public boolean estaVacia() {
            if (!estaVacia()){
                return true;
            }else {
            // Completar: devolver true si cima indica que la pila está vacía
            return false;
            }
        }

        // Verifica si la pila está llena
        public boolean estaLlena() {
            if(!estaLlena()){
                return true;
            } else {
            // Completar: devolver true si cima está en el límite del array
                return false;
            }
        }

        // Agrega un elemento en la cima (push)
        public void meter(double elem) {
                // Completar: incrementar cima y asignar el elemento
                cima ++;
                elementos[cima] = elem;
        }

        // Saca y devuelve el elemento de la cima (pop)
        public double sacar() {
                    // Completar: guardar el elemento de la cima, decrementar cima y devolverlo
            aux = elementos [cima];
            cima --;
            return aux;
            }
    }


