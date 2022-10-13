package Class;

import javax.swing.JOptionPane;

public class CondicionalBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IF sencillo
		int x = 3;
		int y = 5;//Declaramos una variable tipo int llamada x y le asignamos el valor 3
		//Preguntar si x es igual a 3
		if (x == 3) {
			if ( y == 6 ) {
				JOptionPane.showMessageDialog(null,"y es igual a 6");
				JOptionPane.showMessageDialog(null, "x es igual a 3");
				
			}
		} else {
			JOptionPane.showMessageDialog(null, "x NO es igual a 3");
		}
		
		//Hacer algo independiente de la condicion 
		JOptionPane.showMessageDialog(null, "Estos siempre se mostrara");

	}

}
