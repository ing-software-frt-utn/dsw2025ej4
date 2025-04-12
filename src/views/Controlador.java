package views;

import data.Persistencia;
import domain.*;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class Controlador {

    public static TipoAlimentacion[] getTiposAlimentacion() {
        return TipoAlimentacion.values();
    }

    public static ArrayList<Especie> getEspecies() {
        return Persistencia.getEspecies();
    }

    public static ArrayList<Sector> getSectores() {
        return Persistencia.getSectores();
    }

    public static void guardarAnimalDesdeVista(
            int edad, double peso, Especie especie, Sector sector, double valorFijo, Pais pais
    ) throws InvalidPropertiesFormatException {

        TipoAlimentacion tipo = especie.getTipoAlimentacion();

        if (tipo == TipoAlimentacion.HERBIVORO) {
            Herbivoro herbivoro = new Herbivoro(edad, peso, especie, sector, valorFijo, pais);
            guardarAnimal(herbivoro);
        } else {
            Carnivoro carnivoro = new Carnivoro(edad, peso, especie, sector, pais);
            guardarAnimal(carnivoro);
        }
    }
    public static void guardarAnimal(Mamifero mamifero){
        Persistencia.agregarAnimal(mamifero);
    }

    public static ArrayList<Pais> getPaises() {
        return Persistencia.getPaises();
    }

    public static ArrayList<AnimalViewModel> getAnimales() {
        ArrayList<AnimalViewModel> animales = new ArrayList<>();
        for (Mamifero animal : Persistencia.getAnimales()) {
            animales.add(new AnimalViewModel(animal));
        }
        return animales;
    }

    public static ComidaViewModel calcularComida() {
        double totalCarnivoros = Persistencia.getTotalComida(TipoAlimentacion.CARNIVORO);
        double totalHerbivoros = Persistencia.getTotalComida(TipoAlimentacion.HERBIVORO);
        return new ComidaViewModel(totalCarnivoros, totalHerbivoros);
    }
}
