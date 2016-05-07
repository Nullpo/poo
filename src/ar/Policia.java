package ar;

/**
 * Created by pablo on 05/05/16.
 */
public class Policia {
    private static String comisario;

    public static boolean avisar(Empadronado v) {
        Policia.comisario = "Peron";
        throw new EsUnChorroException(v.toString());
    }

}
