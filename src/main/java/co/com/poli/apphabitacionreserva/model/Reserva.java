/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.model;

/**
 *
 * @author ANDRESCOGI
 */
public class Reserva {

    private String idReserva;
    private Habitacion habitacion;
    private Integer numCamas;

    public Reserva(String idReserva, Habitacion habitacion, Integer numCamas) {
        this.idReserva = idReserva;
        this.habitacion = habitacion;
        this.numCamas = numCamas;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

}
