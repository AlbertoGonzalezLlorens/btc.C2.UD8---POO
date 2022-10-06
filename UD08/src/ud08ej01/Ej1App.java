package ud08ej01;

public class Ej1App {

	public static void main(String[] args) {
		
		//Si la clase esta en el mismo package no hace falta importarla
		Persona persona_1 = new Persona("39917486C");
		Persona persona_2 = new Persona("Juan",29,'F',"47785963F");
		Persona persona_3 = new Persona("Antonio",33,'M',"5637789D",98.5,1.73);
		
		//Imprime la opcion default
		System.out.println(persona_1.getNombre());
		System.out.println(persona_1.getEdad());
		System.out.println(persona_1.getDni());
		System.out.println(persona_1.getSexo());
		System.out.println(persona_1.getPeso());
		System.out.println(persona_1.getAltura());
		//imprime con el constructor donde se le entran varios parametros
		System.out.println(persona_2.getNombre());
		System.out.println(persona_2.getEdad());
		System.out.println(persona_2.getDni());
		System.out.println(persona_2.getSexo());
		System.out.println(persona_2.getPeso());
		System.out.println(persona_2.getAltura());
		//imprime con el constructor donde se le pasan todos los atributos
		System.out.println(persona_3.getNombre());
		System.out.println(persona_3.getEdad());
		System.out.println(persona_3.getDni());
		System.out.println(persona_3.getSexo());
		System.out.println(persona_3.getPeso());
		System.out.println(persona_3.getAltura());
	}

}
