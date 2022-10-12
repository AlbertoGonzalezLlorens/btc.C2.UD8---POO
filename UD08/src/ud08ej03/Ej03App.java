package ud08ej03;

import java.util.Scanner;

public class Ej03App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//pedimos al usuario que nos registre el electrodomestico
		
		System.out.println("Añadir por defecto [D], añadir precio y peso [PP] o añadir todo [T]");
		String decision = sc.nextLine().toUpperCase();
		
		switch(decision) {
			case "D":
				imprimirDefault();
				break;
			case "PP":
				imprimirPP(sc);
				break;
			case "T":
				imprimirtTotal(sc);
				break;
			default:
				System.out.println("No ha introducido una opción correcta");
		}
		
		sc.close();
		

	}
		
	public static void imprimirDefault() {
		Electrodomesticos electrodomestico = new Electrodomesticos();
		System.out.println("Color "+electrodomestico.getColor());
		System.out.println("Consumo "+electrodomestico.getConsumo_energetico());
		System.out.println("Peso "+electrodomestico.getPeso());
		System.out.println("Precio "+electrodomestico.getPrecio_base());
	}
	
	public static void imprimirPP(Scanner sc) {
		System.out.println("Peso");
		Double peso = sc.nextDouble();
		System.out.println("Precio");
		Double precio = sc.nextDouble();
		Electrodomesticos electrodomestico = new Electrodomesticos(precio,peso);
		System.out.println("Color "+electrodomestico.getColor());
		System.out.println("Consumo "+electrodomestico.getConsumo_energetico());
		System.out.println("Peso "+electrodomestico.getPeso());
		System.out.println("Precio "+electrodomestico.getPrecio_base());
	}
	
	public static void imprimirtTotal(Scanner sc) {
		System.out.println("Color [BLANCO, NEGRO, ROJO, AZUL, GRIS]");
		String color = sc.next().toUpperCase();
		System.out.println("Peso");
		Double peso = sc.nextDouble();
		System.out.println("Precio");
		Double precio = sc.nextDouble();
		System.out.println("Consumo");
		String consumo = sc.next().toUpperCase();
		Electrodomesticos electrodomestico = new Electrodomesticos(precio,peso,color,consumo);
		System.out.println("Color "+electrodomestico.getColor());
		System.out.println("Consumo "+electrodomestico.getConsumo_energetico());
		System.out.println("Peso "+electrodomestico.getPeso());
		System.out.println("Precio "+electrodomestico.getPrecio_base());
	}

}


