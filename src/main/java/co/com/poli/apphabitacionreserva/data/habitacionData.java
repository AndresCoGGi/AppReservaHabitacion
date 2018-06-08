/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.data;

import co.com.poli.apphabitacionreserva.model.Habitacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class habitacionData {
    private static List<Habitacion> listaHabitaciones;
    
    static{
        listaHabitaciones = new ArrayList<Habitacion>(){
            {
                add(new Habitacion("001", "compartida", 7, "no", 30000D));
                add(new Habitacion("002", "compartida", 8, "no", 30000D));
                add(new Habitacion("003", "privada", 4, "si", 50000D));
                add(new Habitacion("004", "privada", 4, "si", 50000D));
                
            }  
        };
    }

    public static List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public static void setListaHabitaciones(List<Habitacion> aListaHabitaciones) {
        listaHabitaciones = aListaHabitaciones;
    }
    
    
    
}
