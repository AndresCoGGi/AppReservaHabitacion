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
import java.util.Objects;

/**
 *
 * @author ANDRESCOGI
 */
public class HabitacionBusinessImpl implements IHabitacionBusiness {

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
    public Boolean validarCamas(String idHabitacion, Integer numCamas) {
        Boolean swCamas = true;
        List<Habitacion> listaHabitacion = habitacionDaoImpl.listarHabitaciones();
        for (Habitacion habitacion : listaHabitacion) {
            if (habitacion.getIdHabitacion().equals(idHabitacion)) {
                if (habitacion.getTipoHabitacion().equals("privada")) {
                    if (!Objects.equals(numCamas, habitacion.getNumeroCamas())) {
                        swCamas = false;
                    } else {
                        Integer numeroCamas = 0;
                        numeroCamas = habitacion.getNumeroCamasDisponibles();
                        numeroCamas = numeroCamas - numCamas;
                        habitacion.setNumeroCamasDisponibles(numeroCamas);
                        habitacion.setEstado(true);
                    }
                } else {
                    if (numCamas > habitacion.getNumeroCamas()) {
                        swCamas = false;
                    } else {
                        Integer numeroCamas = 0;
                        numeroCamas = habitacion.getNumeroCamasDisponibles();
                        numeroCamas = numeroCamas - numCamas;
                        habitacion.setNumeroCamasDisponibles(numeroCamas);
                        habitacion.setEstado(true);
                    }
                }
            }
        }
        return swCamas;
    }

    @Override
    public Habitacion obtenerHabitacion(String idHabitacion) {
        return habitacionDaoImpl.obtenerHabitacion(idHabitacion);
    }

    @Override
    public List<Habitacion> listarHabitaciones() {
        return habitacionDaoImpl.listarHabitaciones();
    }

//    @Override
//    public String valorHabitacionDisponible() {
//        List<Habitacion> listaHabitacion = habitacionDaoImpl.listarHabitaciones();
//        for (Habitacion habitacion : listaHabitacion) {
//            if(habitacion.){
//                
//            }
//        }
//    }
    @Override
    public Integer habitacionesCamaReservada() {
        Integer contHabiRe = 0;
        List<Habitacion> listaHabitacion = habitacionDaoImpl.listarHabitaciones();
        for (Habitacion habitacion : listaHabitacion) {
            if (habitacion.getEstado() == true) {
                contHabiRe++;
            }
        }
        return contHabiRe;
    }

}
