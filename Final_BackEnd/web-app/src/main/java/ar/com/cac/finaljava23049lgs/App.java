package ar.com.cac.finaljava23049lgs;

import ar.com.cac.finaljava23049lgs.oop.Persona;
import ar.com.cac.finaljava23049lgs.oop.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona persona1 = new Persona("Perez", "Jorge", 25);
        System.out.println(persona1);

        Usuario usuario1 = new Usuario("userTest", "nombretest", 68,"user1","pass1");
        System.out.println(usuario1);

        Persona usuper = new Usuario("userConte", "nombreConte", 15,"userConte","passConte");
        System.out.println(usuper);

        
    }

    

}

