// La dirección de minería de Santa Cruz, lleva un inventario de las minas existentes en la Pcia. Es necesario procesar la información, 
// para saber a) las minas activas b) las minas de un determinado propietario c) las minas cuya cantidad extraída no supera el 30% de las reservas estimadas.
// Una mina es un conjunto de huecos o pozos para extraer o explotar minerales tales como oro, plata, cobre, etc. 
// Las minas suelen estar en el campo, y aunque se puede distinguir una pcia y país, su localización se define por sus coordenadas georeferenciadas. 
// Importa además el nombre de la mina, el propietario (empresa), el mineral que se extrae de la misma, la cantidad disponible estimadas (en toneladas) del mineral, que se denomina reservas;
//  la cantidad del material extraída en toneladas, fecha de apertura, cierre, si está activa, área de excavación (en km2), cantidad de pozos que la forman y vida esperada (en años).



package POOTALLER.Entrega;


public class Mina {
    private String nombre, propietario, mineral, fechaApertura, fechaCierre;
    private int reservas, reservasExtraidas, cantidadPozos, vidaEsperada ;
    private double areaExcavacion, latitud, longitud;
    private boolean estaActiva;
        public Mina(String nombre, String propietario, String mineral, String fechaApertura, String fechaCierre, int reservas, int reservasExtraidas, int cantidadPozos, int vidaEsperada, double areaExcavacion, double latitud, double longitud,  boolean estaActiva){
            this.nombre = nombre;
            this.propietario = propietario;
            this.mineral = mineral;
            this.fechaApertura = fechaApertura;
            this.fechaCierre = fechaCierre;
            this.reservas = reservas;
            this.reservasExtraidas = reservasExtraidas;
            this.cantidadPozos = cantidadPozos;
            this.vidaEsperada = vidaEsperada;
            this.areaExcavacion = areaExcavacion;
            this.latitud = latitud;
            this.longitud = longitud;
            this.estaActiva = estaActiva;
        }
            public String getNombre() {
                return nombre;
            }
            public String getPropietario(){
                return propietario;
            }
            public String getMineral(){
                return mineral;
            }
            public String getFechaApertura(){
                return fechaApertura;
            }
            public String getFechaCierre(){
                return fechaCierre;
            }
            public int getReservas(){
                return reservas;
            }
            public int getReservasExtraidas(){
                return reservasExtraidas;
            }
            public int getCantidadPozos(){
                return cantidadPozos;
            }
            public int getVidaEsperada(){
                return vidaEsperada;
            }
            public double getAreaExcavacion(){
                return areaExcavacion;
            }
            public double getLatitud(){
                return latitud;
            }
            public double getLongitud(){
                return longitud;
            }
            public boolean getEstaActiva(){
                return estaActiva;
            }
            public void setNombre(String nombre){
                this.nombre = nombre;
            }
            public void setPropietario(String propietario){
                this.propietario = propietario;
            }
            public void setMineral(String mineral){
                this.mineral = mineral;
            }
            public void setFechaApertura(String fechaApertura){
                this.fechaApertura = fechaApertura;
            }
            public void setFechaCierre(String fechaCierre){
                this.fechaCierre = fechaCierre;
            }
            public void setReservas(int reservas){
                this.reservas = reservas;
            }
            public void setReservasExtraidas(int reservasExtraidas){
                this.reservasExtraidas = reservasExtraidas;
            }
            public void setCantidadPozos(int cantidadPozos){
                this.cantidadPozos = cantidadPozos;
            }
            public void setVidaEsperada(int vidaEsperada){
                this.vidaEsperada = vidaEsperada;
            }
            public void setAreaExcavacion(double areaExcavacion){
                this.areaExcavacion = areaExcavacion;
            }
            public void setLatitud(double latitud){
                this.latitud = latitud;
            }
            public void setLongitud(double longitud){
                this.longitud = longitud;
            }
            public void setEstaActiva(boolean estaActiva){
                this.estaActiva = estaActiva;
            }
                public String toString(){
                    return "Mina [nombre = " + nombre + ", propietario = " + propietario + ", mineral = " + mineral + ", fechaApertura = " + fechaApertura + ", fechaCierre = " + fechaCierre + ", reservas = " + reservas + ", reservasExtraidas = " + reservasExtraidas + ", cantidadPozos = " + cantidadPozos + ", vidaEsperada = " + vidaEsperada + ", areaExcavacion = " + areaExcavacion + ", latitud = " + latitud + ", longitud = " + longitud + ", estaActiva = " + estaActiva + "]";
                }
}
