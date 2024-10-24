package unahur.edu.poo2.aprendizDeMagia.hechizos;

import unahur.edu.poo2.aprendizDeMagia.hechizables.Hechizable;

public class Hechizo {
    private String nombre;
    private String efecto;

    public Hechizo() {
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void aplicarHechizo(Hechizable hechizable){
        hechizable.recibirHechizo(this);
    };


    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public String getNombre() {
        return nombre;
    }
}
