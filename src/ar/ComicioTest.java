package ar;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablo on 05/05/16.
 */
public class ComicioTest {

    @Test
    public void crearComicio(){
        Modo modo = null;
        List<Candidato> candidatos = null;
        Padron padron = null;

        Comicio c = new Comicio(modo, candidatos, padron);
    }
    @Test
    public void asignarConfiguracion(){
        Modo modo = new Ballotage("Elecciones 2015");
        Modo otroModo = new Ballotage("SARAZASASASASASAS");
        List<Candidato> candidatos = new ArrayList<>();
        Padron padron = new Padron();

        Comicio c = new Comicio(modo, candidatos, padron);

        Assert.assertEquals(modo,c.getModo());
        Assert.assertEquals(candidatos,c.getCandidatos());
        Assert.assertEquals(padron,c.getPadron());

        Assert.assertNotEquals(otroModo, c.getModo());
    }

    public void votar(){
        Modo modo = new Ballotage("Elecciones 2015");
        List<Candidato> candidatos = new ArrayList<>();
        Candidato scioli = new Candidato("Scioli");
        Candidato binner = new Candidato("Binner");
        candidatos.add(scioli);
        candidatos.add(binner);

        Padron padron = new Padron();
        Empadronado pablito = new Empadronado("33893893","Pablito",false);
        Empadronado anita = new Empadronado("29041864","Anita",false);
        padron.addEmpadronado(pablito);

        Comicio c = new Comicio(modo, candidatos, padron);
        if(c.estaHabilitado(pablito)) {
            pablito.vota(binner);
        }

        anita.vota(binner);

        c.vota(pablito, binner);

        //Assert.assertEquals((Integer) 1, c.cantidadVotos());
    }
}