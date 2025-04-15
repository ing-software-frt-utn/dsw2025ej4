/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import domain.Especie;
import domain.TipoAlimentacion;


public class EspecieViewModel {
    private String nombre;
    private double porcentajePesoCarnivoro;
    private TipoAlimentacion tipoAlimentacion;

    public EspecieViewModel(Especie especie) {
        this.nombre = especie.getNombre();
        this.porcentajePesoCarnivoro = especie.getPorcentajePesoCarnivoro();
        this.tipoAlimentacion = especie.getTipoAlimentacion();
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentajePesoCarnivoro() {
        return porcentajePesoCarnivoro;
    }

    public void setPorcentajePesoCarnivoro(double porcentajePesoCarnivoro) {
        this.porcentajePesoCarnivoro = porcentajePesoCarnivoro;
    }

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }
    
    
    @Override
    public String toString(){
        return getNombre();
    }
    
}
