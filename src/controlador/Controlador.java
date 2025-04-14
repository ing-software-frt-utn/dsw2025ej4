package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import domain.*;
import views.*;
import data.Persistencia;
import java.util.InvalidPropertiesFormatException;

public class Controlador implements ActionListener{
    private MenuPrincipal pantallaPrincipal;
    private CargarAnimal pantallaCargarAnimal;
    private ListarAnimalesView pantallaLista;
    
    private List<AnimalViewModel> lista;

    public Controlador() {
        pantallaPrincipal = new MenuPrincipal();
        pantallaCargarAnimal = new CargarAnimal();
        pantallaLista = new ListarAnimalesView();
        lista = new ArrayList<>();
        cargarDatos();
        
    }
    
   public void cargarDatos(){
        try {
            Persistencia.inicializar();
            lista = obtenerDatosAnimales();
        } catch (InvalidPropertiesFormatException e) {
            e.printStackTrace();
        }
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
            pantallaCargarAnimal.ejecutar();
            pantallaPrincipal.salir();
        }
        if(e.getActionCommand().equals(pantallaPrincipal.OPC_LISTAR)){
            pantallaLista.setLista((ArrayList<AnimalViewModel>) lista);
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
        if(e.getActionCommand().equals(pantallaLista.BTN_VOLVER)){
            pantallaLista.volver();
            pantallaPrincipal.ejecutar();
        }
        if(e.getActionCommand().equals(pantallaLista.BTN_MOSTRAR)){
            pantallaLista.setLista((ArrayList<AnimalViewModel>) lista);
        }
        if(e.getActionCommand().equals(pantallaCargarAnimal.BTN_CARGAR)){
     Mamifero nuevo = pantallaCargarAnimal.crearMamifero();
     if(nuevo != null){
        Persistencia.getAnimales().add(nuevo);
        lista.add(new AnimalViewModel(nuevo));
    }
}

}


    
    private ArrayList<AnimalViewModel> obtenerDatosAnimales() {
        ArrayList<AnimalViewModel> animalesViewModel = new ArrayList<>();
        for (Mamifero animal : Persistencia.getAnimales()) {
            animalesViewModel.add(new AnimalViewModel(animal));
        }
        return animalesViewModel;
    }

   
}
