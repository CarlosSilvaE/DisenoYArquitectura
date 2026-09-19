package Adapter;

public class Client {
    
    
    private PagoConTarjeta pasarelaPago;

    public Client(PagoConTarjeta pasarelaPago) {
        this.pasarelaPago = pasarelaPago;
    }

    public void ejecutar() {
        this.pasarelaPago.procesarPago(150.50);
    }

    public static void main(String[] args) {
        SistemaAntiguoPayPal paypalAntiguo = new SistemaAntiguoPayPal();
        PagoConTarjeta adaptador = new AdaptadorPayPal(paypalAntiguo);
        
        Client cliente = new Client(adaptador);
        cliente.ejecutar();
    }
}