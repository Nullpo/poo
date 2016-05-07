package ar;

/**
 * Created by pablo on 05/05/16.
 */
public class Ballotage implements Modo {
    private final String nombre;

    public Ballotage(String nombre) {
        this.nombre = nombre;
    }


    public String toString(){
        return "Ballotage: " + nombre;
    }
}
