package ud08ej02;

import java.util.Random;


public class Password {
	private int longitud = 8;
	private String contraseña;
	private int valor_random_num;
	private int valor_random_decision;

	
	public Password() {
		this.contraseña="";
		this.longitud = longitud;
	}
	
	public Password(int longitud) {
		this.contraseña="";
		this.longitud = longitud;
	}
	
	public String generarContraseña() {
		Random rad = new Random();
		for (int i=0;i<longitud;i++) {
			valor_random_decision = rad.nextInt(4);
			switch(valor_random_decision) {
				case 0:
					valor_random_num = rad.nextInt(10)+48;
					contraseña+=(char)valor_random_num;
					break;
				case 1:
					valor_random_num = rad.nextInt(26)+65;
					contraseña+=(char)valor_random_num;
					break;
				case 2:
					valor_random_num = rad.nextInt(26)+97;
					contraseña+=(char)valor_random_num;
					break;
				case 3:
					valor_random_num = rad.nextInt(4)+35;
					contraseña+=(char)valor_random_num;
					break;
			}
			
		}
		return contraseña;
	}
	
	public String getContraseña() {
		return contraseña;
	}
}
