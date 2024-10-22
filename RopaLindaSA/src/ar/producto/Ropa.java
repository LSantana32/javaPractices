package ar.producto;

public class Ropa extends Producto{
    private String tipoDeTela;

    public Ropa(int codigo, String descripcion, String marca, int precioLista, int stock, String tipoDeTela) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tipoDeTela = tipoDeTela;
    }


    @Override
    public double calcularPrecioPublico() {
        double precioPublico;
        precioPublico= getPrecioLista() + getPrecioLista()*0.40;
        return precioPublico;
    }
}
