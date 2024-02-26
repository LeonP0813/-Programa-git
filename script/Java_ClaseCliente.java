public class Cliente {
    // Atributos
    private int id;          // Identificador único del cliente.
    private String nombre;   // Nombre del cliente.
    private String correo;   // Correo electrónico del cliente.
    private String direccion; // Dirección del cliente.
    private String telefono;  // Número de teléfono del cliente.

    // Constructores
    public Cliente(int id, String nombre, String correo, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Métodos accesores (getters) para obtener valores de los atributos
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    // Métodos modificadores (setters) para actualizar valores de los atributos
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Otros métodos de la clase
    public void realizarPedido(Producto producto, int cantidad) {
        // Lógica para que el cliente realice un pedido de un producto.
        // Esto puede incluir la creación de un objeto Pedido.
    }
}
