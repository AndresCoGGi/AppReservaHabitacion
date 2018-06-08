/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.dao.implementation;

import co.com.poli.apphabitacionreserva.dao.IReservaDao;
import co.com.poli.apphabitacionreserva.data.ReservaData;
import co.com.poli.apphabitacionreserva.model.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class ReservaDaoImpl implements IReservaDao {

    @Override
    public String guardarReserva(Reserva reserva) {
        List<Reserva> listaReserva = ReservaData.getListaReservas();
        listaReserva.add(reserva);
        ReservaData.setListaReservas(listaReserva);
        return "Reserva creada";
    }

    @Override
    public List<Reserva> listarReservas() {
        return ReservaData.getListaReservas();
    }

}
