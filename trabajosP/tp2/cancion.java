package trabajosP.tp2;

public class cancion {
    private String titulo, autor, disco;
    private int duracion;

    public cancion(String titulo, String autor, int duracion, String disco) {
        this.titulo = titulo; 
        this.autor = autor; 
        this.duracion = duracion;
        this.disco = disco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;  
    }   
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getDuracion() {
        return this.duracion;    
    }   
    public void setDisco(String disco) {        
        this.disco = disco;
    }
    public String getDisco() {
        return this.disco;  
    }
}
