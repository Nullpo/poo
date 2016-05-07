package ar;

import java.util.List;

/**
 * Created by pablo on 05/05/16.
 */
public class Comicio {

    private final Modo modo;
    private final List<Candidato> candidatos;
    private final Padron padron;

    public Comicio(Modo modo, List<Candidato> candidatos, Padron padron) {
        this.modo = modo;
        this.candidatos = candidatos;
        this.padron = padron;
    }

    public Modo getModo() {
        return modo;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public Padron getPadron() {
        return padron;
    }

    public void vota(Empadronado empadronado, Candidato candidato) {

    }

    public boolean estaHabilitado(Empadronado empadronado) {
        if(empadronado.hasVote()){
            throw new VotoDobleException(empadronado);
        } else if(empadronado.isFugitivo()){
            return Policia.avisar(empadronado);
        }

        return true;
    }
}
