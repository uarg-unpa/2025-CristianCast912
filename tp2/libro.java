package tp2;

public class libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantdePaginas;

    public Libro (titulo, autor, anioPublicacion, cantdePaginas);{
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
        this.cantdePaginas=cantdePaginas;
        
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    public String getTitulo (){
        return this.titulo;
    }
    public void setAutor (String autor){
        this.autor = autor;
    }
    public String getAutor (){
        return this.autor;
    }
    public void setAnioPublicacion (int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }
    public int getAnioPublicacion (){
        return this.anioPublicacion;
    }
     public void setCantdePaginas (int cantdePaginas){
        this.cantdePaginas = cantdePaginas;
    }
    public int getCantdePaginas (){
        return this.cantdePaginas;
    }
    public boolean esReciente();{
        if (this.anioPublicacion>2010){
            return true;
        else {
            return false;
        }
        }
    }
        public static void main(String[] args) {
        Libro libro1= new Libro ( "harry Potter", "Rowling", "1997", "368");
        Libro libro2= new Libro ( "it", "Stephen King", "1986", "1504")
         }

    }
}