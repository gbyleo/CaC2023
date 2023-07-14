package ar.com.cac.finaljava23049lgs;

import java.io.IOException;
//import javax.servlet.http.HttpServlet;
import ar.com.cac.finaljava23049lgs.dao.impl.DAO;
import ar.com.cac.finaljava23049lgs.dao.impl.DAOImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EliminarController")
public class EliminarController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    String id = req.getParameter("id");

    DAO dao = new DAOImpl();

try {
        dao.delete(Long.parseLong(id));
} catch (Exception e) {
   e.printStackTrace();
}


        
    }

   


}