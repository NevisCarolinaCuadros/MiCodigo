package TallerCiclos;

import java.util.Scanner;

public class Ejercicio6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número para conocer la cantidad de carros que se encuentran en un parqueadero ");
		int n = sc.nextInt();
		

		for(int i = 0; i <= n; i++) {
			for(int k = 0; k <= i; k=k+2) {
				if(i%2 == 0) {
				
				System.out.print(i);
			}
			}
			System.out.println(" ");
		}

	}

}
