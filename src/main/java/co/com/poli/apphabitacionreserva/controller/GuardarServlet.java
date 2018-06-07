/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.apphabitacionreserva.controller;

import co.com.poli.apphabitacionreserva.business.implementation.HabitacionBusinessImpl;
import co.com.poli.apphabitacionreserva.business.implementation.ReservaBusinessImpl;
import co.com.poli.apphabitacionreserva.model.Habitacion;
import co.com.poli.apphabitacionreserva.model.Reserva;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ANDRESCOGI
 */
public class GuardarServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        HabitacionBusinessImpl hBusinessImpl = new HabitacionBusinessImpl();
        ReservaBusinessImpl rBusinessImpl = new ReservaBusinessImpl();
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crearReserva":
//                Boolean swHabitacion = true;
//                Boolean swCamas = true;
//                String idReservaRe = request.getParameter("txtidreserva");
//                String idHabitacionRe = request.getParameter("txthabitacion");
//                Integer numCamasRe = Integer.valueOf(request.getParameter("txtcamas"));
//                swHabitacion = hBusinessImpl.validarExistencia(idHabitacionRe);
//                swCamas = hBusinessImpl.validarCamas(idHabitacionRe, numCamasRe);
//                if(swHabitacion == true && swCamas == true){
//                    
//                    Reserva reserva = new Reserva(idReservaRe, habitacion, numCamasRe);
//                }
//                
                break;
            case "crearHabitacion":
                Double precio = 0D;
                String idHabitacion = request.getParameter("txtidhabitacion");
                Integer numCamas = Integer.valueOf(request.getParameter("txtnumcamas"));
                String tipoHabitacion = request.getParameter("txttipohabitacion");
                String banoPrivada = request.getParameter("txtbanoprivado");
                if (tipoHabitacion.equals("compartida")) {
                    precio = 30000D;
                } else {
                    precio = 50000D;
                }
                Habitacion habitacion = new Habitacion(idHabitacion, tipoHabitacion, numCamas, banoPrivada, precio);
                String mensaje = hBusinessImpl.guardarHabitacion(habitacion);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            default:
                break;
        }
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
