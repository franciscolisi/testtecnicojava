/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testtecnicojava.datos;

import javax.persistence.EntityManager;

/**
 *
 * @author francisco
 */
public class EntityManagerUtil {
    
    public static final ThreadLocal<EntityManager> MANAGERS = new ThreadLocal<EntityManager>();
    
    public static EntityManager getEntityManager(){
        EntityManager mgr = MANAGERS.get();
        
        if (mgr == null){
            mgr = EMF.get().createEntityManager();
            MANAGERS.set(mgr);
            return mgr;
        }
        
        return MANAGERS.get();
    }
    
}
