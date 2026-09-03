package Singleton;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
	private static CarritoCompras instancia;
	
	private List<String> productos = new ArrayList<String>();
	
	private CarritoCompras() {
		this.productos = new ArrayList<String>();
		System.out.println("(SISTEMA) Instancia del Carrito creada en memoria");
	}
	
	public static CarritoCompras getInstancia() {
		if(instancia == null) {
			instancia = new CarritoCompras();
		}
		return instancia;
	}
	
	public void agregarProductos(String producto) {
		productos.add(producto);
	}
	
	public void mostrarContenido() {
		System.out.println("Producto: " + productos);
	}
	
}
