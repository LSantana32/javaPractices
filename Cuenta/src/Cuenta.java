import java.time.LocalDate;
import java.util.LinkedList;

public class Cuenta {
    private long numero;
    private double saldo;
    private double interesAnual;
    private Cliente titular;
    private LinkedList<Movimiento> movimientos;

    public Cuenta(long numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.movimientos = new LinkedList<Movimiento>();
        this.saldo=0;
        this.interesAnual=0;
    }

    public void depositar(int cantidad) {
        this.saldo += cantidad;
        movimientos.add(new Movimiento(LocalDate.now(), 'D', cantidad, this.saldo));
    }

    public void extraer(int cantidad) {
        if (cantidad > this.saldo) {
            System.out.println("Saldo insuficiente");

        }else {
            this.saldo -= cantidad;
            movimientos.add(new Movimiento(LocalDate.now(), 'E', cantidad, this.saldo));
        }
    }

    public void cambiarInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public Cliente verTitular(){
        return this.titular;
    }

    public void verSaldo(){
        System.out.println("Saldo actual: " + this.saldo);
    }

    public void listarMovimientos(){
        for (Movimiento movimiento : movimientos) {
            System.out.println(movimiento);
        }
    }

}
