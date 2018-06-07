/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.dao.implementation;

import co.com.poli.apphabitacionreserva.dao.IHabitacionDao;
import co.com.poli.apphabitacionreserva.data.habitacionData;
import co.com.poli.apphabitacionreserva.model.Habitacion;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class HabitacionDaoImpl implements IHabitacionDao{

    @Override
    public String guardarHabitacion(Habitacion habitacion) {
        List<Habitacion> listaHabitaciones = habitacionData.getListaHabitaciones();
        listaHabitaciones.add(habitacion);
        habitacionData.setListaHabitaciones(listaHabitaciones);
        return "Habitacion creada";
    }

   
}
