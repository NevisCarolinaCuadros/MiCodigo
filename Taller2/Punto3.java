package Taller2;

import javax.swing.JOptionPane;

public class Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String peso = JOptionPane.showInputDialog("Ingresar peso ");
		
		String altura = JOptionPane.showInputDialog("Ingresar altura ");
		
		double pesoDouble = Double.parseDouble(peso);
		double alturaDouble = Double.parseDouble(altura);
		

		double operacion1 = pesoDouble/alturaDouble;
		double operacion2 = operacion1/alturaDouble;
		
		JOptionPane.showMessageDialog(null, operacion2);


	}

}
