package packageCafe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bebida bebida = new Refresco(
		        SaborRefresco.Coca_Cola
		);
		bebida = new Hielos(bebida);
        
		Bebida cafe = new Cafe();
		cafe = new Leche(cafe,TipoLeche.ALMENDRA);
		cafe = new Hielos(cafe);
		cafe = new CremaBatida(cafe);
		
		
		
		
        // Mostrar resultado
        System.out.println(bebida.getDescripcion());
        System.out.println("Precio: $" + bebida.getPrecio());
        
        System.out.println("\n" + cafe.getDescripcion());
        System.out.println("Precio: $" + cafe.getPrecio());
    }

}
