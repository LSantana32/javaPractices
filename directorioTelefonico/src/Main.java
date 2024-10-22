public class Main {
    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        Cliente cliente1 = new Cliente(12345678, "Juan", "Perez", "Cordoba", "Av Siempre Viva 123");
        Cliente cliente2 = new Cliente(87654321, "Maria", "Gomez", "Cordoba", "Av Siempre Viva 456");
        Cliente cliente3 = new Cliente(11223344, "Carlos", "Gonzalez", "Buenos Aires", "Av Siempre Viva 789");
        Cliente cliente4 = new Cliente(44332211, "Ana", "Fernandez", "Buenos Aires", "Av Siempre Viva 101112");
        directorio.agregarCliente(12345678, cliente1);
        directorio.agregarCliente(87654321, cliente2);
        directorio.agregarCliente(11223344, cliente3);
        directorio.agregarCliente(44332211, cliente4);
        System.out.println(directorio.buscarCliente(12345678).getApellido());
        System.out.println(directorio.buscarCliente(87654321).getApellido());
        System.out.println(directorio.buscarCliente(11223344).getApellido());
        System.out.println(directorio.buscarCliente(44332211).getApellido());
        System.out.println(directorio.buscarTelefono("Perez"));
        System.out.println(directorio.buscarCliente("Cordoba"));
        directorio.eliminarCliente(12345678);
        System.out.println(directorio.buscarCliente(12345678));
    }
}
