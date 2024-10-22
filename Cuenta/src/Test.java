import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Perez", "Madrid", LocalDate.of(1990, 1, 1));
        Cuenta cuenta = new Cuenta(1, cliente);
        cuenta.depositar(60000);
        cuenta.extraer(10000);
        cuenta.verSaldo();
        cuenta.listarMovimientos();
    }
}
