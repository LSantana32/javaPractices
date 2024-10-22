import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Cine cine= new Cine("Roma SRL", "Rivadavia 325");
        System.out.println("Bienvenido al actualizador de catalogo de "+cine.getNombre());
        boolean salir = false;
        while (!salir){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriba el titulo de la pelicula:");
            String titulo = scanner.nextLine();
            System.out.println("Escriba el director de la pelicula:");
            String director = scanner.nextLine();
            System.out.println("Escriba la duracion de la pelicula:");
            int duracion = scanner.nextInt();
            Pelicula pelicula = new Pelicula(titulo,director,duracion);
            cine.agregarPelicula(pelicula);
            System.out.println("Desea agregar otra pelicula? (s/n)");
            String respuesta = scanner.next();
            if (respuesta.equals("n")){
                salir = true;
            }
        }
        System.out.println("Duracion minima de pelicula a listar:");
        Scanner scanner = new Scanner(System.in);
        int duracion = scanner.nextInt();
        cine.listarDuranMasDe(duracion);
        System.out.println("Listado de peliculas:");
        cine.listarTodo();
        System.out.println("Listado de peliculas por duracion:");
        cine.listarPorDuracionAscendente();
        System.out.println("Listado de peliculas por titulo:");
        cine.listarPorTituloAscendente();
        System.out.println("Listado de peliculas por director:");
        cine.listarPorDirectorAscendente();
    }
}
