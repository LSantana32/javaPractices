import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Cine {
    private String nombre;
    private String direccion;
    private HashSet<Pelicula> proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.proyecciones = new HashSet<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        this.proyecciones.add(pelicula);
    }

    public void listarTodo(){
        for (Pelicula pelicula : proyecciones) {
            System.out.println(pelicula);
        }
    }


    public void listarDuranMasDe(int duracion){
        for (Pelicula pelicula : proyecciones) {
            if (pelicula.getDuracion() > duracion){
                System.out.println(pelicula);
            }
        }
    }

    public void listarPorDuracionAscendente(){
        ArrayList<Pelicula>copy = new ArrayList<>(proyecciones);
        Collections.sort(copy,Comparator.comparing(Pelicula::getDuracion));
        System.out.println(copy);
    }

    public void listarPorTituloAscendente(){
        ArrayList<Pelicula>copy = new ArrayList<>(proyecciones);
        Collections.sort(copy,Comparator.comparing(Pelicula::getTitulo));
        System.out.println(copy);
    }

    public void listarPorDirectorAscendente(){
        ArrayList<Pelicula>copy = new ArrayList<>(proyecciones);
        Collections.sort(copy,Comparator.comparing(Pelicula::getDirector));
        System.out.println(copy);
    }


    public String getNombre() {
        return nombre;
    }
}
