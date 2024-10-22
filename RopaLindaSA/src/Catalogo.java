import ar.producto.Electrodomestico;
import ar.producto.Perfumeria;
import ar.producto.Producto;
import ar.producto.Ropa;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Producto> productos;

    public Catalogo() {
        this.productos = new ArrayList<>();
    }

    public void agregarProductos(Producto unProducto) {
        productos.add(unProducto);
    }

    public void cantidadDeProductosPorCategoria() {
        int cantidadElectrodomestico = 0;
        int cantidadRopa = 0;
        int cantidadPerfumeria = 0;

        for (Producto producto : productos) {
            if (producto instanceof Ropa) {
                cantidadRopa++;
            } else if (producto instanceof Perfumeria) {
                cantidadPerfumeria++;
            } else {
                cantidadElectrodomestico++;
            }
        }
        System.out.println("Cantidad de productos de la categoria Electrodomestico: " + cantidadElectrodomestico
                + "\nCantidad de productos de la categoria Ropa: " + cantidadRopa
                + "\nCantidad de productos de la categoria Perfumeria: " + cantidadPerfumeria);
    }

    public void listarElectrodomesticos() {
        for (Producto producto : productos) {
            if (producto instanceof Electrodomestico) {
                System.out.println(producto);
            }
        }
    }

    public void listarRopa() {
        for (Producto producto : productos) {
            if (producto instanceof Ropa) {
                System.out.println(producto);
            }
        }
    }

    public void listarPerfumeria() {
        for (Producto producto : productos) {
            if (producto instanceof Perfumeria) {
                System.out.println(producto);
            }
        }
    }
    
}