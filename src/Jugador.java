public class Jugador extends Jugadores{

    public Ficha ficha;

    public Jugador(String nombre, String apellido, Ficha ficha) {
        super(nombre, apellido);
        this.ficha = ficha;
    }

    public Jugador() {

    }


    @Override
    protected void ponerFicha() {
        super.ponerFicha();
    }

    @Override
    protected void moverFicha() {
        super.moverFicha();
    }
}
