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
public class Habitacion {
    
    private String idHabitacion;
    private String tipoHabitacion;
    private Integer numeroCamas;
    private Integer numeroCamasDisponibles;
    private String bañoPrivado;
    private Double precio;
    private Boolean estado = false;

    public Habitacion(String idHabitacion, String tipoHabitacion, Integer numeroCamas, String bañoPrivado, Double precio) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.numeroCamas = numeroCamas;
        this.bañoPrivado = bañoPrivado;
        this.precio = precio;
        numeroCamasDisponibles = numeroCamas;
        
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(String idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public String getBañoPrivado() {
        return bañoPrivado;
    }

    public void setBañoPrivado(String bañoPrivado) {
        this.bañoPrivado = bañoPrivado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getNumeroCamasDisponibles() {
        return numeroCamasDisponibles;
    }

    public void setNumeroCamasDisponibles(Integer numeroCamasDisponibles) {
        this.numeroCamasDisponibles = numeroCamasDisponibles;
    }
    
    
    
    
    
}
