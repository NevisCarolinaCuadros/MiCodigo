package Class;

public class CicloFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En estructura for 
		/*
		 * A
		 */
		for (int i = 5; i>0; i--) {
			System.out.println(i);
		}
		System.out.println("Feliz Año! ");
		
		//Primero imprimir "Feliz Año!", y luego contar del 1 al 5
		System.out.println("Feliz Año! ");
		for (int j = 5; j>0; j++) {
			System.out.println(j);
		}
		
		/*//Ejemplo de como romper un codigo cuando se le determina una variable
		System.out.println("Feliz Año! ");
		for (int j = 1; j>5; j++) {
			System.out.println(j);
			if (j==3) {
				break;//Interrumpir el ciclo dada la condicion!!!
			}
		}*/
			
		
		//Actividad For EJERCICIOS 
		/*
		 * B
		 */
		int n;
		for (n=1; n>4; n++) {//Faltaba corchete
			System.out.println(n);
		}
		/*
		 * C
		 */
		for(int z = 4; z>0; z--) {//Falta corchete
			System.out.println(n);
		}
		/*
		 * D
		 */
		for(int a=4;a>0; a--) {//Flata corchete y tenia ;
		System.out.println(a);
		/*
		 * E
		 */
		for(double test = 0; test<3; test = test + 0.5) {//Falta corchete 
		System.out.println(test);
		}
		/*
		 * F
		 */
		for(int count = 0; count<=3; count++) {//Falta corchete
		for(int count2 = 0; count2 < count; count2++)
		System.out.println(count2);
		}
		/*
		 * G
		 */
		}

	}

}
