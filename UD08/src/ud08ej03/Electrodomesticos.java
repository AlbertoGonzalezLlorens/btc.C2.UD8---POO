package ud08ej03;

public class Electrodomesticos {
	final static String COLOR_DEFECTO = "blanco";
	final static double PRECIO_BASE_DEFECTO = 100;
	final static char CONSUMO_ENERGETICO_DEFECTO = 'F';
	final static double PESO_DEFECTO = 5;
	
	enum Colores {
		BLANCO,NEGRO,ROJO,AZUL,GRIS
	}
	
	enum Consumo {
		A,B,C,D,E,F
	}
	
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
	
	public Electrodomesticos(double precio, double peso, String color, String consumo ) {
		this.precio_base=precio;
		this.color=validaColor(color);
		this.consumo_energetico=validaConsumo (consumo);
		this.peso=peso;	
	}
	
	public static String validaColor(String color) {
		if (!(color.equals(Colores.BLANCO)||color.equals(Colores.NEGRO)||color.equals(Colores.ROJO)||color.equals(Colores.AZUL)||color.equals(Colores.GRIS))){
			System.out.println("No se ha introducido un color correcto, se pondra color default Blanco");
			color="BLANCO";
		}
		return color;
	}
	
	public char validaConsumo (String consumo) {
		if (!(consumo.equals(Consumo.A)||consumo.equals(Consumo.B)||consumo.equals(Consumo.C)||consumo.equals(Consumo.D)||consumo.equals(Consumo.E)||consumo.equals(Consumo.F))){
			System.out.println("No se ha introducido un consumo correcto, se pondra color default F");
			String consumo_energetico_string="F";
			this.consumo_energetico = consumo_energetico_string.charAt(0);
		}
		return consumo_energetico;
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
