package ar;

/**
 * Created by pablo on 05/05/16.
 */
public class Candidato {

    private final String nombre;
    private Integer votos = 0;

    public Candidato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void sumarVoto() {
        this.votos++;
    }
}
