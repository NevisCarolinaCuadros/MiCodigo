package Taller2;

import javax.swing.JOptionPane;

public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String kilometroHora = JOptionPane.showInputDialog("Ingresar kilometros por hora para pasar a Metros por segundo");
		
		double kilometroHoraDouble = Double.parseDouble(kilometroHora);
		
		
		double operacion1 = kilometroHoraDouble*5;
		double operacion2 = operacion1/18;
	
		

		
		JOptionPane.showMessageDialog(null, operacion2);
		

	}

}
