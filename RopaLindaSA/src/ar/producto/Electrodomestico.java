package ar.producto;

public class Electrodomestico extends Producto{
    private int consumoEnWatts;

    public Electrodomestico(int codigo, String descripcion, String marca, int precioLista, int stock, int consumoEnWatts) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.consumoEnWatts = consumoEnWatts;
    }

    @Override
    public double calcularPrecioPublico() {
        double precioPublico;
        precioPublico= getPrecioLista() + getPrecioLista()*0.25;
        return precioPublico;

    }
}
