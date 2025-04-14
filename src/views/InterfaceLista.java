/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package views;

/**
 *
 * @author userr
 */
public interface InterfaceLista {
    public static String BTN_MOSTRAR = "pantalla lista boton mostrar";
    public static String BTN_VOLVER = "pantalla lista boton volver";
    
    public void ejecutar();
    public void volver();
    public void setControlador(controlador.Controlador c);
}
