/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.data;

import co.com.poli.apphabitacionreserva.model.Habitacion;
import co.com.poli.apphabitacionreserva.model.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class ReservaData {
    
    private static List<Reserva> listaReservas;
    
    static{
        listaReservas = new ArrayList<Reserva>(){
            {
//                add(new Reserva("909", new Habitacion("001", "compartida", 10, "no", 30000D), 2));
//                add(new Reserva("809", new Habitacion("004", "privada", 12, "si", 50000D), 4));
                
            }  
        };
    }

    public static List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public static void setListaReservas(List<Reserva> aListaReservas) {
        listaReservas = aListaReservas;
    }

    
    
    
    
}
