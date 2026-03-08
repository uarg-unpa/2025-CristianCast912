package POOTALLER.EjercicioPlaylist;

public class Playlist {
    private Cancion [] canciones;
    private int size, next;
        public Playlist(int n){
            this.size=n;
            this.canciones = new Cancion[size];
            this.next=0;
        }
            public void agregarCancion(Cancion cancion){
                if(!(this.next < this.size))
                    this.enlarge();
                canciones[next] = cancion;
                this.next++;
            }
                public String elimarcancion(String titulo){
                    for (int i=0; i<next; i++){
                        if (canciones[i].getTitulo().equals(titulo)){
                            Cancion eliminada = canciones[i];
                            canciones[i] = canciones[next-1];
                            next --;
                            return eliminada.getTitulo();
                        }
                    }
                    return null;
                }
                    public void reproducirSecuencial(){
                        for(int i=0; i<next; i++){
                            Cancion cancion = canciones[i];
                            while ( cancion.getDuracion() > 0){
                                System.out.println(cancion.getTitulo() + " " + cancion.getDuracion());
                                cancion.setDuracion(cancion.getDuracion()-1);
                            }
                        }
                    }   
                        public void reproducirAleatorio(){
                            int random;
                            for (int i=0; i<next; i++){
                                random = (int)(Math.random()*next);
                                Cancion cancion = canciones[random];
                                while ( cancion.getDuracion() > 0){
                                    System.out.println(cancion.getTitulo() + " " + cancion.getDuracion());
                                    cancion.setDuracion(cancion.getDuracion()-1);
                                }
                            }
                        }

                                private void enlarge(){
                                int count2=0;
                                Cancion [] aux= new Cancion[size*2];
                                    for (int i=0; i<size; i++)
                                        if (canciones[i] != null) {
                                        aux[count2]=canciones[i];
                                        count2++;
                                    }
                                    this.canciones = aux;
                                    this.next = count2;
                                    this.size = size*2;
                            }
                
        
    }
