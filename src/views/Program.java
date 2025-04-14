package views;

import data.Persistencia;
import domain.TipoAlimentacion;
import controlador.Controlador;
import javax.swing.*;
import java.util.InvalidPropertiesFormatException;

public class Program {

    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
    
      Controlador c = new Controlador();
      
      c.ejecutar();
       
}
}

