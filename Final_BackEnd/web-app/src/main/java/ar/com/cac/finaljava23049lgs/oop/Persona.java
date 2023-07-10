package ar.com.cac.finaljava23049lgs.oop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Persona {

    //atributos
    protected String apellido;
    protected String nombre;
    protected int edad;
    protected boolean tieneUsuario;
    protected String foto;

    //constructor
    public Persona(String apellido, String nombre, int edad){
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.tieneUsuario = false;
        this.foto = "";

    }

    //metodos
    public String mostrarFoto(){
    return this.foto;
    }

    public boolean tieneUsuario(){
    return this.tieneUsuario;
    }

    




    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + ", tieneUsuario="
                + tieneUsuario + ", foto=" + foto + "]";
    }

    
   
}
