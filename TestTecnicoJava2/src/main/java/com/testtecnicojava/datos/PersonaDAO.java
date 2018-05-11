/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testtecnicojava.datos;

import com.testtecnicojava.dominio.Persona;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author francisco
 */
public class PersonaDAO {
    
    private EntityManager eman = EntityManagerUtil.getEntityManager();
    
    public void guardarPersona(Persona persona)
    {
        
        try{
            eman.getTransaction().begin();
        
            eman.merge(persona);
        
            eman.getTransaction().commit();
            
            
        }catch(Exception ex1){
            eman.getTransaction().rollback();            
        }    
        
    }
    
    
    public void modificarPersona(Persona personadto)
    {
    
        try {
        
            eman.getTransaction().begin();
            
            Persona persona = (Persona) eman.find(Persona.class, personadto.getDni());
            
            persona.setDni(personadto.getDni());
            persona.setNombre(personadto.getNombre());
            persona.setApellido(personadto.getApellido());
            persona.setEdad(personadto.getEdad());
            
            
            eman.getTransaction().commit();
    
        } catch (Exception ex1) {
            eman.getTransaction().rollback();
        }
    }
    
    
    public void borrarPersona(Long dni) {
    
        try {
       
          eman.getTransaction().begin();
          
          Persona persona = (Persona) eman.find(Persona.class, dni);
          eman.remove(persona);
          eman.getTransaction().commit();
        
        } catch (Exception ex1) {

          eman.getTransaction().rollback();
        }
    }
        
      
    @SuppressWarnings("unchecked")
    public List<Persona> listarPersonas(){
        
        List<Persona> personas;
        
        try {
      
            eman.getTransaction().begin();
                        
            personas = eman.createQuery("from Persona").getResultList();
            
            eman.getTransaction().commit();
        
        } catch (Exception e) {
            eman.getTransaction().rollback();
            personas = null;
        }
        
        return personas;
  }
    
    
    
    
}
