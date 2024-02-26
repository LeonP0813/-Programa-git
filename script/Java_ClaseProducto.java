public class Producto {
    // Atributos
    private int id;          // Identificador único del producto.
    private String nombre;   // Nombre del producto.
    private double precio;   // Precio unitario del producto.
    private int cantidad;    // Cantidad disponible en inventario.
    private String categoria; // Categoría a la que pertenece el producto (ejemplo: electrónica, ropa, alimentos, etc.).
    private boolean disponible; // Indica si el producto está disponible para la venta.

    // Constructores
    public Producto(int id, String nombre, double precio, int cantidad, String categoria, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    // Métodos accesores (getters) para obtener valores de los atributos
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Métodos modificadores (setters) para actualizar valores de los atributos
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Otros métodos de la clase
    public void aumentarCantidad(int cantidad) {
        // Incrementa la cantidad de unidades disponibles en inventario.
        this.cantidad += cantidad;
    }

    public void disminuirCantidad(int cantidad) {
        // Reduce la cantidad de unidades disponibles en inventario.
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("Error: No hay suficientes unidades disponibles.");
        }
    }

    // Método para calcular el valor total de un lote de productos
    public double calcularValorTotal(int cantidad) {
        return precio * cantidad;
    }
}

public static void main(String[] args){

}
