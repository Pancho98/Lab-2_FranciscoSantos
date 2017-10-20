/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_franciscosantos;

/**
 *
 * @author Francisco Santos
 */
public class Mensaje {
    private String Titulo;
    private String emisor;
    private String receptor;
    private String cuerpo; 
    private String importancia;

    public Mensaje() {
    }

    public Mensaje(String Titulo, String emisor, String receptor, String cuerpo, String importancia) {
        this.Titulo = Titulo;
        this.emisor = emisor;
        this.receptor = receptor;
        this.cuerpo = cuerpo;
        this.importancia = importancia;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "emisor=" + emisor + ", receptor=" + receptor +"\n" +", cuerpo=" + cuerpo + '}';
    }
    
    
}
