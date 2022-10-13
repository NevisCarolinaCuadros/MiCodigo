package Taller4;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		int suma = 0;
		
		String total = JOptionPane.showInputDialog("Ingrese el total de datos ");
		int  totalInt = Integer.parseInt(total);
		
		do {
			String numero = JOptionPane.showInputDialog("Igrese numero ");
			int numeroInt = Integer.parseInt(numero);
			x++;
			suma=suma+numeroInt;
		}while (x!=totalInt);
		double promedio = (suma%totalInt);


	}

}
