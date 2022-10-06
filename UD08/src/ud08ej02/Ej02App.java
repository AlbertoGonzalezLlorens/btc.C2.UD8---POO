package ud08ej02;

public class Ej02App {

	public static void main(String[] args) {
		
		Password password_1 = new Password();
		password_1.generarContraseña();
		System.out.println("Tu contraseña es "+password_1.getContraseña());
		
		Password password_2 = new Password(20);
		password_2.generarContraseña();
		System.out.println("Tu contraseña es "+password_2.getContraseña());
		

	}

}
