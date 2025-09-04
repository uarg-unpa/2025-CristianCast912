package tp2.trabajopractico2;

public class pelicula {
    private String titulo, director, genero;
    private int duracion;

    public pelicula(String titulo, String director, int duracion, String genero) {
        this.titulo = titulo; 
        this.director = director; 
        this.duracion = duracion;
        this.genero = genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getDirector() {
        return this.director;  
    }   
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getDuracion() {
        return this.duracion;    
    }   
    public void setGenero(String genero) {        
        this.genero = genero;
    }
    public String getGenero() {
        return this.genero;  
    }
}
