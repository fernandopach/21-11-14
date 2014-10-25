
package com.mycompany.maven.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ServletGuardarUsuario extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        SessionFactory factory= HibernateUtilidades.getSessionFactory();
        Session sesion= factory.openSession();
        Transaction tranza= sesion.beginTransaction();
        sesion.update (new Trabajador(1,"sandtra","brenda","gomez"));
        sesion.save(new Trabajador("raton","vaquero","cricri"));
        tranza.commit();
        sesion.close();
        out.println("ya esta guardado este trabajador");
    }

}