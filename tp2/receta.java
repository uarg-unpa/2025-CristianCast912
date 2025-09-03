package tp2;

public class receta {
    private String nombre;
    private int tiempo; 
    private String dificultad;
    private int cantIngredientes;

    public receta ( String nombre, int tiempo, String dificultad, int cantIngredientes) {
    this.nombre= nombre;
    this.tiempo= tiempo;
    this.dificultad= dificultad;
    this.cantIngredientes= cantIngredientes;
        
        public void setNombre (String nombre){
            this.nombre= nombre ;
        }
        public String getNombre (){
            return this.nombre ;
        }
        public void setTiempo ( int tiempo){
            this.tiempo= tiempo ;
        }
        public int getTiempo (){
            return this.tiempo ;
        }
        public void setDificultad (String Dificultad){
            this.dificultad= dificultad;
        }
        public int getDificultad (){
            return this.dificultad;
        }
        public void setCantIngredientes (int cantIngredientes) {
            this.cantIngredientes;
        }
        public int getCantIngredientes (){
            return this.cantIngredientes;
        }
            public String esTiempo() {
                if (this.tiempo < 30 ){
                    return "receta rapida";
                }else{ {if (this.tiempo < 60)
                    return "receta intermedia";
                    }else{ 
                        return "receta larga";
                    }
                }    
            