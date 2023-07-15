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
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;




import ar.com.cac.finaljava23049lgs.db.AdministradorDeConexiones;
import ar.com.cac.finaljava23049lgs.oop.Persona;
import ar.com.cac.finaljava23049lgs.oop.Usuario;

public class DAOImpl implements DAO{


    

    @Override //para cumplir contrato entre DAO y esta clase
    public Persona getById(long id) throws Exception{
        String sql = "select * from personas where id =?";

        //Obtener la Conection
        Connection con = AdministradorDeConexiones.getConnection();

        //PreparedStatement con mi sql
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setLong(1,id);

        Persona persona = null;

        ResultSet res = pst.executeQuery();

        if(res.next()) {
                       
            Long _id = res.getLong(1);
            String apellido = res.getString(2);
            String nombre = res.getString(3);
            int edad = res.getInt(4);
            Date fechaRegistro = res.getDate(5);
            String codigo = res.getString(6);

            persona = new Persona(_id,apellido, nombre, edad, LocalDateTime.now(), codigo);
        }
        return persona;

    }

	
       
    @Override
    public void delete(long id) throws SQLException {
     String sql = "delete from personas where id = ? ";

         // Obtener Conection 
    Connection con = AdministradorDeConexiones.getConnection();
    // Prepared Statement con Mysql   para pasar la sentencia
    PreparedStatement pst = con.prepareStatement(sql);

    pst.setLong(1, id);

    pst.executeUpdate();  //modifico la base con execute update


    }

    @Override
    public ArrayList<Persona> findAll() throws Exception{
        String sql = "select * from personas";
       
    //Obtener la Conection
        Connection con = AdministradorDeConexiones.getConnection();

        //PreparedStatement con mi sql
        PreparedStatement pst = con.prepareStatement(sql);

        ArrayList<Persona> listado = new ArrayList<>();

        ResultSet res = pst.executeQuery();

        while(res.next()) {

            Long id = res.getLong(1);
            String apellido = res.getString(2);
            String nombre = res.getString(3);
            int edad = res.getInt(4);
            Date fechaRegistro = res.getDate(5);
            String codigo = res.getString(6);
     

            listado.add(new Persona(id,apellido, nombre, edad, LocalDateTime.now(), codigo));

        }
        return listado;
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
    pst.setString((7), (persona.getCodigo() + "-COD-" + randomChar()));
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

    
