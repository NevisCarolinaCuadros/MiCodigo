package Class;

import javax.swing.JOptionPane;

public class EjercicioAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2 ,n3;
		String inputN1 = JOptionPane.showInputDialog("Ingrese N1: ");
		n1 = Integer.parseInt(inputN1);
		
		String inputN2 = JOptionPane.showInputDialog("Ingrese N2: ");
		n2 = Integer.parseInt(inputN2);
		
		String inputN3 = JOptionPane.showInputDialog("Ingrese N3: ");
		n3 = Integer.parseInt(inputN3);
		
		//Decir cual es el menor de los 3 numeros
		//n1 menor a n2 y n1 menor a n3
		if(n1<n2 && n1<n3) {
			JOptionPane.showMessageDialog(null, "El nro menor es: " + n1);	
		}else if (n2<n1 && n2<n3) {
			JOptionPane.showMessageDialog(null, "El nro menor es n2: " + n3);	
		}else if (n1 == n2 && n2 == n3) {
			JOptionPane.showMessageDialog(null, "Los numeros son iguales");
		}else if (n1 ==n2 && n2 == n3) {
			JOptionPane.showMessageDialog(null, "El nro menor es: " + n3 );
		}
		
	}
		

}
