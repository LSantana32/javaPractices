public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    private int age;

    public Alumno(int legajo, String nombre, String apellido, int age) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alumno) {
            Alumno alumno = (Alumno) obj;
            return this.legajo == alumno.legajo;
        }
        return false;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", age=" + age +
                '}';
    }
}
