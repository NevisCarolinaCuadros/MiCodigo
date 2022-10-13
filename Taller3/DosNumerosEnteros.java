package Taller3;

import javax.swing.JOptionPane;

public class DosNumerosEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aqui voy a ingresar dos variables de numeros enteros
				int x;
				int y;
				
				String valor1 = JOptionPane.showInputDialog("Ingrese valor nro 1");
				x = Integer.parseInt(valor1);
				String valor2 = JOptionPane.showInputDialog("Ingrese valor nro 2");
				y = Integer.parseInt(valor2);
				
				double valor1Double = Double.parseDouble(valor1);
				double valor2Double = Double.parseDouble(valor2);
				
				if ( valor1Double < valor2Double ) {
					JOptionPane.showMessageDialog(null, "El valor nro 1 es menor al valor nro 2");	
				} else if ( valor1Double > valor2Double ) {
					JOptionPane.showMessageDialog(null, "El valor nro 1 es mayor al valor nro 2 ");
				} else if ( valor1Double == valor2Double ) {
					JOptionPane.showMessageDialog(null, "El valor nro 1 y el valor nro 2 son iguales");
				}

	}

}
