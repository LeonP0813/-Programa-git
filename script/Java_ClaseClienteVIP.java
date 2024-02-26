public class ClienteVIP extends Cliente {
    // Atributos adicionales específicos de un cliente VIP.
    private String nivelVIP; // Nivel de membresía VIP (ejemplo: Oro, Plata, Diamante).

    // Constructor
    public ClienteVIP(int id, String nombre, String correo, String direccion, String telefono, String nivelVIP) {
        super(id, nombre, correo, direccion, telefono);
        this.nivelVIP = nivelVIP;
    }

    // Getter y Setter específico para el nivel VIP
    public String getNivelVIP() {
        return nivelVIP;
    }

    public void setNivelVIP(String nivelVIP) {
        this.nivelVIP = nivelVIP;
    }

    // Métodos específicos de un cliente VIP
    public void recibirDescuento(double descuento) {
        // Lógica para aplicar un descuento especial a un cliente VIP.
    }

    public void accederAOfertasEspeciales() {
        // Lógica para permitir que un cliente VIP acceda a ofertas exclusivas.
    }
}

