package trabajosP.tp4;

public class auto {
    private String patente;
    private int movimientos;

    public Auto (String patente, int movimientos) {
        this.patente = patente;
        this.movimientos = 0;
    }

    public String getPatente() {
        return patente;
    }

    public void mover() {
        movimientos++;
    }

    public int getMovimientos() {
        return movimientos;
    }

    @Override
    public String toString() {
        return "Auto " + patente + " (movido " + movimientos + " veces)";
    }
}
