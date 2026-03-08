//En el estacionamiento municipal todos los días entran y salen autos. Cada auto,
//identificado por su patente, al ingresar se le marca la hora de ingreso, a la salida, se
//marca la hora de salida, de la diferencia de ingreso-salida, se obtiene el valor a pagar
//por el usuario. L valor es proporcional, siendo $ 50 por hora. 

package POOTALLER.Entrega;


public class Auto {
    private String patente;
    private int horaIngreso, horaSalida;
        public Auto(String patente, int horaIngreso, int horaSalida){
            this.patente = patente;
            this.horaIngreso = horaIngreso;
            this.horaSalida = horaSalida;
        }
            public String getPatente() {
                return patente;
            }
            public void setPatente(String patente){
                this.patente = patente;
            }
            public int getHoraIngreso() {
                return horaIngreso;
            }
            public void setHoraIngreso(int horaIngreso){
                this.horaIngreso = horaIngreso;
            }
            public int getHoraSalida() {
                return horaSalida;
            }
            public void setHoraSalida(int horaSalida){
                this.horaSalida = horaSalida;
            }

}