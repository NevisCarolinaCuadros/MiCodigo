package EjercicioArreglosJava;

public class EjercicioA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arreglo = new int[10];
		for(int i=0; i<arreglo.length; i++) {
			arreglo[i] = 2*i;
		}
		for(int i: arreglo) {
			System.out.print(i + " ");
		}
		System.out.println();

	}//El output es una secuecialidad de números pares del 0 al 18

}
