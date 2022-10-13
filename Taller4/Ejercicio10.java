package Taller4;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		String input = JOptionPane.showInputDialog("Cuantas lineas desea imprimir? ");
			int n = Integer.parseInt(input);
			
		/*
		 * Sin ciclo seria 
		 * System.out.print("1");
		 */
		do {
			int j=1;
			do {
				System.out.print(i);
				j++;
			}while (j <= i);
			System.out.println();
			i++;
		}while (i <=5);

	}

}
