package Taller3;

import javax.swing.JOptionPane;

public class añoActualañoCualquiera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		
		
		String fecha1 = JOptionPane.showInputDialog("¿Que año es? ");
		x = Integer.parseInt(fecha1);
		
		String fecha2 = JOptionPane.showInputDialog("Escriba un año cualquiera ");
		y = Integer.parseInt(fecha2);
		
		double fecha1Double = Double.parseDouble(fecha1);
		double fecha2Double = Double.parseDouble(fecha2);

		
		if (fecha1Double > fecha2Double) {
			JOptionPane.showMessageDialog(null, "Desde el año" + fecha2Double + "Ha pasado" + (fecha1Double - fecha2Double) + "años ");
		}else if (fecha1Double < fecha2Double) {
			JOptionPane.showMessageDialog(null, "Para el año" + fecha2Double + "faltan" + (fecha2Double - fecha1Double) + "años ");
		}else {
			JOptionPane.showMessageDialog(null, "Wow!, eso es interesante ");
		}

	}

}
