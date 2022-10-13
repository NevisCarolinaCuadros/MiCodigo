package Taller2;

import javax.swing.JOptionPane;

public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aqui voy a poner el valor del iva 
		final double IVA = 0.21;
		
		String valor = JOptionPane.showInputDialog("Ingeresar Valor: ");
		double valorDouble = Double.parseDouble(valor);
		double operacion1 = valorDouble*0.21;
		
		JOptionPane.showMessageDialog(null, operacion1);
		

	}

}
