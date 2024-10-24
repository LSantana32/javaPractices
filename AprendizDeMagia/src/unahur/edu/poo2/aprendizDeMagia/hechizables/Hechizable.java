package unahur.edu.poo2.aprendizDeMagia.hechizables;

import unahur.edu.poo2.aprendizDeMagia.hechizos.Hechizo;

public class Hechizable {
    private String estadoActual;

    public Hechizable(){
        estadoActual = "normal";
    }

    public void recibirHechizo(Hechizo hechizo){
        estadoActual = hechizo.getEfecto();
    }

}
