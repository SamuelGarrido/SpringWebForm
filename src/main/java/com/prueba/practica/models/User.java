
package com.prueba.practica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import jdk.nashorn.internal.ir.annotations.Ignore;

@Entity
public class User {
    
    private String name;
    private String lastName;
    private boolean processed;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Ignore
    public User(String nombre, String apellido) {
        this.name = nombre;
        this.lastName = apellido;
        this.processed = false;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
    
}
