/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package views;

/**
 *
 * @author USURIO
 */

    public interface InterfaceAgregar {

    public static String botonAgregarInt = "boton de agregar al menu de la vista agregar";
    public static String botonSalirInt = "boton de salir de la vista agregar";

    public void ejecutar();
    
    public void cerrar();

    public void setControlador(views.Controlador c);

    public int getEdad();

    public double getPeso();

    public String getComboPais();

    public String getComboEspecie();

    public int getComboSector();

    public void setEtiquetaAlimentacion(String alimento);
    
    public void actualizarComboSectores(String especie);
    
    public void cargarComboPais(data.Persistencia persistencia);
}

