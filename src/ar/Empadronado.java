package ar;

/**
 * Created by pablo on 05/05/16.
 */
public class Empadronado {
    private final String dni;
    private final String nombre;
    private final Boolean fugitivo;
    private boolean vote = false;

    public Empadronado(String dni, String nombre, Boolean fugitivo) {
        this.dni = dni;
        this.nombre = nombre;
        this.fugitivo = fugitivo;
    }

    public String toString(){
        String resp = this.dni + " - " + this.nombre;
        if(this.fugitivo){
            return resp + " - OJO AL PIOJO!!!";
        }
        return resp;
    }

    public void vota(Candidato candidato) {
        if(!this.vote){
            candidato.sumarVoto();
            this.vote = true;
        }
    }

    public boolean hasVote(){
        return this.vote;
    }

    public boolean isFugitivo() {
        return fugitivo;
    }
}
