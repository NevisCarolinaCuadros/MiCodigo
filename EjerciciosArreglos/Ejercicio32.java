package EjerciciosArreglos;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		int m = 1; 
		
		int[] arreglo = new int[20];
		for(int i=0; i<arreglo.length; i++) {
			int j= (int)Math.floor(Math.random()*(m-n+1))+ n;
			arreglo[i] = j;
			if (arreglo[i]%1==0) {
				System.out.println(arreglo[i]+ " Cantidad de ceros ");
			}
		
		}
		for(int i: arreglo) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
