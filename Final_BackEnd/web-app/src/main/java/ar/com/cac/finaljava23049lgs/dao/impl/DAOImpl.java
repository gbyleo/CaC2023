package ar.com.cac.finaljava23049lgs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;


import ar.com.cac.finaljava23049lgs.db.AdministradorDeConexiones;
import ar.com.cac.finaljava23049lgs.oop.Persona;
import ar.com.cac.finaljava23049lgs.oop.Usuario;

public class DAOImpl implements DAO{


    

    @Override //para cumplir contrato entre DAO y esta clase
    public Persona getById(long id) {
        return new Usuario("PerezController", "JorgeController", 80, "control", "passcontrol");
    }

    @Override
    public void delete(long id) {
     String sql = "delete from personas where id = " + id;
    }

    @Override
    public ArrayList<Persona> findAll() {
        String sql = "select * from personas";
        return null;
    }

    @Override
    public void update(Persona persona) {
       String sql = "update personas set apellido= , nombre=, edad= ";        
    }

    @Override
    public void create(Persona persona) throws Exception {
        String sql = "insert into personas";
        sql += "(apellido,nombre,edad,tieneusuario,foto,fecha_registro,codigo)";
        sql += "values(?,?,?,?,?,?,?)";

    

    //Resumen luego de esto para CREACION:
    
    // Obtener Conection 
    Connection con = AdministradorDeConexiones.getConnection();
    // Prepared Statement con Mysql   para pasar la sentencia
    PreparedStatement pst = con.prepareStatement(sql);

    pst.setString(1, persona.getApellido());
    pst.setString(2, persona.getNombre());
    pst.setInt(3, persona.getEdad());
    pst.setBoolean(4, persona.isTieneUsuario());
    pst.setString(5, persona.getFoto());
    pst.setDate(6, this.dateFrom(persona.getFechaRegistro()));//fecha LocalDateTime > jdbc > java.sql.Date
    pst.setString((7), (randomChar()+ "-COD-"+ randomChar()));

    /*
    private String user;
    private String pass;
    private LocalDate fechaCreacion;
       
 */

 
    // ResultSet  para devolver el valor
    pst.executeUpdate(); //lo puedo usar para un CREATE/UPDATE/DELETE


}

  private Date dateFrom(LocalDateTime ldt) {
        java.util.Date date = Date.from(ldt.toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
        return new java.sql.Date(date.getTime());
  }


 
//defino metodo para tener un caracter random asino se me reptie el codigo que es unique
private static char randomChar() {
        Random r = new Random();
        return (char)(r.nextInt(26) + 'A');
    }

    

}

    
