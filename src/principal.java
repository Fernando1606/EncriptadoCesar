import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		// Creamos las variables y preguntamos la opcion
		Scanner teclado = new Scanner(System.in);
		int eleccion = 0;
		// Creamos un bucle para que se repita tantas veces como el usuario desee
		while (eleccion != 3) {
			// Comprobamos que el numero introducido es correcto
			System.out.println("Menu de opciones:");
			System.out.println("1. Cifrar");
			System.out.println("2. Descifrar");
			System.out.println("3. Salir");
			eleccion = teclado.nextInt();
			// Menu de opciones
			switch (eleccion) {
			case 1:
				// Cifrado
				System.out.println("Dime la clave a utilizar");
				// Recogemos por teclado la clave
				int claveCifrado = teclado.nextInt();
				claveCifrado %= 26;
				// Recogemos por teclado el texto a cifrar
				System.out.println("Dime el texto que quieres cifrar");
				String textoNoCifrado = teclado.next();
				textoNoCifrado.toLowerCase();
				StringBuilder textoCifrado = new StringBuilder();
				// Creamos un for para recorrer todo el string del texto a cifrar
				for (int i = 0; i < textoNoCifrado.length(); i++) {
					// Comprobamos que el caracter sea una letra de la 'a' a la 'z'
					if (textoNoCifrado.charAt(i) >= 'a' && textoNoCifrado.charAt(i) <= 'z') {
						// Ahora comprobamos que si con la encriptacion sale un valor mayor a z vuelva a
						// la letra a
						if (textoNoCifrado.charAt(i) + claveCifrado > 'z') {
							textoCifrado.append((char) (textoNoCifrado.charAt(i) + claveCifrado - 26));
							// Si no simplemente se le añade la clave
						} else {
							textoCifrado.append((char) (textoNoCifrado.charAt(i) + claveCifrado));
						}
					}
				}
				System.out.println("--------------------------------");
				System.out.println("Mensaje cifrado:");
				System.out.println(textoCifrado.toString());
				System.out.println("--------------------------------");
				break;
			case 2:
				// Descifrado
				System.out.println("Dime la clave a utilizar");
				// Recogemos por teclado la clave
				int claveDescifrado = teclado.nextInt();
				claveDescifrado %= 26;
				// Recogemos por teclado el texto a descifrar
				System.out.println("Dime el texto que quieres descifrar");
				String textoADescifrar = teclado.next();
				textoADescifrar.toLowerCase();
				StringBuilder textoYaDescifrado = new StringBuilder();
				// Creamos un for para recorrer todo el string del texto a descifrar
				for (int i = 0; i < textoADescifrar.length(); i++) {
					// Comprobamos que el caracter sea una letra de la 'a' a la 'z'
					if (textoADescifrar.charAt(i) >= 'a' && textoADescifrar.charAt(i) <= 'z') {
						// Ahora comprobamos que si con la encriptacion sale un valor mayor a z vuelva a
						// la letra a
						if (textoADescifrar.charAt(i) - claveDescifrado > 'z') {
							textoYaDescifrado.append((char) (textoADescifrar.charAt(i) - claveDescifrado + 26));
							// Si no simplemente se le añade la clave
						} else {
							textoYaDescifrado.append((char) (textoADescifrar.charAt(i) - claveDescifrado));
						}
					}
				}
				System.out.println("--------------------------------");
				System.out.println("Mensaje descifrado:");
				System.out.println(textoYaDescifrado.toString());
				System.out.println("--------------------------------");
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Numero incorrecto");
			}
		}
		teclado.close();
	}
}
