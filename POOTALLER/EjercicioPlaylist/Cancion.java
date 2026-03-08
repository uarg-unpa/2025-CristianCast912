package POOTALLER.EjercicioPlaylist;

public class Cancion {
    String titulo, artista;
    int duracion;
    String fechaCreacion;
    boolean reproduciendose;

    public Cancion(String titulo, String artista, int duracion, String fechaCreacion, boolean reproduciendose) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.fechaCreacion = fechaCreacion;
        this.reproduciendose = reproduciendose;
    }
        public String getTitulo() {
            return titulo;
        }
        public String getArtista() {
            return artista;
        }
        public int getDuracion() {
            return duracion;
        }
        public String getFechaCreacion(){
            return fechaCreacion;
        }
        public boolean getReproduciendose(){
            return reproduciendose;
        }
        public void setTitulo(String titulo){
            this.titulo = titulo;
        }
        public void setArtista(String artista){
            this.artista = artista;
        }
        public void setDuracion(int duracion){
            this.duracion = duracion;
        }
        public void setFechaCreacion(String fechaCreacion){
            this.fechaCreacion = fechaCreacion;
        }
        public void setReproduciendose(boolean reproduciendose){
            this.reproduciendose = reproduciendose;
        }
}
