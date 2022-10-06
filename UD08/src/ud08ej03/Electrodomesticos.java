package ud08ej03;

public class Electrodomesticos {
	final static String COLOR_DEFECTO = "blanco";
	final static double PRECIO_BASE_DEFECTO = 100;
	final static char CONSUMO_ENERGETICO_DEFECTO = 'F';
	final static double PESO_DEFECTO = 5;
	
	private double precio_base;
	private String color;
	private char consumo_energetico;
	private double peso;
	
	public Electrodomesticos() {
		this.precio_base=PRECIO_BASE_DEFECTO;
		this.color=COLOR_DEFECTO;
		this.consumo_energetico=CONSUMO_ENERGETICO_DEFECTO;
		this.peso=PESO_DEFECTO;	
	}
	
	public Electrodomesticos(double precio, double peso) {
		this.precio_base=precio;
		this.color=COLOR_DEFECTO;
		this.consumo_energetico=CONSUMO_ENERGETICO_DEFECTO;
		this.peso=peso;	
	}
	
	public Electrodomesticos(double precio, double peso, String color, char consumo ) {
		this.precio_base=precio;
		this.color=validaColor(color);
		this.consumo_energetico=consumo;
		this.peso=peso;	
	}
	
	public static String validaColor(String color) {
		switch(color) {
		case "BLANCO":
			break;
		case "NEGRO":
			break;
		case "ROJO":
			break;
		case "AZUL":
			break;
		case "GRIS":
			break;
		default:
			System.out.println("No se ha introducido un colo correcto, se pondra color default Blanco");
			color="BLANCO";
		}
		return color;
	}
	

	public double getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
