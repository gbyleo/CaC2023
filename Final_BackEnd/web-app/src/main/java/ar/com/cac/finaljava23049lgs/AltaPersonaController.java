package ar.com.cac.finaljava23049lgs;

import java.time.LocalDate;
import java.time.LocalDateTime;

import ar.com.cac.finaljava23049lgs.dao.impl.DAO;
import ar.com.cac.finaljava23049lgs.dao.impl.DAOImpl;
import ar.com.cac.finaljava23049lgs.oop.Persona;
import ar.com.cac.finaljava23049lgs.oop.Usuario;

/**
 * Hello world!
 *
 */
public class AltaPersonaController 
{
    public static void main( String[] args ) throws Exception
    {
       
       /*
        Persona persona1 = new Persona("Perez", "Jorge", 25);
        System.out.println(persona1);

        Usuario usuario1 = new Usuario("userTest", "nombretest", 68,"user1","pass1");
        System.out.println(usuario1);

        Persona usuper = new Usuario("userConte", "nombreConte", 15,"userConte","passConte");
        System.out.println("------------------------");
        System.out.println(usuper);
         */

       

        //hablar puedo usar los metodos de dao sin saber quien cumple el contrato
        //usando los metodos que tiene la dao sin saber quien cumple el contrato


        //CREATE CONTROLLER 
        //Del front tendria que obtener los siguientes valores:
        String apellido ="del form";
        String nombre = "del form";
        int edad = 10 ;
        boolean tieneUsuario = true;
        String foto = "fotoinstancia";
        LocalDateTime fechaRegistro = LocalDateTime.now();
        String user= "del form";
        String pass ="del form";
        LocalDate fechaCreacion = LocalDate.now();
        
        
        Persona nuevaPersona = new Usuario(apellido, nombre,edad, user, pass);

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

