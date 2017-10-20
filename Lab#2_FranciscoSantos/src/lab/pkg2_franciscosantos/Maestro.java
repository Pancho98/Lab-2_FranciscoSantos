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
public class Maestro {
    private String nombre;
    private String titulo;
    private String maestria;
    private int salario;
    private String usuario;
    private String contraseña;
    ArrayList<String> clase = new ArrayList();

    public Maestro() {
    }

    public Maestro(String nombre) {
        this.nombre = nombre;
    }

    public Maestro(String nombre, String titulo, String maestria, int salario, String usuario, String contraseña) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.maestria = maestria;
        this.salario = salario;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
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

    public ArrayList<String> getClase() {
        return clase;
    }

    public void setClase(ArrayList<String> clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Maestro\n " + "nombre=" + nombre;
    }
    
    
}
