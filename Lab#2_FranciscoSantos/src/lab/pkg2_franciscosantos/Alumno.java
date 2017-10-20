/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_franciscosantos;

import java.util.ArrayList;

/**
 *
 * @author Francisco Santos
 */
public class Alumno {
    private String nombre;
    private int cuenta;
    private String carrera;
    private int edad;
    private int dinero;
    private String usuario;
    private String contraseña;
    ArrayList<String> lista = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String nombre, int cuenta, String carrera, int edad, int dinero, String usuario, String contraseña) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.edad = edad;
        this.dinero = dinero;
        this.usuario = usuario;
        this.contraseña = contraseña;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Alumno\n" + "nombre=" + nombre;
    }
    
    
}
