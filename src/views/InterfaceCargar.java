package views;

public interface InterfaceCargar {
    public static String BTN_VOLVER = "Pantalla cargar animales btn volver";
    public static String BTN_CARGAR = "Pantalla carga animales btn cargar";
    
    public void ejecutar();
    public void volver();
    public void setControlador(controlador.Controlador c);
}
