
package views;

public interface InterfaceMenu {
    
    public static String botonListarInt = "boton de listar menu";
    public static String botonAgregarInt = "boton de agregar al menu";
    public static String botonSalirInt = "boton de salir de la ventana Menu";

    public void ejecutar();

    public void salir();
    
    public void setControlador(views.Controlador c);
}
