package TallerCiclos;

import javax.swing.JOptionPane;

public class Ejercicio6c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       String n = JOptionPane.showInputDialog("Ingrese un número: ");
	        int nInt = Integer.parseInt(n);
	        for(int i=0; i<= nInt; i++) {
	            for(int j=0; j<=i; j++) {
	                if(i%2==1) {
	                    System.out.print("2");
	                }else {
	                    System.out.print("1");
	                }
	            }
	            System.out.println(" ");
	        }

	}

}
