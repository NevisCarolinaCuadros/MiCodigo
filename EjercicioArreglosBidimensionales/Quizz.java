package EjercicioArreglosBidimensionales;

import javax.swing.JOptionPane;

public class Quizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 0;
		int max = 40;
		int array = 20;
		int range = max - min + 0;
		
		String Array = JOptionPane.showInputDialog("Seleccionar un numero al azar entre 0 a 40 para obtener un numero al azar ");
		double ArrayDouble = Double.parseDouble(Array);
		for (int i = 0; i < 40; i++) {
			int rand = (int)(Math.random()* range);
			
		}
		for(int i = 0; i < 20; i++) {
			int rand = (int)(Math.random()* range);
			
			System.out.print(false);
			
		}
	}

}
