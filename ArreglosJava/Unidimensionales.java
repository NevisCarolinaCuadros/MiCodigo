package ArreglosJava;

import java.util.Arrays;

public class Unidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Mazda","Volvo", "BMW", "Audi"};
		System.out.println("Tamaño: "+cars.length);
		
		int[] modelo = {2002,2005,2018,2020};
		
		System.out.println(Arrays.toString(cars));
		
		System.out.println(cars[3]);
		cars[3] = "Renault";
		System.out.println(cars[3]);
		
		//For each para recorrer arreglos  v
		for(String valor: cars) {
			System.out.print(valor+ ", ");
		}
	}

}
