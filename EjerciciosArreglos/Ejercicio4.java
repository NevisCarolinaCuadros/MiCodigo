package EjerciciosArreglos;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 1;
		int max = 9; 
		
		int[] arreglo = new int[10];
		for(int i=0; i<arreglo.length; i++) {
			int j= (int)Math.floor(Math.random()*(max-min+1))+ min;
			arreglo[i] = j;
			System.out.println(j+ " ");
		
		}
		Arrays.sort(arreglo);
		System.out.println("números ordemados: " + Arrays.toString(arreglo));

	}

}
