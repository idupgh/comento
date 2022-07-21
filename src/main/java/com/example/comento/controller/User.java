package com.example.comento.controller;


import javax.persistence.*;

@Table(name = "Test")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column
    private String name;
    @Column String LOC;
    
    public int getID() {return ID;}
    
    public void setID(int ID) {this.ID = ID;}
    
    public String getName() {return name;}
}
