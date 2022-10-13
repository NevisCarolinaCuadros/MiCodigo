package miPrimerCodigo;

import javax.swing.JOptionPane;

public class miCodigo {
	
	public static void main(String [] arg) {
		//TODO Auto-generated method stub
		int x = 5;
		System.out.print(x);
		
		
		String name = JOptionPane.showInputDialog("Como te llamas");
		JOptionPane.showMessageDialog(null, "Hola" + name);
	}

}
