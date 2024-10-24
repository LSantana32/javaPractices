package unahur.edu.poo2.aprendizDeMagia;

import unahur.edu.poo2.aprendizDeMagia.hechizos.Hechizo;

import java.util.ArrayList;
import java.util.List;

public class LibroDeHechizos {
    List<Hechizo> hechizos;

    public LibroDeHechizos() {
    this.hechizos = new ArrayList<>();
    }

    public void agregarHechizo(Hechizo hechizo) {
        hechizos.add(hechizo);
    }

    public Hechizo buscarHechizo(String nombre) {
        for (Hechizo hechizo : hechizos) {
            if (hechizo.getNombre().equals(nombre)) {
                return hechizo;
            }
        }
        return null;
    }
}
