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
    ArrayList<Alumno> lista = new ArrayList();

    public Clase() {
    }

    public Clase(String nombre, String seccion, int max, String maestro, int uv) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.max = max;
        this.maestro = maestro;
        this.uv = uv;
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

    public ArrayList<Alumno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alumno> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Clase" + "nombre=" + nombre;
    }
    
    
}
