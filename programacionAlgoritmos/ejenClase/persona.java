package ejenClase;

public class persona {

    String nombre;
    String apellido;
    int edad;
    int dni;

    public persona ( String nombre, String apellido, int edad, int dni){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.dni=dni;
    }

        public String getNombre () {
            return nombre;
         }
        public void setNombre( String nombre) {
            this.nombre=nombre;
        }
        public String getApellido () {
            return apellido;
        }
        public void setApellido( String apellido) {
            this.apellido=apellido;
        }
        public int getEdad () {
            return edad;
        }
        public void setEdad ( int edad) {
            this.edad=edad;
        }
        public int getDni () {
            return dni;
        }
        public void setDni ( int dni) {
            this.dni=dni;
        }

            public boolean mayorDeEdad ( ) {

                if (edad >=18){
                    return true;
                }else{ 
                    return false;
                }
            }
                public static void main(String[] args) {
                    persona persona1, persona2;
                    persona1= new persona ("Santiago", "Braida", 18, 47624205);
                    persona2= new persona ("Tomas", "Turri", 18, 47640205);
                    System.out.println("el nombre de la persona 1 es: " +persona1.getNombre());
                    System.out.println(" el apellido de la persona 1 es: " +persona1.getApellido());
                    System.out.println(" la edad de la persona 1 es : " +persona1.getEdad());
                    System.out.println(" el dni de la persona 1 es: " +persona1.getDni());
                    System.out.println(" es mayor de edad: " +persona1.mayorDeEdad());

                    System.out.println("el nombre de la persona 2 es: " +persona2.getNombre()); 
                    System.out.println(" el apellido de la persona 2 es: " +persona2.getApellido());    
                    System.out.println(" la edad de la persona 2 es : " +persona2.getEdad());
                    System.out.println(" el dni de la persona 2 es: " +persona2.getDni());
                    System.out.println(" es mayor de edad: " +persona2.mayorDeEdad());
                }
}         
   