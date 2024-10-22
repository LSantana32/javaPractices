import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Colegio {
    private List<Alumno> alumnos;

    public Colegio() {
        this.alumnos = new ArrayList<>();
    }

    public void addAlumno(Alumno alumno) {
        if (!this.alumnos.contains(alumno)) {
            this.alumnos.add(alumno);
        }
    }

    public void removeAlumno(Alumno alumno) {
        this.alumnos.remove(alumno);
    }

    public void listarAlumnosAlfabeticamente(){
        List<Alumno> alumnosCopy = new ArrayList<>(this.alumnos);
        alumnosCopy.sort((Comparator.comparing(Alumno::getApellido)));
        System.out.println(alumnosCopy);
    }

    public void listarAlumnosPorCaracter(char caracter){
        List<Alumno> alumnosCopy = new ArrayList<>();
        for (Alumno alumno : this.alumnos) {
            if (alumno.getApellido().charAt(0) == caracter) {
                alumnosCopy.add(alumno);
            }
        }
    }
}
