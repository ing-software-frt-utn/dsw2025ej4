package views;

import data.Persistencia;
import domain.*;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import javax.swing.JOptionPane;

public class Controlador {
      
    static Principal Inicio = new Principal();
    static AgregarAnimales VistaA = new AgregarAnimales(Inicio,true);
    static ListarAnimalesView Lista = new ListarAnimalesView();
       
      
    public static TipoAlimentacion[] getTiposAlimentacion(){
        return  TipoAlimentacion.values();
    }
    public static ArrayList<Especie> getEspecies(){
        return Persistencia.getEspecies();
    }
    public static ArrayList<Sector> getSectores(){
        return Persistencia.getSectores();
    }
    
    public static ArrayList<AnimalViewModel> getAnimales(){
        ArrayList<AnimalViewModel> animales = new ArrayList<>();
        for(Mamifero animal : Persistencia.getAnimales()){
            animales.add(new AnimalViewModel(animal));
        }
        return animales;
    }
    
    public static ComidaViewModel  calcularComida(){
        double totalCarnivoros = Persistencia.getTotalComida(TipoAlimentacion.CARNIVORO);
        double totalHerbivoros = Persistencia.getTotalComida(TipoAlimentacion.HERBIVORO);
        return new ComidaViewModel(totalCarnivoros, totalHerbivoros);       
    }
    
    static void mostrarAgregarAnimales(){
        VistaA.setVisible(true);
    }
    static void cargarTipoAlimentacion(){        
       VistaA.getComboBoxTipoAlimentacion().removeAllItems();
       VistaA.getComboBoxTipoAlimentacion().addItem("CARNIVORO");
       VistaA.getComboBoxTipoAlimentacion().addItem("HERBIVORO");
    }  
    
    static void inicio(){        
     Inicio.setVisible(true);
    }
    
static void cargarEspecie(){        
       
       VistaA.getComboBoxEspecie().removeAllItems();
          
    String tipoSeleccionado = (String) VistaA.getComboBoxTipoAlimentacion().getSelectedItem();
    
    for (Especie animal : Persistencia.getEspecies()) {
        
        
         if (tipoSeleccionado == null) {
        return;
        }
        if (tipoSeleccionado.equals("CARNIVORO") && animal.getTipoAlimentacion().esCarnivoro()) {
            VistaA.getComboBoxEspecie().addItem(animal.getNombre());
        }

        if (tipoSeleccionado.equals("HERBIVORO") && animal.getTipoAlimentacion().esHerbivoro()) {
            VistaA.getComboBoxEspecie().addItem(animal.getNombre());
        }
        
    } 
    Controlador.mostrarValorFijo();
  }

static void cargarSector(){        
       
    VistaA.getComboBoxSector().removeAllItems();

    String tipoSeleccionado = (String) VistaA.getComboBoxTipoAlimentacion().getSelectedItem();
    
    for (Sector sector : Persistencia.getSectores()) {
        
        
        if (tipoSeleccionado == null) {    
        return;
        }
        
        if (tipoSeleccionado.equals("CARNIVORO") && sector.getTipoAlimentacion().esCarnivoro()) {
            VistaA.getComboBoxSector().addItem(Integer.toString(sector.getNumero()));
        }

        if (tipoSeleccionado.equals("HERBIVORO") && sector.getTipoAlimentacion().esHerbivoro()) {
              VistaA.getComboBoxSector().addItem(Integer.toString(sector.getNumero()));
        }
        
    } 
  }

static void cargarEmpleado(){        
       
       VistaA.getComboBoxEmpleado().removeAllItems();
       
       String sectorSeleccionado =(String) VistaA.getComboBoxSector().getSelectedItem();
            
         for (Sector sector : Persistencia.getSectores()) {
             
        if (sectorSeleccionado == null) {    
        return;
        }
        
          if(sectorSeleccionado.equals(Integer.toString(sector.getNumero()))){
              VistaA.getComboBoxEmpleado().addItem(sector.getEmpleado().getNombre());
          }
        }
 }

static void cargarPais() {
        
        VistaA.getComboBoxPais().removeAllItems();
        
        for (Pais pais: Persistencia.getPaises()) {
                
            VistaA.getComboBoxPais().addItem(pais.getNombre());
          }
        }


static void agregarAnimal() {
    String especieSeleccionada = VistaA.getComboBoxEspecie().getSelectedItem().toString();
    String paisSeleccionado = VistaA.getComboBoxPais().getSelectedItem().toString();
    int numeroSector = Integer.parseInt(VistaA.getComboBoxSector().getSelectedItem().toString());

    int edad;
    double peso;

    try {
        edad = Integer.parseInt(VistaA.getEdad().getText());
        peso = Double.parseDouble(VistaA.getPeso().getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null,"Error: Edad o peso con formato incorrecto.", "Error en los datos",JOptionPane.ERROR_MESSAGE);
        return;
    }

    Especie especieEncontrada = null;
    for (Especie especie : Persistencia.getEspecies()) {
        if (especie.getNombre().equals(especieSeleccionada)) {
            especieEncontrada = especie;
            break;
        }
    }


    Sector sectorEncontrado = null;
    for (Sector sector : Persistencia.getSectores()) {
        if (sector.getNumero() == numeroSector) {
            sectorEncontrado = sector;
            break;
        }
    }

 
    Pais paisEncontrado = null;
    for (Pais pais : Persistencia.getPaises()) {
        if (pais.getNombre().equals(paisSeleccionado)) {
            paisEncontrado = pais;
            break;
        }
    }

   
        
         try {
            if(VistaA.getComboBoxTipoAlimentacion().getSelectedItem().equals("CARNIVORO")){
            Carnivoro nuevo = new Carnivoro(edad, peso, especieEncontrada, sectorEncontrado, paisEncontrado);
            Persistencia.getAnimales().add(nuevo);
            //JOptionPane.showMessageDialog(null,"Datos guardados correctamente", "Guardado exitoso",JOptionPane.PLAIN_MESSAGE,iconoRedimensionado);
            }
            if(VistaA.getComboBoxTipoAlimentacion().getSelectedItem().equals("HERBIVORO")){
           
            Herbivoro nuevo = new Herbivoro(edad,peso,especieEncontrada,sectorEncontrado,Double.parseDouble(VistaA.getValorFijo().getText()),paisEncontrado);
            Persistencia.getAnimales().add(nuevo);
            //JOptionPane.showMessageDialog(null,"Datos guardados correctamente", "Guardado exitoso",JOptionPane.PLAIN_MESSAGE,iconoRedimensionado);
                }
            
        } catch (InvalidPropertiesFormatException e) {
            System.out.println("Error al cargar el animal: " + e.getMessage());
        }
    
}

    static void mostrarListaAnimales() {
        Lista.listarAnimales();
        Lista.setVisible(true);
        
    }
    
static void mostrarValorFijo(){
    
    String tipoSeleccionado = (String) VistaA.getComboBoxTipoAlimentacion().getSelectedItem().toString();
     
    if(tipoSeleccionado.equals("CARNIVORO")){
        VistaA.getValorFijo().setEnabled(false);
    }
    else{
        VistaA.getValorFijo().setText("");
        VistaA.getValorFijo().setEnabled(true);
    
    }
}
}