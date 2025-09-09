package ejerciciosenClase;

import java.util.Scanner;

public class librodefpersona {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantdePaginas;

    public librodefpersona (String titulo, String autor, int anioPublicacion, int cantdePaginas){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
        this.cantdePaginas=cantdePaginas;
    }
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
        public boolean esReciente(){
            if (this.anioPublicacion>2010){
                return true;
            }else {
                return false;
            }
        }
        public String toString(){
            return "librodefpersona[titulo='"+titulo+"', autor='"+autor+"', anioPublicacion="+anioPublicacion+", cantdePaginas="+cantdePaginas+"+esReciente="+esReciente()+"]";
        }
            public static void main(String[] args) {
            Scanner sn=new Scanner (System.in);
            
            System.err.println("¿cuantos libros desea cargar?");
            int n=sn.nextInt();
            sn.nextLine();

            librodefpersona [] libros = new librodefpersona[n];

                for(int i=0; i<n; i++){
                    System.out.println("ingrese titulo del libro");
                        String titulo=sn.nextLine();

                    System.out.println("ingresar autor del libro");
                        String autor=sn.nextLine();

                    System.out.println("ingresar anio de publicacion");
                        int anioPublicacion=sn.nextInt();
                        sn.nextLine();

                    System.out.println("ingresar cantidad de paginas");
                        int cantdePaginas=sn.nextInt();
                        sn.nextLine();
                
                    libros[n]=new librodefpersona(titulo, autor, anioPublicacion, cantdePaginas);
                }
                    for(int i=0; i<n; i++){
                        System.out.println(libros[i].toString());
                    }
                        sn.close();
            }
            
            
}

