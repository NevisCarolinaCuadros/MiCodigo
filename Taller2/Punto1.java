package Taller2;

import javax.swing.JOptionPane;

public class Punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double pi = 3.1416;
		String grados = JOptionPane.showInputDialog("Ingresar grados: ");
		double gradosDouble = Double.parseDouble(grados);
		double operacion1 = gradosDouble*2;
		double operacion2 = operacion1/360;
		double operacion3 = operacion2*pi;
		
		JOptionPane.showMessageDialog(null, operacion3);

	}

}
