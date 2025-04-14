package data;

import domain.*;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;

public class Persistencia {
    private static ArrayList<Mamifero> animales = new ArrayList<>();
    private static ArrayList<Sector> sectores = new ArrayList<>();
    private static ArrayList<Especie> especies = new ArrayList<>();
    private static ArrayList<Pais> paises = new ArrayList<>();

    private static void inicializarEspecies(String animal) {
        if(animal.equals("León")){
            especies.add(new Especie("León", TipoAlimentacion.CARNIVORO, 0.2));
        }
        if (animal.equals("Jirafa")){
            especies.add(new Especie("Jirafa", TipoAlimentacion.HERBIVORO, 0));
        }
        if(animal.equals("Tigre")){
            especies.add(new Especie("Tigre", TipoAlimentacion.CARNIVORO, 0.15));
        }
        if(animal.equals("Elefante")){
            especies.add(new Especie("Elefante", TipoAlimentacion.HERBIVORO, 0));
        }
    }

    private static void inicializarSectores(String animal) {
        Empleado raul = new Empleado("Raul A", "20111222", "Tucumán" );
        Empleado maria = new Empleado("Maria B", "30111222", "Tucumán" );
        
        if (animal.equals("Jirafa")){
            sectores.add(new Sector(1, -26.250724, -65.522827, 10, TipoAlimentacion.HERBIVORO, raul));
        }
        if(animal.equals("León")){
            sectores.add(new Sector(2, -26.252359, -65.521511, 10, TipoAlimentacion.CARNIVORO, maria));
        }
        if(animal.equals("Elefante")){
            sectores.add(new Sector(3, -26.254661, -65.522726, 10, TipoAlimentacion.HERBIVORO, maria));
        }
        if(animal.equals("Tigre")){
            sectores.add(new Sector(4, -26.257250, -65.523514, 10, TipoAlimentacion.CARNIVORO, raul));
        }
    }
    
    private static void inicializarAnimales(String animal,Pais pais, int edad, int peso, int num) throws InvalidPropertiesFormatException {
        if(animal.equals("León")){
            animales.add(new Carnivoro(edad,peso,especies.get(num), sectores.get(num), pais));
        }
        if(animal.equals("Tigre")){
            animales.add(new Carnivoro(edad,peso,especies.get(num), sectores.get(num), pais));
         }
        if (animal.equals("Jirafa")){
            animales.add(new Herbivoro(edad, peso,especies.get(num), sectores.get(num), 170, pais));
        }
        if(animal.equals("Elefante")){
            animales.add(new Herbivoro(edad, peso,especies.get(num), sectores.get(num), 320, pais));
        }
    }
    
    private static void inicializarPaises(String pais, int codigo){
        paises.add(new Pais(pais,Integer.toString(codigo)));
        
    }

    public static void inicializar(String animal,String pais, int codigo, int edad, int peso) throws InvalidPropertiesFormatException{
        int numb = especies.size();
        Pais pais1 = new Pais(pais,Integer.toString(codigo));
        inicializarEspecies(animal);
        inicializarSectores(animal);
        inicializarPaises(pais,codigo);
        inicializarAnimales(animal,pais1,edad,peso,numb);
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
}
