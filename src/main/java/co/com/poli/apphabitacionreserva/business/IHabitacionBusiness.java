/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.business;

import co.com.poli.apphabitacionreserva.model.Habitacion;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public interface IHabitacionBusiness {
    String guardarHabitacion(Habitacion habitacion);
    Habitacion obtenerHabitacion(String idHabitacion);
    Boolean validarCamas(String idHabitacion, Integer numCamas);
    List<Habitacion> listarHabitaciones();
    Double valorHabitacionDisponible();
    Integer habitacionesCamaReservada();
}
