package ar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablo on 05/05/16.
 */
public class Padron {

    private List<Empadronado> empadronados = new ArrayList<>();

    public void addEmpadronado(Empadronado e) {
        this.empadronados.add(e);
    }

}
