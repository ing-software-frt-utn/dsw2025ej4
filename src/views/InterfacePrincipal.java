package views;

public interface InterfacePrincipal {
    public static String OPC_CARGAR = "pantala principal opcion cargar animal";
    public static String OPC_LISTAR = "pantalla principal opcion listar";
    public static String OPC_SALIR = "pantalla principal opcion salir";
    
    public void ejecutar();
    public void salir();
    public void setControlador(controlador.Controlador c);
}

