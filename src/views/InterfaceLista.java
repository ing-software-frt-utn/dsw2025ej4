package views;

import java.util.ArrayList;

public interface InterfaceLista {
    public static String BTN_MOSTRAR = "pantalla lista boton mostrar";
    public static String BTN_VOLVER = "pantalla lista boton volver";
    
    public void ejecutar();
    public void volver();
    public void setListaConfig(ArrayList<Object[]> lista);
    public void setLista(ArrayList <AnimalViewModel> listaf);
    public void setControlador(controlador.Controlador c); 
    
}
