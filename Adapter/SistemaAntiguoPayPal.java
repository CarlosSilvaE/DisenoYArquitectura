package Adapter;

public class SistemaAntiguoPayPal {
    
    public SistemaAntiguoPayPal() {
        
    }

    public void enviarPago(double cantidadEnUSD) {
        System.out.println("Procesando pago de $" + cantidadEnUSD + " USD a través del sistema antiguo de PayPal.");
    }
}