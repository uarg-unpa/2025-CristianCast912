package trabajosP.tp3;

public class Auto {
    private int patente;
    private String marca;
    private String modelo;
    private int año;
    
        public Auto (int patente, String marca, String modelo, int año){
            this.patente = patente;
            this.marca = marca;
            this.modelo = modelo; 
            this.año = año;
        }
            public int getPatente(){
                return patente;
            }
                 public void setPatente(int patente){
                    this.patente = patente; 
                }
                    public String getMarca(){
                        return marca;
                    }
                        public void setMarca(String marca){
                            this.marca = marca;
                        }

                            public String getModelo(){
                                return modelo;
                            }
                                public void setModelo(String modelo){
                                    this.modelo = modelo;
                                }

                                    public int getAño(){
                                        return año;
                                    }
                                        public void setAño(int año){
                                            this.año = año;
                                        }

                                            public String toString(){
                                                return "Auto [patente = " + patente + ", marca = " + marca + ", modelo = " + modelo + ", año = " + año + "]";   
                                            }
}
