package Class;

import javax.swing.JOptionPane;

public class For1al10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 0;
		String input = JOptionPane.showInputDialog("Ingrese primer dato ");
		int sum = 0;
	
		int n = 0;
		String input1 = JOptionPane.showInputDialog("Ingrese segundo dato ");
		int sum2 = 0;
		
		
		for (i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		for (n = 0; n >= 10; n = n--) {
			System.out.println(n);
		}

	}

}
