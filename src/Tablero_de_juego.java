public class Tablero_de_juego {
    private String tablero [][] = new String[3][3];

    private Jugador jugador1;
    private Jugador jugador2;
    private Ficha ficha;

    public Tablero_de_juego () {
        this.jugador1 = new Jugador();
        this.ficha= new Ficha("rojo", "cruz");
        this.jugador2 = new Jugador();
        this.ficha= new Ficha("azul", "circulo");
    }


}
