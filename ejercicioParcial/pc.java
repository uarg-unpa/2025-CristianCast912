package ejercicioParcial;

import java.util.Scanner;

public class pc {
    private String marca;
    private String procesador;
    private Double precio;
    private int ram;

    public pc ( String marca, String procesador, Double precio, int ram) {
        this.marca = marca;
        this.procesador = procesador;
        this.precio = precio;
        this.ram = ram;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getProcesador(){
        return procesador;
    }
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(Double precio){
        this.precio = precio;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
        
        public void actualizarRam (int nuevaRam){
            this.ram = nuevaRam;
        }

            public void aplicarDescuento (double porcentaje){
                double descuento = (porcentaje/100) * precio;
                this.precio = precio - descuento;
            }

                public String toString(){
                    return "PC [marca = " + marca + ", procesador = " + procesador + ", precio = " + precio + ", ram = " + ram + "]";
                }
                    public boolean mayorRam (pc p){
                        if (this.ram > p.getRam()){                        
                            return true;
                        } else {
                            return false;
                        }
                        
                    }    

                            public static void main(String args[]){
                        
                            Scanner sc = new Scanner (System.in);

                            System.out.println("ingresa la marca de su pc");
                            String marca = sc.nextLine();
                            sc.nextLine();

                            System.out.println("ingresa el procesador de su pc");
                            String procesador = sc.nextLine();
                            sc.nextLine();

                            System.out.println("ingresa el precio de su pc");
                            double precio = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("ingrese la cantidad de ram de su pc");
                            int ram = sc.nextInt();
                            sc.nextLine();

                            pc p1 = new pc  (marca, procesador, precio, ram);
                            System.out.println(p1);
                            System.out.println("ingresar el descuento ");
                            p1.aplicarDescuento(sc.nextDouble());
                            System.out.println("el valor de la pc se actualizo");
                            System.out.println(p1);
                            sc.nextLine();
                            p1.actualizarRam(5);

                                System.out.println("ingrese la marca de su pc");
                                String marca2 = sc.nextLine();
                                sc.nextLine();

                                System.out.println("ingrese el procesador de su pc");
                                String procesador2 = sc.nextLine();
                                sc.nextLine();
                        
                                System.out.println("ingrese el precio de su pc");
                                double precio2 = sc.nextDouble();
                                sc.nextLine();

                                System.out.println("ingrese la cancitdad de ram de su pc");
                                int ram2 = sc.nextInt();
                                sc.nextLine();

                                pc p2 = new pc (marca2, procesador2, precio2, ram2);
                                System.out.println(p2);

                                System.out.println("¿la primera pc tiene mas ram que la segunda?"+p1.mayorRam(p2));

                                    sc.close();
                    }
            
}
