/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import SessionBeans.ConnectionSingletonSessionBean;
import SessionBeans.RegisterSessionBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fahdo
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */   
            String username = request.getParameter("username");
            String password = request.getParameter("password");  
            String email = request.getParameter("email");
            String date = request.getParameter("date");
            String sexe = request.getParameter("sexe");
             ConnectionSingletonSessionBean cnx;
           cnx=new ConnectionSingletonSessionBean();
           Connection conn = cnx.ConnexionDB();
            RegisterSessionBean register = new RegisterSessionBean();

           //boolean test =register.RegisterUser(conn, "fares", "fares@gmail.com", "fares123", "21/06/1995", "Homme");
           //System.out.println(test);
           boolean test =register.RegisterUser(conn, username, email, password, date, sexe);
           if(test){
                            response.sendRedirect("/jeeapp-war/index.html");  

           }
                            response.sendRedirect("/jeeapp-war/register.html");  

           
            
            }
        catch(Exception e ){System.out.println(e.toString());}
            
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
