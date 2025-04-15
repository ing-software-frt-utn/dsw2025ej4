package views;

import data.Persistencia;
import domain.*;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class Controlador {
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
     public static ArrayList<EspecieViewModel> getEspeciesCmb(){
       ArrayList<EspecieViewModel> especies = new ArrayList<>();
       for(Especie especie: Persistencia.getEspecies()){
           especies.add(new EspecieViewModel(especie));
       }
       return especies;
    }
      
      
      public static ArrayList<SectorViewModel> getSectoresCmb(){
          ArrayList<SectorViewModel> sectores = new ArrayList<>();
          for (Sector sector: Persistencia.getSectores()){
              sectores.add(new SectorViewModel(sector));
          }
          return sectores;
      }
    
    public static ComidaViewModel  calcularComida(){
        double totalCarnivoros = Persistencia.getTotalComida(TipoAlimentacion.CARNIVORO);
        double totalHerbivoros = Persistencia.getTotalComida(TipoAlimentacion.HERBIVORO);
        return new ComidaViewModel(totalCarnivoros, totalHerbivoros);
    }
     public static void crearCarnivoro(EspecieViewModel especieSelec, int edadSelec, double pesoSelec, SectorViewModel sectorSelec) throws InvalidPropertiesFormatException {
     Especie especie = new Especie(especieSelec.getNombre(),especieSelec.getTipoAlimentacion(),especieSelec.getPorcentajePesoCarnivoro()); 
     Sector sector = buscarSector(sectorSelec.getNumero());
     
     
     Carnivoro carnivoro = new Carnivoro(edadSelec,pesoSelec,especie,sector);
     
     Persistencia.AddAnimal(carnivoro);
     

    }

    public static void crearHerbivoro(EspecieViewModel especieSelec, int edadSelec, double pesoSelec, SectorViewModel sectorSelec, double valorHerbivoroSelec) throws InvalidPropertiesFormatException {
     Especie especie = new Especie(especieSelec.getNombre(),especieSelec.getTipoAlimentacion(),especieSelec.getPorcentajePesoCarnivoro()); 
     Sector sector = buscarSector(sectorSelec.getNumero());
     
     
     Herbivoro herbivoro = new Herbivoro(edadSelec,pesoSelec,especie,sector,valorHerbivoroSelec);
     
     Persistencia.AddAnimal(herbivoro);  
    }
    
    public static Sector buscarSector(int numero){
        return Persistencia.getSectorPorNum(numero);
    }
   
}
