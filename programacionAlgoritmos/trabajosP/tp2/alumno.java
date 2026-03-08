package trabajosP.tp2;

import java.util.Scanner;

//clase alumno
public class alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private int edad;
    private String carrera;

    //constructor
    public alumno (String nombre, String apellido, int legajo, int edad, String carrera){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.edad = edad;
        this.carrera = carrera;
    }
        //Getters y Setters
        public String getNombre(){
            return nombre;
        }
        public void setNombre (String nombre){
            this.nombre = nombre; 
        }
        public String getApellido(){
            return apellido; 
        }
        public void setApellido (String apellido){
            this.apellido = apellido;
        }

        public int getLegajo(){
            return legajo;
        }
        public void setLegajo (int legajo){
            this.legajo = legajo;
        }
        public int getEdad(){
            return edad;
        }   
        public void setEdad (int edad){
            this.edad = edad;
        }   
        public String getCarrera(){
            return carrera;
        }
        public void setCarrera (String carrera){
            this.carrera = carrera;
        }
    
            //Metodo toString
            @Override
            public String toString() {
            return "alumno [nombre= " + nombre + ", apellido= " + apellido + ", legajo= " + legajo + ", edad= " + edad + ", carrera= " + carrera + "]";
            }

            //metodo esmayordeedad
            public boolean esMayor(){
                if(this.edad >= 18){
                    return true;
                }else{
                    return false;
                }
            }

                //metodo cambiarcarrera
                public void cambiarCarrera (String nuevaCarrera){
                    this.carrera = nuevaCarrera;
                }

                    //metodo esApellido
                    public boolean esApellido (String apellido){
                        if (this.apellido.equals("Herrera")){
                            return true;
                        }else {
                            return false;
                        }
                    }

    

                        //crear objeto alumno
                        public static void main (String args[]){

                            Scanner sn = new Scanner (System.in);

                            System.out.println("ingresa el nombre");
                            String nombre = sn.nextLine();
                            sn.nextLine();

                            System.out.println("ingresa el apellido");
                            String apellido = sn.nextLine();
                            sn.nextLine();
                            
                            System.out.println("ingresa el legajo");
                            int legajo = sn.nextInt();
                            sn.nextLine();

                            System.out.println("ingresa la edad");
                            int edad = sn.nextInt();
                            sn.nextLine();

                            System.out.println("ingresa la carrera");
                            String carrera= sn.nextLine();
                            sn.nextLine();
                            
                            alumno a1= new alumno (nombre, apellido, legajo, edad, carrera);

                            System.out.println(a1);

                            System.out.println("es mayor de edad?" + a1.esMayor());
                            System.out.println("ingresa la nueva carrera");
                            a1.cambiarCarrera(sn.nextLine());
                            sn.nextLine();
                            System.out.println(a1);

                            System.out.println("ingresar apellido para comparar");
                            String apel = sn.nextLine();
                            sn.nextLine();
                            System.out.println("el apellido es Herrera? " + a1.esApellido(apel));

                            sn.close();
                        }
}
