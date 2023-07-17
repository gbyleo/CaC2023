package ar.com.cac.finaljava23049lgs;

import java.io.IOException;
//import java.time.LocalDate;
import java.time.LocalDateTime;

import ar.com.cac.finaljava23049lgs.dao.impl.DAO;
import ar.com.cac.finaljava23049lgs.dao.impl.DAOImpl;
import ar.com.cac.finaljava23049lgs.oop.Persona;
import ar.com.cac.finaljava23049lgs.oop.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
/*
import java.io.IOException;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
*/
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Hello world!
 *
 */
@WebServlet("/AltaPersonaController")
public class AltaPersonaController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
      
        /*
        Persona persona1 = new Persona("Perez", "Jorge", 25);
        System.out.println(persona1);

        Usuario usuario1 = new Usuario("userTest", "nombretest", 68,"user1","pass1");
        System.out.println(usuario1);

        Persona usuper = new Usuario("userConte", "nombreConte", 15,"userConte","passConte");
        System.out.println("------------------------");
        System.out.println(usuper);
         */
      
        /*
        //hablar puedo usar los metodos de dao sin saber quien cumple el contrato
        //usando los metodos que tiene la dao sin saber quien cumple el contrato


        //CREATE CONTROLLER 
        //Del front tendria que obtener los siguientes valores:
         */
        
        System.out.println("AltaArticuloController");
        String apellido =req.getParameter("apellido");
        String nombre =req.getParameter("nombre");
        int edad = Integer.parseInt(req.getParameter("edad"));
        LocalDateTime fechaRegistro = LocalDateTime.now();
        String user= "user";
        String pass ="pass";
        String codigo = "XYZ";

        
        
        Persona nuevaPersona = new Usuario(apellido,nombre,edad,user,pass,fechaRegistro,codigo);



     
     
























        //interface nombre = new claseQueLaImplementa();
        DAO dao = new DAOImpl();
        

        try{
            dao.create(nuevaPersona);
        } catch (Exception e){
            e.printStackTrace();
        }
         System.out.println(nuevaPersona);
    




//CONTROLLER BUSCARPOR ID
       // Persona p = dao.getById(1);
         //   System.out.println(p);
        }

    

}

