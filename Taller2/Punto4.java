package Taller2;

import javax.swing.JOptionPane;

public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarar dos varuable tipo int y dos tipos double
		int x, y; //Declarar dos variables en la misma linea de codigo 
		double n, m;
		
		//Solicitar variable a traves de JoptionPane
		String inputX = JOptionPane.showInputDialog("Ingrese x, debe ser entero ");
		String inputY = JOptionPane.showInputDialog("Ingrese y, debe ser entero ");
		//String inputN = JOptionPane.showInputDialog("Ingrese n, debe ser entero ");
		//String inputM = JOptionPane.showInputDialog("Ingrese m, debe ser entero ");
		
		//Parsear variables de String a int o double
		x = Integer.parseInt(inputX);
		y = Integer.parseInt(inputY);
		//n = Double.parseDouble(inputN);
		//m = Double.parseDouble(inputM);
		
		//Calcular modulo
		int intResiduo = x%y;
		JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es: " + intResiduo);
		

	}

}
