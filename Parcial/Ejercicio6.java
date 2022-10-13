package Parcial;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] siembra = {"Maíz","Papa", "Yuca"};
		System.out.println("semillas "+siembra.length);
		
		Scanner semillas = new Scanner (System.in);
		System.out.println("Ingrese el nro de la semillas: ");
		int n = semillas.nextInt();
	
		
		int[] cosecha = {20};
		
		System.out.println(Arrays.toString(siembra));
		
		System.out.println("-------------------");
		
		System.out.println(siembra[1]);
		siembra[1] = "Maíz";
		
		double[] cosechamaiz = new double[n];
		double suma = 0;
		
		for(int i=0; i<cosechamaiz.length; i++) {
			System.out.println("Ingrese nro de parcela " +i+1);
			cosechamaiz [i] = semillas.nextDouble();
			suma = suma + cosechamaiz[i];
		
		System.out.println("-------------------");
		
		for(String valor: siembra) {
			System.out.print(valor+ ", ");
			break;
		}
		
		System.out.println("-------------------");
		
		System.out.println(siembra[2]);
		siembra[2] = "Papa";
		
		double[] cosechapapa = new double[n];
		double suman = 0;
		
		for(int j=0; j<cosechapapa.length; j++) {
			System.out.println("Ingrese nro de parcela " +j+1);
			cosechapapa [j] = semillas.nextDouble();
			suman = suman + cosechapapa[i];
		
		System.out.println("-------------------");
		
		for(String valor: siembra) {
			System.out.print(valor+ ", ");
			break;
		}
		
		System.out.println("-------------------");
		
		System.out.println(siembra[2]);
		siembra[2] = "Yuca";
		
		double[] cosechayuca = new double[n];
		double sumanm = 0;
		
		for(int w=0; w<cosechayuca.length; w++) {
			System.out.println("Ingrese nro de parcela " +w+1);
			cosechayuca [w] = semillas.nextDouble();
			sumanm = sumanm + cosechayuca[i];
		
		System.out.println("-------------------");
		
		for(String valor: siembra) {
			System.out.print(valor+ ", ");
			break;
		}
		
		
		}
		
		}
		}

	}

}
