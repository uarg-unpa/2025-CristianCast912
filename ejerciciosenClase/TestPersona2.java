package ejerciciosenClase;

public class TestPersona2 {
    public static void main(String[] args) {
        Domicilio dom1 = new Domicilio("Av. Rivadavia", 1234);
        Persona2 p1 = new Persona2("Laura", 20, "12345678", 'M', 60.5, 1.65, dom1);
        System.out.println(p1);
        System.out.println(p1.infoDomicilio());

        Persona2 p2 = new Persona2("Pedro");
        System.out.println(p2); // Domicilio por defecto
    }
}