package EjerciciosArreglos;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 0;
		int max = 20; 
		
		int[] arreglo = new int[6];
		for(int i=0; i<arreglo.length; i++) {
			int j= (int)Math.floor(Math.random()*(max-min+1))+ min;
			arreglo[i] = j;
			if (arreglo[i]%3==0) {
				System.out.println(arreglo[i]+ " Es multiplo de tres ");
			}
		
		}
		for(int i: arreglo) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
