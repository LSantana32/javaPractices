package ar.producto;

public class Perfumeria extends Producto {
    private int tamanioEnCC;

    public Perfumeria(int codigo, String descripcion, String marca, int precioLista, int stock, int tamanioEnCC) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tamanioEnCC = tamanioEnCC;
    }

    @Override
    public double calcularPrecioPublico() {
        double precioPublico= getPrecioLista();
        int incremento= tamanioEnCC/100;
        precioPublico+= getPrecioLista()*0.20*incremento;
        return precioPublico;
    }
}
