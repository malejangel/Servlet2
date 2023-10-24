/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerservlet.models;


public class Acta {
   
    private int id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String No_casa;
    private String muros;
    private String pisos;
    private String techos;
    private String habitaciones;
    private String banios;                       
    private String cocina;

    public Acta(int id, String nombre, String apellidos, String telefono, String direccion, String No_casa, String muros, String pisos, String techos, String habitaciones, String banios, String cocina) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.No_casa = No_casa;
        this.muros = muros;
        this.pisos = pisos;
        this.techos = techos;
        this.habitaciones = habitaciones;
        this.banios = banios;
        this.cocina = cocina;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNo_casa() {
        return No_casa;
    }

    public String getMuros() {
        return muros;
    }

    public String getPisos() {
        return pisos;
    }

    public String getTechos() {
        return techos;
    }

    public String getHabitaciones() {
        return habitaciones;
    }

    public String getBaños() {
        return banios;
    }

    public String getCocina() {
        return cocina;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellidos = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNo_casa(String No_casa) {
        this.No_casa = No_casa;
    }

    public void setMuros(String muros) {
        this.muros = muros;
    }

    public void setPisos(String pisos) {
        this.pisos = pisos;
    }

    public void setTechos(String techos) {
        this.techos = techos;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setBaños(String baños) {
        this.banios = baños;
    }

    public void setCocina(String cocina) {
        this.cocina = cocina;
    }
    
            
    }
    
