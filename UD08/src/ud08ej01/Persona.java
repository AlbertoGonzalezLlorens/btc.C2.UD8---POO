package ud08ej01;

public class Persona{
	final static char HOMBRE = 'H';
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	public Persona(String dni) {
		this.dni=dni;
		this.nombre="";
		this.edad=0;
		this.sexo=HOMBRE;
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre, int edad, char sexo, String dni) {
		this.dni = dni;
		this.nombre=nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre, int edad, char sexo, String dni, double peso, double altura) {
		this.dni = dni;
		this.nombre=nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso=peso;
		this.altura=altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}


