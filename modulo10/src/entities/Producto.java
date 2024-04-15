package entities;

public class Producto {
    private final String nombre; // Nombre del producto
    private double precio; // Precio del producto

    public Producto(String nombre, double precio) {
        this.nombre = nombre; // Inicializa el nombre del producto
        this.precio = precio; // Inicializa el precio del producto
    }

    // Getter para el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Getter para el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Setter para el precio del producto
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para convertir un objeto de tipo Producto a una cadena de caracteres
    @Override
    public String toString() {
        return nombre + " - Precio: " + precio;
    }
}