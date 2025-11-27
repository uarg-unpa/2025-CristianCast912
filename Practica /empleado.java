package Practica;

public class empleado {
 private String nombre;
 private int legajo;
 private int sueldo;
 
    private empleado(String nombre, int legajo, int sueldo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public String toString() {
        return "empleado [nombre=" + nombre + ", legajo=" + legajo + ", sueldo=" + sueldo + "]";
    }

    public boolean ganaMasQue(empleado e){
        if (this.sueldo > e.getSueldo()){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        empleado emp1 = new empleado("Juan", 123, 50000);
        empleado emp2 = new empleado("Ana", 456, 60000);
        empleado emp3 = new empleado("Luis", 789, 55000);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        
        if (emp1.ganaMasQue(emp2)) {
            System.out.println(emp1.getNombre() + " gana más que " + emp2.getNombre());
        } else {
            System.out.println(emp2.getNombre() + " gana más que " + emp1.getNombre());
        }
    }
}