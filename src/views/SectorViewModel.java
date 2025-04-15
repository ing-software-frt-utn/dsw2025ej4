/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import domain.Empleado;
import domain.Mamifero;
import domain.Sector;
import domain.TipoAlimentacion;
import java.util.ArrayList;


public class SectorViewModel {
     private int numero;
     private TipoAlimentacion tipoAlimentacion;

    public SectorViewModel(Sector sector) {
        this.numero = sector.getNumero();
        this.tipoAlimentacion = sector.getTipoAlimentacion();
    }

    public int getNumero() {
        return numero;
    }

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    
    
 @Override
 public String toString(){
     return ""+numero;
 }
    
}


