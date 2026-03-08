package POOTALLER.Entrega;
//Una clínica médica tiene diversos equipos o aparatos que se usan para realizar estudios, análisis, tratamientos, cirugías, etc. Los aparatos como respiradores, estirilizadores, desfribiladores, ecógrafos, mamógrafos, resonadores, etc. tienen una función, una marca, un año de compra y se indica si está en uso. (puede no estar en uso por desperfecto, porque esta en reparación, u otro motivo).
//La clínica debe ofrecer la siguiente información:
// qué aparatos están uso, el total de aparatos que dispone, qué aparatos fueron adquiridos en un determinado año.
//Realice el modelado del enunciado. Codifique las clases (gestor y clase pojo). Realice un menú que permita hacer las operaciones.

public class Aparato {
    private String funcion, marca;
    private boolean enUso;
    private String añoCompra;
        public Aparato(String funcion, String marca, boolean enUso, String añoCompra){
            this.funcion = funcion;
            this.marca = marca;
            this.enUso = enUso;
            this.añoCompra = añoCompra;
        }
            public String getFuncion() {
                return funcion;
            }
            public void setFuncion(String funcion){
                this.funcion = funcion;
            }
            public String getMarca() {
                return marca;
            }
            public void setMarca(String marca){
                this.marca = marca;
            }
            public boolean getEnUso() {
                return enUso;
            }
            public void setEnUso(boolean enUso){
                this.enUso = enUso;
            }
            public String getAñoCompra() {
                return añoCompra;
            }
            public void setAñoCompra(String añoCompra){
                this.añoCompra = añoCompra;
            }
                public String toString(){
                    return "Aparato [funcion = " + funcion + ", marca = " + marca + ", enUso = " + enUso + ", añoCompra = " + añoCompra + "]";
                }
}
