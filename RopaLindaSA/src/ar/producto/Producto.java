package ar.producto;

public abstract class Producto {
    private int codigo;
    private String descripcion;
    private String marca;
    private double precioLista;
    private int stock;

    public Producto(int codigo, String descripcion, String marca, int precioLista, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precioLista = precioLista;
        this.stock = stock;
    }

    public abstract double calcularPrecioPublico();

    public double getPrecioLista() {
        return precioLista;
    }
}
