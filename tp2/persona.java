package tp2;

public class persona {

    String nombre;
    String apellido;
    int edad;
    int dni;

    public persona ( String nombre, String apellido, int edad, int dni)
    {
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.dni=dni;
    }

    public String getNombre ()
    {
        return nombre;
    }
    public void setNombre( String nombre) {

        this.nombre=nombre;
    }
    public String getApellido ()
    {
        return apellido;
    }
    public void setApellido( String apellido) {

        this.apellido=apellido;
    }
    public int getEdad ( int edad){

        return edad;
    }
    public void setEdad ( int edad) {

        this.edad=edad;
    }
    public int getDni (int dni){

        return dni;
    }
    public void setDni ( int dni) {

        this.dni=dni;
    }

    public boolean mayorDeEdad ( ) {

        if (edad >=18)
            return true;
        else 
            return false;
    }
}
   