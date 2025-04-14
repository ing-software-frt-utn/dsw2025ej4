package controlador;

import domain.*;
import data.Persistencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
//import java.awt.event.ActionListener;
import views.*;

public class Controlador implements ActionListener{
    private MenuPrincipal pantallaPrincipal;
    private CargarAnimal pantallaCargarAnimal;
    private ListarAnimalesView pantallaLista;

    public Controlador() {
        pantallaPrincipal = new MenuPrincipal();
        pantallaCargarAnimal = new CargarAnimal();
        pantallaLista = new ListarAnimalesView();
        
    }
    
    public void ejecutar(){
        pantallaPrincipal.setControlador(this);
        pantallaPrincipal.ejecutar();
        pantallaCargarAnimal.setControlador(this);
        pantallaLista.setControlador(this);
    }
    
    public void actionPerformed(ActionEvent e){
        System.out.println("Se produjo un evento [" + e.getActionCommand()+ "]");
        if(e.getActionCommand().equals(pantallaPrincipal.OPC_CARGAR)){
    try {
        Persistencia.inicializar(); // Asegura que las listas estén cargadas
    } catch (InvalidPropertiesFormatException ex) {
        ex.printStackTrace();
    }

    // Obtener las listas desde Persistencia
    ArrayList<Especie> listaEspecies = Persistencia.getEspecies();
    ArrayList<Pais> listaPaises = Persistencia.getPaises();
    ArrayList<Sector> listaSectores = Persistencia.getSectores();

    // Cargar en la vista
    pantallaCargarAnimal.cargarEspecies(listaEspecies);
    pantallaCargarAnimal.cargarPais(listaPaises);
    pantallaCargarAnimal.cargarSector(listaSectores);

    // Mostrar pantalla
    pantallaCargarAnimal.ejecutar();
    pantallaPrincipal.salir();
}
        if(e.getActionCommand().equals(pantallaPrincipal.OPC_LISTAR)){
            pantallaLista.ejecutar();
            pantallaPrincipal.salir();
        }
        if(e.getActionCommand().equals(pantallaPrincipal.OPC_SALIR)){
            pantallaPrincipal.salir();
        }
        if(e.getActionCommand().equals(pantallaCargarAnimal.BTN_VOLVER)){
            pantallaCargarAnimal.volver();
            pantallaPrincipal.ejecutar();
        }
        if(e.getActionCommand().equals(pantallaCargarAnimal.BTN_CARGAR)){
            
        }
        if(e.getActionCommand().equals(pantallaLista.BTN_VOLVER)){
            pantallaLista.volver();
            pantallaPrincipal.ejecutar();
        }
        
    }
}
 
