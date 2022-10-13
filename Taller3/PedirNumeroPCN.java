package Taller3;

import javax.swing.JOptionPane;

public class PedirNumeroPCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Aqui voy a ingresar un numero entero de 3 diferentes variables para diferentes respuestas 
		int x;
		int y;
		int z;
		
		String inputx = JOptionPane.showInputDialog("Ingrese valor 1: ");
		x = Integer.parseInt(inputx);
		
		if ( x < 0) {
			JOptionPane.showMessageDialog(null, "El numero es menor que 0 ");
		} else if ( x > 0 ){
			JOptionPane.showMessageDialog(null, "El numero es mayor que 0 ");	
		} else if( x == 0 ) {
			JOptionPane.showMessageDialog(null, "El numero es igual que 0 ");
		}
		
		String inputy = JOptionPane.showInputDialog("Ingrese valor 2: ");
		y = Integer.parseInt(inputy);
		
		if ( y > 0) {
			JOptionPane.showMessageDialog(null, "El numero es mayor que 0 ");
		} else if ( y < 0 ) {
			JOptionPane.showMessageDialog(null, "El numero es menor que 0 ");
		} else if ( y == 0) {
			JOptionPane.showMessageDialog(null, "El numero es igual que 0 ");
		}
		
		String inputz = JOptionPane.showInputDialog("Ingrese valor 3: ");
		z = Integer.parseInt(inputz);
		
		if ( z == 0) {
			JOptionPane.showMessageDialog(null, "El numero es igual que 0");
		} else if ( z < 0) {
			JOptionPane.showMessageDialog(null, "El numero es menor que 0 ");
		} else if ( z > 0) {
			JOptionPane.showMessageDialog(null, "El numero es mayor que 0 ");
		}

	}

}
