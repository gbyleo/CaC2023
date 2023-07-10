package ar.com.cac.finaljava23049lgs.oop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Persona {

    //atributos
    String apellido;
    String nombre;
    int edad;
    boolean tieneUsuario;
    String foto;

    //constructor
    public Persona(String apellido, String nombre, int edad){
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.tieneUsuario = false;
        this.foto = "";

    }

    //metodos
    String mostrarFoto(){
    return this.foto;
    }

    boolean tieneUsuario(){
    return this.tieneUsuario;
    }
   
}
