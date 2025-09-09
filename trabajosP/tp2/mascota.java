package trabajosP.tp2;

public class mascota {
    private String nombre, tipo, raza;
    private int edad;

    public mascota(String nombre, String tipo, int edad, String raza) {
        this.nombre = nombre; 
        this.tipo = tipo; 
        this.edad = edad;
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;  
    }   
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;    
    }   
    public void setRaza(String raza) {        
        this.raza = raza;
    }
    public String getRaza() {
        return this.raza;  
    }
}
