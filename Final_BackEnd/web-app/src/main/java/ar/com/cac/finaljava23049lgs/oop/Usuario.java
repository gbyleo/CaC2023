package ar.com.cac.finaljava23049lgs.oop;

import java.time.LocalDate;

//creo a clase usuario como hijo de clase Persona
public class Usuario extends Persona {
    
    private String user;
    private String pass;
    private LocalDate fechaCreacion;

//constructor de Usuario

public Usuario(String apellido,
        String nombre, 
        int edad, 
        String user, 
        String pass
        ) {
        
            //crea padre
            super(apellido, nombre, edad);
            //crea hijo
            this.user = user;
            this.apellido =apellido;
            this.fechaCreacion = LocalDate.now();
            this.tieneUsuario= true;
}

//metodos

public String obtenerUser(){
    return this.user;
}


public String obtenerPass(){ //ver privadicidad si conviene ponerlo en private
    return this.pass;
}

//geters and setters //
public String getUser() {
    return user;
}

public void setUser(String user) {
    this.user = user;
}

public String getPass() {
    return pass;
}

public void setPass(String pass) {
    this.pass = pass;
}

public LocalDate getFechaCreacion() {
    return fechaCreacion;
}

public void setFechaCreacion(LocalDate fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
}



//*******************//

//aca sobreescirbo el metodo tostring de usuario
@Override
public String toString() {
    
    //usando el tostring del padre con super y mostrandolo con println
    // System.out.println(super.toString()); 
    //pero como devuelve un string estaria mal que solo hago un retorno, entonces:
    
    return super.toString() + ", Usuario [user=" + user + ", pass=" + pass + ", fechaCreacion=" + fechaCreacion + "]";
   
    //esto no iria:
    // return "Usuario [user=" + user + ", pass=" + pass + ", fechaCreacion=" + fechaCreacion + "]";
}




}
