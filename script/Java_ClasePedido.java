import java.util.Date; // Importar la clase Date para manejar fechas.

public class Pedido {
    // Atributos
    private int id;          // Identificador único del pedido.
    private Date fecha;      // Fecha de realización del pedido.
    private Cliente cliente; // Cliente que realizó el pedido.
    private Producto producto; // Producto solicitado en el pedido.
    private int cantidad;    // Cantidad de productos solicitados.

    // Constructores
    public Pedido(int id, Date fecha, Cliente cliente, Producto producto, int cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

        // Getters
        public int getId() {
            return id;
        }
    
        public Date getFecha() {
            return fecha;
        }
    
        public Cliente getCliente() {
            return cliente;
        }
    
        public Producto getProducto() {
            return producto;
        }
    
        public int getCantidad() {
            return cantidad;
        }
    
        // Setters
        public void setId(int id) {
            this.id = id;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
    
        public void setProducto(Producto producto) {
            this.producto = producto;
        }
    
        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
    
        // Métodos adicionales de la clase
        public double calcularTotal() {
            // Calcular el total del pedido en función del producto y la cantidad.
            return producto.getPrecio() * cantidad;
    }
}
