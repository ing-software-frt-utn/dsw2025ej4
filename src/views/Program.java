package views;

import data.Persistencia;
import domain.TipoAlimentacion;

import javax.swing.*;
import java.util.InvalidPropertiesFormatException;

public class Program {

    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        AgregarAnimalView view = new AgregarAnimalView();
        view.setVisible(true);
    }
}
