package Taller3;

import javax.swing.JOptionPane;

public class ActividadObrero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 40;
		int y = 100;
		
		String salarioSemanal = JOptionPane.showInputDialog("Ingresar el valor del salario semanal ");
		double salarioSemanalDouble = Double.parseDouble(salarioSemanal);
		
		//Aqui para obtener la respuesta hay que poner el valor de la hora (40) con el signo de <
		if ( salarioSemanalDouble < 40) {
			JOptionPane.showMessageDialog(null, "El valor del salario semanal por trabajar menos de 40 horas es de: 16");
			
		//Aqui para obtener la respuesta hay que poner el valor de la hora (40) con el signo >=
		} else if ( salarioSemanalDouble >= 40) {
			JOptionPane.showMessageDialog(null, "El valor del salario semanal por trabajar mas de 40 horas es de: 20");
		} 
	

	}

}
