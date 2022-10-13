package ArreglosJava;

import java.util.Scanner;

public class ArreglosBasicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solicito tamaño del arreglo (nro de temperaturas)
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingrese el nro de temperaturas: ");
		int n = keyboard.nextInt();
		
		//Declaro el arreglo de temperaturas y la variable suma 
		double[] temperaturas = new double[n];
		double suma = 0;
		
		//Ciclo para recorrer el arreglo de temperaturas y calculo de suma
		for(int i=0; i<temperaturas.length; i++) {
			System.out.println("Ingrese temperatura nro: " +i+1);
			temperaturas [i] = keyboard.nextDouble();
			suma = suma + temperaturas[i];
		}
		//Imprimir el promedio
		System.out.print("La temperatura promedio para" +n+ "temperaturas es "+ suma/n);

	}

}
