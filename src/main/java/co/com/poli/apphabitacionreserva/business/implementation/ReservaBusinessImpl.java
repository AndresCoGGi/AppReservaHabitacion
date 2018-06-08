/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.business.implementation;

import co.com.poli.apphabitacionreserva.business.IReservaBusiness;
import co.com.poli.apphabitacionreserva.dao.implementation.ReservaDaoImpl;
import co.com.poli.apphabitacionreserva.data.ReservaData;
import co.com.poli.apphabitacionreserva.model.Reserva;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class ReservaBusinessImpl implements IReservaBusiness {

    private ReservaDaoImpl reservaDaoImpl = new ReservaDaoImpl();

    @Override
    public String guardarReserva(Reserva reserva) {
        String respuesta = "";
        Boolean sw = false;
        List<Reserva> listaReserva = ReservaData.getListaReservas();
        for (Reserva reserva1 : listaReserva) {
            if (reserva1.getIdReserva().equals(reserva.getIdReserva())) {
                respuesta = "Reserva ya existe";
                sw = true;
            }
        }
        if (sw == true) {
            return respuesta;
        } else {
            respuesta = reservaDaoImpl.guardarReserva(reserva);
            return respuesta;
        }

    }

    @Override
    public List<Reserva> listarReservas() {
        return reservaDaoImpl.listarReservas();
    }

}
