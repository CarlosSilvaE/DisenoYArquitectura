package Adapter;

public class AdaptadorPayPal implements PagoConTarjeta {
    
    private SistemaAntiguoPayPal sistemaAntiguo;

    public AdaptadorPayPal(SistemaAntiguoPayPal sistemaAntiguo) {
        this.sistemaAntiguo = sistemaAntiguo;
    }

    @Override
    public void procesarPago(double monto) {
        
        this.sistemaAntiguo.enviarPago(monto);
    }
}