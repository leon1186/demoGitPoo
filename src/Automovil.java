public class Automovil extends Vehiculo {
    private boolean descapotable;

    public boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void cambioAceite() {
        System.out.println("se cambio aceite al automovil siempre ");
    }
}
