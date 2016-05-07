package ar;

/**
 * Created by pablo on 05/05/16.
 */
public class VotoDobleException extends RuntimeException {
    public VotoDobleException(Empadronado empadronado) {
        super(empadronado.toString());
    }
}
