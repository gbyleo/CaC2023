package ar.com.cac.finaljava23049lgs.oop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Persona {

    //atributos
    protected Long id;
    protected String apellido;
    protected String nombre;
    protected int edad;
    protected boolean tieneUsuario;
    protected String foto;
    protected LocalDateTime fechaRegistro;
    protected String codigo;
    
    
  

    //constructor
    public Persona(String apellido, String nombre, int edad, LocalDateTime fechaRegistro, String codigo){
        extracted(apellido, nombre, edad, fechaRegistro, codigo);
     }

       // segundo constructor
    public Persona(Long id, String apellido, String nombre, int edad, LocalDateTime fechaRegistro, String codigo){
        extracted(apellido, nombre, edad, fechaRegistro, codigo);
        this.id = id;
     }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private void extracted(String apellido, String nombre, int edad, LocalDateTime fechaRegistro, String codigo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.tieneUsuario = false;
        this.foto = "";
        this.fechaRegistro = fechaRegistro;
        this.codigo = codigo;
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
                + tieneUsuario + ", foto=" + foto + "fechaRegistro=" + fechaRegistro +";]";
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTieneUsuario() {
        return tieneUsuario;
    }

    public void setTieneUsuario(boolean tieneUsuario) {
        this.tieneUsuario = tieneUsuario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

    
   
}
