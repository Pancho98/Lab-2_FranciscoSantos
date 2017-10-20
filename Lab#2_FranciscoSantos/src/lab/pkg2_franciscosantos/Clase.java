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
public class Clase {
    private String nombre;
    private String seccion;
    private int max;
    private String maestro;
    private int uv;
    private int precio;
    ArrayList<Maestro> Maestros = new ArrayList();
    ArrayList<Alumno> Alumnos = new ArrayList();

    public Clase() {
    }

    public Clase(String nombre, String seccion, int max, String maestro, int uv, int precio) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.max = max;
        this.maestro = maestro;
        this.uv = uv;
        this.precio = precio;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public ArrayList<Alumno> getAlumnos() {
        return Alumnos;
    }

    public void setAlumno(ArrayList<Alumno> lista) {
        this.Alumnos = lista;
    }

    public ArrayList<Maestro> getMaestros() {
        return Maestros;
    }

    public void setMaestros(ArrayList<Maestro> listaM) {
        this.Maestros = listaM;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Clase " + "nombre=" + nombre+" Seccion="+seccion;
    }
    
    
}
