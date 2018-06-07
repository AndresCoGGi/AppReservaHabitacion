/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.dao;

import co.com.poli.apphabitacionreserva.model.Habitacion;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public interface IHabitacionDao {
    
    String guardarHabitacion(Habitacion habitacion);
    //List<Habitacion> listarHabitacion();
    
}
