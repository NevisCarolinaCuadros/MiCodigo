package Taller4;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String input = JOptionPane.showInputDialog("Cuantas filas?");
		int n = Integer.parseInt(input);
		//ciclo 1 maneja filas
		//ciclo 2 maneja columnas
		for(int count = 1; count<=n; count++) {//Falta corchete
			for(int count2 = 1; count2 <= count; count2++) {
				System.out.print(count2);
			}
			System.out.println();

		}
		for(int count = n; count>=1; count--) {//Falta corchete
			for(int count2 = 1; count2 <= count; count2++) {
				System.out.print(count2);
			}
			System.out.println();

		}


	}

}
