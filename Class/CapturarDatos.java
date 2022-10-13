package Class;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CapturarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Imprimir variable usando JOptionPane
		String name = JOptionPane.showInputDialog("Como te llamas?");
		JOptionPane.showMessageDialog(null, "Hola, " + name);
		
		//Capturando con scanner
		//Creamos variable tipo Scanner y le decimos que pueda aceptarla como input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ingrese dos números enteros separados de uno o ");

	}

}
