package POOTALLER.Entrega;

public class Clinica {
    private Aparato [] aparatos;
    private int size, next;
        public Clinica(int n){
            this.size=n;
            this.aparatos = new Aparato[size];
            this.next=0;
        }
            public void agregarAparato(Aparato aparato){
                if(!(this.next < this.size)){
                    this.enlarge();
                }
                aparatos[next]= aparato;
                this.next++ ;
            
            }
                public void listAparatosUso(){
                    int count=0;
                    Aparato aux;
                    while (count<next){
                        if (aparatos[count] != null){
                            aux = aparatos[count];
                            if (aux.getEnUso() == true)
                                System.out.println(aux.toString());
                        }
                        count++;
                    }

                }
                    public int totalAparatos(){
                        return this.next;
                    }
                        public void listAparatosA(String añoCompra){
                            int count=0;
                            Aparato aux;
                            while (count<next){
                                if(aparatos[count] != null){
                                    aux = aparatos[count];
                                    if (aux.getAñoCompra().equals(añoCompra))
                                        System.out.println(aux.toString());
                                }
                                count++;
                            }

                        }
                                private void enlarge(){
                                    int count2=0;
                                    Aparato [] aux = new Aparato[this.size*2];
                                    for (int i=0; i<size; i++){
                                        aux[count2]=aparatos[i];
                                        count2++;
                                    }
                                    this.aparatos = aux;
                                    this.next = count2;
                                    this.size = size*2;
                                }
                    }
