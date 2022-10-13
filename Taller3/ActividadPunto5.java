package Taller3;

import javax.swing.JOptionPane;

public class ActividadPunto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gastox, litrosx, costo;
		
		double litros = Double.parseDouble(JOptionPane.showInputDialog("Ingresar litros consumidos "));
		double gasto1 = 60.00;
		double operacion1 = (gasto1 = gasto1 + (litros-50)*30.00);
		double operacion2 = (gasto1 = gasto1 + (litros-200)*50.00);
		
		if (litros>50) {
			JOptionPane.showMessageDialog(null, "opcion1 " + operacion1);
		}if (litros>200) {
			JOptionPane.showMessageDialog(null, "opcion2" + operacion2);
			JOptionPane.showMessageDialog(null, "Valor de gasto: " + gasto1);

		}


	}

}
