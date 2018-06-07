/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.business.implementation;

import co.com.poli.apphabitacionreserva.business.IHabitacionBusiness;
import co.com.poli.apphabitacionreserva.dao.IHabitacionDao;
import co.com.poli.apphabitacionreserva.dao.implementation.HabitacionDaoImpl;
import co.com.poli.apphabitacionreserva.data.habitacionData;
import co.com.poli.apphabitacionreserva.model.Habitacion;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class HabitacionBusinessImpl implements IHabitacionBusiness{
    
    private HabitacionDaoImpl habitacionDaoImpl = new HabitacionDaoImpl();

    @Override
    public String guardarHabitacion(Habitacion habitacion) {
        String respuesta = "";
        Boolean sw = false;
        List<Habitacion> listaHabitacion = habitacionData.getListaHabitaciones();
        for (Habitacion habitacion1 : listaHabitacion) {
            if (habitacion1.getIdHabitacion().equals(habitacion.getIdHabitacion())) {
                respuesta = "Habitacion ya existe";
                sw = true;
            }
        }
        if (sw == true) {
            return respuesta;
        } else {
            respuesta = habitacionDaoImpl.guardarHabitacion(habitacion);
            return respuesta;
        }
    }

    @Override
    public Boolean validarExistencia(String idHabitacion) {
        return true;
    }

    @Override
    public Boolean validarCamas(String idHabitacion, Integer numCamas) {
        return true;
    }

    @Override
    public Habitacion retornarHabitacion(String idHabitacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
