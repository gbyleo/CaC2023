package ar.com.cac.finaljava23049lgs.dao.impl;

import java.util.ArrayList;

import ar.com.cac.finaljava23049lgs.oop.Persona;

public interface DAO {
    
    public Persona getById(long id) throws Exception;//la pk de la tabla seria el id long convertido
    public void delete(long id) throws Exception;  //la pk de la tabla seria el id long convertido
    public ArrayList<Persona> findAll() throws Exception;
    public void update(Persona persona) throws Exception; //vendria con un id por eso el parametro
    public void create(Persona persona) throws Exception; //sin parametro de id, no tiene id
    

    
}
