package modelo;

/**
 * Created by martin on 27/07/16.
 */
public class Negocio {

    // singleton
    private static final Negocio negocio = new Negocio();

    public static Negocio getInstance() { return negocio; }

    private Negocio() {

    }

    public void hacerUnaTarea() {
        System.out.println("realice una tarea X");
    }

    public boolean otroProcedimiento() {
        return true;
    }

}
