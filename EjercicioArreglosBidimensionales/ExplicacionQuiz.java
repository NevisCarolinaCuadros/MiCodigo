package EjercicioArreglosBidimensionales;

import javax.swing.JOptionPane;

public class ExplicacionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[20];
		
		int min = 1;
		int max = 40;
		
		for(int i = 0; i<array.length; i++) {
			array [i] = (int)Math.floor(Math.random() * (max-min+1))	+ min;
		}
		
		for (int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
			
		int numero = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese un número ente 1 y 20"));
		
		for(int i = 0; i<array.length; i++) {
			if(numero == array[i]) {
				JOptionPane.showMessageDialog(null, "Correcto, " + numero + "se encuentra en el array. ");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Incorrecto, " + numero + " no se encuentra en el array. "
						+ "\nIntente de nuevo. ");
				break;
			}
		}

	}

}
