/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eagl.bg.sjga.proyecto1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T
 */
public class ServletBuscarHoroscopo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html");
       // response.setContentType("Aplication/vnd.ms-excel");
       PrintWriter out= response.getWriter();
      String nombre=request.getParameter("nombre");
      String signo=request.getParameter("signo");
       out.println("Bienvenido " +nombre+ "a mi servlet escogiste "+signo);
       
    }
}
        