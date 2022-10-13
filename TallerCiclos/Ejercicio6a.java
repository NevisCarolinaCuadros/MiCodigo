package TallerCiclos;

import java.util.Scanner;

public class Ejercicio6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número para conocer la cantidad de carros que se encuentran en un parqueadero ");
		int n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			for(int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}

	}

}
