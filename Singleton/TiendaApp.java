package Singleton;

public class TiendaApp {
    public static void main(String[] args) {

        CarritoCompras cc = CarritoCompras.getInstancia();
        cc.agregarProductos("Platano");

        CarritoCompras cc2 = CarritoCompras.getInstancia();
        cc2.agregarProductos("Manzana");

        CarritoCompras cc3 = CarritoCompras.getInstancia();
        cc3.agregarProductos("Pera");

        CarritoCompras cc4 = CarritoCompras.getInstancia();
        cc4.mostrarContenido();
    }
}