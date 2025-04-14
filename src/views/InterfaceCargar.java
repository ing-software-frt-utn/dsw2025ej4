package views;

import domain.Especie;
import domain.Pais;
import domain.Sector;
import java.util.ArrayList;

public interface InterfaceCargar {
    public static String BTN_VOLVER = "Pantalla cargar animales btn volver";
    public static String BTN_CARGAR = "Pantalla cargar animales btn cargar";

    
    public void ejecutar();
    public void volver();
    public void setControlador(controlador.Controlador c);
    public void cargarEspecies(ArrayList<Especie> lista);
    public void cargarSector(ArrayList<Sector> lista);
    public void cargarPais(ArrayList<Pais> lista);
    public void cargarSecoresFiltrados(ArrayList<Sector> lista, String tipoAlimentacion);
    public void inicializarEventos();

}
