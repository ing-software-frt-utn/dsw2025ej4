package data;

import static data.Persistencia.agregarCarnivoro;
import domain.*;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import javax.swing.JOptionPane;
import views.ListarAnimalesView;
import views.VentanaAgregacion;

public class Persistencia {
    private static ArrayList<Mamifero> animales = new ArrayList<>();
    private static ArrayList<Sector> sectores = new ArrayList<>();
    private static ArrayList<Especie> especies = new ArrayList<>();
    private static ArrayList<Pais> paises = new ArrayList<>();

    private static void inicializarEspecies() {
        especies.add(new Especie("León", TipoAlimentacion.CARNIVORO, 0.2));
        especies.add(new Especie("Jirafa", TipoAlimentacion.HERBIVORO, 0));
        especies.add(new Especie("Tigre", TipoAlimentacion.CARNIVORO, 0.15));
        especies.add(new Especie("Elefante", TipoAlimentacion.HERBIVORO, 0));
    }

    private static void inicializarSectores() {
        Empleado raul = new Empleado("Raul A", "20111222", "Tucumán" );
        Empleado maria = new Empleado("Maria B", "30111222", "Tucumán" );
        sectores.add(new Sector(1, -26.250724, -65.522827, 10, TipoAlimentacion.HERBIVORO, raul));
        sectores.add(new Sector(2, -26.252359, -65.521511, 10, TipoAlimentacion.CARNIVORO, maria));
        sectores.add(new Sector(3, -26.254661, -65.522726, 10, TipoAlimentacion.HERBIVORO, maria));
        sectores.add(new Sector(4, -26.257250, -65.523514, 10, TipoAlimentacion.CARNIVORO, raul));
    }
    
    private static void inicializarPaises(){
        paises.add(new Pais("Madagascar","450"));
        paises.add(new Pais("Rusia","643"));
        paises.add(new Pais("India","356"));
        paises.add(new Pais("Brasil","076"));
        paises.add(new Pais("Australia","036"));
    }

    public static void inicializar() throws InvalidPropertiesFormatException{
        inicializarEspecies();
        inicializarSectores();
        inicializarPaises();
    }

    public static ArrayList<Mamifero> getAnimales() {
        return animales;
    }

    public static ArrayList<Sector> getSectores() {
        return sectores;
    }

    public static ArrayList<Especie> getEspecies() {
        return especies;
    }

    public static double getTotalComida(TipoAlimentacion tipoAlimentacion) {
        double total = 0;
        for(Mamifero animal : animales){
            total += animal.TieneAlimentacion(tipoAlimentacion) ? animal.calcularCantidadDeComida() : 0;
        }
        return total;
    }
    
     public static void agregarHerbivoro(int edad, double peso, Especie especie, Sector sector, double valorFijo, Pais pais) throws InvalidPropertiesFormatException{
        Herbivoro herbivoro = new Herbivoro(edad, peso, especie, sector, valorFijo, pais);
        animales.add(herbivoro);
    }

    public static void agregarCarnivoro(int edad, double peso, Especie especie, Sector sector, Pais pais) throws InvalidPropertiesFormatException  {
        Carnivoro carnivoro = new Carnivoro(edad, peso, especie, sector, pais);
        animales.add(carnivoro);
    }
   
    
    
    public static VentanaAgregacion v = new VentanaAgregacion();
       public static ListarAnimalesView vent = new ListarAnimalesView();
    
       
       public static void Botonagregar(){
         
     
        v.setVisible(true);
    }
    
      public static void BotonListar(){      
        vent.listarAnimales();
          vent.setVisible(true);
    }
     public static void BotonVolverAgregacion(){
          v.setVisible(false);
    }    
       public static void BotonVolverListar(){
          vent.setVisible(false);
    } 
        
     public static void agregarAnimal() throws InvalidPropertiesFormatException {
      int edad;
      double peso;
      try {
   edad=Integer.parseInt(v.getTexto2().getText());
   peso=Double.parseDouble(v.getTexto1().getText());
      }
    catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null,"Error: Edad o peso con formato incorrecto.", "Error en los datos",JOptionPane.ERROR_MESSAGE);
        return;
            }
   
   double valorFijo=Double.parseDouble(v.getTexto3().getText());        
   Especie especie=especies.get(v.getBox1().getSelectedIndex());
   Sector sector=sectores.get(v.getBox3().getSelectedIndex());
   Pais pais=paises.get(v.getBox2().getSelectedIndex());
   
   
         if(especie.getTipoAlimentacion().esCarnivoro()){
            
    try {
         agregarCarnivoro(edad, peso,especie,sector,pais); // este es el que lanza la excepción
    } catch (InvalidPropertiesFormatException e) {
        
        System.err.println("Error al agregar el animal: " + e.getMessage());
    }
}
         else{
           try {
         agregarHerbivoro(edad, peso,especie,sector,valorFijo,pais); // este es el que lanza la excepción
    } catch (InvalidPropertiesFormatException e) {
        
        System.err.println("Error al agregar el animal: " + e.getMessage());
    }
         }
  
  }
}
