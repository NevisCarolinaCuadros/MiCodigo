package Taller3;

import javax.swing.JOptionPane;

public class FontanarDescuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 300;
		
		String valor = JOptionPane.showInputDialog("Ingrese valor de la compra: ");
		double valorDouble = Double.parseDouble(valor);
		double operacion1 = valorDouble*0.2;

		
		if ( valorDouble > x ) {
			JOptionPane.showMessageDialog(null, "La compra cuenta con el descuento de: " + operacion1);
		} else if ( valorDouble < x) {
			JOptionPane.showMessageDialog(null, "La compra no cuenta con el descuento ");
		}
		

	}

}
