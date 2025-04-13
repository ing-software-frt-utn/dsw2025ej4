package views;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;

public class Program {

    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        Inicio view = new Inicio();
        view.setVisible(true);
    }
}
