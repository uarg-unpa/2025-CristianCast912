//Una empresa vende productos lácteos. Diariamente se necesita información sobre
//los productos de una determinada marca o denominación. Un producto lácteo, tiene
//una denominación (manteca, queso, yogur, crema, etc…), una marca (La Serenísima),
//un peso (en gramos), un precio, y una fecha de vencimiento.

package POOTALLER.EjercicioEmpresaLact;

public class Producto {
    private String denominacion, marca;
    private int peso;
    private double precio;
    private String fechaV;
        public Producto (String denominacion, String marca, int peso, double precio, String fechaV){
            this.denominacion = denominacion;
            this.marca = marca;
            this.peso = peso; 
            this.precio = precio;
            this.fechaV = fechaV; 
        }
        public String getDenominacion(){
            return denominacion;
        }
        public String getMarca(){
            return marca;
        }
        public int getPeso(){
            return peso;
        }
        public double getPrecio(){
            return precio;
        }
        public String getFechaV(){
            return fechaV;
        }
        public void setDenominacion(String denominacion){
            this.denominacion = denominacion;
        }
        public void setMarca(String marca){
            this.marca = marca;
        }
        public void setPeso(int peso){
            this.peso = peso;
        }
        public void setPrecio(double precio){
            this.precio = precio;
        }
        public void setFechaV(String fechaV){
            this.fechaV = fechaV;
        }



}