package ar.com.cac.finaljava23049lgs;

import java.io.IOException;
import java.util.ArrayList;

import ar.com.cac.finaljava23049lgs.dao.impl.DAO;
import ar.com.cac.finaljava23049lgs.dao.impl.DAOImpl;
import ar.com.cac.finaljava23049lgs.oop.Persona;
import ar.com.cac.finaljava23049lgs.oop.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ListadoPersonasController")
public class ListadoPersonasController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // interface nombre = new claseQueLaImplementa();
        DAO dao = new DAOImpl();

        try {
            ArrayList<Persona> listado = dao.findAll();

            System.out.println(listado);

            // guardar en request de tomcat
            req.setAttribute("listado", listado);

            // redireccion
            getServletContext().getRequestDispatcher("listado.jsp").forward(req, res);

        } catch (Exception e) {


            var listado = new ArrayList<>();
            req.setAttribute("listado", listado);
             
            //habiendo error o no lo redirecciono a listado.jsp
               getServletContext().getRequestDispatcher("listado.jsp").forward(req, res);
        }
    }
}
