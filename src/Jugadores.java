public abstract class Jugadores  {
    //atributos
    protected String nombre;
    protected String apellido;

    protected int cantFichas =3;

    public Jugadores(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    //metodos

    public Jugadores() {
    }

    protected  void moverFicha () {

    }
    protected  void ponerFicha () {

        if (cantFichas == 0) {
            moverFicha();
        }else {
            System.out.println("ingrese ficha al tablero");
        }
    }
}
