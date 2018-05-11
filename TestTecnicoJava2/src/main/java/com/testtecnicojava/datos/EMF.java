/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testtecnicojava.datos;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author francisco
 */
public class EMF {
  
    private static final EntityManagerFactory miemf = Persistence.createEntityManagerFactory("testtecnicojavaPU");

    public static  EntityManagerFactory get() {
        return miemf;
    }
    
    private EMF(){        
    }
    
}
