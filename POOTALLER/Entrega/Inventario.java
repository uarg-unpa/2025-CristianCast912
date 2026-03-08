package POOTALLER.Entrega;

public class Inventario {
    private Mina [] minas;
    private int size, next;
        public Inventario(int n){
            this.size=n;
            this.minas = new Mina[size];
            this.next=0;
        }
            public void agregarMina(Mina mina){
                    if(!(this.next < this.size))
                        this.enlarge();
                    minas[next]= mina;
                    this.next++ ;
            }
                public void inventarioCompleto(){
                    int count = 0;
                    Mina aux;   
                    while (count<next){
                        if (minas[count] != null){
                            aux = minas[count];
                            System.out.println(aux.toString());
                        }
                        count++ ;
                    }
                }
                    public void listMinasPersona(String propietario){
                        int count=0;
                        Mina aux;   
                        while (count<next){
                            if (minas[count] != null){
                                aux = minas[count];
                                if (aux.getPropietario().equals(propietario)){
                                    System.out.println(aux.toString());
                                }
                            }
                            count++ ;
                        }
                    }
                        public void listMinasEnUso(){
                            int count=0;
                            Mina aux;   
                            while (count<next){
                                if (minas[count] != null){
                                    aux = minas[count];
                                    if (aux.getEstaActiva() == true){
                                        System.out.println(aux.toString());
                                    }
                                }
                                count++ ;
                            }
                        }
                            public void listExtraido30(){
                            int count=0;
                            Mina aux;   
                            while (count<next){
                                if (minas[count] != null){
                                    aux = minas[count];
                                    if (aux.getReservasExtraidas() <= (aux.getReservas() * 0.3)){
                                        System.out.println(aux.toString());
                                    }
                                }
                                count++ ;
                            }
                        }
                                private void enlarge(){
                                        int count2=0;
                                        Mina [] aux = new Mina[this.size*2];
                                            for (int i=0; i<size; i++){
                                            aux[count2]=minas[i];
                                            count2++;
                                            }
                                            this.minas = aux;
                                            this.next = count2;
                                            this.size = size*2;
                                    }
                                    

    
}
