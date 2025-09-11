package trabajosP.tp2;

public class alumno {
    private String nombre, apellido;
    private int dni, legajo;

    public alumno(String nombre, String apellido, int dni, int legajo) {
        this.nombre = nombre; 
        this.apellido =apellido; 
        this.dni = dni; 
        this.legajo = legajo;
    }

        public void setNombre(String nombre) {
             this.nombre = nombre;
        }
        public String getNombre() {
            return this.nombre;
        }
        public void setApellido(String apellido) {
             this.apellido = apellido;
        }
        public String getApellido() {
            return this.apellido;  
        }   
        public void setDni(int dni) {
            this.dni = dni;
        }
        public int getDni() {
            return this.dni;    
        }
        public void setLegajo(int legajo) {        
            this.legajo = legajo;
        }
        public int getLegajo() {
            return this.legajo;
        }
            
            public String toString() {
                return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", legajo=" + legajo + "]";
            }
                public static void main(String args []){
                    alumno alumno1, alumno2;
                    alumno1= new alumno ("Cristian", "Castro", 25965350, 965201);
                    alumno2= new alumno ("Juan", "Polo", 35291865, 465905);
                    System.out.println(alumno1);
                    System.out.println(alumno2);
                    }
}       