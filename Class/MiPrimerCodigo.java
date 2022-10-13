package Class;

public class MiPrimerCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Nevis";
		int edad = 18;
		
		//Aqui estoy imprimiendo un nombre 
		System.out.println(name);
		
		//Aqui estoy imprimiend la edad
		System.out.println("Tu edad es:" + edad);
		
		//Aqui estoy haciendo uso de \n como salto de linea"
		System.out.print("Hola " + name + " Tu edad es " + edad + "\n");
		System.out.println("Mucho gusto");
		
		//Suma de dos numeros
		int a = 25;
		int b = 45;
		
		//Inicializar variable resultado en 0
		int resultado = 0;
		
		resultado = a + b ;
		
		System.out.println("La suma de los dos números es " + resultado);
		
		
		
		//Convertir de String a int 
		String cadena = "123";
		int cadenaEntera = Integer.parseInt(cadena);
		int operacion = cadenaEntera + 1;
	
		System.out.println("El entero es: " + operacion);
		
		//Convertir de String a Double
		cadena = "12.3";
		double cadenaDouble = Double.parseDouble(cadena);
		System.out.println("El decimal es: " + cadenaDouble);
		
		//Convertir de String a float 
		cadena = "1.2";
		float cadenaFloat = Float.parseFloat(cadena);
		System.out.println("El flotante es " + cadenaFloat);
		
		//Definir una constante
		final int MIN_AGE = 3;
		System.out.println(MIN_AGE); 
		

	}

}
