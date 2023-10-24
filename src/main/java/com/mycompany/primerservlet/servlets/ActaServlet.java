/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.primerservlet.servlets;


import com.mycompany.primerservlet.dao.ActaDao;
import com.mycompany.primerservlet.models.Acta;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aleja
 */
@WebServlet(name = "ActaServlet", urlPatterns = {"/ActaServlet"})
public class ActaServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
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
        ActaDao actaDao = new ActaDao();
        List<Acta> listaActa = actaDao.mostrarRegistros();
       
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaActa", listaActa);
        
        response.sendRedirect("mostrarActas.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id= request.getParameter("id");
        String nombre= request.getParameter("nombre");
        String apellidos= request.getParameter("apellidos");
        String telefono= request.getParameter("telefono");
        String direccion= request.getParameter("direccion");
        String No_casa= request.getParameter("No_casa");
        String muros= request.getParameter("muros");
        String pisos= request.getParameter("pisos");
        String techos= request.getParameter("techos");
        String habitaciones= request.getParameter("habitaciones");
        String banios= request.getParameter("banios");
        String cocina= request.getParameter("cocina");
        
        Acta acta = new Acta(Integer.parseInt(id),nombre,apellidos,telefono,direccion,No_casa,muros,pisos,techos,habitaciones,banios,cocina);
        ActaDao actaDao = new ActaDao();
        
        actaDao.insertarRegistro(nombre, apellidos,telefono, direccion, No_casa, muros , pisos, techos, habitaciones,banios, cocina,Integer.parseInt (id));
        System.out.println("id es :"+ id);
        System.out.println("nombre es:" +nombre);
        System.out.println("apellido es:" +apellidos);
        System.out.println("telefono es:"+telefono);
        System.out.println("direccion es :"+direccion); 
        System.out.println("No casa es:"+ No_casa); 
        System.out.println("muros es:"+muros); 
        System.out.println("pisos es :"+pisos); 
        System.out.println("techos es:"+techos); 
        System.out.println("habitaciones es:"+habitaciones); 
        System.out.println("banios es:"+banios); 
        System.out.println("cocina es:"+cocina);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
