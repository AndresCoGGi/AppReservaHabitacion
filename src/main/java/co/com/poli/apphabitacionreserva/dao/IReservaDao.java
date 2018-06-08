/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.dao;

import co.com.poli.apphabitacionreserva.model.Reserva;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public interface IReservaDao {
    
    String guardarReserva(Reserva reserva);
    List<Reserva> listarReservas();
}
