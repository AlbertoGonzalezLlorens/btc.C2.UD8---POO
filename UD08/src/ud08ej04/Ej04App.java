package ud08ej04;

import java.util.Scanner;

public class Ej04App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escoge una de las opciones [DEFAULT, TITULO_Y_CREADOR, TOTAL]");
		String que_imprimir = sc.next();
		
		switch (que_imprimir) {
			case "DEFAULT":
				imprimirD();
				break;
			case "TITULO_Y_CREADOR":
				imprimirTC(sc);
				break;
			case "TOTAL":
				imprimirTotal(sc);
				break;
			default:
				System.out.println("No ha introducido un valor correcto");
		}
		

	}
	
	public static void imprimirD() {
		Serie serie = new Serie();
		System.out.println("Titulo "+serie.getTitulo());
		System.out.println("Creador "+serie.getCreador());
		System.out.println("Genero "+serie.getGenero());
		System.out.println("Numero de temporadas "+serie.getN_temporadas());
		System.out.println("Entregado? "+serie.isEntregado());
	}

	public static void imprimirTC(Scanner sc) {
		System.out.println("Titulo de la serie");
		String titulo = sc.next();
		System.out.println("Creador");
		String creador = sc.next();
		Serie serie = new Serie(titulo,creador);
		System.out.println("Titulo "+serie.getTitulo());
		System.out.println("Creador "+serie.getCreador());
		System.out.println("Genero "+serie.getGenero());
		System.out.println("Numero de temporadas "+serie.getN_temporadas());
		System.out.println("Entregado? "+serie.isEntregado());
	}
	
	public static void imprimirTotal(Scanner sc) {
		System.out.println("Titulo de la serie");
		String titulo = sc.next();
		System.out.println("Creador");
		String creador = sc.next();
		System.out.println("Numero de temporadas");
		int n_temporadas = sc.nextInt();
		System.out.println("Genero");
		String genero = sc.next();
		Serie serie = new Serie(titulo,creador,n_temporadas,genero);
		System.out.println("Titulo "+serie.getTitulo());
		System.out.println("Creador "+serie.getCreador());
		System.out.println("Genero "+serie.getGenero());
		System.out.println("Numero de temporadas "+serie.getN_temporadas());
		System.out.println("Entregado? "+serie.isEntregado());
	}
}
