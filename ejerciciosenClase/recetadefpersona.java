package ejerciciosenClase;

import java.util.Scanner;

public class recetadefpersona {
     private String nombre;
        private int tiempo; 
        private String dificultad;
        private int cantIngredientes;

        public recetadefpersona ( String nombre, int tiempo, String dificultad, int cantIngredientes) {
        this.nombre= nombre;
        this.tiempo= tiempo;
        this.dificultad= dificultad;
        this.cantIngredientes= cantIngredientes;
        }                                   
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
                public void setDificultad (String dificultad){
                        this.dificultad= dificultad;
                }
                public String getDificultad (){
                        return this.dificultad;
                }
                public void setCantIngredientes (int cantIngredientes) {
                        this.cantIngredientes= cantIngredientes;
                }
                public int getCantIngredientes (){
                        return this.cantIngredientes;
                }
                        public String esTiempo() {
                        if (this.tiempo < 30 ){
                                return "receta rapida";
                        }else if (this.tiempo < 60) {
                                return "receta intermedia";
                        }else{
                                return "receta larga";
                        }
                        }
                                public void aumentarTiempo(int minutos) {
                                        this.tiempo += minutos;
                                }
                                public String toString() {
                                        return "recetadefpersona[nombre='"+nombre+"', tiempo="+tiempo+", dificultad='"+dificultad+"', cantIngredientes="+cantIngredientes+", esTiempo="+esTiempo()+"]";
                                }   
                                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);

                                        System.out.println("¿cuantas recetas quieres cargar?");
                                        int n = sc.nextInt();
                                        sc.nextLine();

                                        recetadefpersona [] receta = new recetadefpersona[n];
                                        
                                            for (int i = 0; i < n; i++) {
                                            System.out.println("ingrese el nombre de la receta");
                                            String nombre = sc.nextLine();

                                            System.out.println("ingrese el tiempo de la receta");
                                            int tiempo = sc.nextInt();
                                            sc.nextLine();
                                        
                                            System.out.println("ingrese la dificultad de la receta");
                                            String dificultad= sc.nextLine();

                                            System.out.println("ingrese la cantidad de ingredientes de la receta");
                                            int cantIngredientes= sc.nextInt();
                                            sc.nextLine();
                                        
                                            receta [n] = new recetadefpersona(nombre, tiempo, dificultad, cantIngredientes);
                                            }
                                                for (int i= 0; i<n; i++){
                                                    System.out.println(receta[i]);
                                                }
                                                sc.close();
                                    }
}
