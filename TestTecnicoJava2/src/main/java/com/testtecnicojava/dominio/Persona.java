/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testtecnicojava.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author francisco
 */

@Table(name = "personas")
@Entity
public class Persona implements Serializable{
    
    @Id
    @Column(name = "dni")
    private Long dni;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "edad")
    private Integer edad;
    
    
    public Persona(){
        
    }
    
    
    public void setDni(Long dni){
        this.dni = dni;
    }
    
    public Long getDni(){
        return dni;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(){
        return apellido;
    }

    public void setEdad(Integer edad){
        this.edad = edad;
    }
    
    public Integer getEdad(){
        return edad;
    }
    
}
