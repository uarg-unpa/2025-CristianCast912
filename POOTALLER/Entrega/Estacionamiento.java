package POOTALLER.Entrega;

public class Estacionamiento {
                private Auto [] autos;
                private int size, next;
                    public Estacionamiento(int n){
                        this.size=n;
                        this.autos = new Auto[size];
                        this.next=0;
                    }
                        public void agregarAuto(Auto auto, int horaIngreso){
                            if (!(this.next < this.size))
                            this.enlarge();
                            auto.setHoraIngreso(horaIngreso);
                            autos[next]=auto;
                            this.next++;
                        }
                            public void sacarAuto(String patente, int horaSalida){
                                boolean found=false;
                                int count=0;
                                Auto aux;
                                while(!found && count<next){
                                    if (autos[count] != null) {
                                        aux=autos[count];
                                        if (aux.getPatente().equals(patente)){
                                        found=true;
                                        aux.setHoraSalida(horaSalida);
                                        }
                                    }
                                    count++;
                                }
                                if (found){
                                    autos[count-1]= null;
                                    next--;
                                }
                            }
                                public boolean buscarAuto(String patente){
                                    boolean found=false;
                                    int count=0;
                                    Auto aux;
                                    while(!found && count<next) {
                                        if (autos[count] != null) {
                                            aux=autos[count];
                                            if (aux.getPatente().equals(patente))
                                            found=true;
                                        }
                                        count++;
                                    }
                                    return found;
                                    }
                                        public int calcularValor(int horaIngreso, int horaSalida){
                                                return (horaSalida - horaIngreso) * 50;
                                        }
                                            public int buscarHoraEntrada(String patente){
                                            int i = 0;
                                            while (i < next) {
                                                if (autos[i] != null && autos[i].getPatente().equals(patente)) {
                                                    return autos[i].getHoraIngreso();
                                                }
                                                i++;
                                            }
                                            return -1; 
                                        }

                                                private void enlarge(){
                                                    int count2=0;
                                                    Auto [] aux= new Auto[size*2];
                                                    for (int i=0; i<size; i++){
                                                        aux[count2]=autos[i];
                                                        count2++;
                                                    }
                                                    this.autos = aux;
                                                    this.next = count2;
                                                    this.size = size*2;
                                                }
                    }

                